public class IOB {
    static String bankName ="IndianOverseasBank";
    String name;
    double balance;
    static double interestRate =5.5;


    IOB(String name , double balance){
        this.name=name;
        this.balance=balance;
    }

    public void showInformation(){
        System.out.println("Customer name : " + name);
        System.out.println("The available balance : " + balance);
        System.out.println(bankName);
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited amount : " + amount);
        System.out.println("The available balance after deposit : " + balance);
    }

    public void withdraw(double amount){
        if (amount<=balance){
            balance = amount-balance;
        }else {
            System.out.println("insufficent balance");
        }
    }

    public void printAnnualIntrest(){
        double interest = (balance * interestRate) / 100;
        System.out.println("Annual interest: " + interest);
    }

    public static void changeBankName(String newName) {
        bankName = newName;
    }



    public static void main(String[] args) {
        IOB bala = new IOB("Bala Kumar A " , 1000.00);
        bala.showInformation();
        changeBankName("Mahindra bank");
    }
}
