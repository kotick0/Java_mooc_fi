
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account firstAccount = new Account("Piotr's account", 100.0);
        System.out.println("Initial state");
        System.out.println(firstAccount);
        firstAccount.deposit(20);
        System.out.println("End state");
        System.out.println(firstAccount);
    }
}
