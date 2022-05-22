
package bankaccountsmanagementsystem;

import java.util.ArrayList;

public class checkingAccount extends register{
    private static double Deposit;
    private static double Withdraw;
    private static double transfer ;


    public checkingAccount(String name, String city, String age, String password, String typeAcc, String ID, double Deposit,
            double Withdraw, double transfer) {
        super(name, city, age, password, typeAcc, ID);
        this.Deposit=Deposit*0.96;
        this.Withdraw = Withdraw;
        this.transfer = transfer;
    }

    public static double getTransfer() {
        return transfer;
    }

    public static void setTransfer(double transfer) {
        Deposit =Deposit-transfer;
        System.out.println("\tYour account contains:"+Deposit);
    }

    public static void setDeposit(double Deposit) {
        checkingAccount.Deposit = Deposit*0.96;
        System.out.println("\tYour account contains:"+Deposit);
    }

    public static void setWithdraw(double Withdraw) {
         Deposit =Deposit-Withdraw;
         System.out.println("Your account contains:"+Deposit);
    }
    
    
    public static double getDeposit() {
        return Deposit;
    }

    public static double getWithdraw() {
        
        return Withdraw;
    }

}
