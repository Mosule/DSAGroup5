package de.unistuttgart.vis.dsass2020.ex01.p2;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

//import de.unistuttgart.vis.dsass2020.ex01.p2.SpeedList;


public class SpeedListTest {

	
	
	@Test
	public void testspeedList() {
		SpeedList<String> List = new SpeedList<String>(2);
		if (List.isEmpty()) {
			System.out.println("List is created");
		}
		List.prepend("Drei");
		List.prepend("Zwei");
		List.prepend("Eins");
		List.append("Vier");
		List.append("Fuenf");
		
		assertEquals("Eins", List.getElementAt(0));
		assertEquals("Zwei", List.getElementAt(1));
		assertEquals("Drei", List.getElementAt(2));
		assertEquals("Vier", List.getElementAt(3));
		assertEquals("Fuenf", List.getElementAt(4));
		
		if (List.isEmpty()) {
			System.out.println("List is empty");
		}
		
		assertEquals(5, List.size());
		
		
	}
	
	@Test
	public void testspeedList2() {
		SpeedList<Integer> List = new SpeedList<Integer>(2);
		for (int i= 5; i<10 ; i++) {
			List.append(i);
		}	
		for (int i= 4; i>-1 ; i--) {
			List.prepend(i);
			
		}

			System.out.println(List.getShortcutAt(2));
	}
	
	
}
