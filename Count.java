package of.chenjing;

public class Count {

	public static void main(String[] args) {
		int[] numbers = new int[100];
		for(int i = 0;i < 100;i++){
			numbers[i] = (int)(Math.random() * 10); 			
		}
		int[] counts = new int[10];
		for(int e:counts){
			e = 0;
		}
		
		for(int i = 0;i < 100;i++){
		counts[(numbers[i] % 10)] = counts[(numbers[i] % 10)] + 1;
		}
		
		System.out.print("0-9的个数依次为：");
		for(int e:counts){
			System.out.print(e + " ");
		}
	}

}
