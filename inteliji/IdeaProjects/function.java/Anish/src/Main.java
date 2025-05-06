import java.util.Scanner;

// oops
class pen {
    // decleration method
    String color;
    String type ;
    public void write(){
        System.out.println("write something");
    }


}

class Student {
    String name ;
    int age ;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //constructor
    Student(String name , int age){
        this.name = name ;
        this.age = age ;

        System.out.println("anish");
    }
}

public class string{ // public class
// main class
    // classes ki objects
  public static void main(String arg []){
      /*
        pen sc1 = new pen();
        sc1.color = "blue0";
        sc1.type = "gel";
        sc1.write();*/

    Student s1 = new Student("aman" , 45);
    s1.printInfo();




    }


}

//import javax.sound.midi.Soundbank;
//import java.util.*;

//class Main{
  //  public static void main (String arg []){
        //string format
      /*  String Name  = "Anish ";
        String name = new String("anish");
        System.out.println(name);
        System.out.printf(" ");
        System.out.println(Name);
*/
        /*
        String name = new String("anish");
        System.out.println("my name is ; "+ name);

         */

       /* Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = a+ " " +b;
        System.out.println(c.length());

        // charAT
        for (int i = 0 ; i<c.length(); i++){
            System.out.println(c.charAt(i));
        }
    }
}*/
