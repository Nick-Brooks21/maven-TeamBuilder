package playerBuilder;

import static org.junit.Assert.*;

import org.junit.Test;

public class PositionTest {

	@Test
	public void PositionPass() {
		BuildPlayer test = new BuildPlayer();
		String position = "RF";
		position = test.position();
		
		String [] Positions = { "C", "1B", "2B", "3B", "SS", "LF", "CF", "RF", "DH" };
		
		for (int i = 0; i < Positions.length; i++) {
			if (position == Positions[i]) {
				assertEquals("That is my favorite position", Positions[i], position);
			}
		}
	}

	@Test
	public void PositionFail() {
		BuildPlayer test = new BuildPlayer();
		String position = "Peru";
		position = test.position();
		
		String [] Positions = { "C", "1B", "2B", "3B", "SS", "LF", "CF", "RF", "DH" };
		
		for (int i = 0; i < Positions.length; i++) {
			if (position != Positions[i]) {
				assertNotEquals("That is not a position in baseball", Positions[i], position);
			}
		}
	}

}
