public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("1234-5678-9012-3456", "ABC Corp", true);
        Account account2 = new Account("9876-5432-1098-7654", "XYZ Inc", false);
        
        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }
}
