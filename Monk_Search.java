import java.util.*;

class Monk_Search {
	
	static Scanner c = new Scanner(System.in);

	public static void main(String[] args) {
		int n = c.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = c.nextInt();
		}
		Arrays.sort(a);
		int q = c.nextInt();
		while(q-- !=0){
			int x = c.nextInt();
			int k = c.nextInt();
			if(x==0)
				System.out.println(searchEquals(a, k));
			else
				System.out.println(search(a, k));
		}
	}

	static int search(int[] a, int k){
		int s =0 ;
		int e = a.length -1;
		int ans = 0;
		while(s>e){
			int m = (s+e)/2;
			if(a[m] == k){
				ans = m;
				
			}

			if(k>a[m])
				s = m+1;
			else
				e = m-1;
		}
		

	}
}