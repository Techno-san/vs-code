/* class Student{
    String a;
    int b ;

    public void printInfo(String a ){
        System.out.println(a);
    }

    public void printInfo(int b ){
        System.out.println(b);
    }
    public void printInfo(String a ,int b ){
        System.out.println(a+ " " + b );
    }
}
*/

class shape {
    public void area(){
        System.out.println("dis area");
    }
}


class triangle extends shape{ // single level inheritance
    public void area(int l , int h){
        System.out.println(1/2*l*h);
    }
}
 /*class equilateralTringle extends triangle{
    public void area(int l , int h){        // multilevel inheritance
     System.out.println(1/2*l*h);
}*/

class cirle extends shape{
    public void area (int r){
        System.out.println((3.14)*r*r);
    }
}

public class Main {
    public static void main(String[] args) {
    /*    Student s1 = new Student();
        s1.a = "anish";
        s1.b = 24;
        s1.printInfo(s1.a);
        s1.printInfo(s1.b);
        s1.printInfo(s1.a , s1.b);*/
    }
}