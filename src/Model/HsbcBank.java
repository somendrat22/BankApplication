package Model;

public class HsbcBank extends Bank{
    public HsbcBank(String ifscCode){
        super("HSBC", ifscCode);
    }

    public void whichBankingSystem(){
        System.out.println("Hey I am online banking system with bank name " + bankName + " and ifsc Code is " + ifscCode);
    }


    public void createOnlineAccount(int accId){
        accountStorage.put(accId, 0);

        System.out.println("Account Id " + accId + " got created in sbi bank via online method ");
    }
}
