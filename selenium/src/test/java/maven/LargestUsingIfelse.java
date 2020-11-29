package maven;

import org.testng.annotations.Test;

public class LargestUsingIfelse {
	@Test

	public static void LargestUsingIfelse() {
		int num1 = 15, num2 = 150, num3 = 350;

	      if( num1 > num2 && num1 > num3)
	          System.out.println(num1+" is the largest Number");

	      else if (num2 > num1 && num2 > num3)
	          System.out.println(num2+" is the largest Number");

	      else
	          System.out.println(num3+" is the largest Number");
		
	}

}
