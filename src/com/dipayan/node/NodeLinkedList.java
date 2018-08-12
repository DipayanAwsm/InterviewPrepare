/*
	Author:Dipayan
	Date:Jul 31, 2018
	BeHappy
*/
package com.dipayan.node;

public class NodeLinkedList {
	int data;
	
	NodeLinkedList next;
	
	public NodeLinkedList() {
		this.data=0;
		this.next=null;
	}
	public NodeLinkedList(int data) {
		this.data=data;
		next=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public NodeLinkedList getNext() {
		return next;
	}
	public void setNext(NodeLinkedList next) {
		this.next = next;
	}
	public void addData(int data) {
		NodeLinkedList tempNode=new NodeLinkedList(data);
		NodeLinkedList temp=this.next;
		if(null==this.next) {
			this.next=tempNode;
		}else {
			while(null!=temp.next) {
				temp=temp.next;
			}
			temp.next=tempNode;
		}
		
	}
	/*traverse the entire data with out using the root*/
	public void traverse() {
	       NodeLinkedList temp=this;
	       System.out.println();
	       while(null!=temp) {
	    	   System.out.print(temp.getData()+" ");
	    	   temp=temp.next;
	       }
	       
	}
	
	
	/*If some one gives the root directory*/
	public void traverse(NodeLinkedList root) {
		   NodeLinkedList temp=root;
		   System.out.println();
		   while(null!=temp) {
	    	   System.out.print(temp.getData()+" ");
	    	   temp=temp.next;
	       }
		
	}
	public void linearSearch(int data) {
		 NodeLinkedList temp=this;
	       System.out.println();
	       boolean found=false;
	       while(null!=temp) {
	    	  if(data==temp.data) {
	    		 
	    		  found=true;
	    		  break;
	    	  }
	    	   temp=temp.next;
	       }
	       if(found) {
	    	   System.out.println("Data is found:"+data);
	       }else {
	    	   System.out.println("Data not found:"+data);
	       }
	}
	
	/*same lenear search returns entire object*/
	
	public int linearSearchReturnsObject(int data) {
		 NodeLinkedList temp=this;
	       System.out.println();
	       boolean found=false;
	       while(null!=temp) {
	    	  if(data==temp.data) {
	    		 
	    		  found=true;
	    		  break;
	    	  }
	    	   temp=temp.next;
	       }
	       if(found) {
	    	   System.out.println("Data is found:"+data);
	    	   return data;
	       }else {
	    	   System.out.println("Data not found:"+data);
	    	   return -data;
	       }
	}
	
	
	
	
	
	
	
	/*if root is given then linear search*/
	public void linearSearch(NodeLinkedList root, int data) {
	
		 NodeLinkedList temp=root;
	       System.out.println();
	       boolean found=false;
	       while(null!=temp) {
	    	  if(data==temp.data) {
	    		 
	    		  found=true;
	    		  break;
	    	  }
	    	   temp=temp.next;
	       }
	       if(found) {
	    	   System.out.println("Data is found:"+data);
	       }else {
	    	   System.out.println("Data not found:"+data);
	       }
		
	}
	
	
	
}


