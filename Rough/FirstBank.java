
class FirstBank{
    public static void main(String[] args){
        Account account = new Account("Avinash","A00001");
        account.deposit(200);
        account.deposit(100);
        account.withdraw(150);
        System.out.println(account.getBalance() + " " + account.getPreviousBalance());
    }
}