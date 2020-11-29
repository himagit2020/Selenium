package maven;

import org.testng.annotations.Test;

public class Reversednumber {
	
	@Test
	public static void reversed() {
        int num = 1234, reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
	

