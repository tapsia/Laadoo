package tapoo;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	String s1 = "I want to : split the string";
	String[] words = s1.split(":");
	String word1 = words[0];
	String word2 = words[1];
	for(String w: words)
	{
		System.out.println(word1);
		//System.out.println("First String " + word1);  
		//System.out.println("Second String " + word2);
	}
	
	}

}
