package programCoding;

public class MatrixMultiply {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int m[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int n[][]= {{1,2,3},{4,5,6},{7,8,9}};

		int c[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				 c[i][j]=0;
				 for(int k=0;k<3;k++) {
					 
					c[i][j]+= m[i][k]*m[k][j];
				 }
				 System.out.print(c[i][j]+" " +"\t");
			}
			System.out.println();
	}
	}

}
