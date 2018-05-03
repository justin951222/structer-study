import java.util.Scanner;

public class CodeUp1491 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int N = n;
		int m = sc.nextInt();
		int M = m;
		int[][] Result = new int[n][m];
		int data = n*m;
		int x = N;
		int y = 0;
		int turn = -1;
		while(data>0) {
			for(int i=0; i<N; i++) {
				x += turn;
				Result[x][y] = data;
				data--;
			}
			turn *= -1;
			M--;
			for(int i=0; i<M; i++) {
				y += turn;
				Result[x][y] = data;
				data--;
			}
			N--;
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++)
				System.out.print((int)Result[i][j]+"	");
			System.out.println();
		}
	}
}
