package comdipayan.array;

import java.util.Arrays;

import com.dipayan.node.HashTableImplement;

public class ArrayCustom {

	/*Code fo linear search*/
	public int linearSearch(int[] data, int searchData) {
		// TODO Auto-generated method stub
		int result=-1;
		int length=data.length;
		for(int i=0;i<length;i++) {
			if(searchData==data[i]) {
				return i;
			}
		}
		
		return result;
	}
	
	/*Its a simple binary search program which will return the index of search data if found*/
	/*its a recursive version*/
	/*here leftIndex=0;
	 * rightIndex=input.length-1;
	 * */
	public int binarySearch(int[] input, int leftIndex,int rightIndex,int targetData) {
		if(leftIndex>rightIndex) {
			//System.out.println("Data not found");
			return -1;
		}
		
		int middle=(leftIndex+rightIndex)/2;
		if(targetData==input[middle]) {
			//System.out.println("Data found in binary Search recursiveVersion");
			return middle;
		}
		if(targetData>input[middle]) {
			leftIndex=middle+1;
			return binarySearch(input, leftIndex, rightIndex, targetData);
		}else {
			rightIndex=middle-1;
			return binarySearch(input, leftIndex, rightIndex, targetData);
		}
		
		
	}

	public int binarySearchIterative(int[] input, int leftIndex, int rightIndex, int targetData) {
		int middle=(leftIndex+rightIndex)/2;
		while(rightIndex>=leftIndex) {
			middle=(leftIndex+rightIndex)/2;
			if(targetData==input[middle]) {
				System.out.println("Data is found in iterative binary search");
				return middle;
			}
			
			if(targetData>input[middle]) {
				leftIndex=middle+1;
				
			}else {
				rightIndex=middle-1;
			}
			
		}
		System.out.println("Datanot found inIterative binary Search");
		return -1;
	}

	/*This Method returns the element which is occurring at least n/2 times 
	 * according to MOORE Voting Algorithm
	 * =====================================================================
	 * if such element exist then return that;
	 * else return null;
	 * */
	public String findMaximumElements(String[] input) {
		// TODO Auto-generated method stub
		String result="";
		int count =0;
		String previoues="";
		int occurenceCount=0;
		for(String temp:input) {
			/*if count ==0 then we are adding new element
			 * else checking weather current is == previous or not if it is then we increase count decrease count*/
			if(0==count) {
				count++;
				previoues=temp;
			}else {
				if(previoues.equalsIgnoreCase(temp)) {
					count++;
				}else {
					count--;
				}
			}
		}
		
		
		/*This part is checking previous element is max or not*/
		if(count>=1) {
			for(String temp:input) {
				if(previoues.equalsIgnoreCase(temp)) {
					occurenceCount++;
				}
			}
			if(occurenceCount>=(input.length)/2+1) {
				result=previoues;
			}else {
				result=null;
			}
		}else {
		
			/*As no such element exist*/
			result=null;
		}
		
		
		return result;
	}

	/*Q> 
	 * Find The Maximum difference in 2 elements in an array such that larger elements 
	 * appear after smaller Element */
	public int[] findMa3xDifferenceWithLargeNumberAfterSmallNaive(int[] input) {
		// TODO Auto-generated method stub
		int result[];
		int inputlemgth=input.length;
		int currentDifference=0;
		int smallerElement=input[0];
		int largerElement=input[0];
		for(int i=0;i<inputlemgth;i++) {
			
				
			for(int j=i+1;j<inputlemgth;j++) {
				if(input[i]<input[j]) {
					if(currentDifference<input[j]-input[i]) {
						if(smallerElement>input[i]) {
							smallerElement=input[i];
							currentDifference=input[j]-input[i];
						}
						if(largerElement<input[j]) {
							largerElement=input[j];
							currentDifference=input[j]-input[i];
						}
					}
				
				}
				
			}
		}
			result=new int[2];
			result[0]=smallerElement;
			result[1]=largerElement;
		
		
		return result;
	}

	/*This function will return two elements if their sum is as given target*/
	public int[] SumOfTwoSubArray(int []data,int sum) {
		// TODO Auto-generated method stub
		
		HashTableImplement hash=new HashTableImplement();
		hash.insert(data);
		int[] result=null;
		int index=-1;
		/*finding such b=x-a;*/
	    for(int i=0;i<data.length;i++) {
	    	index=hash.findData(sum-data[i]);
	    	 if(index>=0  ) {
	 	    	System.out.println("such Sum is possible");
	 	    	result=new int[2];
	 	    	result[0]=data[i];
	 	    	result[1]=sum-data[i];
	 	    	break;
	 	    }
	    }
		
		
		return result;
	}

	
	/*Q>/*This function will return two elements if their sum is as given target
	 *========================================================================== 
	 *Algo:
	 *1.find diff matrix such that:diff[i]=diff[i+1]-diff[i]
	 *2.currentDiff=diff[0]'
	 *3.for i= 1:n
	 *	check diff[i-1]>0
	 *        if(yes):update diff[i]=diff[i]+diff[i-1]
	 *        crrentDiff max(currentDiff,diff[i])
	 * 		 
	 *  4.return currentDiff;
	 * */
	public int findMaxDifferenceWithLargeNumberAfterSmallDiffMAtrix(int[] input) {
		int currentDiff;
		int arrayLength=input.length;
		int diff[]=new int[arrayLength-1];
		for(int i=0;i<arrayLength-1;i++) {
			diff[i]=input[i+1]-input[i];
		}
		currentDiff=diff[0];
		for(int i=1;i<arrayLength-1;i++) {
			if(diff[i-1]>0) {
				diff[i]=diff[i]+diff[i-1];
				currentDiff=maximum(currentDiff,diff[i]);
			}
		}
		
		return currentDiff;
	}

	private int maximum(int number1, int number2) {
		return (number1>=number2)?number1:number2;
	}

	
	/*This program is going to find the maximum difference of two elements where larger element is after the small element*/
	/*assumption array is not in decreasing order
	 * all elements are not equal
	 * */
	public int findMaxDifferenceWithLargeNumberAfterSmallApp3(int[] input) {
		int minSorter=input[0];
		int maxDiff=0;
		int small=input[0];
		int max=input[0];
	
		for(int i=1;i<input.length;i++) {
			if(input[i]<minSorter) {
				minSorter=input[i];
			}
			if(maxDiff<input[i]-minSorter) {
				maxDiff=input[i]-minSorter;
				small=minSorter;
				max=input[i];
			}
		}
		return maxDiff;
	}

	/*Given a array or string od numbers of number find the number which one is occuring odd number of times
	 * 
	 *  given only one number occurring only once 
	 * 
	 * */
	public int oddOccringCharacter(String data) {
		// TODO Auto-generated method stub
		int oddOccuringData=Integer.parseInt(data.charAt(0)+"");
		int length=data.length();
		for(int i=1;i<length;i++) {
			oddOccuringData=(char) (oddOccuringData^Integer.parseInt(data.charAt(i)+""));
					
		}
		return oddOccuringData;
	}


/*This Program  will separate 0 and 1's 0s will be at start and 1s be at end*/
	public void separate0and1(int []input) {
		int leftPointer=0;
		int rightPointer=input.length-1;
		while(rightPointer>leftPointer){
			while(0==input[leftPointer]) {
				leftPointer++;
			}
			while(1==input[rightPointer]) {
				rightPointer--;
			}
			if(leftPointer>=rightPointer) {
				break;
			}
			if(1==input[leftPointer]||0==input[rightPointer] ) {
				
					swap(input,leftPointer,rightPointer);
				
			}
		}
	}

	private void swap(int[] input, int leftPointer, int rightPointer) {
		int temp;
		temp=input[leftPointer];
		input[leftPointer]=input[rightPointer];
		input[rightPointer]=temp;
	}

	
	/*Sum Of Two Elements Is Equal to Given Number
	 * x is given and array is given find the sum of two elements
	 * 
	 * if such points exist then return an array size[2] containing those elements
	 * */
	public int[] sumOfTwoElementsIsEqualGivenNumber(int[] input, int target) {
		int result[]=null;
		Arrays.sort(input);
		int leftPointer=0;
		int rightPointer=input.length-1;
		int tempSum=input[leftPointer]+input[rightPointer];
		while(rightPointer>leftPointer) {
			tempSum=input[leftPointer]+input[rightPointer];
			if(tempSum==target) {
				result=new int[2];
				result[0]=input[leftPointer];
				result[1]=input[rightPointer];
				return result;
			}if(tempSum<target) {
				leftPointer++;
			}else {
				rightPointer--;
			}
		}
		return result;
	}

	/*Given an Array Find two elements whose sum is closest to 0 
	 * 
	 * please sent not null array;
	 * */
	public int[] sumClosestTo0(int[] input) {
		if(null==input) {
			return null;
		}
		
		int result[]=new int[2];
		int leftPointer=0;
		int rightPointer=input.length-1;
		Arrays.sort(input);
		int sum=input[leftPointer]+input[rightPointer];
		int tempSmall=input[leftPointer];
		int tempLarge=input[rightPointer];
		int currentSum=0;
		while(rightPointer>leftPointer) {
			currentSum=input[leftPointer]+input[rightPointer];
			if(currentSum==0) {
				result[0]=input[leftPointer];
				result[1]=input[rightPointer];
				return result;
			}
			if(mod(sum)>mod(currentSum)) {
				sum=currentSum;
				tempSmall=input[leftPointer];
				tempLarge=input[rightPointer];
			}
			
			if(sum>0) {
				rightPointer--;
			}
			if(sum<0) {
				leftPointer++;
			}
			
			
		}
		
		result[0]=tempSmall;
		result[1]=tempLarge;
		return result;
	}

	/*It returns the positive value of the data*/
	private int mod(int data) {

		int result=data;
		if(result<0) {
			result=-result;
		}
		return result;
	}


/*There Is a Given Array,and a sum Find three Elements from Array Such that
 * those three elements summation  is given sum 
 * If find such elements return array of size 3 containing elements 
 * else return null
 * this will be n^2*logn solution
 * */
	public int[] findTrippletForGivenSum(int[] input, int sum) {
		// TODO Auto-generated method stub
		int result[]=null;
		Arrays.sort(input);
		int length=input.length-1;
		int lengthI=length;
		int lengthJ=lengthI-1;
		int firstElementIndex;
		int secondElementIndex;
		int thirdElementIndex;
		for(int i=0;i<lengthI;i++) {
			firstElementIndex=i;
			for(int j=0;j<lengthJ;j++) {
				secondElementIndex=j;
				thirdElementIndex=binarySearch(input, 0, length,sum-input[firstElementIndex]-input[secondElementIndex]);
				if(thirdElementIndex!=-1 && thirdElementIndex!=firstElementIndex && thirdElementIndex !=secondElementIndex) {
					result=new int[3];
					result[0]=input[firstElementIndex];
					result[1]=input[secondElementIndex];
					result[2]=input[thirdElementIndex];
					return result;
				}
			}
		}
		return result;
	}

	/*There Is a Given Array,and a sum Find three Elements from Array Such that
	 * those three elements summation  is given sum 
	 * If find such elements return array of size 3 containing elements 
	 * else return null
	 * this will be n^2 solution
	 * */
	public int[] findTippletToGivenSumnSquareSolution(int[] input, int sum) {
		int result[]=null;
		Arrays.sort(input);
		int leftPointer=0;
		int rightPointer=input.length-1;
		int middle;
		int tempSum;
		while(rightPointer>leftPointer) {
			tempSum=input[leftPointer]+input[rightPointer];
			middle=(leftPointer+rightPointer)/2;
			if(input[middle]==(sum-tempSum)) {
				System.out.println("Data Found");
				result=new int[3];
				result[0]=input[leftPointer];
				result[1]=input[middle];
				result[2]=input[rightPointer];
				return result;
			}else if(input[middle]<(sum-tempSum)) {
				leftPointer++;
			}else if(input[middle]>(sum-tempSum)) {
				rightPointer--;
			}
			
		}
		return result;
	}

	/*
/*Find EquiLibium point in array
 *EquiLibium point is where sum from (left to EquiLibium point)==sum from (EquiLibium point to end) 
 *return index if exist else return -1
 **/
	public int equilibriumPoint(int[] input) {
		// TODO Auto-generated method stub
				int length=input.length;
		if(length<1) {
			return -1;
		}else if(length==1) {
			return 0;
		}
		
		int []leftSum=new int[length];
		int index=-1;
		leftSum[0]=input[0];
		for (int i = 1; i < length; i++) {
			leftSum[i]=input[i]+leftSum[i-1];
			
		}
		if(1==leftSum[length-1]%2) {
			System.out.println("No such Data Exist");
			return -1;
		}
		int midSum=leftSum[length-1]/2;
		for (int i = 0; i < length; i++) {
			if(leftSum[i]==midSum) {
				System.out.println("Point found");
				return i;
			}
		}
		return index;
	}

	
}
