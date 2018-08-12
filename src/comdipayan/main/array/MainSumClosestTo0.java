/*
	Author:Dipayan
	Date:Aug 11, 2018
	Mail:picku.pickudas@gmail.com
	BeHappy
*/

package comdipayan.main.array;

import comdipayan.array.ArrayCustom;

/*Given an Array Find two elements whose sum is closest to 0 
 * 
 * */
public class MainSumClosestTo0 {
	public static void main(String[] args) {
		int input[]= {1,2,3,4,5,6,7324,1231,231,24,234,234,23,4,1-1,1,1,1,-1};
		ArrayCustom array=new ArrayCustom();
		int data[];
		data=array.sumClosestTo0(input);
		print(data);
	}

	private static void print(int[] input) {
		System.out.println(input[0]+" "+input[1]);
		
	}
}


