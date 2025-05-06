public class loops {
    public static void main (String []arg){
        int n = Integer.parseInt(arg[0]);
        int sum=0, r;
        while (n<66){
            r = n%10;
            sum +=r;
            n/=10;

        }
        System.out.println("sum of digits= "+ sum);
    }
}
