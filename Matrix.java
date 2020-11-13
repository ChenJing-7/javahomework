package of.chenjing;

import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		System.out.println("请输入一个正整数");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		printMatrix(n);
		input.close();

	}
	public static void printMatrix(int n){
		
		for(int i = 1;i <= (int)(Math.pow(n,2));i++){
			double a = Math.random();
			int b = (int)((a < 0.5)? 0 : 1);
			if(i % n == 0){
				System.out.println(b);
			}else{
				System.out.print(b + " ");
			}
		}
				
	}

}
