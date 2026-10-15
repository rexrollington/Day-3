import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter day number (1-7):");
    int day = sc.nextInt();
    switch (day) {
      case 1,2,3,4,5: System.out.println("Weekday"); break;
      case 6,7: System.out.println("Weekened"); break;
      default: System.out.println("Invalid");
    }
    sc.close();
}
}
      