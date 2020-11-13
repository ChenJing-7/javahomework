package of.chenjing;

import java.util.Scanner;
public class Small {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入10个数字");
		int[] num = new int[10]; 
		for(int i = 0;i < 10;i++){
		num[i] = input.nextInt();
		}
		int index = indexOfSmallestElement(num);
		System.out.println("最小元素的下标为：" + index + "，该下标值为：" + num[index]);
		input.close();
	}
	
	public static int indexOfSmallestElement(int[] array){
		double min = array[0];
		int index = 0;
		for(int i = 0;i < 10;i++){
			if(min > array[i]){
				min = array[i];
				index = i;
			}
			
		}
		return index;
	}
}
