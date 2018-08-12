/*
	Author:Dipayan
	Date:Aug 1, 2018
	Mail:picku.pickudas@gmail.com
	BeHappy
*/

package comdipayan.main.array;

import com.dipayan.node.HashTableImplement;

import comdipayan.array.ArrayCustom;

/*Its going to find weather sum of two number is in list or not Using hash method*/
/*
 * Algo
 * 1.put all inthe Hash table
 * 2.a+b=x;
 * 3.find all the b such that b=x-a;in the table if its found the possible
 * ## for this every number must be unique!
 * */

public class MainSumOftwo {
	public static void main(String[] args) {
		int data[]={1,2,3,4,5,6,7,8,9,10};
		ArrayCustom array=new ArrayCustom();
		
		
		
		

		
		int sum=12;
		
		int[] sumOfTwoSubArray=array.SumOfTwoSubArray(data,sum);
		if(null!=sumOfTwoSubArray) {
			System.out.println(sumOfTwoSubArray[0]+"+"+sumOfTwoSubArray[1]);
		}else {
			System.out.println(sumOfTwoSubArray);
		}
	   
		
	}
}


