import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;
class first {
  public static void main(String args[]) {
    // input value catch
    Scanner sc = new Scanner(in);
    out.print("enter your length: ");
    int length=sc.nextInt();
    out.print("enter your boolean value true/false: ");
    boolean iswhile = sc.nextBoolean();
    sc.close();
    // for loop
    for (int i = 1; i <= length; i++) {
      out.println(i+":I love java");
    }
    ;
    // while loop
    while(iswhile){
      out.println("while is run beacause its true");
    }
    ;
    // do while loop
    do {
      out.println("do while is run at first if it's false also");
    } while (iswhile);
    //  if - else if - else block
    if (length > 100) {
      out.println("its a big lenghy");
    } else if (length == 100) {
      out.println("its a soo lenghy");
    } else {
      out.println("its a okk");
    }
    // switch and break block

    switch (length) {
      case 98:
        out.println("its lower than 100 its 98");
        break;
      case 99:
        out.println("its lower than 100 its 99");
        break;
      case 100:
        out.println("its equal to 100 its 100");
        break;
      case 101:
        out.println("its grader than 100 its 101");
        break;
      case 102:
        out.println("its grader than 100 its 102");
        break;
      default:
        out.println("i cannot detect it");
        break;
    }
  }
}




