/*
	Author:Dipayan
	Date:Aug 1, 2018
	Mail:picku.pickudas@gmail.com
	BeHappy
*/

package com.dipayan.node;

/*Its a mod 10 hash table*/
public class HashTableImplement {

	private NodeLinkedList []array;
	private static  int ARRAY_LENGTH=10; 
	public HashTableImplement() {
		this.array=new NodeLinkedList[10];
		for(int i=0;i<ARRAY_LENGTH;i++) {
			this.array[i]=new NodeLinkedList();
		}
	}
	
	/*It just inserts the data*/
	public void insert(int[] data) {
	
		NodeLinkedList tempNode;
		int index=0;
		for(int tempData:data) {
			index=tempData%10;
			this.array[index].addData(tempData);
		}
		
		
	}

	/*It checks wather data exist in hash table or not*/
	public int findData(int targetData) {
		int index=targetData%10;
		if(index<0) {
			index=0-index;
		}
		NodeLinkedList node=array[index];
		int data=node.linearSearchReturnsObject(targetData);
		if(data==targetData) {
			System.out.println("Data is found in hash table");
			return index;
		}
		System.out.println("Data not found in hash table");
		return -1;
	}
	
	
}


