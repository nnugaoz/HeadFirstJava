public class ZhanJianTestDriver{
	public static void main(String[] args){
		String[][] AStatus = {{"B0","0"},{"C0","0"},{"D0","0"}};
		ZhanJian A = new ZhanJian();
		A.setName("Go2.com");
		A.setStatus(AStatus);
		
		String[][] BStatus = {{"D2","0"},{"D3","0"},{"D4","0"}};
		ZhanJian B = new ZhanJian();
		B.setName("Pets.com");
		B.setStatus(BStatus);
		
		String[][] CStatus = {{"G3","0"},{"G4","0"},{"G5","0"}};
		ZhanJian C = new ZhanJian();
		C.setName("AskMe.com");
		C.setStatus(CStatus);
		
		String guess="";
		System.out.print("Enter a guess ");
		guess = System.in.read();
		System.out.print(guess);
	}
}