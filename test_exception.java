public class test_exception {
    double balance=500;
    void withdraw(double amount) throws custom_exception{
        if(amount>balance)
        {
            throw new custom_exception("Insufficient Balance. Withdrawal Failed.");
        }
        if(amount<0)
        {
            throw new custom_exception("Invalid Amount. Withdrawal Failed.");
        }

        balance-=amount;
        System.out.println("Withdrawal Successful. Remaining balance: "+balance);

    }
    public static void main(String[] args) {
        test_exception te=new test_exception();
        try{
            te.withdraw(600);
        }catch(custom_exception e){
            System.out.println(e.getMessage());
        }
    }
}
