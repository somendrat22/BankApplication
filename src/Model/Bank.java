package Model;

import java.util.HashMap;

public class Bank {
    String bankName;
    String ifscCode;
    HashMap<Integer, Integer> accountStorage;

    private int BankBalance;

    public Bank(String bankName, String ifscCode){
        this.bankName = bankName;
        this.ifscCode = ifscCode;
        this.accountStorage = new HashMap<>();
        this.BankBalance = 0;
    }



    public void setBankBalance(int amt){
        BankBalance = amt;
    }

    public int getBankBalance(){
        return BankBalance;
    }
    public void addAccount(int accId){
        accountStorage.put(accId, 0);
        System.out.println("Account ID " + accId + " got created in the bank " + bankName );
    }

    public void depositMoney(int accId, int money){
        accountStorage.put(accId, accountStorage.get(accId) + money);
        System.out.println("Balance of account id  " + accId + " is this ->"  + accountStorage.get(accId));
    }



}
