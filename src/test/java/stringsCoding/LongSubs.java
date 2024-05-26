package stringsCoding;
import java.util.*;
public class LongSubs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "abc";
		int l=0,r=0,len=0;
		HashSet<Character> hs=new HashSet<Character>();
		while(r<str.length()) {
			if(!hs.contains(str.charAt(r))) {
				hs.add(str.charAt(r));
				r++;
				len++;
			}
			
			else {
				hs.remove(str.charAt(r));
				l++;
				r++;
			}
		}

		System.out.println(hs.size() +"  "+ len);
		System.out.println(str.substring(1));
		
		System.out.println(str.substring(0,1));
	}

}
