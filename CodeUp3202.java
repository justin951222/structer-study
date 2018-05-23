import java.util.Scanner;

public class CodeUp3202 {
	static char[] T;
	public static void main(String[] args) {
		String tree;
		Scanner sc = new Scanner(System.in);
		tree = sc.nextLine();
		T = new char[tree.length()+1];
		for(int i=1; i<T.length; i++) T[i] = (char)tree.charAt(i-1);
		preorder(1);
	}
	public static void preorder(int now) {
		if(now>=T.length) return;
		System.out.print(T[now]);
		preorder(2*now);
		preorder(2*now+1);
	}
}
