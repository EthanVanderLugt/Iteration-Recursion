import java.util.LinkedList;

/**
 * This class implements methods from the recursive class,
 * allowing for a demonstration of recursive classes, which
 * can be expressed as alternatives to loops when solving
 * iterative problems
 * 
 * @author Ethan VanderLugt
 * @version October 2 2024
 * 
 */

public class TesterCode{
    
    /**
	 * This is going to compute the greatest common divisor of
	 * two positive numbers
	 *
	 * Base case: If arg1 == arg2, the GCD is arg1 or arg2.
	 *
	 * Recursive case:
	 * 	If arg1 > arg2, then the GCD = gcd(arg1 - arg2, arg2)
	 * 	If arg1 < arg2, then the GCD = gcd(arg1, arg2 - arg1)
	 * 
	 * @param arg1 The first number to compare
	 * @param arg2 The second number to compare
	 * @return the GCD of arg1 and arg2
	 */
	public static int recursiveGreatestCommonDivisor(int arg1, int arg2){
        if (arg1 == arg2)
            return arg1;
        else if (arg1 > arg2)
            return recursiveGreatestCommonDivisor(arg1 - arg2, arg2);
        return recursiveGreatestCommonDivisor(arg1, arg2 - arg1);
    }

    /**
	 * Fast Modular Exponentiation computes a^n mod m in a way
	 * that is faster than normal. This has computations that occur after
	 * the recursive call, unlike some of the previous examples we looked at.
	 *
	 * Base case: If n == 0, return 1
	 *            If n == 1, return a
	 *
	 * Recursive case:
	 * 	Assume that "x" = fastModExp(a, n/2, m)
	 *
	 *	   if n is even:
	 *       then fastModExp = x^2 (mod m)	
	 *		if n is odd:
	 * 		then fastModExp = (x^2 * a) (mod m)
	 *
	 * Solve this recursively. While you may use a helper method for this, you should
	 * not need one.
	 * @param a The base number to be raised to an exponent
	 * @param n The power to raise the value to
	 * @param m The modulo operation
	 * @return The result a^n mod m
	 */
	public static int fastModExp(int a, int n, int m){
        if (n == 0)
            return 1;
        else if (n == 1)
            return a;
        int x = fastModExp(a,n/2,m);
		if (n % 2 == 0)
			return (int) Math.pow(x,2) % m;
		return (int) Math.pow(x,2) * a % m;
    }

    /**
	 * This returns the maximum value of a list.
	 * You may destructively modify the list, and/or make a helper method!
	 * However, you cannot use a loop.
	 * Assume that the length of a list is always at least 1. 
	 *
	 * Hint: We can remove the first element of a LinkedList using .removeFirst()
	 * 		 What is our base case? 
	 *
	 * @param myList the list of integers that we need to find the maximum value from.
	 * @return int of the maximum found value.
	 */
	public static int findMaxValue(LinkedList<Integer> myList){
        if (myList.size() == 1)
			return  myList.getFirst();
		else if (myList.get(1) > myList.getFirst())
			myList.removeFirst();
		else
			myList.remove(1);
		return (findMaxValue(myList));
    }

	/**
	 * This returns true if str1 is a subsequence of str2.
	 * We say that str1 is a subsequence of str2 if you can convert str2 to str1
	 * by only deleting characters. We cannot rearrange or add characters in the process.
	 *
	 * So "EVIL" is a substring of "pomErVILle"
	 * Similarly, "mILe" is also a substring!
	 * A string is also a substring of itself, since you can choose to delete 0 characters,
	 * so "pomErVILle" is a substring of "pomErVILle" as well!
	 *
	 * Hints: 	What are the valid substrings of the empty string ""?
	 *			What is left to be checked if first characters of each string match? What if they don't?
	 *
	 * @see <a hreif (str.substring(str.length()-1, str.length()).equals((char)))f="https://en.wikipedia.org/wiki/Substring">Wikipedia Substring</a>
	 * @param str1 is the string that is the candidate substring
	 * @param str2 is the string we want to check for the substring str1
	 * @return true if str1 is a substring of str2
	 */
	public static boolean recursiveIsSubsequence(String str1, String str2){
        if (str2.equals(""))
			return false;
		else if (str1.equals(str2))
			return true;
		else if (str2.substring(0,1).equals(str1.substring(0,1)))
			return recursiveIsSubsequence(str1.substring(1), str2.substring(1));
		return recursiveIsSubsequence(str1, str2.substring(1));
	}

	// THIS IS THE SET OF LOOP METHOD HEADERS
	// IN YOUR JAVADOC COMMENTS, PROVIDE A TIME COMPLEXITY
	
	/**
	 * Finds the index of the last alphabetical character (upper or lower case)
	 * that occurs in str.
	 *
	 * In str "Ab23123ZB; 32", this would return 8 since B is at index 8.
	 *
	 * Be careful of upper and lowercase characters!
	 * @param str	The string to check
	 * @return index of the last alphabetical character
	 */
	public static int loopLastAlphabeticalChar(String str){
		char check;
		for (int i = str.length()-1; i > 0; i--){
			check = str.charAt(i);
			if (((int) check > 64 && (int) check < 91) || ((int) check > 96 && (int) check < 123))
				return i;
		}	
		return 0;
	}

	/**
	 * Print all possible combinations of 1 and 0 for a binary string of length n
	 *
	 * For instance, if n is 3, it will print:
	 * 000 001 010 011 100 101 110 111
	 *
	 * It can be in any order.
	 *
	 * Hint: You may use Integer.toBinaryString(int n). You can assume it has a time complexity of O(log(n)).
	 *       You may also use Math.pow(double j, double k), which you can assume has a time complexity of O(1).
	 *
	 * @param n	The length of the binary string.
	 *
	 */
	public static void loopPrintAllBinary(int n){
		for (int i = 0; i < Math.pow(2,n); i++)
			System.out.print(Integer.toBinaryString(i) + " ");
	}
	/**
	 * Find log (base 10) of a number.
	 * Assume the number is guaranteed to be a power of ten.
	 *
	 * @param n A number that is a power of 10
	 * @return the number of 0s that follow the 1 in the number.
	 */
	public static int loopGetLogBaseTen(long n){
		int count = 0;
		while(n / 10 > 0){
			count++;
			n /= 10;
		}
		return count;
	}

    public static void main(String[] args){
        System.out.println(recursiveGreatestCommonDivisor(20, 4));
        System.out.println(fastModExp(40, 21, 11));
        LinkedList<Integer> test = new LinkedList<Integer>();
        test.addFirst(1);
        test.addFirst(3);
        test.addFirst(4);
        test.addFirst(2);
        test.addFirst(5);
        System.out.println(findMaxValue(test));
        System.out.println(loopLastAlphabeticalChar("Ab23123ZB; 32"));
        loopPrintAllBinary(4);
        System.out.printf("%n");
        System.out.println(loopGetLogBaseTen(1000000000));
    }
}

