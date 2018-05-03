import java.util.Scanner;

public class CodeUp1915_2day {
	public static int Func(int n) {
		if(n<3) return 1;
		return Func(n-1) + Func(n-2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Func(n));
	}
}
