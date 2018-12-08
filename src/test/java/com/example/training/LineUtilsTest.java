package com.example.training;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class LineUtilsTest {

	private static List<Long> executedTimes = new ArrayList<>();

	private long start;
	
	private long end;
	
	@BeforeClass
	public static void startupBeforeClass() {
		// warming up
		LineUtils.isOverlap(new Line(0, 0), new Line(0, 0));
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Double reult = executedTimes.stream().collect(Collectors.averagingLong(Long::longValue));
		System.out.println("[AVERGE] : " + reult + " (nano second)");
	}

	@Test
	public void testCase01() {
		Line l1 = new Line(8, 18);
		Line l1r = new Line(18, 8);
		Line l2 = new Line(21, 25);
		Line l2r = new Line(25, 21);

		assertFalse(isOverlapWrapper(l1, l2));
		assertFalse(isOverlapWrapper(l1r, l2));
		assertFalse(isOverlapWrapper(l1, l2r));
		assertFalse(isOverlapWrapper(l1r, l2r));

		assertFalse(isOverlapWrapper(l2, l1));
		assertFalse(isOverlapWrapper(l2, l1r));
		assertFalse(isOverlapWrapper(l2r, l1));
		assertFalse(isOverlapWrapper(l2r, l1r));
	}

	@Test
	public void testCase02() {
		Line l1 = new Line(8, 18);
		Line l1r = new Line(18, 8);
		Line l2 = new Line(18, 23);
		Line l2r = new Line(23, 18);

		assertFalse(isOverlapWrapper(l1, l2));
		assertFalse(isOverlapWrapper(l1r, l2));
		assertFalse(isOverlapWrapper(l1, l2r));
		assertFalse(isOverlapWrapper(l1r, l2r));

		assertFalse(isOverlapWrapper(l2, l1));
		assertFalse(isOverlapWrapper(l2, l1r));
		assertFalse(isOverlapWrapper(l2r, l1));
		assertFalse(isOverlapWrapper(l2r, l1r));
	}

	@Test
	public void testCase03() {
		Line l1 = new Line(8, 18);
		Line l1r = new Line(18, 8);
		Line l2 = new Line(16, 21);
		Line l2r = new Line(21, 16);

		assertTrue(isOverlapWrapper(l1, l2));
		assertTrue(isOverlapWrapper(l1r, l2));
		assertTrue(isOverlapWrapper(l1, l2r));
		assertTrue(isOverlapWrapper(l1r, l2r));

		assertTrue(isOverlapWrapper(l2, l1));
		assertTrue(isOverlapWrapper(l2, l1r));
		assertTrue(isOverlapWrapper(l2r, l1));
		assertTrue(isOverlapWrapper(l2r, l1r));
	}

	@Test
	public void testCase04() {
		Line l1 = new Line(8, 18);
		Line l1r = new Line(18, 8);
		Line l2 = new Line(8, 20);
		Line l2r = new Line(20, 8);

		assertTrue(isOverlapWrapper(l1, l2));
		assertTrue(isOverlapWrapper(l1r, l2));
		assertTrue(isOverlapWrapper(l1, l2r));
		assertTrue(isOverlapWrapper(l1r, l2r));

		assertTrue(isOverlapWrapper(l2, l1));
		assertTrue(isOverlapWrapper(l2, l1r));
		assertTrue(isOverlapWrapper(l2r, l1));
		assertTrue(isOverlapWrapper(l2r, l1r));
	}

	@Test
	public void testCase05() {
		Line l1 = new Line(8, 18);
		Line l1r = new Line(18, 8);
		Line l2 = new Line(12, 18);
		Line l2r = new Line(18, 12);

		assertTrue(isOverlapWrapper(l1, l2));
		assertTrue(isOverlapWrapper(l1r, l2));
		assertTrue(isOverlapWrapper(l1, l2r));
		assertTrue(isOverlapWrapper(l1r, l2r));

		assertTrue(isOverlapWrapper(l2, l1));
		assertTrue(isOverlapWrapper(l2, l1r));
		assertTrue(isOverlapWrapper(l2r, l1));
		assertTrue(isOverlapWrapper(l2r, l1r));
	}

	@Test
	public void testCase06() {
		Line l1 = new Line(8, 18);
		Line l1r = new Line(18, 8);
		Line l2 = new Line(10, 16);
		Line l2r = new Line(16, 10);

		assertTrue(isOverlapWrapper(l1, l2));
		assertTrue(isOverlapWrapper(l1r, l2));
		assertTrue(isOverlapWrapper(l1, l2r));
		assertTrue(isOverlapWrapper(l1r, l2r));

		assertTrue(isOverlapWrapper(l2, l1));
		assertTrue(isOverlapWrapper(l2, l1r));
		assertTrue(isOverlapWrapper(l2r, l1));
		assertTrue(isOverlapWrapper(l2r, l1r));
	}

	@Test
	public void testCase07() {
		Line l1 = new Line(8, 18);
		Line l1r = new Line(18, 8);
		Line l2 = new Line(8, 18);
		Line l2r = new Line(18, 8);

		assertTrue(isOverlapWrapper(l1, l2));
		assertTrue(isOverlapWrapper(l1r, l2));
		assertTrue(isOverlapWrapper(l1, l2r));
		assertTrue(isOverlapWrapper(l1r, l2r));

		assertTrue(isOverlapWrapper(l2, l1));
		assertTrue(isOverlapWrapper(l2, l1r));
		assertTrue(isOverlapWrapper(l2r, l1));
		assertTrue(isOverlapWrapper(l2r, l1r));
	}

	@Test
	public void testCase08() {
		Line l1 = new Line(8, 18);
		Line l1r = new Line(18, 8);
		Line l2 = new Line(3, 20);
		Line l2r = new Line(20, 3);

		assertTrue(isOverlapWrapper(l1, l2));
		assertTrue(isOverlapWrapper(l1r, l2));
		assertTrue(isOverlapWrapper(l1, l2r));
		assertTrue(isOverlapWrapper(l1r, l2r));

		assertTrue(isOverlapWrapper(l2, l1));
		assertTrue(isOverlapWrapper(l2, l1r));
		assertTrue(isOverlapWrapper(l2r, l1));
		assertTrue(isOverlapWrapper(l2r, l1r));
	}

	@Test
	public void testCase09() {
		Line l1 = new Line(8, 18);
		Line l1r = new Line(18, 8);
		Line l2 = new Line(8, 12);
		Line l2r = new Line(12, 8);

		assertTrue(isOverlapWrapper(l1, l2));
		assertTrue(isOverlapWrapper(l1r, l2));
		assertTrue(isOverlapWrapper(l1, l2r));
		assertTrue(isOverlapWrapper(l1r, l2r));

		assertTrue(isOverlapWrapper(l2, l1));
		assertTrue(isOverlapWrapper(l2, l1r));
		assertTrue(isOverlapWrapper(l2r, l1));
		assertTrue(isOverlapWrapper(l2r, l1r));
	}

	@Test
	public void testCase10() {
		Line l1 = new Line(8, 18);
		Line l1r = new Line(18, 8);
		Line l2 = new Line(5, 18);
		Line l2r = new Line(18, 5);

		assertTrue(isOverlapWrapper(l1, l2));
		assertTrue(isOverlapWrapper(l1r, l2));
		assertTrue(isOverlapWrapper(l1, l2r));
		assertTrue(isOverlapWrapper(l1r, l2r));

		assertTrue(isOverlapWrapper(l2, l1));
		assertTrue(isOverlapWrapper(l2, l1r));
		assertTrue(isOverlapWrapper(l2r, l1));
		assertTrue(isOverlapWrapper(l2r, l1r));
	}

	@Test
	public void testCase11() {
		Line l1 = new Line(8, 18);
		Line l1r = new Line(18, 8);
		Line l2 = new Line(1, 15);
		Line l2r = new Line(15, 1);

		assertTrue(isOverlapWrapper(l1, l2));
		assertTrue(isOverlapWrapper(l1r, l2));
		assertTrue(isOverlapWrapper(l1, l2r));
		assertTrue(isOverlapWrapper(l1r, l2r));

		assertTrue(isOverlapWrapper(l2, l1));
		assertTrue(isOverlapWrapper(l2, l1r));
		assertTrue(isOverlapWrapper(l2r, l1));
		assertTrue(isOverlapWrapper(l2r, l1r));
	}

	@Test
	public void testCase12() {
		Line l1 = new Line(8, 18);
		Line l1r = new Line(18, 8);
		Line l2 = new Line(3, 8);
		Line l2r = new Line(8, 3);

		assertFalse(isOverlapWrapper(l1, l2));
		assertFalse(isOverlapWrapper(l1r, l2));
		assertFalse(isOverlapWrapper(l1, l2r));
		assertFalse(isOverlapWrapper(l1r, l2r));

		assertFalse(isOverlapWrapper(l2, l1));
		assertFalse(isOverlapWrapper(l2, l1r));
		assertFalse(isOverlapWrapper(l2r, l1));
		assertFalse(isOverlapWrapper(l2r, l1r));
	}

	@Test
	public void testCase13() {
		Line l1 = new Line(8, 18);
		Line l1r = new Line(18, 8);
		Line l2 = new Line(0, 4);
		Line l2r = new Line(4, 0);

		assertFalse(isOverlapWrapper(l1, l2));
		assertFalse(isOverlapWrapper(l1r, l2));
		assertFalse(isOverlapWrapper(l1, l2r));
		assertFalse(isOverlapWrapper(l1r, l2r));

		assertFalse(isOverlapWrapper(l2, l1));
		assertFalse(isOverlapWrapper(l2, l1r));
		assertFalse(isOverlapWrapper(l2r, l1));
		assertFalse(isOverlapWrapper(l2r, l1r));
	}

	private boolean isOverlapWrapper(Line l1, Line l2) {
		start = System.nanoTime();
		boolean result = LineUtils.isOverlap(l1, l2);
		end = System.nanoTime();
		executedTimes.add(end - start);
		return result;
	}
}
