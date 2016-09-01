import java.util.*;

public class FlipCard {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[][] a = new int[N][N];
		for(int i = 0; i < N; i++)
			for(int j = 0; j < N; j++)
				a[i][j] = in.nextInt();
		in.close();
		
		int count = 0;
		for(int n = 0; n <= N-M; n++){
			for(int i = 0; i < N; i++){
				if(a[n][i] == 1)continue;
				else if(i+M > N){
					count = -1;
					n = N;
				}
				else{	
					count++;
					for(int g = n; g < n+M; g++)
						for(int j = i; j < i+M; j++)
							if(a[g][j] == 1)a[g][j] = 0;
							else a[g][j] = 1;
				}
			}
		}
		
		//越界,检查结果,如果不可能实现目标，输出-1。
        for(int j = 0; j < N;j++)
        	if(a[N-M+1][j] == 0)count = -1;
		
		System.out.println(count);
	}
}