
class Account {
    private int balance;
    private String name;
    private String accountNo;
    private int previousBalance;

    Account(String name, String accountNo) {
        this.setName(name);
        this.setAccountNo(accountNo);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPreviousBalance() {
        return previousBalance;
    }

    public void setPreviousBalance(int previousBalance) {
        this.previousBalance = previousBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance += amount;
            setPreviousBalance(amount);
        }
    }

    void withdraw(int amount) {
        if (amount != 0 && balance >= amount) {
            balance -= amount;
            previousBalance = -amount;
        }
    }

}
