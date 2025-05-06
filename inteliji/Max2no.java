

class Max2no{
    public static void main(String[] args) {
        int a ,b ;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        if (a > b) {
            System.out.println("a is maximum");
        }
        else {
            System.out.println("b is minimum");
        }
    }
}