/*
	Author:Dipayan
	Date:Aug 5, 2018
	Mail:picku.pickudas@gmail.com
	BeHappy
*/

package comdipayan.main.array;

import comdipayan.array.ArrayCustom;

/*This program is going to find the maximum difference of two elements where larger element is after the small element*/
public class MainMaxiMumDifference {

	public static void main(String[] args) {
		int input[]= {3,1,4,7,5,100,10};
		ArrayCustom arrayObject=new ArrayCustom();
		int maxDifference=arrayObject.findMaxDifferenceWithLargeNumberAfterSmallDiffMAtrix(input);
		System.out.println(maxDifference);
	}
}


