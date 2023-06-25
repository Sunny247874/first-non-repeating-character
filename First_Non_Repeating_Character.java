package array_Assignment_1;

import java.util.HashMap;

public class First_Non_Repeating_Character {

	public static int firstNonRepeating(String s)
	{
		HashMap<Character,Integer> h=new HashMap<>();
		
		for(char ch:s.toCharArray())
		{
			
			h.put(ch,h.getOrDefault(ch,0)+1);
		}
		
		for(int i=0;i<s.length();i++)
		{
			if(h.get(s.charAt(i))==1)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		String s="leetcode";
		
		int unique=firstNonRepeating(s);
		System.out.println("First Non Repeating Character:"+unique);

	}

}
