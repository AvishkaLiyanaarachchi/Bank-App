class Bank{
	
	//displaying with draw meesage
	public void withDraw(){
		System.out.println("withdraw money");
	}
	
	//dispplaying the message
	public void loanAndInvestment(){
		System.out.println("Get loan");
	}
	
	//displaing the deposit message
	public void deposit(){
		System.out.println("depositing");
	}
}

public class App{
	
	public static void main(String[]args){
		Bank obj = new Bank();
		obj.deposit();
	}
}