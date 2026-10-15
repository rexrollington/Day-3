import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    system.out.println("Enetr the 1st number");
    int a=scan.nextInt(); //50
    system.out.println("Enter the 2nd number");
    int b=scan.nextInt(); //70
    system.out.println("Enter the 3rd number");
    int c=scan.nextInt(); //35
    if(a>b && a>c) {
      System.out.println("Greater Number is:"+a);
    }else if(b>a && b>c) {
      System.out.println("Greater Number is:"+b);
    }else {
      System.out.println("Greater Number is:"+c);
    }
  }
}