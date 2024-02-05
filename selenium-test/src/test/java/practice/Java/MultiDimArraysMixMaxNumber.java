// find min no from row and max number from that same row in matrix

package practice.Java;

public class MultiDimArraysMixMaxNumber {
	public static void main(String[] args) {
		int ary[][] = new int[3][3];
		ary[0][0] = 15;
		ary[0][1] = 22;
		ary[0][2] = 13;
		ary[1][0] = 44;
		ary[1][1] = 55;
		ary[1][2] = 60;
		ary[2][0] = 82;
		ary[2][1] = 11;
		ary[2][2] = 92;
		int min = ary[0][0];
		
		int minCol = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(ary[i][j]);
				if (ary[i][j] < min) {
					min = ary[i][j];
					minCol=j;
					
				}
				System.out.print("\t");
			}
			System.out.println(" ");
		}
		int k=0;
		int max = ary[0][minCol];
		while(k<3)
		{
			if(ary[k][minCol]>max)
			{
				max=ary[k][minCol];
			}
			k++;
		}
		System.out.println("min number from matrix is :" + min);

		/*
		 * for (int i = 0; i < 3; i++) { for (int j = 0; j < 3; j++) {
		 * System.out.print(ary[i][j]); if (ary[i][j] > max) { max = ary[i][j]; }
		 * System.out.print("\t"); } System.out.println(" "); }
		 * System.out.println("min number from matrix is :" + max);
		 */

	}

	private static void While(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
