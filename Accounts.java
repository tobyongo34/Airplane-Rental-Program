public class Accounts {
    Account[] accounts = new Account[50];
    int current;
    public Accounts() {
        initToNulls(accounts);
    }
    private void initToNulls(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = null;
        }
    }
}
