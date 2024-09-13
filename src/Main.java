import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int a = scan.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = scan.nextInt();

        System.out.println("--------------");
        System.out.println(a + b);
        System.out.println("--------------");
    }
}