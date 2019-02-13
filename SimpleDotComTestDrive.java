public class SimpleDotComTestDrive{
	public static void main(String[] args){
		int numOfGuesses = 0;
		
		GameHelper helper = new GameHelper();
		
		SimpleDotCom theDotCom = new SimpleDotCom();
		
		int randomNum = (int)(Math.random() * 5);
		
		int[][] locations = {{randomNum,0},{randomNum+1,0},{randomNum+2,0}};
		
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