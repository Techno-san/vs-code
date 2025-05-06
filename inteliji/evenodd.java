 class evenodd{
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
      switch(n%2) {
          case 0:
              System.out.println("even");
              break;
          case 1:
              System.out.println("odd");
              break;
      }
    }
}