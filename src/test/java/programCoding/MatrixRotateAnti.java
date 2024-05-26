package programCoding;

public class MatrixRotateAnti {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	//to move the matrix anticlockwise 
		//1. transpose the matrix
		//2. swapping the rows
	/*	[123]     [147]       [369]
	    [456]     [258]       [258]
	    [789] =   [369] = 	  [147] 	*/
		
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
				int t=m[l][k];
				m[l][k]=m[h][k];
				m[h][k]=t;
				
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
