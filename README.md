# DSA with Java – Placement Course

---

# 📘 Lecture 1: Introduction to Java

## 🔹 1. Java কি?

- Java হলো **high-level, object-oriented, class-based programming language**।
- এটাকে **platform-independent** বলা হয় (কারণ একবার code লিখে সবখানে run করা যায় → WORA = _Write
  Once, Run Anywhere_).
- Java code → compile হয় `.class` file → চলে **JVM (Java Virtual Machine)** এর উপর।

---

## 🔹 2. Java এর History

- 1991 → James Gosling (Sun Microsystems) Java তৈরি করে।
- 1995 → officially release হয়।
- এখন Oracle এর অধীনে maintain হয়।

---

## 🔹 3. Java কেন শিখব?

1. **Platform independent** (Windows, Mac, Linux — সব জায়গায় run হয়)
2. **Huge community support**
3. **Secure & Robust**
4. **Popular in DSA, Backend (Spring), Android development**
5. Placement interviews এ **Java + DSA** খুব common।

---

## 🔹 4. JDK, JRE, JVM এর পার্থক্য

- **JVM (Java Virtual Machine)** → Java code কে run করায় (platform-specific)।
- **JRE (Java Runtime Environment)** → JVM + libraries (Java run করার জন্য প্রয়োজনীয় সবকিছু)।
- **JDK (Java Development Kit)** → JRE + development tools (compiler `javac`, debugger ইত্যাদি)। 👉
  Developers দের জন্য JDK install করতে হয়।

---

## 🔹 5. First Java Program

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### 🔸 কোড ব্যাখ্যা:

- `public class HelloWorld` → class definition (file name এর সাথে same হতে হবে → `HelloWorld.java`)
- `public static void main(String[] args)` → program এর entry point।
- `System.out.println("Hello, World!");` → output print করে।

---

## 🔹 6. Java Compile & Run Process

1. Save file → `HelloWorld.java`
2. Compile →

   ```bash
   javac HelloWorld.java
   ```

   এতে `.class` file তৈরি হবে (`HelloWorld.class`)

3. Run →

   ```bash
   java HelloWorld
   ```

   Output:

   ```
   Hello, World!
   ```

---

## 🔹 7. Features of Java

- **Simple & Familiar** → C/C++ এর মতো syntax।
- **Object-Oriented** → সবকিছু class/object এর উপর ভিত্তি করে।
- **Platform-Independent** → JVM এর জন্য যেকোনো OS এ run করে।
- **Secure** → memory management & exception handling আছে।
- **Robust** → error handle করতে পারে, crash কম হয়।
- **Multithreading Support** → একসাথে multiple কাজ করা যায়।

---

## 🔹 8. Java এর Versions

- Java SE → Standard Edition (DSA/placements এ main use)
- Java EE → Enterprise Edition (web apps, backend)
- Java ME → Micro Edition (mobile, embedded systems)

---

## 🔹 9. Placement এ Java এর Use

- Interviews এ DSA problem solve করতে অনেকেই Java use করে।
- Java এর **fast execution + rich libraries** interview coding round এর জন্য ভালো।
- Big companies (Google, Amazon, Microsoft, etc.) Java কে still prefer করে।

---

# ✅ Quick Recap:

- Java = Platform Independent, Object Oriented Language
- JVM → runs code, JRE → JVM + libraries, JDK → JRE + dev tools
- Compile: `javac filename.java` → Run: `java filename`
- Features: Simple, Secure, Robust, Portable, Multithreaded
- প্রথম program: HelloWorld.java

---

# 📘 Lecture 2: Variables, Input/Output, Data Types in Java

## 🔹 1. Variables in Java

- Variable হলো memory location এর নাম, যেখানে data store হয়।
- **Java strongly typed language** → variable declare করার সময় data type দিতে হয়।

### Syntax:

```java
datatype variableName = value;
```

### Example:

```java
int age = 21;
String name = "Mostakin";
double pi = 3.1416;
```

---

## 🔹 2. Rules for Naming Variables

1. Must start with **letter, \$ বা \_** (number দিয়ে শুরু করা যাবে না)
2. Case-sensitive (`age` ≠ `Age`)
3. Reserved keywords ব্যবহার করা যাবে না (`int`, `class` ইত্যাদি)
4. Convention: variable name ছোট অক্ষরে শুরু হবে → `studentName`

---

## 🔹 3. Java Input/Output

### 🖨️ Output (System.out.print / println)

- **`System.out.print()`** → same line এ print করে
- **`System.out.println()`** → print করার পর newline add করে

```java
System.out.print("Hello ");
System.out.println("World!");
```

Output:

```
Hello World!
```

---

### ⌨️ Input (Scanner Class)

Java তে input নেওয়ার জন্য **Scanner** class ব্যবহার হয়। 👉 Scanner use করতে হলে import করতে হবে:

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // String input

        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Integer input

        System.out.println("Hello " + name + ", your age is " + age);
    }
}
```

---

## 🔹 4. Primitive Data Types vs Non-Primitive Data Types

### ✅ Primitive Data Types (Built-in, fixed size)

| Data Type | Size (Bytes)       | Range                                    |
| --------- | ------------------ | ---------------------------------------- |
| `byte`    | 1 byte             | -128 to 127                              |
| `short`   | 2 bytes            | -32,768 to 32,767                        |
| `int`     | 4 bytes            | -2^31 to 2^31 - 1                        |
| `long`    | 8 bytes            | -2^63 to 2^63 - 1                        |
| `float`   | 4 bytes            | \~6-7 decimal digits precision           |
| `double`  | 8 bytes            | \~15 decimal digits precision            |
| `char`    | 2 bytes            | Single Unicode character (e.g. 'A', 'b') |
| `boolean` | 1 bit (JVM depend) | true / false                             |

👉 এগুলোকে primitive বলা হয় কারণ এগুলো directly memory তে store হয় এবং reference use করে না।

---

### ✅ Non-Primitive Data Types (Objects / Reference types)

- Examples: **String, Arrays, Classes, Interfaces**
- Memory তে এগুলো reference আকারে store হয়।
- Size fixed না (depend করে object এর উপর)।

Example:

```java
String name = "Mostakin";  // Non-primitive
int[] numbers = {1, 2, 3}; // Non-primitive (array)
```

---

## 🔹 5. Memory for Every Data Type (Summary Table)

| Type    | Memory              | Example                |
| ------- | ------------------- | ---------------------- |
| byte    | 1 B                 | `byte b = 10;`         |
| short   | 2 B                 | `short s = 1000;`      |
| int     | 4 B                 | `int n = 12345;`       |
| long    | 8 B                 | `long l = 100000L;`    |
| float   | 4 B                 | `float f = 3.14f;`     |
| double  | 8 B                 | `double d = 99.99;`    |
| char    | 2 B                 | `char c = 'A';`        |
| boolean | 1 bit (theoretical) | `boolean isOk = true;` |

---

## 🔹 6. Example Program (All in One)

```java
import java.util.Scanner;

public class Lecture2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Variables
        double pi = 3.14159;
        boolean status = true;

        // Output
        System.out.println("Hello " + name + ", you are " + age + " years old.");
        System.out.println("Value of Pi = " + pi);
        System.out.println("Status = " + status);
    }
}
```

---

# ✅ Quick Recap

- **Variables** → memory location (datatype + name + value)
- **Output** → `System.out.print` / `System.out.println`
- **Input** → `Scanner sc = new Scanner(System.in);`
- **Primitive Data Types** → byte, short, int, long, float, double, char, boolean
- **Non-Primitive Data Types** → String, Arrays, Objects, Classes
- **Memory size fixed** for primitive, variable for non-primitive

---

# 📘 Lecture 3: Conditional Statements in Java

## 🔹 1. What are Conditional Statements?

- Conditional statements ব্যবহার করা হয় **decision making** এর জন্য।
- Program কোনো condition true হলে একভাবে execute হবে, false হলে অন্যভাবে।

---

## 🔹 2. `if` Statement

👉 Syntax:

```java
if (condition) {
    // code if condition is true
}
```

👉 Example:

```java
int age = 20;
if (age >= 18) {
    System.out.println("You are eligible to vote.");
}
```

---

## 🔹 3. `if-else` Statement

👉 Syntax:

```java
if (condition) {
    // executes if condition is true
} else {
    // executes if condition is false
}
```

👉 Example:

```java
int age = 16;
if (age >= 18) {
    System.out.println("You can vote.");
} else {
    System.out.println("You cannot vote.");
}
```

---

## 🔹 4. `if-else-if` Ladder

👉 Syntax:

```java
if (condition1) {
    // executes if condition1 is true
} else if (condition2) {
    // executes if condition2 is true
} else {
    // executes if none is true
}
```

👉 Example:

```java
int marks = 85;

if (marks >= 90) {
    System.out.println("Grade: A+");
} else if (marks >= 80) {
    System.out.println("Grade: A");
} else if (marks >= 70) {
    System.out.println("Grade: B");
} else {
    System.out.println("Grade: C");
}
```

---

## 🔹 5. Nested `if` Statement

👉 এক `if` এর মধ্যে আরেকটা `if` ব্যবহার করা যায়।

👉 Example:

```java
int age = 25;
boolean hasID = true;

if (age >= 18) {
    if (hasID) {
        System.out.println("You can enter the club.");
    } else {
        System.out.println("ID required!");
    }
} else {
    System.out.println("You are underage.");
}
```

---

## 🔹 6. `switch` Statement

- যখন একটা variable এর multiple values check করতে হয়, তখন `switch` বেশি clean হয়।
- `break` ব্যবহার না করলে control নিচের সব case execute করে → এটাকে বলে **fall-through**।

👉 Syntax:

```java
switch (expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // if no case matches
}
```

👉 Example:

```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid Day");
}
```

---

## 🔹 7. `break` Statement

- **switch case** বা **loops** এ ব্যবহার হয়।
- Execution বন্ধ করে বাইরে চলে যায়।

👉 Example:

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        break; // loop end হবে
    }
    System.out.println(i);
}
```

Output:

```
1
2
```

---

## 🔹 8. `continue` Statement (extra concept)

- Loop এ **current iteration skip** করে **next iteration** এ চলে যায়।

👉 Example:

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // 3 skip হবে
    }
    System.out.println(i);
}
```

Output:

```
1
2
4
5
```

---

## 🔹 9. Example Program (All in One)

```java
import java.util.Scanner;

public class ConditionalExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // if-else-if ladder
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

        // switch example
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid Day");
        }
    }
}
```

---

# ✅ Quick Recap

- **if** → only one condition check
- **if-else** → condition true হলে এক কাজ, false হলে অন্য কাজ
- **if-else-if** → একাধিক condition handle করার জন্য
- **nested if** → if এর ভিতরে আরেক if
- **switch-case** → multiple fixed values check করার জন্য ভালো
- **break** → execution বন্ধ করে বাইরে চলে যায়
- **continue** → loop এর current iteration skip করে

---

# 📘 Lecture 4: Loops in Java

## 🔹 1. Loop কী?

- **Loop** হলো একটি control structure যা একটি কাজকে বারবার execute করতে দেয় যতক্ষণ না একটি condition
  false হয়।
- **Loop এর সুবিধা** → Code Reusability, কম লাইন এ repetitive কাজ।

---

## 🔹 2. Types of Loops in Java

Java তে মূলত ৩ ধরনের loop আছে:

1. **for loop**
2. **while loop**
3. **do-while loop**

---

## 🔹 3. for loop

👉 যখন iteration সংখ্যা আগে থেকে জানা থাকে।

### Syntax:

```java
for(initialization; condition; increment/decrement) {
    // code block
}
```

### Example:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Number: " + i);
}
```

**Output:**

```
Number: 1
Number: 2
Number: 3
Number: 4
Number: 5
```

---

## 🔹 4. while loop

👉 যখন iteration সংখ্যা আগে থেকে জানা থাকে না, এবং শর্ত check করে লুপ চলে।

### Syntax:

```java
while(condition) {
    // code block
}
```

### Example:

```java
int i = 1;
while (i <= 5) {
    System.out.println("Count: " + i);
    i++;
}
```

**Output:**

```
Count: 1
Count: 2
Count: 3
Count: 4
Count: 5
```

---

## 🔹 5. do-while loop

👉 অন্তত **একবার execute হবেই**, তারপর condition true হলে বারবার চলবে।

### Syntax:

```java
do {
    // code block
} while(condition);
```

### Example:

```java
int i = 1;
do {
    System.out.println("Value: " + i);
    i++;
} while (i <= 5);
```

**Output:**

```
Value: 1
Value: 2
Value: 3
Value: 4
Value: 5
```

---

## 🔹 6. Loop Flow (Diagram)

```
for loop → Initialization → Condition → Statement → Increment → Back to Condition
while loop → Condition → Statement → Increment → Back to Condition
do-while loop → Statement → Condition → (if true repeat, else exit)
```

---

## 🔹 7. Example Program (All Loops Together)

```java
public class LoopsExample {
    public static void main(String[] args) {

        // For Loop
        System.out.println("=== For Loop ===");
        for (int i = 1; i <= 3; i++) {
            System.out.println("For: " + i);
        }

        // While Loop
        System.out.println("=== While Loop ===");
        int j = 1;
        while (j <= 3) {
            System.out.println("While: " + j);
            j++;
        }

        // Do-While Loop
        System.out.println("=== Do-While Loop ===");
        int k = 1;
        do {
            System.out.println("Do-While: " + k);
            k++;
        } while (k <= 3);
    }
}
```

**Output:**

```
=== For Loop ===
For: 1
For: 2
For: 3

=== While Loop ===
While: 1
While: 2
While: 3

=== Do-While Loop ===
Do-While: 1
Do-While: 2
Do-While: 3
```

---

## 🔹 8. Special Keywords in Loops

- **break** → লুপ সম্পূর্ণভাবে থামিয়ে দেয়।
- **continue** → সেই iteration skip করে, পরের iteration এ চলে যায়।

### Example (break & continue):

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // skip 3
    }
    if (i == 5) {
        break; // stop loop when i=5
    }
    System.out.println(i);
}
```

**Output:**

```
1
2
4
```

---

# ✅ Quick Recap

- **for loop** → fixed number of iterations
- **while loop** → condition ভিত্তিক, আগে condition check করে
- **do-while loop** → অন্তত একবার চলবেই, পরে condition check
- **break** → লুপ থামায়
- **continue** → current iteration skip করে

---

# 📘 Lecture 5: create some basic pattern by java loop

---

# 📘 Lecture 6: create some advanced pattern by java loop

---

# 📘 Lecture 7 – Functions & Methods (Java)

## 🔹 Function / Method কী?

- **Function (বা Method)** হলো কোনো কোড ব্লক যেটা একটি নির্দিষ্ট কাজ করার জন্য বানানো হয়।
- বারবার একই কোড লিখতে না হয়ে একবার ফাংশন লিখে বারবার ব্যবহার করা যায়।

---

## 🔹 Function Declaration Syntax (Java)

```java
returnType functionName(parameterType parameterName) {
    // function body
    return value; // যদি returnType void না হয়
}
```

👉 Example:

```java
int add(int a, int b) {
    return a + b;
}
```

---

## 🔹 Method vs Function

- Java তে **সব Function আসলে Method** কারণ এগুলো সবসময় কোনো Class এর ভেতরে থাকে।
- অন্য ভাষায় Function আলাদা থাকতে পারে, কিন্তু Java তে Method সবসময় Class এর অংশ।

---

## 🔹 Static Method

```java
class MyClass {
    public static int square(int n) {
        return n * n;
    }
}
```

- `static` method সরাসরি class এর নাম দিয়ে কল করা যায় → `MyClass.square(5)`
- Static method এর জন্য class object বানাতে হয় না।

👉 **কোথায় static ব্যবহার করব?**

- যখন method এর কাজ কোনো **object-এর ডেটা নির্ভর নয়**।
- শুধু ইনপুট নিয়ে কাজ করে, object fields ব্যবহার করে না।

---

## 🔹 Non-Static Method (Instance Method)

```java
class MyClass {
    int x = 10;

    public int getX() {
        return this.x; // এখানে this ব্যবহার করা হচ্ছে
    }
}
```

- Non-static method কল করতে object বানাতে হয়।
- Method object-এর ভেতরের data (fields/variables) access করতে পারে।

---

## 🔹 `this` Keyword

- `this` মানে **current object**
- যখন method এর ভিতরে **object-এর variable (instance variable)** আর **local variable** এর নাম একই
  হয়, তখন `this` ব্যবহার করতে হয়।

👉 Example:

```java
class MyClass {
    int x;

    MyClass(int x) {
        this.x = x; // this.x মানে instance variable, x মানে local variable (constructor এর parameter)
    }
}
```

👉 **কখন this লাগবে না?**

- যদি local variable আর instance variable এর নাম আলাদা হয়, তখন `this` না লিখলেও চলে।

---

## 🔹 `main()` Method vs Class Methods

### 1. `public static void main(String[] args)`

- এটি Java প্রোগ্রামের entry point।
- এর মধ্যে সরাসরি কোড লিখতে পারি অথবা অন্য method call করতে পারি।
- এখানে আমরা **static** method ব্যবহার করি কারণ `main` এর মধ্যে object create না করেও call করা যায়।

### 2. Class এর বাইরে Method লেখা (কিন্তু class এর ভেতরেই থাকে)

```java
class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
```

👉 এখানে:

- `add` → static method (object ছাড়াই call করা যাবে: `Calculator.add(5, 6)`)
- `multiply` → instance method (object বানিয়ে call করতে হবে: `new Calculator().multiply(5, 6)`)

---

## 🔹 কখন কোনটা ব্যবহার করব?

- **Static Method:**

  - কাজটা object-এর state (instance variable) এর উপর নির্ভর করে না।
  - Pure functions এর মতো কাজ করবে (যেমন: `Math.sqrt()`, `Math.max()` ইত্যাদি)।

- **Non-Static Method (Instance Method):**

  - কাজটা object-specific data এর উপর নির্ভর করছে।
  - Example: Bank Account class এর মধ্যে `withdraw()` method → এটা নির্দিষ্ট account balance এর উপর
    কাজ করবে।

---

## 🔹 Example Code Recap

```java
class Calculator {

    // static method
    public static int add(int a, int b) {
        return a + b;
    }

    // non-static method
    public int multiply(int a, int b) {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        // static method call
        int sum = Calculator.add(5, 10);
        System.out.println("Sum: " + sum);

        // non-static method call
        Calculator calc = new Calculator();
        int product = calc.multiply(5, 10);
        System.out.println("Product: " + product);
    }
}
```

---

# 📌 Summary (Quick Recap)

- Function = Method (Java তে সব function class এর মধ্যে থাকে)।
- `static` method object ছাড়া কল করা যায়, `non-static` method এর জন্য object লাগে।
- `this` keyword = current object (instance variable আর local variable আলাদা করার জন্য ব্যবহার হয়)।
- `main()` = program entry point, এখানে static methods কল করা যায়, object বানিয়ে instance methods-ও
  কল করা যায়।

---

# 📘 Lecture 8 – Java Exercise

## Questions

- Enter 3 numbers from the user & make a function to print their average.
- Write a function to print the sum of all odd numbers from 1 to n.
- Write a function which takes in 2 numbers and returns the greater of those two.
- Write a function that takes in the radius as input and returns the circumference of a circle.
- Write a function that takes in age as input and returns if that person is eligible to vote or not.
  A person of age > 18 is eligible to vote.
- Write an infinite loop using do while condition.
- Write a program to enter the numbers till the user wants and at the end it should display the
  count of positive, negative and zeros entered.
- Two numbers are entered by the user, x and n. Write a function to find the value of one number
  raised to the power of another i.e. xn.

- Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
- Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13
  21 ..... In the Fibonacci series, a number is the sum of the previous 2 numbers that came before
  it. (BONUS)

---

# **📘 Lecture 9: Time Complexity & Space Complexity**

## ⏳ 1. Time Complexity কী?

👉 Time Complexity = একটি algorithm ইনপুট সাইজ (n) বাড়লে কত সময় নেয় সেটা measure করার পদ্ধতি।

- এটা **exact time (seconds/minutes)** না, বরং **growth rate** measure করে।
- অর্থাৎ, `n` যত বড় হবে, রানিং টাইম কত দ্রুত বাড়বে তা বোঝায়।

---

## 🧮 2. Space Complexity কী?

👉 Space Complexity = Algorithm চালানোর জন্য কতটা **memory (RAM)** লাগবে। এতে ধরা হয়:

- Variable,
- Data Structure,
- Function Call Stack ইত্যাদি।

---

## ⚡ 3. Types of Time Complexity

### (a) **Best Case (Ω Notation)**

- যখন input সবচেয়ে ভালো অবস্থায় থাকে।
- Algorithm এর সবচেয়ে কম সময় লাগে।
- Example: Linear Search → যদি element প্রথমেই পাওয়া যায়।

```java
// Linear Search Best Case
int search(int[] arr, int key) {
    if (arr[0] == key) return 0;  // Best Case O(1)
}
```

👉 নোটেশনে লেখা হয় **Ω(n)**

---

### (b) **Average Case (Θ Notation)**

- সাধারনভাবে মাঝামাঝি অবস্থার সময়।
- Input random হলে যে সময়টা লাগবে।
- Example: Linear Search → element মাঝে কোথাও থাকলে। 👉 নোটেশনে লেখা হয় **Θ(n)**

---

### (c) **Worst Case (O Notation / Big O)**

- সবচেয়ে খারাপ input দিলে কত সময় লাগবে।
- Algorithm design & analysis এ **সবচেয়ে বেশি গুরুত্ব** দেয়া হয় কারণ worst-case এ program fail করলে
  চলবে না।
- Example: Linear Search → যদি element একদম শেষে থাকে বা না থাকে।

```java
// Linear Search Worst Case
int search(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == key) return i;
    }
    return -1; // Worst Case O(n)
}
```

👉 নোটেশনে লেখা হয় **O(n)**

---

## 🔍 4. Common Time Complexities

| Complexity     | Name         | Example                          |
| -------------- | ------------ | -------------------------------- |
| **O(1)**       | Constant     | Accessing array element by index |
| **O(log n)**   | Logarithmic  | Binary Search                    |
| **O(n)**       | Linear       | Linear Search                    |
| **O(n log n)** | Linearithmic | Merge Sort, Quick Sort (average) |
| **O(n²)**      | Quadratic    | Bubble Sort, Insertion Sort      |
| **O(2^n)**     | Exponential  | Recursive Fibonacci              |
| **O(n!)**      | Factorial    | Traveling Salesman (Brute Force) |

---

## 🧠 5. কিভাবে Time Complexity বের করব?

1. **Loops Count করো** → কয়বার loop চলছে।

   - `for (i=0; i<n; i++)` → O(n)
   - Nested loop → O(n²)

2. **Recursive calls দেখো** → এক recursion কয়বার হচ্ছে।

   - Fibonacci recursion → O(2^n)

3. **Best, Average, Worst Case আলাদা করো**।
4. **Constant ignore করো** → O(2n) = O(n)।
5. **Highest Order রাখো** → O(n² + n) = O(n²)।

---

## 🛠️ 6. Space Complexity বের করার Rule

- Variables → O(1)
- Arrays → O(n)
- Two nested arrays → O(n²)
- Recursive calls → O(n) (stack space)

---

## 📊 7. Best vs Average vs Worst ব্যবহার

- **Best Case (Ω)** → Performance optimization বুঝতে।
- **Average Case (Θ)** → সাধারণ runtime expectation।
- **Worst Case (O)** → Algorithm কতটা reliable হবে, সেটাই measure করার standard।

---

## ✅ Example Summary:

- Linear Search → Best O(1), Average Θ(n), Worst O(n)
- Binary Search → Best O(1), Average Θ(log n), Worst O(log n)
- Bubble Sort → Best O(n), Average Θ(n²), Worst O(n²)

---

# 🎯 Final Shortcut Recap

- **Best Case** = Ω
- **Average Case** = Θ
- **Worst Case** = O (Big O সবচেয়ে বেশি important)
- Loop = `n` বার → O(n)
- Nested Loop = `n * n` → O(n²)
- Divide & Conquer (Binary Search) → O(log n)

---

# **📘 Lecture 10: Arrays in Java + Linear Search**

## 🧾 1. Array কী?

👉 Array হলো একধরনের **data structure** যেখানে একই ধরনের multiple value একসাথে contiguous memory
block-এ store হয়।

- প্রতিটি element **index (0-based)** দিয়ে access করা হয়।
- Fixed size → declare করার সময় length দিতে হয়।

---

## 🏗️ 2. Array Declare করার উপায় (Java)

### (a) Declaration + Memory allocation একসাথে

```java
int[] arr = new int[5];   // size 5 এর integer array
```

### (b) Declaration + Initialization

```java
int[] arr = {10, 20, 30, 40, 50};
```

### (c) Separate Declaration & Memory Allocation

```java
int arr[];
arr = new int[5];
```

### (d) Multi-Dimensional Array

```java
int[][] matrix = new int[3][3];  // 3x3 2D array
```

---

## 🧑‍💻 3. User Input দিয়ে Array তৈরি করা

```java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter array size: ");
    int n = sc.nextInt();

    int[] arr = new int[n];  // user defined size

    System.out.println("Enter " + n + " elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("You entered:");
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }

    sc.close();
  }
}
```

---

## 🔍 4. Linear Search Algorithm

👉 **Definition:** Linear Search = একটি **search algorithm** যেখানে আমরা array-এর প্রতিটি element
একে একে check করি target value এর সাথে মিলে কিনা।

### ⏱️ Time Complexity:

- **Best Case:** O(1) → যদি প্রথমেই element পাওয়া যায়।
- **Worst Case:** O(n) → যদি element শেষে থাকে বা না থাকে।

---

### ✅ Java Example: Linear Search

```java
class LinearSearch {
  public static int search(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i; // পাওয়া গেলে index return করবে
      }
    }
    return -1; // না পাওয়া গেলে -1 return
  }

  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50};
    int key = 30;

    int result = search(arr, key);
    if (result == -1) {
      System.out.println("Element not found!");
    } else {
      System.out.println("Element found at index: " + result);
    }
  }
}
```

---

### ✅ JavaScript Example: Linear Search

```javascript
function linearSearch(arr, key) {
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === key) {
      return i // index return
    }
  }
  return -1 // not found
}

const arr = [10, 20, 30, 40, 50]
const key = 30

const result = linearSearch(arr, key)
console.log(result === -1 ? 'Element not found!' : `Element found at index: ${result}`)
```

---

## 📍 5. কবে Linear Search ব্যবহার করব?

👉 যখন:

1. Array ছোট হয়।
2. Array unsorted থাকে (Binary Search তখন কাজ করে না)।
3. বারবার search করার দরকার নেই।
4. Quick implementation দরকার।
5. Memory কম খরচ করতে চাই (extra structure লাগে না)।

---

## 🌍 6. Real Life Example of Linear Search

1. মোবাইল phone contacts list এ একটা নাম খোঁজা (unsorted)।
2. Library book shelf থেকে specific বই খোঁজা।
3. File Explorer এ একটা file ম্যানুয়ালি খোঁজা।
4. Student roll number থেকে একজনকে খোঁজা (random order list)।
5. Supermarket list এ একটা product manually খোঁজা।

---

## ⚖️ 7. Java vs JavaScript (Array + Linear Search তুলনা)

| Concept          | Java Example                           | JavaScript Example        |
| ---------------- | -------------------------------------- | ------------------------- |
| Array Declare    | `int[] arr = new int[5];`              | `let arr = new Array(5);` |
| Array Initialize | `int[] arr = {1,2,3};`                 | `let arr = [1,2,3];`      |
| User Input       | `Scanner sc = new Scanner(System.in);` | `prompt()` / form input   |
| Search Syntax    | `for (int i=0; i<n; i++)`              | `for (let i=0; i<n; i++)` |
| Return Not Found | `return -1;`                           | `return -1;`              |
| Inbuilt Method   | নেই (manually লিখতে হয়)                | `arr.indexOf(key)`        |

---

# 🎯 Final Recap

- Java তে Array fixed size, JS এ dynamic।
- Array Declare → `int[] arr` (Java), `let arr=[]` (JS)।
- User Input → Java তে `Scanner`, JS তে `prompt` বা form input।
- Linear Search → O(n), সহজ কিন্তু বড় data-এর জন্য slow।
- Binary Search এর মতো efficient না, কিন্তু unsorted data এর জন্য একমাত্র option।

---


# **📘 Lecture 11 – 2D Arrays (DSA with Java Placement Course)**

## 🔹 2D Array কী?

* 2D Array মানে হলো **Array এর ভিতরে Array**।
* এটাকে **Matrix** নামেও ডাকা হয় (rows × columns আকারে data রাখা হয়)।
* **Structure:**

  ```
  arr[row][col]
  ```
* যেমন 3x3 মেট্রিক্স:

  ```
  1 2 3
  4 5 6
  7 8 9
  ```

---

## 🔹 2D Array Declare করার উপায়

### **1. Direct Size দিয়ে**

```java
int[][] arr = new int[3][4];  // 3 rows, 4 columns
```

### **2. Direct Initialization দিয়ে**

```java
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

### **3. Jagged Array (row-wise ভিন্ন length)**

```java
int[][] arr = new int[3][];
arr[0] = new int[2]; // row 0 → 2 elements
arr[1] = new int[3]; // row 1 → 3 elements
arr[2] = new int[4]; // row 2 → 4 elements
```

📌 **কখন কোনটা ব্যবহার করব?**

* Fixed size (Matrix problem) → `new int[row][col]`
* Small + predefined data → direct initialization
* Rows আলাদা আলাদা length হলে → Jagged Array

---

## 🔹 User Input দিয়ে 2D Array নেওয়া

```java
import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter cols: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Input values
        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print array
        System.out.println("2D Array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

---

## 🔹 2D Array তে Linear Search Algorithm

### Algorithm:

1. পুরো 2D array row by row traverse করো।
2. প্রতিটি element check করো target এর সাথে।
3. পেলে index return করো, না পেলে -1।

### Example (Java)

```java
public class LinearSearch2D {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int target = 50;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Found at: (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Not Found!");
        }
    }
}
```

### Example (JavaScript)

```javascript
let arr = [
  [10, 20, 30],
  [40, 50, 60],
  [70, 80, 90]
];

let target = 50;
let found = false;

for (let i = 0; i < arr.length; i++) {
  for (let j = 0; j < arr[i].length; j++) {
    if (arr[i][j] === target) {
      console.log(`Found at (${i}, ${j})`);
      found = true;
    }
  }
}

if (!found) {
  console.log("Not Found!");
}
```

---

## 🔹 কখন Linear Search ব্যবহার করব?

* Array **sorted না হলে** (binary search use করা যাবে না)
* Small dataset এ (কারণ Time Complexity: **O(n × m)** for 2D array)
* যখন searching frequency কম (1–2 বার)

---

## 🔹 Real-life Example of Linear Search in 2D

1. Excel sheet থেকে কোনো value খোঁজা
2. Sudoku board এ সংখ্যা খোঁজা
3. Chessboard এ কোনো specific piece এর location খোঁজা
4. Seating arrangement এ কোনো seat খোঁজা
5. Pixel matrix এ কোনো color খোঁজা

---

## 🔹 Java vs JavaScript (Comparison)

| Concept                  | Java (2D Array)          | JavaScript (2D Array)       |
| ------------------------ | ------------------------ | --------------------------- |
| Declare fixed size       | `new int[3][4]`          | Not possible directly       |
| Jagged Array             | Supported                | Supported (`[[],[]]`)       |
| User input               | `Scanner` দিয়ে নেওয়া যায় | Browser prompt / Node input |
| Linear Search complexity | O(rows × cols)           | O(rows × cols)              |

---

✅ **Quick Recap:**

* 2D Array → Matrix (row × col)
* Declare করার ৩টা উপায় → fixed, initialized, jagged
* Input → `Scanner` দিয়ে
* Linear Search → প্রতিটি element sequentially check করা
* Real-life ৫টা example → Excel, Sudoku, Chessboard, Seating, Pixel

---
