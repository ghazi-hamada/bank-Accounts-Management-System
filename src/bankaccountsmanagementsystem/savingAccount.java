package bankaccountsmanagementsystem;

public class savingAccount extends register {

    private static double Deposit;
    private static double Withdraw;
    private static double transfer;

    public savingAccount(String name, String city, String age, String password, String typeAcc, String ID) {
        super(name, city, age, password, typeAcc, ID);
        this.Deposit = Deposit * 0.98;
        this.Withdraw = Withdraw;
    }

    public static void setDeposit(double Deposit) {
        savingAccount.Deposit = Deposit * 0.98;
        System.out.println("\tYour account contains:" + Deposit);
    }

    public static void setWithdraw(double Withdraw) {
        Deposit = Deposit - Withdraw;
        System.out.println("\tYour account contains:" + Deposit);
    }

    public static void setTransfer(double transfer) {
        Deposit = Deposit - transfer;
        System.out.println("Your account contains:" + Deposit);
    }

    public static double getDeposit() {
        return Deposit;
    }

    public static double getWithdraw() {

        return Withdraw;
    }

}
