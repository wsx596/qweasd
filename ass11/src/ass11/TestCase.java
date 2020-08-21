package ass11;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {

	@Test
	public void testSample() {
		int[] a = new int[] {1,2,3,4,5,};
		assertEquals(15, getSum(a));
	}
   public int getSum(int[] a)  {
	   int sum = 0;
	   for(int i = 0; i<a.length; i++) {
		   sum += a[i];
	   }
	   return sum;
   }
}
