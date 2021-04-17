class Bike{
	final void run()
	{
		System.out.println("running");
	}
}
class Honda extends Bike{
	void run()
	{
		System.out.println("running safely with 100 kmph");
	}

	public static void main(String[]args){
		Honda honda=new Honda();
		honda.run();	}


}