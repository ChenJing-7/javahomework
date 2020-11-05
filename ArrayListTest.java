package ofchenjing;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
	public static void main(String[] args){
		ArrayList<Number> list = new ArrayList<>();
		System.out.println("请输入数字（需要结束时输入0）");
		Scanner input = new Scanner(System.in);
		
		//输入加入list中的数字（0是结束标志）
		Number value;
		do{
			value = input.nextDouble();
			if(value.doubleValue() != 0)
				list.add(value);
		}while(value.doubleValue() != 0);
		
		//用函数进行排序
		sort(list);
		
		//遍历输出
		System.out.println("排序后：");
		for(Number x : list){
			System.out.print(x + " ");
		}
					
	}
	
	//对list中的数字排序
	public static void sort(ArrayList<Number> list){
		Number temp;
		for(int i = 0;i < list.size();i++){
			for(int j = list.size() - 1; j > i;j--){
				if(list.get(j).doubleValue() < list.get(j-1).doubleValue()){
					temp = list.get(j-1);
					list.set(j-1,list.get(j));
					list.set(j, temp);
				}
				
			}
			
		}
		
	}
	
	
}
