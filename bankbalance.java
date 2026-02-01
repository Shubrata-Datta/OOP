class BankAccount{
	private double balance;
	public void deposit(double amount){
		if(amount>0){
			balance+=amount;
		}
	}
	public void withdraw(double amount){
		if(amount>0 && amount<= balance){
			balance-=amount;
		}
	}
	public double getbalance(){
		return balance;
	}
}
public class bankbalance{
	public void main (String[] args){
		BankAccount acc=new BankAccount();
		acc.deposit(5000);
		acc.withdraw(3000);
		System.out.println("Balance:"+acc.getbalance());
	}
}