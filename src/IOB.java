public class IOB {
    static String bankName ="IndianOverseasBank";
    String name;
    double balance;
    double amount;

    IOB(String name , double balance){
        this.name=name;
        this.balance=balance;
    }

    public void showInformation(){
        System.out.println("Customer name : " + name);
        System.out.println("The available balance : " + balance);
    }

    public void deposit(double amount){
        this.amount=amount;
        balance += amount;
        System.out.println("Deposited amount : " + amount);
        System.out.println("The available balance after deposit : " + balance);
    }



    public static void main(String[] args) {
        IOB bala = new IOB("Bala Kumar A " , 1000.00);
        bala.showInformation();
    }
}
