package a_Introductory;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Vector2DTest {
	Vector2D v1, v2, v3;

	@Before
	public void setUp() throws Exception {
		/* v1 and v3 are orthogonal, v1 and v2 aren't. */
		v1 = new Vector2D(-2, 4);
		v2 = new Vector2D(1, 2);
		v3 = new Vector2D(2, 1);
	}

	@Test
	public void testDotProduct() {
		assertEquals("v1 and v3 are orthogonal. The dot product should be zero.", 0, v1.dotProduct(v3));
		assertEquals("The dot product of v1 and v2 should be (-2 * 1) + (4 * 2) = 6", 6, v1.dotProduct(v2));
	}
	
	@Test
	public void testOrthogonality() {
		assertFalse("v1 should not be orthogonal to v2", v1.isOrthogonalTo(v2));
		assertTrue("v1 should be orthogonal to v3", v1.isOrthogonalTo(v3));
	}
}
 
