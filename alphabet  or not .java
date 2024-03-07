import java.util.Scanner;
class alphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Input 
        System.out.print("Enter A character:");
        char character =input.next().charAt(0);   
        //Logic and output
        if(('A'<=character && 'Z'>=character)||('a'<=character && 'z'>=character))
            System.out.println(character+" is Alphabet");
        else
            System.out.println(character+" is not Alphabet");
        
    }
}
