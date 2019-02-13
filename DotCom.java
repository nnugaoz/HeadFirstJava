import java.util.ArrayList;
public class DotCom{
	ArrayList<Integer> locationCells = new ArrayList<Integer>();
	
	public void setLocationCells(ArrayList<Integer> locs){
		locationCells = locs;
	}
	
	public String checkYourself(String stringGuess){
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		if(locationCells.contains(guess)){
			result = "hit";
			locationCells.remove((Integer)guess);
		}
		
		if(0 == locationCells.size()){
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
}