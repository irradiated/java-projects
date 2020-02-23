public abstract class Account {
    String name, acctNumber;
    double balance;

    public Account(String name, String acc, double balance) {
        this.name = name;
        acctNumber = acc;
        this.balance = balance;
    }
}