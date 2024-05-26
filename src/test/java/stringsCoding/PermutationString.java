package stringsCoding;

public class PermutationString {
	
	static void permut(String input, String result) {
		if(input.length()==0) {
			System.out.println(result+"  ");
			return;
		}
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			String rest=input.substring(0,i)+input.substring(i+1);
			permut(rest,result+ch);
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String str="abc";
		permut(str,"");

	}

}
