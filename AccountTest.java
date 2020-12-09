package ofchenjing;
import java.util.Date;

public class AccountTest{
	public static void main(String[] args){
		Account Account = new Account(1122,20000);//创建一个账户ID
		Account.setannualInterestRate(4.5); //年利率为4.5%
		Account.withDraw(2500);//取款
		Account.deposit(3000);//存款
		System.out.println("余额：" + Account.getbalance());//打印余额
		System.out.println("月利息：" + Account.getMonthlyInterest());//打印月利息
		System.out.println("开户日期：" + Account.getdateCreated());
	}
	
}

class Account {
	private int id = 0; //账号
	private double balance = 0; //余额
	private double annualInterestRate = 0; //当前利率
	private Date dateCreated; // 存储账户的开户日期
	
	//创建默认账户的无参构造方法
	public Account() {
		
	}
	//创建具有指定id和初始余额的账户的构造方法
	public Account(int id,double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	//id的访问器方法
	public int getid(){
		return id;
	}
	//balance的访问器方法
	public double getbalance(){
		return balance;
	}
	//annualInterestRate的访问器方法
	public double getannualInterestRate(){
		return annualInterestRate;
	}
	
	//id的修改器方法
	public void setid(int id){
		this.id = id;
	}
	//balance的修改器方法
	public void setbalance(double balance){
		this.balance = balance;
	}
	//annualInterestRate的修改器方法
	public void setannualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate/100;
	}
	
	//dataCreated的访问器方法
	public Date getdateCreated(){
		this.dateCreated = new Date();
		return dateCreated;
	}
	
	//返回月利率的方法
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	
	//返回月利息的方法
	public double getMonthlyInterest(){
		return balance * getMonthlyInterestRate();
	}
	
	//从账户提取指定额度
	public void withDraw(double money){
		this.balance = this.balance - money;
	}
	
	//从账户存储指定额度
	public void deposit(double money){
		this.balance = this.balance + money;
	}
}
