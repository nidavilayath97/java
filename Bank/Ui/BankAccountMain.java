package Bank.Ui;

import Bank.entity.*;

public class BankAccountMain {
public static void main(String[] args)
	{
	Bankaccount store[]=new Bankaccount[3];
	store[0]=new Bankaccount(1, "alekhya",1000);
	store[0].addbalance(2000);
	
	store[1]=new Bankaccount(2,"Nandini",5000);
	store[1].transferamount(store[0],3000);
	
	
	store[2]=new Bankaccount(3,"Ravi",2000);
	store[2].addbalance(1000);
	
	BankAccountMain m=new BankAccountMain();
	m.print(store);
	
}


public void  print(Bankaccount[] a) {
	for (int i=0; i<3; i++) {
		System.out.println("id:"+a[i].getid() +"name:"+a[i].getname() +"balance:"+ a[i].getbalance());
		
	}
}
	
	

}
