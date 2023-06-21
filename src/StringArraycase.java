import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class StringArraycase {

	public static void main(String[] args) {
		String s1= "We make computer programs for users."
				+ " We solve real-world computer problems for users."
				+ " So , it is necessary for our computer to interact with the users.";
		
		System.out.println("String length is: "+s1.length());
		
		String[] words=s1.split(" ");
		String reverseString="";
		
		for(String w:words) {
			String reverseword="";
			for(int i=w.length()-1;i>=0;i--) {
				reverseword=reverseword+w.charAt(i);
			}
			reverseString=reverseString+reverseword+" ";
			}
		System.out.println("Reverse words are: "+reverseString);
		
		
		
		HashSet<String> uniqueWords = new HashSet<String>(Arrays.asList(words));
		
		for(String s:uniqueWords) {
			System.out.println("unique words are:"+s);
		}
		
		
		 Map<String, Integer> hashMap = new HashMap<>();
		 String[] word=s1.split(" ");
		 for(String s:word) {
			
			 if(hashMap.containsKey(s)) {
				 hashMap.put(s, hashMap.get(s)+1);}
			 else {
				 hashMap.put(s,1);
			 }
		 }
		 System.out.println(hashMap);
		}

	}


