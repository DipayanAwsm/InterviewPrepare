/*
	Author:Dipayan
	Date:Aug 11, 2018
	Mail:picku.pickudas@gmail.com
	BeHappy
*/

package comdipayan.main.array;

import comdipayan.array.ArrayCustom;

/*This Program  will separate 0 and 1's 0s will be at start and 1s be at end*/
public class MainSeparate0_1 {

	public static void main(String[] args) {
		int []input= {1,1,0,1,1};
		ArrayCustom array=new ArrayCustom();
		array.separate0and1(input);
		print(input);
	}

	private static void print(int[] input) {
		for(int temp:input) {
			System.out.print(temp+" ");
		}
		
	}
}


