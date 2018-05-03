import java.util.Scanner;

public class CodeUp1912_2day {
	public static int Func(int n) {
		if(n==1) return 1;
		return Func(n-1) * n;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Func(n));
	}
}
