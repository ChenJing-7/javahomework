package of.chenjing;

import java.util.Scanner;
public class Diagonal {

	public static void main(String[] args) {
		double matrix [][];
		matrix = new double[4][4];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a " + matrix.length + "-by-" + matrix[0].length + "row by row:");
		for(int row = 0;row < matrix.length;row++){
			for(int column = 0;column < matrix[0].length;column++){
				matrix[row][column] = input.nextDouble(); 
			}
		}
		double sum = sumMajorDiagonal(matrix);
		System.out.println("Sum of the element in the major diagonal is " + sum);
		input.close();
	}
	
	public static double sumMajorDiagonal(double[][] m){
		double sum = 0;
		for(int i = 0;i < m[0].length;i++){
			
			sum += m[i][i];
		}
		return sum;
		
	}
	
}
