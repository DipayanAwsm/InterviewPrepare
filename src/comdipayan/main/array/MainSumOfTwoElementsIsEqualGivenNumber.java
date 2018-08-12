/*
	Author:Dipayan
	Date:Aug 11, 2018
	Mail:picku.pickudas@gmail.com
	BeHappy
*/

package comdipayan.main.array;

import comdipayan.array.ArrayCustom;

/*Sum Of Two Elements Is Equal to Given Number
 * x is given and array is given find the sum of two elements
 * */
public class MainSumOfTwoElementsIsEqualGivenNumber {

	public static void main(String[] args) {
		int input[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,22,123,2,123,1};
		ArrayCustom array=new ArrayCustom();
		int data[]=new int[2];
		int target=12;
		data=array.sumOfTwoElementsIsEqualGivenNumber(input,target);
		println(data);
	}

	
	private static void println(int[] data) {
		if(null==data) {
			System.out.println("No such combination exist");
		}if(data.length==2) {
			System.out.println("Such combination exist"+data[0]+","+data[1]);
		}
	}
}


