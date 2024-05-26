package stringsCoding;

public class SubsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="meenakshi";
		String sub1 ="enhri";
		char s[]=s1.toCharArray();
		char sub[]=sub1.toCharArray();
		int j=0;
		int i=0;
		while(i<s1.length() && j<sub1.length()) {
			
			if(sub[j]==s[i]) {
				j++;
				i++;
			}
			else {
				i++;
			}
			}
		if(j==sub1.length()) {
			System.out.print("Subsequence substring");
		}
		else {
			System.out.print("not a Subsequence substring");
	
		}
		
	}

}
