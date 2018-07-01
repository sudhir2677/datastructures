import java.io.*;
import java.util.*;

class BookAllocationProblem {
	
	public static void main(String[] args)throws IOException {
		FastReader c = new FastReader();
		int test = c.nextInt();
		//System.out.println(test);
		while(test-- != 0){
			int n = c.nextInt();
			int m = c.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = c.nextInt();
			}

			System.out.println(binarySearch(a,n,m));
		}

	}

	static int binarySearch(int[] a, int n, int m){
		int sum = 0;
		for(int i: a) sum+=i;

		int s = a[0];
		int e = sum;
		int ans= 0;
		while(s < e){
			int mid = (s+e) >> 1;
			System.out.println("---------------------------- s:"+s+"  e:"+e+"  mid:"+mid);
			if(check(a,n,m, mid)){
				ans = mid;
				e = mid;
			}else{
				s = mid+1;
			}
		}
		return ans;
	}

	static boolean check(int[] a, int n, int m, int mid){
		int count = 1;
		int noPage = 0;
		for(int i : a) System.out.print(i+" ");
		System.out.println("");
		for(int i =0; i < n; i++){
			noPage += a[i];
			System.out.println("noPage:"+noPage+"  mid:"+mid+"  count:"+count);
			if(noPage >= mid){
				count++;
				System.out.println("count:"+count);
				noPage = a[i];
				if(count == m){
					return true;
				}
			}				
		}
		return false;
	}

	static class FastReader{
		static BufferedReader br;
		static PrintWriter out;
		static StringTokenizer st;

		FastReader(){
			br = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(new OutputStreamWriter(System.out));
		}

		static String next() throws IOException{
			while( st == null || !st.hasMoreTokens()){
				st = new StringTokenizer(br.readLine());
			}
			return st.nextToken();
		}

		static int nextInt() throws IOException{
			return Integer.parseInt(next());
		}
	}
}