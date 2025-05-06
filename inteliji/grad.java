

class grad{
    public static void main(String[] args) {
        float p = Float.parseFloat(args[0]);
        if (p<=100 && p>=60){
            System.out.println("1st division");
        } else if (p<60 && p>=45) {
            System.out.println("2nd dividion");
        } else if (p<45 && p>=33) {
            System.out.println("3rd division");
        }
        else if (p<33 && p>=0){
            System.out.println("failed");
        }
        else {
            System.out.println("involid % value");
        }

    }
}