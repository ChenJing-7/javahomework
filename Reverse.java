package of.chenjing;

import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		System.out.println("请输入一个整数");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		reverse(num);	
	}
	public static void reverse(int number){
		
		int j = 1;
		int len = 0;
		for(int i = 1;j != 0;i *= 10){
			j = number / (i * 10);
			len++; 
		}
		
		int after = 0;
		for (int i = 1;i <= len;i++){
		int last = number % (int)(Math.pow(10,i));
		last = last / (int)(Math.pow(10,i-1));
		after += last * (int)(Math.pow(10,len - i));
		}
		System.out.println(after);
		
	}
		
	}
