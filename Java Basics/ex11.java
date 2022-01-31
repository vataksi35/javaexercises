import java.util.Scanner;
public class ex11 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        double average=(a+b+c)/3;
        System.out.println(average);
    }
}
