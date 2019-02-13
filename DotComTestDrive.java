import java.util.ArrayList;
public class DotComTestDrive{
	public static void main(String[] args){
		int numOfGuesses = 0;
		
		GameHelper helper = new GameHelper();
		
		DotCom theDotCom = new DotCom();
		
		int randomNum = (int)(Math.random() * 5);
		
		ArrayList<Integer> locations = new ArrayList<Integer>();
		locations.add(randomNum);
		locations.add(randomNum + 1);
		locations.add(randomNum + 2);
		
		theDotCom.setLocationCells(locations);
		
		boolean isAlive = true;
		
		while(isAlive){
			String guess = helper.getUserInput("enter a number");
			String result = theDotCom.checkYourself(guess);
			numOfGuesses++;
			
			if(result.equals("kill")){
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guess.");
			}
		}
		
	}
}