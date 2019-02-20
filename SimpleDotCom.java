public class SimpleDotCom{
	int[][] locationCells;
	int numOfHits = 0;
	
	public void setLocationCells(int[][] locs){
		locationCells = locs;
	}
	
	public String checkYourself(String stringGuess){
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for(int[] cell : locationCells){
			if(guess == cell[0] && 0 == cell[1]){
				result = "hit";
				cell[1] = 1;
				numOfHits++;
				break;
			}
		}
		
		if(numOfHits == locationCells.length){
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
}