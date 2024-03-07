import java.util.Scanner;
class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Input of number
        System.out.print("Enter The Number: ");
        int num =input.nextInt();
        //Logic and output
        if(num % 2 == 0)
            System.out.println(num+" is A Even Number");
        else
            System.out.println(num+" is A Odd Number");
        
    }
}
