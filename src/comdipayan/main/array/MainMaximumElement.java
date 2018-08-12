/*
	Author:Dipayan
	Date:Aug 4, 2018
	Mail:picku.pickudas@gmail.com
	BeHappy
*/

package comdipayan.main.array;

import comdipayan.array.ArrayCustom;

/*This Code is Going to check weather an Array has an element who has occurrence n/2 times*/
public class MainMaximumElement {

	public static void main(String[] args) {
		/*This can be replaced with args[] also */
		String input[]= {"1","1","2","3","1","4","1","0","7"};
		ArrayCustom arrayObject=new ArrayCustom();
		
		System.out.println(arrayObject.findMaximumElements(input));
	}
}


