package a_Introductory;


import org.junit.Before;
import static org.junit.Assert.*;

public class PointTest {
	Point p1, p2, p3;
	
	@Before
	public void setUp() throws Exception {
		p1 = new Point(7, 9);
		p2 = new Point(-3, -30);
		p3 = new Point(-10, 3);
	}
	
	public void testAdd() {
		Point res1 = p1.add(p2);
		Point res2 = p1.add(p3);
		
		assertEquals(4, (int) res1.x);
		assertEquals(-21,(int) res1.y);
		assertEquals(-3,(int) res2.x);
		assertEquals(12, (int) res2.x);
	}
	
	public void testSub() {
		Point res1 = p1.sub(p2);
		Point res2 = p1.sub(p3);
		
		assertEquals(4,(int) res1.x);
		assertEquals(-21, (int) res1.y);
		assertEquals(-3, (int) res2.x);
		assertEquals(12, (int) res2.x);
	}

}
