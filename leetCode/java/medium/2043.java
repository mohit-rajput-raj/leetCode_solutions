class Bank {
    private long[] bank;
    public Bank(long[] balance) {
        this.bank = balance;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(account1>this.bank.length || account2>this.bank.length)return false;
        if(this.bank[account1-1]>=money){
            this.bank[account1-1]-=money;
        }else{
            return false;
        }
        this.bank[account2-1]+=money;
        return true;
    }
    
    public boolean deposit(int account, long money) {
        if(account>this.bank.length)return false;
        this.bank[account-1]+=money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(account>this.bank.length)return false;
        if(this.bank[account-1]>=money){
            this.bank[account-1]-=money;
        }else{
            return false;
        }
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */