import java.util.Scanner;
class leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Input of year
        System.out.print("Enter A year:");
        int year =input.nextInt();
        //Logic and output
        if(((year % 4 == 0)&&(year % 100 !=0))||(year % 400 == 0))
            System.out.println(year+" is A leap year");
        else
            System.out.println(year+" is not A Leap year");
        
    }
}
