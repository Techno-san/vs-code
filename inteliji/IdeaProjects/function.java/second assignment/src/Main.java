

 class Main{
    public static void main(String[] args) {
        int p ,t ;
        p = Integer.parseInt(args[0]);
        t = Integer.parseInt(args[2]);
        float r ;
        r = Float.parseFloat(args[1]);
        float si = p*r*t/100 ;
        System.out.println("simple intrest = " +si);
    }
}