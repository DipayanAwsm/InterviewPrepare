/*
	Author:Dipayan
	Date:Aug 12, 2018
	Mail:picku.pickudas@gmail.com
	BeHappy
*/

package comdipayan.main.array;

import comdipayan.array.ArrayCustom;

/*Find EquiLibium point in array
 *EquiLibium point is where sum from (left to EquiLibium point)==sum from (EquiLibium point to end) */
public class MainEqulibiumPoint {

	public static void main(String[] args) {
		int input[]= {10,5,15,3,4,21,2};
		ArrayCustom array=new ArrayCustom();
		int equlibriumPoint=array.equilibriumPoint(input);
		print(equlibriumPoint);
	}

	private static void print(int equlibriumPoint) {
		if(0>equlibriumPoint) {
			System.out.println("No such pointExist");
		}else {
			System.out.println(""+equlibriumPoint);
		}
		
	}
}


