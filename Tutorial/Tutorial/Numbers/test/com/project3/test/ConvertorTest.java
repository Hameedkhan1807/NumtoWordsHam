package com.project3.test;
/**
 * 
 */

import static org.junit.Assert.*;

import org.junit.*;

import com.project3.java.Convertor;



public class ConvertorTest {
	
	@Test
	public void checkNotNull() {
		Convertor convtest = new Convertor();
		String str = convtest.convert(10);
		Assert.assertNotNull(str);
	}

	@Test
	public void checkInt() {
		Convertor convtest = new Convertor();
		Assert.assertEquals("fifty", convtest.convert(50));
	}

	@Test
	public void checkNegativeNumber() {
		Convertor convtest = new Convertor();
		Assert.assertEquals("negative twenty three", convtest.convert(-23));
	}

	@Test
	public void checklargeNumber() {
		Convertor convtest = new Convertor();
		Assert.assertEquals("three hundred thirty four million four hundred thirty four thousand five hundred sixty seven",
				convtest.convert(334434567));
	}

}
