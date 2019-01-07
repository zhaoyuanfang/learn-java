package chapter12;
import java.util.*;
public class PairTest2 {
	public static void main(String[] args) {
		GregorianCalendar[] birthdays = 
			{
					new GregorianCalendar(1906, Calendar.DECEMBER, 9),
					new GregorianCalendar(1815, Calendar.OCTOBER, 10),
					new GregorianCalendar(1903, Calendar.DECEMBER, 3),
					new GregorianCalendar(1910, Calendar.JUNE, 1),
			};
		Pair<GregorianCalendar> mm = ArrayAlg2.minmax(birthdays);
		System.out.println("min = " + mm.getFirst().getTime());
		System.out.println("max = " + mm.getSecond().getTime());
	}
}
class ArrayAlg2
{
	public static <T extends Comparable> Pair<T> minmax(T[] a) {
		if (a == null || a.length == 0) return null;
		T min = a[0];
		T max = a[0];
		for (int i = 0; i < a.length; i++)
		{
			if (min.compareTo(a[i]) > 0) min = a[i];
			if (max.compareTo(a[i]) < 0) max = a[i];
		}
		return new Pair<T>(min, max);
	}
}