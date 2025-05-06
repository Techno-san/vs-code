import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ENTETR TEMPERATURE IN DEGREE CENTIGRADE !");
        Scanner sc = new Scanner(System.in);
        float C = sc.nextFloat();

        System.out.println(C*9/5 + 32+" Fahrenheit");
        // for f to c
        // C = f-32 * 5 /9
    }
}