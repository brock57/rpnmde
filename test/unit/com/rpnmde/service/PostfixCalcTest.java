package com.rpnmde.service;

import static org.junit.Assert.*;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import org.junit.Test;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class PostfixCalcTest {
	
	@Test
	public void testMain() {
		PostfixCalc test = new PostfixCalc();

		try {
			assertEquals(BigDecimal.valueOf(10), test.calculate("5,2,*"));
			assertEquals(BigDecimal.valueOf(37), test.calculate("22, 15, +"));
			assertEquals(BigDecimal.valueOf(15), test.calculate("16, 1, -"));
			assertEquals(new BigDecimal(2.500).setScale(3, RoundingMode.HALF_UP), test.calculate("10, 4, /"));
			assertEquals(BigDecimal.valueOf(-15), test.calculate("5, 20, -"));
			assertEquals(BigDecimal.valueOf(100), test.calculate("10, 5, *, 50, +")); //more complex inputs
			assertEquals(new BigDecimal(4.000).setScale(3), test.calculate("45, 25, -, 5, /"));
			assertEquals(new BigDecimal(3.333).setScale(3, RoundingMode.HALF_UP),  test.calculate("42, 7, /, 6, *, 26, -, 3, /"));
			assertEquals(new BigDecimal(33.333).setScale(3, RoundingMode.HALF_UP), test.calculate("1000, 30, /"));
		}
		finally {
		}

	}

}
