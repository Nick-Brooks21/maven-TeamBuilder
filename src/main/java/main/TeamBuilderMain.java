package main;
import playerBuilder.*;

public class TeamBuilderMain {

	public static void main(String[] args) {
		
		final int teamSize = 9;
		
		BuildPlayer MookieBetts = new BuildPlayer("Mookie Betts", "RF", 50, "Right", "Right");
		BuildPlayer RafaelDevers = new BuildPlayer("Rafael Devers", "3B", 11, "Left", "Right");
		BuildPlayer XanderBogaerts = new BuildPlayer("Xander Bogaerts", "SS", 2, "Right", "Right");
		BuildPlayer JDMartinez = new BuildPlayer("J.D. Martinez", "DH", 28, "Right", "Right");
		BuildPlayer SamTravis = new BuildPlayer("Sam Travis", "1B", 59, "Right", "Right");
		BuildPlayer AndrewBenintendi = new BuildPlayer("Andrew Benintendi", "LF", 16, "Left", "Left");
		BuildPlayer ChristianVazquez = new BuildPlayer("Christian Vazquez", "C", 7, "Right", "Right");
		BuildPlayer BrockHolt = new BuildPlayer("Brock Holt", "2B", 12, "Left", "Right");
		BuildPlayer GorkysHernandez = new BuildPlayer("Gorkys Hernandez", "CF", 47, "Right", "Right");
		
		String[] BostonRedSox = { MookieBetts.playerDisplay(), RafaelDevers.playerDisplay(), XanderBogaerts.playerDisplay(),
				JDMartinez.playerDisplay(), SamTravis.playerDisplay(), AndrewBenintendi.playerDisplay(),
				ChristianVazquez.playerDisplay(), BrockHolt.playerDisplay(), GorkysHernandez.playerDisplay() };
		
		for (int i = 0; i < teamSize; i++) {
			System.out.println(BostonRedSox[i]);
		}
	
		
		

	}

}
