package ofchenjing;
import java.util.Date;

public class DateTest{
	public static void main(String[] args){
		long time = 10000;
		
		for(int i = 1;i <= 8;i++){	
		Date data = new Date(time);
		System.out.println("流逝时间：" + time + "秒" + "\n日期：" + data.toString());
		time *= 10;
		}
		
	}
	
}