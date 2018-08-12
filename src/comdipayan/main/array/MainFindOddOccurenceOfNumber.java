/*
	Author:Dipayan
	Date:Aug 5, 2018
	Mail:picku.pickudas@gmail.com
	BeHappy

 */
package comdipayan.main.array;

import comdipayan.array.ArrayCustom;

/*Given a array or string od numbers of number find the number which one is occuring odd number of times
 * 
 *  given only one number occurring only once 
 * 
 * */
public class MainFindOddOccurenceOfNumber {

	public static void main(String args[]) {
			String data="1122334455667788998";
			ArrayCustom arrayObject=new ArrayCustom();
			int oddOccringCharacter=arrayObject.oddOccringCharacter(data);
			System.out.println(oddOccringCharacter);
	}
}


