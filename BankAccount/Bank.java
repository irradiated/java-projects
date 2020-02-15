public class Bank {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[3];
            accounts[0] = new CheckingAccount("Peter Pan", "111-222-333", 1200.00);
            accounts[1] = new DailyInterestSavings("Susan White", "111-222-444", 15000.00, 5.75);
            accounts[2] = new TermSavings("John Mckay", "111-222-555", 20000.00, 5.75, 24);

            ((CheckingAccount) accounts[0]).checkProcessing(200.00);
            ((CheckingAccount) accounts[0]).checkProcessing(150.00);

            ((DailyInterestSavings) accounts[1]).deposit(5000.00);
            System.out.println(accounts[1] + "\n");

            ((DailyInterestSavings) accounts[1]).withdraw (2000.00);
            System.out.println(accounts[1] + "\n");


            for (int i = 0; i < 31; i++)
                ((DailyInterestSavings) accounts[1]).calculateInterest();  //calculate daily interest for the month

            ((TermSavings) accounts[2]).calculateInterest();  // calculate the term interest

    /*
    	   	if (accounts[0] instanceof CheckingAccount)
    	   	{
            	((CheckingAccount) accounts[0]).checkProcessing(200.00);
            	((CheckingAccount) accounts[0]).checkProcessing(150.00);
    	   	}

            if (accounts[1] instanceof DailyInterestSavings)
            {
            	((DailyInterestSavings) accounts[1]).deposit(5000.00);
            	System.out.println(accounts[1] + "\n");

            	((DailyInterestSavings) accounts[1]).withdraw (2000.00);
            	System.out.println(accounts[1] + "\n");

            	for (int i = 0; i < 31; i++)
                 ((DailyInterestSavings) accounts[1]).calculateInterest();//calculate daily interest for the month
            }

           	if (accounts[2] instanceof TermSavings)
                ((TermSavings) accounts[2]).calculateInterest();  // calculate the term interest

*/
            for (BankAccount acct : accounts)
            	System.out.println(acct + "\n");

    }
}