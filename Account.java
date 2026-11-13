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
}


