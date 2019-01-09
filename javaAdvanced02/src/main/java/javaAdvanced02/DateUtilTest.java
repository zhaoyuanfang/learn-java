package javaAdvanced02;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
public class DateUtilTest {
	@Test
	public void test() {
		assertEquals(false, new DateUtil().isLeapYear(-100));
		assertEquals(false, new DateUtil().isLeapYear(1000));
		assertEquals(false, new DateUtil().isLeapYear(20000));
		assertEquals(true, new DateUtil().isLeapYear(2020));
		assertEquals(false, new DateUtil().isLeapYear(2019));
		assertEquals(true, new DateUtil().isLeapYear(2000));
		assertEquals(false, new DateUtil().isLeapYear(1900));
	}
}
