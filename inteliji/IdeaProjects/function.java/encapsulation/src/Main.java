
// multiple inheritance = interface

interface  Anish{
    int eye = 2;
   public void walks();
}

interface Sahu{

}
class Hourse implements Anish, Sahu {
    public void walks(){
        System.out.println("walks on samething");
    }
}
public class Main {
}


















/*class Animal{

    public void walk(){
        System.out.println("Animal walks");
    }
    Animal(){

        System.out.println();
    }
}

class Horse extends Animal {
    public void walk(){
        System.out.println("walks on 4 legs");

    }
 Horse(){
     System.out.println();
 }
}
class Checkin extends Animal{
    public void walk(){
        System.out.println("walk on 2 legs");
    }
}

public class Main{
    public static void main(String arg[]){
        Horse A = new Horse();
        A.walk();
    }
}
*/
/*class Student {
    private int a ; //a = roll no,
    private String b ; // b= name
    public void get (int x, String y){
        a = x;
        b = y;
    }
    public void show(){
        System.out.println("roll no. = " + a);
        System.out.println("name =" + b);
    }
}
public class Main {
    public static void main(String[] args) {
    Student s1= new Student();
       s1.get(101,"Anish");
       s1.show();
    }
}*/