public class AccountMain{
	public static void main(String args[]){
		Account a[]=new Account[2];
		a[0]=new Savings(200,300);
		a[1]=new Current(300,400);
		
		for(int i=0;i<a.length;i++){
		System.out.println(" "+a[i].getBal());
	}
	}
	
}


class Account{
	private int balance;
	
	public Account(int balance){
	this.balance=balance;
	}
	
	public int getBal(){
		return this.balance;
	}

}

class Savings extends Account{
	private int fd;
	
	public Savings(int balance,int fd){
		super(balance);
		this.fd=fd;
	}
	
	public int getBal(){
		return super.getBal()+this.fd;
	}
}

class Current extends Account{
	private int credit;
	
	public Current(int balance,int credit){
		super(balance);
		this.credit=credit;
	}
	
	public int getBal(){
		return super.getBal()+this.credit;
	}
}


