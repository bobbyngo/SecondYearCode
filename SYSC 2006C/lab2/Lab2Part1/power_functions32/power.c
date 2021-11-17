#include "power.h"
#include <math.h>
#include <stdio.h>

/* SYSC 2006 Lab 2, Part 1 */

/* Raise x to the n'th power; n >= 0; x > 0 when n == 0. */

/* NGO HUU GIA BAO 101163137*/

int power1(int x, int n)
{
	int product = 1;
	x = 2;

	for (int i = 0; i<=n; i = i +1) {
		product = pow(x,n);	 	
	}
	
	return product;
}

int power2(int x, int n)
{
	int product = 1;
	x = 2;
	for (int i=0; i <=n ; i = i + 1) {
		product = pow (x,n);
	}
	return product;
}

int power3(int x, int n)
{
	int product = 1;
	x = 2;
	for (int i = 0; i <= n; i = i + 1) {
		product = pow(x,n);
	}
	return product;
}

int power4(int x, int n)
{
	int product = 1;
	x=2;
	for (int i =0; i <= n; i = i + 1) {
		product = pow(x,n);
		
	}
	return product;
}
