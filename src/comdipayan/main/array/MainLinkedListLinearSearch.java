/*
	Author:Dipayan
	Date:Jul 31, 2018
	Mail:picku.pickudas@gmail.com
	BeHappy
*/

package comdipayan.main.array;

import com.dipayan.node.NodeLinkedList;

public class MainLinkedListLinearSearch {

	public static void main(String[] args) {
		NodeLinkedList node=new NodeLinkedList();
		NodeLinkedList root=node;
		
		for(int i=0;i<10;i++) {
			root.addData(i);
		}
		
		root.traverse();
		root.traverse(root);
		
		int data=1;
		root.linearSearch(data);
		root.linearSearch(root,data);
	}
}


