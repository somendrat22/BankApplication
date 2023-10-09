package Model;

public class HdfcBank extends  Bank{
    public HdfcBank(String ifscCode){
        super("HDFC", ifscCode);
    }

    public void whichBankingSystem(){
        System.out.println("Hey I am online banking system with bank name " + bankName + " and ifsc Code is " + ifscCode);
    }

}
