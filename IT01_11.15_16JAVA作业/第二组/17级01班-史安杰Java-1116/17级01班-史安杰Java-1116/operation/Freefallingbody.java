import java.util.Scanner;


public class Freefallingbody {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入H为多少");
		double H = sc.nextInt();
		double hn = H / 2; 
		
		int i = 0;
		System.out.println("请输入N为多少");
		int N = sc.nextInt();
		for (i = 1;i< N;i ++){
		H = H + hn * 2;    
		hn = hn / 2;      
		}
		System.out.println("第" + i + "次落地经过" + H +"米"); 
		System.out.println("第" + i + "次反弹" + hn + "米");
	}

}
