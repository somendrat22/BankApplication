package Model;

public class KarnatkaBank extends Bank implements OnlineBankingSystemWithCreateAccount{

    public KarnatkaBank(String ifsc){
        super("KarnatkaBank", ifsc);
    }

    @Override
    public void whichBankingSystem() {

    }

    @Override
    public void createOnlineAccount(int accId) {

    }
}
