public class Player{
	public int mNum;
	
	public void guess(){
		mNum = (int)(Math.random()*1000);
		System.out.println("I'm guessing " + mNum);
	}
}