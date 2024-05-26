package programCoding;

public class FreqOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int even=0,odd=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				if(m[i][j]%2==0) {
					even++;
				}
				else 
					odd++;
				
			}
	
	}
		
		System.out.println("Even frequency is "+even +" Odd frequency is"+ odd);

}
}
