package Model;

public class SBIBank extends Bank implements OnlineBankingSystemWithCreateAccount {

    // Online Banking with account creation

    public SBIBank(String ifscCode){
        super("SBI", ifscCode);
    }

    @Override
    public void whichBankingSystem(){
        //System.out.println(bankBalance);
        System.out.println("Hey I am online banking system with bank name " + bankName + " and ifsc Code is " + ifscCode);
    }

    @Override
    public void createOnlineAccount(int accId) {
        accountStorage.put(accId, 0);

        System.out.println("Account Id " + accId + " got created in sbi bank via online method ");
    }




}
