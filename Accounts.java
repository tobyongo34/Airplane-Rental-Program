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

    
    public boolean hasNext(Account[] accounts, int current) {
        if (accounts == null) {
            return false;
        }
        for (int i = Math.max(0, current); i < accounts.length; i++) {
            if (accounts[i] != null) {
                return true;
            }
        }
        return false;
    }

    public Account getNext(Account[] accounts, int current) {
        if (accounts == null) {
            return null;
        }
        if (current < 0 || current > accounts.length) {
            throw new ArrayIndexOutOfBoundsException(current);
        }
        for (int i = current; i < accounts.length; i++) {
            if (accounts[i] != null) {
                return accounts[i];
            }
        }
        return null;
    }
    public void reset() {
        current = 0;
    }
    public Account getAccount(Account[] accounts, String creditCardNum) throws AccountNotFoundException {
        if (accounts != null) {
            for (int i = 0; i < accounts.length; i++) {
                Account account = accounts[i];
                if (account != null && (creditCardNum == null
                        ? account.getCreditCardNum() == null
                        : creditCardNum.equals(account.getCreditCardNum()))) {
                    return account;
                }
            }
        }
        throw new AccountNotFoundException();
    }

    public int size() {
        return accounts.length;
    }
}

class AccountNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;
}
