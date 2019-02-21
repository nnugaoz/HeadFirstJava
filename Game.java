public class Game{
	public int mNum;
	public void generateNum(){
		System.out.println("I'm thinking of a number between 0 and 999...");
		mNum=(int)(Math.random()*1000);
		System.out.println("Number to guess is " + mNum);
	}
}