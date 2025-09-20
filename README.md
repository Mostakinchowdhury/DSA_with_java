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
