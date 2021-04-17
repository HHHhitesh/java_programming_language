package two;
import one.*;

// encapsulations is : Binding the data with method

class Account{                   //get method is use for read only u can not change the value;
	                             //set method :u can not get the value u can only change the value of the data member. 
	private long acc_no;
	private String name,email;
	private float amount;

	public long getAcc_no(){
		return acc_no;
	}
	public void setAcc_no(long acc_no){
		this.acc_no=acc_no;

	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public float getAmount(){
		return amount;
	}
	public void setAmount(){
		this.amount=amount;
	}
}