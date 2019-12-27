package Bank.entity;

public class Bankaccount {

	public Bankaccount() {

	}

	public Bankaccount(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	private int id;

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	private String name;

	public String getname() {
		return name;
	}


	public void setname(String name) {
		this.name = name;
	}

	private double balance;

	public double getbalance() {
		return balance;
	}

	public void setbalance(double balance) {
		this.balance = balance;
	}

	public void addbalance(double credit) {
		balance = balance + credit;
	}

	public void transferamount(Bankaccount b, double amount) {
		if (balance > amount) {
			balance = balance - amount;
			b.balance = b.balance + amount;

		} else {
			System.out.println("insufficient balance");
		}
	}
}
