/*
	Author:Dipayan
	Date:Aug 4, 2018
	Mail:picku.pickudas@gmail.com
	BeHappy
*/

package comdipayan.main.array;

import comdipayan.array.ArrayCustom;

/*Q> 
 * Find The Maximum difference in 2 elements in an array such that larger elements 
 * appear after smaller Element */
public class MainMaximumDifferenceOfTwoElements {

	public static void main(String[] args) {
		int[] input= {4,3,10,2,9,1,6};
		ArrayCustom array=new ArrayCustom();
		int[] result=array.findMa3xDifferenceWithLargeNumberAfterSmallNaive(input);
		System.out.println(result[0]+"-"+result[1] );
	}
}


