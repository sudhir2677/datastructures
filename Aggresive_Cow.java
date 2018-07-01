import java.util.*;

class Aggresive_Cow {
	
	static Scanner c = new Scanner(System.in);

	public static void main(String[] args) {
		int n = c.nextInt();
		int cow = c.nextInt();
		int []a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = c.nextInt();
		}
		Arrays.sort(a);
		System.out.println(binarySearch(a,n,cow));
	}

	static int binarySearch(int[] a, int n, int cow){
		int s = 0;
		int e = n-1;
		int ans = 0;
		while(s<e){
			int m = (s+e)/2;
			if(check(a,n,cow, m)){
				ans = m;
				s = m +1;
			}else{
				e = m-1;
			}			
		}
		return ans;
	}

	static boolean check(int[] a, int n, int cows, int m){
		int x = 1;
		int pow = a[0];
		for(int i = 1; i < n; i++){
			if(a[i] - pow >= m){
				x++;
				pow = a[i];
				if(x == cows)
					return true;
			}
		}
		return false;
	}
}