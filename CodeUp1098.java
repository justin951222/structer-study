import java.util.Scanner;

public class CodeUp1098 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int w, h;
		h = sc.nextInt();
		w = sc.nextInt();
		int[] Result = new int[h * w];
		for(int i=0; i<h*w; i++) Result[i] = 0;
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int l = sc.nextInt();
			int d = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			x--; y--;
			if(d==0) {
				for(int j=0; j<l; j++) {
					if(y + j < w) Result[w*x + y + j] = 1;
				}
			}
			else {
				for(int j=0; j<l; j++) {
					if(x + j < h) Result[w*x + y + j*w] = 1;
				}
			}
		}
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++)
				System.out.print(Result[w*i + j]);
			System.out.println();
		}
	}
}
