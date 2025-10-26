//-----------Simple bank system----------
class Bank {
    private long[] balance;

    public Bank(long[] balance) {
        this.balance = balance;
        
    }
     public boolean transfer(int account1, int account2, long money) {
        if (!isValidAccount(account1) || !isValidAccount(account2))
        return false;
        if(balance[account1 -1] < money)
        return false;

        balance[account1 - 1] -= money;
        balance[account2 -1] += money;
        return true;
        
    }