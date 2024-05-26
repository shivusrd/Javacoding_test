package stringsCoding;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="taani";
		String s1="taanii";
		s=s+"i";
		System.out.println(s);
		if(s!=s1) {
			System.out.println("equal");
		}
		else if(s.equals(s1))
		
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("not equal");
		}
	}

}
