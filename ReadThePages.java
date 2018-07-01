import java.util.*;

class ReadThePages {
	
	static Scanner c = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = c.nextInt();
		int st = c.nextInt();
		int a[] = new int[n];
		for(int i =0 ; i < n; i++){
			a[i] = c.nextInt();
		}

		System.out.println(noOfPages(a,n,st));
	}

	static int noOfPages(int[] a, int n, int st){
		int sum = 0;
		for(int i: a){
			sum+= i;
		}
		int s = a[0];
		int e = sum;
		int ans = 0;
		while(s <= e){
			int mid = (s+e)/2;
			if(possible(a,n,st,mid)){
				ans = mid;
				s = mid+1;
			}else{
				e = mid -1;
			}
		}
		return ans;
	}

	static boolean possible(int[] a, int n, int st, int mid){
		int x = 1;
		int sum = a[0];
		for(int i = 1; i < n; i++){
			if(sum >= mid){
				sum = a[i];
				x++;
				if(x == st){
					return true;
				}
			}
			sum+=a[i];
		}
		return false;
	}
}