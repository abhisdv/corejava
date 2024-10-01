package string_pgms;

public class Countvowel {
	public static void main(String[] args) {
		String s=" ali babu ";int countvowel=0;int countsp=0;
		String cons="AEIOUaeiou";
		for (int i = 0; i < s.length(); i++) {
			if(cons.contains(s.charAt(i)+"")) {
				countvowel++;
				
			}
			if(s.charAt(i)==' ') {
				countsp++;
			}
		}
		System.out.println("the number of vowels are : "+countvowel);
		System.out.println("the number of space characters are :"+ countsp);
	}
	
}
