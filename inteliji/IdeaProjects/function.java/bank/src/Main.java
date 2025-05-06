package bank;

class account {
    public String name ;
    protected String email;
    private String password ;
    public String getPossword(){
        setPassword(randomPass);
        return  this.password;
    }
    public void setPassword(String pass){

    }
}

public class Main {
    public static void main(String[] args) {
       account account1 = new account();
       account1.name = "anish ";
       account1.email = " anish@saji";
       account1.setPassword("abcd");
        System.out.println(account1.getPossword());

    }
}