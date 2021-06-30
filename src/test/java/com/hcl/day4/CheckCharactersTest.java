package com.hcl.day4;

import junit.framework.TestCase;

public class CheckCharactersTest extends TestCase {

	public CheckCharactersTest() {
	}

	public void testCharCheck() {
		assertEquals(1, UserMainCode.checkCharacters("the picture was great"));
		assertEquals(-1, UserMainCode.checkCharacters("this"));
	}
}
