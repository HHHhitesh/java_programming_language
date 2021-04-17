package one;

public class TestAccount{
	public static void main(String[]args){
		Account acc=new Account();
		acc.setAcc_no(292350);
		acc.setName("saniya mirza");
		acc.setEmail("informations@gmail.com");
		acc.setAmount(500f);
		System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
	}
}