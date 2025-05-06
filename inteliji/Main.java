class maths {
    public int add (int a, int b){
        return (a+b);
    }
    public int add (int a,int b, int c){
        return (a+b+c);
    }
    public float add (float x , float y){
        return (x+y);
    }

}

class Main {
    public static void main(String arg[] ){
        maths m1 = new maths();
        int a = Integer.parseInt(arg[0] + arg[1]);
        System.out.println("a= " + a);

        int c = Integer.parseInt(arg[0] + arg[1] + arg[2]);
        System.out.println("a="+ c);


    }
}