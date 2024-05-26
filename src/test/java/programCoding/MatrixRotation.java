package programCoding;

public class MatrixRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//to move the matrix clockwise 
		//1. transpose the matrix
		//2. swapping the columns
	/*	[123]     [147]       [741]
	    [456]     [258]       [852]
	    [789] =   [369] = 	  [963] 	*/
		
		int m[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int swap;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				System.out.print(m[i][j]+" " +"\t");
				
			}
			System.out.println();
		}
		
		//transpose the matrix
		for(int i=0;i<3;i++) {
			for(int j=i;j<3;j++) {
			
				swap=m[i][j];
				m[i][j]=m[j][i];
				m[j][i]=swap;
				
			}
			
		}
		int l=0;
		int h=2;
		while(l<h) {
			for(int k=0;k<3;k++) {
				int t=m[k][l];
				m[k][l]=m[k][h];
				m[k][h]=t;
				
			}
			l++;
			h--;
		}
	
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				System.out.print(m[i][j]+" " +"\t");
				
			}
			System.out.println();
	}
		
}
}
