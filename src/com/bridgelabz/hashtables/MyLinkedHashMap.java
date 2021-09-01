package com.bridgelabz.hashtables;

import java.util.ArrayList;

import com.bridgelabz.linkedlist.MyLinkedList;

public class MyLinkedHashMap<K,V> 
{
	private final int numBuckets;
	ArrayList<MyLinkedList<K>> myBucketArray;
	
	public MyLinkedHashMap() 
	
	{
		this.numBuckets=10;
		this.myBucketArray=new ArrayList<>(numBuckets);
		
		for(int index=0;index<numBuckets;index++)
		{
			
			this.myBucketArray.add(null);
		}
	}
	
	public V get(K key)
	{
		int index=this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
		if(myLinkedList==null) return null;
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
		return (myMapNode==null)? null : myMapNode.getValue();
		
	}

	private int getBucketIndex(K key) 
	
	{
		int hashCode= Math.abs(key.hashCode());
		int index=hashCode%numBuckets;
		System.out.println("key:"+key+" hashcode: "+hashCode +" index: "+index);
		return index;
	}
	

}
