
public class Calculatormain {
public static void main(String[] args)
{
	Calculator calculator=new Calculator();
	int intResult= calculator.add(10,20);
	System.out.println(intResult);
	float floatResult=calculator.add(10.5f,2.2f);
	System.out.println(floatResult);
	
}
}
