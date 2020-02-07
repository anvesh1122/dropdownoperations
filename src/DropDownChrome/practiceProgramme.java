package DropDownChrome;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class practiceProgramme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s = "javaaaj";
	char[] ch=  s.toCharArray();
	
	 Map<Character ,Integer>m= new HashMap<>();
	 Set<Character>key =m.keySet();
	 
	for(Character c : ch)
	{
		if(m.containsKey(c)) {
			m.put(c,m.get(c)+1);
		}else {
			m.put(c, 1);
		}
		
	}
	for(Character k:key)
	{
		if(m.get(k)>1) {
			System.out.println(k+"="+m.get(k));
		}
	}
	System.out.println(m);
			  }

	}
	



