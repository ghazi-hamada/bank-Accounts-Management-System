
package bankaccountsmanagementsystem;

import java.util.*;

public class BankAccountsManagementSystem {

    public static ArrayList<register> list = new ArrayList();
    public static ArrayList<String> trans = new ArrayList();
    public static Scanner in = new Scanner(System.in);
    public static int AccountType;

    public static String getSaltString() {
        String SALTCHARS = "1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    public static void disPlaylogIn() {
        while (true) {

            System.out.println("\tLog in ===>");
            System.out.println("\t---------------------");
            System.out.println("\t\t1.Deposit");
            System.out.println("\t\t2.Withdraw .");
            System.out.println("\t\t3.Transfer ");
            System.out.println("\t\t4.Check balance ");
            System.out.println("\t\t5.Print account transactions");
            System.out.println("\t\t6.back");
            System.out.println("\t\t7.Exit.");
            System.out.print("\tChoose one: ");
            int key = in.nextInt();
            switch (key) {
                case 1:
                    if (AccountType == 1) {

                        System.out.print("\tEnter Amount Of Money :");
                        double Deposit = in.nextDouble();
                        checkingAccount.setDeposit(Deposit);
                        String n = " Added 'ِ" + Deposit + "' to your account \n";
                        trans.add(n);
                    } else if (AccountType == 2) {
                        System.out.print("\tEnter Amount Of Money :");
                        double Deposit = in.nextDouble();
                        savingAccount.setDeposit(Deposit);
                        String n = " Added 'ِ" + Deposit + "' to your account \n";
                        trans.add(n);
                    }
                    break;
                case 2:
                    if (AccountType == 1) {
                        System.out.println("\tEnter Amount Of Money :");
                        double Withdraw = in.nextDouble();
                        checkingAccount.setWithdraw(Withdraw);
                        String x = " Withdrawn '" + Withdraw + "' from your account \n";
                        trans.add(x);
                    } else if (AccountType == 2) {
                        System.out.println("\tEnter Amount Of Money :");
                        double Withdraw = in.nextDouble();
                        savingAccount.setWithdraw(Withdraw);
                        String x = " Withdrawn '" + Withdraw + "' from your account \n";
                        trans.add(x);

                    }

                    break;
                case 3:
                    System.out.print("\tEnter the account number you want to transfer to: ");
                    int s = in.nextInt();
                    if (AccountType == 1) {
                        System.out.print("\tEnter the amount you want to transfer: ");
                        int many = in.nextInt();
                        checkingAccount.setTransfer(many);
                    }
                    if (AccountType == 2) {
                        System.out.println("\tEnter the amount you want to transfer");
                        int many = in.nextInt();
                        savingAccount.setTransfer(many);
                    }
                    break;
                case 4:
                    System.out.println("\t---------------------\n");
                    System.out.println("\tCustomer name :" + register.name);
                    System.out.println("\tArea : " + register.city);
                    System.out.println("\tAge : " + register.age);
                    System.out.println("\tPassword : " + register.password);
                    System.out.println("\tAccount Type : " + register.typeAcc);
                    System.out.println("\taccount ID : " + register.ID);
                    if (AccountType == 1) {
                        System.out.println("Your account contains: " + checkingAccount.getDeposit());
                    } else if (AccountType == 2) {
                        System.out.println("Your account contains: " + savingAccount.getDeposit());
                    }
                    break;
                case 5:
                    System.out.println("\t---------------------\n");
                    System.out.println("\t" + trans);
                    break;
                case 6:
                    return;
                case 7:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }

        }
    }

    static void display_details() {
        System.out.println("\t---------------------\n");
        System.out.println("\tCustomer name :" + register.name);
        System.out.println("\tArea : " + register.city);
        System.out.println("\tAge : " + register.age);
        System.out.println("\tPassword : " + register.password);
        System.out.println("\tAccount Type : " + register.typeAcc);
        System.out.println("\taccount ID : " + register.ID);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            System.out.println("\tATM Project ===>");
            System.out.println("\tWelcome...");
            System.out.println("\t---------------------");
            System.out.println("\t\t1. Log in");
            System.out.println("\t\t2. Register");
            System.out.println("\t\t3. Exit");
            System.out.print("\tChoose one: ");

            int key = in.nextInt();
            switch (key) {
                case 1:
                    System.out.println("\t--------------");
                    System.out.print("\tAccount ID: ");
                    String ID = in.next();
                    System.out.print("\tPassword: ");
                    String password = in.next();
//                    ID.equals(register.getID()) && password.equals(register.getPassword())
                    if (ID.equals(register.ID) && password.equals(register.password)) {
                        disPlaylogIn();
                    } else {
                        System.out.println("\t------------------------------");
                        System.out.println("\tAccount ID or Password is wrong!");
                        System.out.println("Try again...");
                        main(args);
                    }
                    break;
                case 2:
                    System.out.println("\t---------------------\n");
                    System.out.print("\tEnter your name: ");
                    String name = in.next();
                    System.out.print("\tEnter your City: ");
                    String city = in.next();
                    System.out.print("\tHow old are you: ");
                    String age = in.next();
                    System.out.print("\tEnter your password: ");
                    String pass = in.next();

                    System.out.println("\t1.Checking Account");
                    System.out.println("\t2.Saving Account");
                    System.out.print("\tChoose one: ");
                    AccountType = in.nextInt();
                    String typeAcc = null;
                    String IDacc = getSaltString();
                    if (AccountType == 1) {
                        typeAcc = "Checking Account";
                    }
                    if (AccountType == 2) {
                        typeAcc = "Saving Account";
                    }
                    list.add(new register(name, city, age, pass, typeAcc, IDacc));
                    display_details();
                    disPlaylogIn();
                    break;

                case 3:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }

        }

    }
}
