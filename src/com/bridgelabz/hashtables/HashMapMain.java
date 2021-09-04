package com.bridgelabz.hashtables;


public class HashMapMain {

	public static void main(String[] args) 
	
	{
		String sentence="To be or not to be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<String, Integer>();
		String words[] = sentence.toLowerCase().split(" ");
		for(String word:words)
		{
			Integer value=myHashMap.get(word);
			if(value==null)
			{
				value=1;
			}
			else 
			{
				value=value+1;
			}
				
			myHashMap.add(word, value);
				
			
		}
		
		myHashMap.add(null,1);
		
		System.out.println(myHashMap);
		String keyToGetFrequency="to";
		Integer frequency = myHashMap.get(keyToGetFrequency);
		System.out.println("frequenct of the word 'to' is :"+frequency);
		

	}

}
