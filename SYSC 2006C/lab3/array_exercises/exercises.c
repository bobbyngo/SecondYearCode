/* SYSC 2006 Lab 3. 

 * Incomplete implementations of the functions that will be coded during the lab.
 */

#include <stdlib.h>
#include <math.h>
#include <stdbool.h>

#include "exercises.h"

/* Exercise 1. */

/* Return the average magnitude of the n doubles in x[]. 
 * This function assumes that parameter n is >= 1.
 */
double avg_magnitude(double x[], double n)
{
	double sum = 0.0;

	for (int i = 0; i < n; ++i)
	{

		x[i] = fabs(x[i]);
		sum = sum + x[i];
	}

	return sum / n;
}

/* Exercise 2. */

/* Return the average power of the n doubles in x[].
 * This function assumes that parameter n is >= 1.
 */
double avg_power(double x[], double n)
{
	double sum = 0.0;

	for (int i = 0; i < n; ++i)
	{
		double power = pow(x[i], 2);
		sum = sum + power;

	}
	return sum / n;
}

/* Exercise 3. */

/* Return the largest of the n doubles in arr[]. 
 * This function assumes that parameter n is >= 1.
 */
double max(double arr[], int n)
{
	double maxVal = 0.0;

	for (int i = 0; i < n; ++i)
	{
		if (maxVal < arr[i])
		{

			maxVal = arr[i];
		}
	}
	return maxVal;
}

/* Exercise 4. */

/* Return the smallest of the n doubles in arr[]. 
 * This function assumes that parameter n is >= 1.
 */
double min(double arr[], int n)
{

	double minVal = 10.0;
	for (int i = 0; i < n; ++i)
	{
		if (minVal > arr[i])
		{
			minVal = arr[i];
		}
	}
	return minVal;
}

/* Exercise 5. */

/* Normalize the n doubles in x[]. 
 * This function assumes that parameter n is >= 2, and that at least
 * two of the values in x[] are different.
 */
void normalize(double x[], int n)
{
	double maxVal = max(x, n);
	double minVal = min(x, n);

	for (int i = 0; i < n; ++i)
	{
		x[i] = (x[i] - minVal) / (maxVal - minVal);
	}
}
