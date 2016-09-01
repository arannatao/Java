import java.util.*;

public class InvestingYourPrize {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int[][] cases = new int[2][T];	
		double[] results = new double[T];
		
		for(int i = 0; i < T; i++){
			cases[0][i] = in.nextInt();//N different investment products
			cases[1][i] = in.nextInt();//P元本金
			
			List<double[]> products = new LinkedList<>();	
			for(int j = 0; j < cases[0][i]; j++){
				double[] a = new double[3];
				a[0] = in.nextInt();//at least li Yuan
				a[1] = in.nextDouble();;//rate is ri%
				a[2] = j+1;//记录是第几种产品
				ListIterator<double[]> iter1 = products.listIterator();
				int tag1 = 0;
				while(tag1 == 0){
					if(iter1.hasNext()){
						double[] b = iter1.next();
						//System.out.println(b[1]);
						if(a[1] > b[1]){	
							products.add(products.indexOf(b), a);//按a[1]即ri由大到小排序
							tag1 = 1;
						}
						else if((a[1] == b[1]) && (a[0] > b[0])){
							products.add(products.indexOf(b), a);
							tag1 = 1;
						}
						else{
							iter1.next();
						}		
					}
					else{
						products.add(a);
						tag1 = 1;
					}
				}
			}	
			
			//按ri由大到小遍历，比较本金cases[1][i]和购买最低金额li的大小
			ListIterator<double[]> iter2 = products.listIterator();
			int tag2 = 0;
			while(tag2 == 0){
				if(iter2.hasNext()){
					double[] c = iter2.next();
					//System.out.println(products.indexOf(c));
					//System.out.println(c[1]);
					if(cases[1][i] >= c[0]){
						results[i] = c[2];
						tag2 = 1;
					}
					//不可以加else{iter2.next();}！！
				}
				else{
					results[i] = -1;
					tag2 = 1;
				}
			}
		}
		in.close();
		
		for(double result : results){
			int r= (int) result;
			System.out.println(r);
		}
	}
}
