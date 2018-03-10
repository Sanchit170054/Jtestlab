package a_Introductory;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LineTest {
	Point p1, p2;
	Point p3, p4;
	Line l1;
	Line l2;
	
	@Before
	public void setUp() throws Exception {
		p1 = new Point(2, -3);
		p2 = new Point(3, 7);
		l1 = new Line(p1, p2);

		p3 = new Point(7, 2);
		p4 = new Point(8, 12);
		l2 = new Line(p3, p4);
	}
	
	@Test
	public void testLength() {
		assertEquals(10.0498756, l1.getLength(), 0.0001);
		assertEquals(10.0498756, l2.getLength(), 0.0001);
		assertTrue("l1 should have same length as l2", l1.isSameLengthAs(l2));
	}

}
