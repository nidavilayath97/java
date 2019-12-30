package Wallet.Entity;

public class WalletEntity {
	
	private String mobileno;
	private String name;
	private double balance;
	
	public WalletEntity() {
		
	}
	
	public WalletEntity (String mobileno ,String name, double balance) {
		this.mobileno=mobileno;
		this.name=name;
		this.balance=balance;
		}
	
	
	public String getmobileno() {
		return mobileno;
	}
	
	public void setmobileno() {
		this.mobileno=mobileno;
		
	}
	
	
	public String getname() {
		return name;
	}
	
	public void setname() {
		this.name=name;
		
	}
	
	
	public double getbalance() {
		return balance;
	}
	
	public void setbalance() {
		this.balance=balance;
		
	}
	public void transferamount(WalletEntity b, double amount) {
		if(balance>amount) {
			balance=balance-amount;
			b.balance=b.balance+amount;
		}
		
		else {
			System.out.println("Insufficient balance:");
		}
		}
	}
	
	
	
	


