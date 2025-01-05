import java.util.LinkedList;
public interface Recursive{

	// THIS IS THE SET OF RECURSIVE METHOD HEADERS


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
	public int recursiveGreatestCommonDivisor(int arg1, int arg2);
	
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
	public int fastModExp(int a, int n, int m);

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
	public int findMaxValue(LinkedList<Integer> myList);

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
	 * @see <a href="https://en.wikipedia.org/wiki/Substring">Wikipedia Substring</a>
	 * @param str1 is the string that is the candidate substring
	 * @param str2 is the string we want to check for the substring str1
	 * @return true if str1 is a substring of str2
	 */
	public boolean recursiveIsSubsequence(String str1, String str2);


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
	public int loopLastAlphabeticalChar(String str);

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
	public void loopPrintAllBinary(int n);

	/**
	 * Find log (base 10) of a number.
	 * Assume the number is guaranteed to be a power of ten.
	 *
	 * @param n A number that is a power of 10
	 * @return the number of 0s that follow the 1 in the number.
	 */
	public int loopGetLogBaseTen(long n);

}

