import java.util.Scanner;

public class CodeUp3201 {
	static char[] T;
	public static void main(String[] args) {
		String tree;
		Scanner sc = new Scanner(System.in);
		tree = sc.nextLine();
		T = new char[tree.length()+1];
		for(int i=1; i<T.length; i++) T[i] = (char)tree.charAt(i-1);
		inorder(1);
	}
	public static void inorder(int now) {
		if(now>=T.length) return;
		inorder(2*now);
		System.out.print(T[now]);
		inorder(2*now+1);
	}
}
