package com.rpnmde.service;

import static org.junit.Assert.*;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import org.junit.Test;
import java.util.Scanner;

public class PostfixCalcTest {
	
	@Test
	public void testMain() {
		PostfixCalc test = new PostfixCalc();

		try {
			assertEquals(Double.valueOf(10), test.calculate("5,2,*"));
			assertEquals(Double.valueOf(37), test.calculate("22, 15, +"));
			assertEquals(Double.valueOf(15), test.calculate("16, 1, -"));
			assertEquals(Double.valueOf(2.5), test.calculate("10, 4, /"));
			assertEquals(Double.valueOf(-15), test.calculate("5, 20, -"));
			assertEquals(Double.valueOf(100), test.calculate("10, 5, *, 50, +")); //more complex inputs
			assertEquals(Double.valueOf(4), test.calculate("45, 25, -, 5, /"));
			assertEquals(Double.valueOf(3.333), test.calculate("42, 7, /, 6, *, 26, -, 3, /"));
			assertEquals(Double.valueOf(33.333), test.calculate("1000, 30, /"));
		}
		finally {
		}

	}

}
