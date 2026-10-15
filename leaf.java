import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the year:");
    if(year%400==0) {
      System.out.println(year+" is leap year");
    }else if(year%4==0 && year%100!=0) {
      System.out.println(year+"is leap year");
    }else{
      System.out.println(year+"not is leap year");
    }
  }
}