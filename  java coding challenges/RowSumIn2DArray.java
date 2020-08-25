package toDos;

public class RowSumIn2DArray {

	public static void main(String[] args) {
		 int [][] values = {
				 {1, 2, 3, 4},
				 {5, 6, 7, 8}, 
				 {9, 10, 11, 12}
				 
				 };
		 
		  
		 
		 
		 for (int i = 0; i < 3; i++) {
			 
			  int sum1 = 0;
			 for (int j = 0; j < 4; j++) {
				 
				
					 sum1 += values[i][j];
						
			
				
			 }
			 
			 System.out.println("The col of Row " + (i + 1) + " is :" + sum1);
			 
		 }
		 
		 
//		 
		  
		  
		  			 
 
	   
	    
		System.out.println("Sum of row 1: " +  sumRow1(values)); 
		System.out.println("Sum of row 2: "+ sumRow2(values));
		System.out.println("Sum of row 3: "+ sumRow3(values));
	}

private static int sumRow1(int[][] values) {
	int row1Sum = 0;
	 for (int i = 0; i < values[0].length; i++) {
		 
		  
			 row1Sum = row1Sum + values[0][i];
			 
		 
	 }
 return row1Sum;
	
}
		 
		
	

 
		
	

	private static int sumRow2(int[][] values) {
		int row2Sum = 0;
		 for (int i = 0; i < values[1].length; i++) {
			 
			  
		row2Sum = row2Sum + values[1][i];
				 
			 
		 }
      return row2Sum;
		
	}

	private static int sumRow3(int[][] values) {
	 

		int row3Sum = 0;
		 for (int i = 0; i < values[2].length; i++) {
			 
			  
	row3Sum = row3Sum + values[2][i];
				 
			}
     return row3Sum;
	}
	}


