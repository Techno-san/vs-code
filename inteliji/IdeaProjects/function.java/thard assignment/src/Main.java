import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("largest among two number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 1st no.");
        float a = sc.nextInt();
        System.out.println("Type 2nd no.");
        float b = sc.nextInt();
        if (a<b){
            System.out.println(b + "  No. is maximum");
        }
        else {
            System.out.println(b + "  No. is minimum");
        }


    }
}