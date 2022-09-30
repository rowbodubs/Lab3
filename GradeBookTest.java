import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private static GradeBook gradebook1;
	private static GradeBook gradebook2;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		gradebook1 = new GradeBook(3);
		gradebook2 = new GradeBook(2);
		gradebook1.addScore(69.99);
		gradebook1.addScore(99.69);
		gradebook1.addScore(42.0);
		gradebook2.addScore(99.0);
		gradebook2.addScore(69.42);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		gradebook1 = null;
		gradebook2 = null;
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddScore() {
		assertTrue(gradebook1.toString().equals("69.99 99.69 42.0"));
		assertTrue(gradebook2.toString().equals("99.0 69.42"));
		fail("Not yet implemented");
	}

	@Test
	void testSum() {
		assertEquals(211.68, gradebook1.sum(), .0001);
		assertEquals(168.42, gradebook2.sum(), .0001);
		fail("Not yet implemented");
	}
	@Test
	void testMinimum() {
		assertEquals(42, gradebook1.minimum(), .001);
		assertEquals(69.42, gradebook2.minimum(), .001);
		fail("Not yet implemented");
	}

	@Test
	void testFinalScore() {
		fail("Not yet implemented");
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
