import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter 1st Number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter 2nd Number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter 3rd Number: ");
        int num3 = scanner.nextInt();
        
        if ((num1 > num2) && (num1 > num3)) 
        {
            System.out.println("largest number among them is: " + num1);
        }
        
        if ((num2 > num1) && (num2 > num3)) 
        {
            System.out.println("largest number among them is: " + num2);
        } else 
        {
            System.out.println("largest number among them is: " + num3);
        }
    }
}

