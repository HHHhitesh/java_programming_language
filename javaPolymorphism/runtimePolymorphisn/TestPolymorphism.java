class Bank{
	float getRateOfInterest(){return 0;}
}
class SBI extends Bank{
	float getRateOfInterest(){return 8.4f;}
}
class ICICI extends Bank{
	float getRateOfInterest(){return 7.3f;}
}
class AXIS extends Bank{
	float getRateOfInterest(){return 9.7f;}
}
class TestPolymorphism{
	public static void main(String[]args){
		SBI s=new SBI();
		ICICI i=new ICICI();
		AXIS a=new AXIS();
		System.out.println(s.getRateOfInterest());
		System.out.println(i.getRateOfInterest());
		System.out.println(a.getRateOfInterest());
	}
}