public class GameTestDriver{
	public static void main(String[] args){
		Game lGame = new Game();
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		boolean havewinner = false;
		int round = 1;
		
		System.out.println("---Game start!---");
		while(true){
			System.out.println("---Round"+round+"---");
			round++;
			lGame.generateNum();
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			if(p1.mNum == lGame.mNum || p2.mNum == lGame.mNum || p3.mNum == lGame.mNum){
				havewinner = true;
			}
			
			if(havewinner){
				System.out.println("We have a winner!");
			}

			System.out.println("Player one guessed " + p1.mNum);
			System.out.println("Player two guessed " + p2.mNum);
			System.out.println("Player three guessed " + p3.mNum);
			
			if(!havewinner){
				System.out.println("Player will have to try again.");
			}		
			else
			{
				System.out.println("---Game over!---");
				break;
			}
		}
	}
}