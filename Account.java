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
    public Account getAccount(String creditCardNum) {
        java.util.NoSuchElementException exception = new java.util.NoSuchElementException("Account with credit card number " + creditCardNum + " not found.");
        throw exception;
    }
}
