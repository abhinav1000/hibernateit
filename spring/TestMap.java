package com.practice.spring;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	
	
	
	Map<String,String> mapA= new HashMap<String,String>();
	Map<String,String> mapB= new HashMap<String,String>();
	
	public void combineMap(){
		mapA.put("12", "Abhi");
		mapA.put("13", "Akhi");
		
		mapB.put("13", "Akhi");
		mapB.put("2", "Ram");
		
		//mapA.putAll(mapB);
		for(Object map:mapA.keySet()){
			for(Object map1: mapB.keySet()){
				
				String a=mapA.get(map);
				String b=mapB.get(map);
				
				if(map.equals(mapB)){
					
					
				}
			}
		}
		
		System.out.println(mapA);
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		new TestMap().combineMap();
		
		// TODO Auto-generated method stub

	}

}
