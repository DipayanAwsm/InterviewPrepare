/*
	Author:Dipayan
	Date:Aug 12, 2018
	Mail:picku.pickudas@gmail.com
	BeHappy
*/

package comdipayan.main.array;

import java.util.Date;

import comdipayan.array.ArrayCustom;

/*There Is a Given Array,and a sum Find three Elements from Array Such that
 * those three elements summation  is given sum 
 * If find such elements return array of size 3 containing elements 
 * else return null
 * this will be n^2 solution
 * */
public class MainArrayFindTippletToGivenSumnSquareSolution {

	public static void main(String[] args) {
		
		int input[]= {1,2,3,4,5,6,7324,1231,231,24,234,234,23,4,1-1,1,1,1,-1};
		int sum=6;
		ArrayCustom array=new ArrayCustom();
		Date startTime=new Date();
		int result[]=array.findTippletToGivenSumnSquareSolution(input,sum);
		Date endTime=new Date();
		print(result);
		//System.out.println("Time Taken:"+(endTime.compareTo(startTime)));
	}

	private static void print(int[] data) {
		if(null==data) {
			System.out.println("No such Data Exist");
		}else if(3==data.length) {
			System.out.println(data[0]+","+data[1]+","+data[2]);
		}
		
	}
}


