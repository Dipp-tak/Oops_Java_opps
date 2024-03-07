import java.util.Scanner;
class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String input
        System.out.print("Enter Your Name: ");
        String name =input.nextLine();
        //Integer input
        System.out.print("Enter Your Age: ");
        int age =input.nextInt();
        //Float input
        System.out.print("Enter Your CGPA: ");
        float cgpa =input.nextFloat();
        //Output
        System.out.println("Your Name is : "+ name);
        System.out.println("Your Age is : "+ age);
        System.out.println("Your CGPA is : "+ cgpa);
        input.close();
        
    }
}
