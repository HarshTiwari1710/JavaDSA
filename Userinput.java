import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your age:");
       int age = sc.nextInt();
       sc.close();
       System.out.println(age);    
    }
}