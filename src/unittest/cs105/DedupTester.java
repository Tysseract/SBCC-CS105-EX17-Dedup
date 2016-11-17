package unittest.cs105;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.sbcc.cs105.Dedup;

public class DedupTester {
	private static final int maximumScore = 12;
	private static final int maximumAssignmentScore = 16;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() throws IOException {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		System.out.printf("Your program's functionality scores %d out of %d.\n\n", totalScore, maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		System.out.printf("The assignment is worth a total of %d where the remainder of %d %s\n",
				maximumAssignmentScore, difference, correctedPoint);
		System.out.println("comes from grading related to documentation, algorithms, and other");
		System.out.println("criteria.");
	}

	@Test
	public void testFreshObject() throws Exception {
		ArrayList<Integer> data = Dedup.readData("large.txt");

		assertTrue("There should be none of any number after creating a fresh object.", Dedup.howMany(data, 0) == 0);
		totalScore += 2;
	}

	@Test
	public void testHowMany() throws Exception {
		ArrayList<Integer> data = Dedup.readData("large.txt");
		
		assertEquals("Should only be one 308 in the input file.", 1, Dedup.howMany(data, 308));
		totalScore += 2;

		assertEquals("There should be four 639s in the input file.", 4, Dedup.howMany(data, 639));
		totalScore += 2;
	}

	@Test
	public void testReturnUnique() throws Exception {
		ArrayList<Integer> data = Dedup.readData("large.txt");
		
		ArrayList<Integer> unique = Dedup.returnUnique(data);

		assertEquals("Size of the unique values should be 634.", 634, unique.size());
		totalScore += 2;

		assertEquals("Wrong value at index 200.", 324, (int) unique.get(200));
		totalScore += 2;

		assertEquals("Wrong value at index 0.", 1, (int) unique.get(0));
		assertEquals("Wrong value at index 633.", 998, (int) unique.get(633));
		totalScore += 2;
	}

}
