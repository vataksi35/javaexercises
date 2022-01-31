import java.util.Scanner;
public class ex15 { 
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter first binary number :: ");

    int b1 = scan.nextInt(2);

    System.out.print("Enter second binary number :: ");
    int b2 = scan.nextInt(2);

    int result = b1 * b2;
    System.out.println(result);
}
}