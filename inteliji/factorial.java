 class Main{
    public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int i , f=1;

    for(i=n ; i<=1 ; i++){
    f = f*i ;
    }
        System.out.println("factorial of " + n + " is " + f);
    }
}