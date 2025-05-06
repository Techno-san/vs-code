import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("ENTER YOUR AGE !");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        if (a>18){
            System.out.println("YOU CAN VOTE:");
        }

        else {
            System.out.println("YOU CAN NOT VOTE;");
        }


    }
}