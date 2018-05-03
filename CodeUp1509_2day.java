import java.util.Scanner;

public class CodeUp1509_2day {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] map = new int[11][10];
		for(int i=0; i<11; i++)
			for(int j=0; j<10; j++)
				map[i][j] = sc.nextInt();
		for(int i=0; i<10; i++) {
			if(map[10][i]==1) {
				int j=9;
				System.out.print(i+1 + " ");
				for(; j>=0; j--) {
					if(map[j][i] > 0) {
						System.out.println("crash");
						break;
					}
					else if(map[j][i] < 0) {
						System.out.println("fail");
						break;
					}
				}
				if(j==-1) System.out.println("safe");
			}
		}
	}
}
