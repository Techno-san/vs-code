class shape{
    public void display(){
        System.out.println("abcd");
    }
}

class ractangle {
    public void area(){
        System.out.println("dcab");
    }
}
class cube{
    public void volume(){
        System.out.println("abd");
    }
}
class Main {
    public static void main(String arg[]) {
        cube a1 = new cube();
        
        a1.volume();
    }
}