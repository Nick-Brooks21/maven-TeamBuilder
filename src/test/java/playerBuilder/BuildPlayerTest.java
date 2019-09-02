package playerBuilder;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuildPlayerTest {

	@Test
	public void JerseyNumTestFail() {
		BuildPlayer test = new BuildPlayer();
		int number = 56;
		number = test.jerseyNum();
		
		assertNotEquals('a', number);		
	}
	
	@Test
	public void JerseyNumTestPass() {
		BuildPlayer test = new BuildPlayer();
		int number = 7;
		number = test.jerseyNum();
		
		assertTrue("Number is too low.", number >= 0);
		assertTrue("Number is too high.", number <= 99);
	}
	
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
