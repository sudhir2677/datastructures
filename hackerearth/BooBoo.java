import java.util.*;

class BooBoo {
	
	static Scanner c = new Scanner(System.in);

	public static void main(String[] args) {
		int n = c.nextInt();
		int m = c.nextInt();
		long sum = 0;
		long []q = new long[n];
		for (int i = 0; i < n; i++) {
			q[i] = c.nextLong();
			sum += q[i];
		}

		System.out.println(solve(n,m,sum,q));
	}

	static long solve(int n, int m, long sum, long[] q){
		long s = 0;
		long e = sum;
		long ans = 0;
		while(s<e){
			long mid = (s+e)/2;
			if(check(n,mid,q,m)){
				ans = mid;
				s = mid+1;
				System.out.println("---------------------------------");
			}else{
				e = mid;
			}
			System.out.println("mid:"+ mid+" ans:"+ans+" s:"+s+" e:"+e);
		}
		return ans;
	}

	static boolean check(int n, long mid, long[] q, int m){
		long x = 1;
		long s1 = 0;
		long l = s1;
		for(int i = 0; i < n; i++){
			if(s1 + q[i] > mid){
				x++;
				s1 = q[i];
				if(x == m)
					return true;
			}else
				s1 += q[i];
			System.out.println("x: "+x+"  s1:"+s1+" q:"+q[i]+" mid:"+mid);
			
		}
		return false;
	}
}