import java.util.Scanner;
public class ex18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numer");
        int decimal=sc.nextInt();
        System.out.println(Integer.toBinaryString(decimal));
        System.out.println(Integer.toHexString(decimal));
        System.out.println(Integer.toOctalString(decimal));
}
}