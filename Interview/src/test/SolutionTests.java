package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import core.Solution;

class SolutionTests {

	@Test
	void removeDupInIntArrayRemovesDuplicateIntegers() {
		Integer[] expected = new Integer[] { 1, 3, 5, 9, 7 };
		Integer[] input = new Integer[] { 1, 1, 3, 3, 1, 3, 5, 9, 7, 7, 9 };
		Integer[] actual = Solution.removeDupInIntArray(input);
		//assertEquals(expected, actual);
		assertArrayEquals(expected, actual);
	}

	@Test
	void removeDupInIntArrayRemovesNegativeDuplicateIntegers() {
		Integer[] expected = new Integer[] { 1, -11,3, 5, 9, 7, 0,-2};
		Integer[] input = new Integer[] { 1, 1,-11,-11, 3, 3, 1, 3, 5, 9, 7, 7, 9, 0, 0, -2 };
		Integer[] actual = Solution.removeDupInIntArray(input);
		//assertEquals(expected, actual);
		assertArrayEquals(expected, actual);
	}

}
