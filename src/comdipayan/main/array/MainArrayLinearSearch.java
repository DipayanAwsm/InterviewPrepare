package comdipayan.main.array;
/* Author:Dipayan
 * Be Happy
 * */

import comdipayan.array.ArrayCustom;

/*Wap for linear search*/
public class MainArrayLinearSearch {

	public static void main(String[] args) {
		ArrayCustom array=new ArrayCustom();
		int data[]= {1,2,3,4,5,6,7,8,9,10,11,12};
		int searchData=12;
		int index=array.linearSearch(data,searchData);
		System.out.println(index);
	}
}
