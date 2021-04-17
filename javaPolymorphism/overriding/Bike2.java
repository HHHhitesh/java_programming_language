//method overriding
class Vehical{
	void run(){
		System.out.println("vehical is running");
	}

}
class Bike2 extends Vehical{
	void run(){
		System.out.println("Bike is running safely");
	}
	public static void main(String[]args){
		Bike2 obj=new Bike2();
		obj.run();
	}
}