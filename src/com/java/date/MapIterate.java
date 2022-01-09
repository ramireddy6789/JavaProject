package com.java.date;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Map<String,Long> map=new HashMap<String,Long>();
  map.put("english", 90L);
  map.put("Telugu", 81L);
  map.put("maths", 100L);
  map.put("computers", 85L);
  
  for(Map.Entry<String, Long> iterateMap : map.entrySet())
  {
	  System.out.println("Subject Name : " + iterateMap.getKey() + " " + "Number of Marks obtained : " + iterateMap.getValue());
  }
	}

}
