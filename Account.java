public class Account {
    private int current;
    String creditCardNum;
    String companyName;
    boolean primeCustomer;

    public Account(String creditCardNum, String companyName, boolean primeCustomer) {
        this.creditCardNum = creditCardNum;
        this.companyName = companyName;
        this.primeCustomer = primeCustomer;



    }
    public String getCreditCardNum() {
        return creditCardNum;
    }

    public String getCompanyName() {
        return companyName;
    }

    public boolean isPrimeCustomer() {
        return primeCustomer;
    }
    public String toString() {
        return "Card Number: " + creditCardNum + ", Company Name: " + companyName + ", Prime Customer: " + primeCustomer;
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

    
}

class AccountNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;
}
