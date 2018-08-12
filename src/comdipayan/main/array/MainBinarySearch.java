/*
	Author:Dipayan
	Date:Aug 1, 2018
	Mail:picku.pickudas@gmail.com
	BeHappy
*/

package comdipayan.main.array;

import comdipayan.array.ArrayCustom;

/*Its a very simple example of binary search*/
/*Input must be a sorted array*/
public class MainBinarySearch {
	
	
	public static void main(String[] args) {
		int[] input= {1,2,3,4,5,6,7,8,9,10,11,12};
		int targetDat=2;
		ArrayCustom binarySearch=new ArrayCustom();
		int leftIndex=0;
		int rightIndex=input.length-1;
		int index=binarySearch.binarySearch(input,leftIndex,rightIndex,targetDat);
		System.out.println("Data is is in:"+index);
		index=binarySearch.binarySearchIterative(input,leftIndex,rightIndex,targetDat);
		System.out.println("Data is is in:"+index );
	}
}


