package string_pgms;

public class WhiteSpace {
	public static void main(String[] args) {
		String s = "  hii what is it   ";
//		System.out.println("this is "+s.trim()+" it");
		String snew="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=' ') {
				
				snew+=s.charAt(i);
			}
		}
		System.out.println(snew);
	}
}
