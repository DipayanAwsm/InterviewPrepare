/*
	Author:Dipayan
	Date:Aug 5, 2018
	Mail:picku.pickudas@gmail.com
	BeHappy
*/

package comdipayan.main.array;

import comdipayan.array.ArrayCustom;

/*This program is going to find the maximum difference of two elements where larger element is after the small element*/
/*assumption array is not in decreasing order
 * all elements are not equal
 * */
public class MainMaximumDiffernceApproach3 {

	public static void main(String args[]) {

		int input[]= {4,3,10,2,9,1,6};
		ArrayCustom arrayObject=new ArrayCustom();
		int maxDifference=arrayObject.findMaxDifferenceWithLargeNumberAfterSmallApp3(input);
		System.out.println(maxDifference);
	}
}


