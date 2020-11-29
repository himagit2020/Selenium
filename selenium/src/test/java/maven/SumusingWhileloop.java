package maven;

import org.testng.annotations.Test;

public class SumusingWhileloop {
	
	@Test
	public static void SumusingWhileloop() {
		int num = 10, i = 1, sum = 0;

        while(i <= num)
        {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
		
	}

}
