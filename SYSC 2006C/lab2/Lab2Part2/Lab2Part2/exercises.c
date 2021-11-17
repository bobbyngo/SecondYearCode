/* SYSC 2006 Lab 2, Part 2.
 *
 * Incomplete implementations of the functions that will be coded during the lab. 
 */


#include <stdlib.h>
#include <math.h>

#include "exercises.h"

/* Returns n! for n >= 0. (0! is defined to be 1.)
   Note that the return type is int, and n! grows rapidly as n increases,
   so this function should only be used for fairly small values of n; 
   i.e., if ints are implemented as 32-bit values, n must be <= 15.
 */
int factorial(int n)
{
	int fact = 1;
	for (int i = 1; i <= n; i++)										/* NGO HUU GIA BAO 101163137*/
	{
		if (n == 0)
		{
			return 1;
		}
		else
		{
			fact = fact * i;
		}
	}
	return fact;
}

/* Returns the number of different ordered subsets of k objects picked
   from a set of n objects, for n > 0, k > 0, n >= k.
 */
int ordered_subsets(int n, int k)
{
	int result;

	result = factorial(n) / factorial(n - k);

	return result;
}

/* Returns the binomial coefficient (n k); that is, the number of 
   combinations of k objects that can be chosen from a set of n objects, 
   for n > 0, k > 0, n >= k.
 */
int binomial(int n, int k)
{
	int result;

	result = ordered_subsets(n, k) / factorial(k);	// n! / (n-k)! / k!

	return result;
}

/* Returns the cosine of x (measured in radians) by calculating
 * the first n terms of the infinite series expansion of cosine.
 */
double cosine(double x, int n)
{
	return -2.0;
}
