import java.util.*;
import java.io.*;

class AggresiveCow {
	
	static Scanner c = new Scanner(System.in);

	public static void main(String[] args) {
		int test = c.nextInt();
		while(test-- != 0){
			
			int stalls = c.nextInt();
			int cows = c.nextInt();

			int[] a = new int[stalls];
			for(int i = 0; i < stalls; i++){
				a[i] = c.nextInt();
			}

			Arrays.sort(a);
			
			System.out.println(solve(a,stalls,cows));
		}
	}

	static int solve(int[] a, int stalls, int cows){
		int s = 0;
		int e = a[a.length -1];
		int ans = 0;
		while(s <= e){
			int mid = (s+e)/2;
			if(check(a,stalls,cows,mid)){
				ans = mid;
				s = mid+1;
			}else{
				e = mid -1;
			}
			//System.out.println("ans:"+ans);
		}
		return ans;
	}

	static boolean check(int[] a, int stalls, int cows, int mid){
		int pow = a[0];
		int x = 1;
		for(int i =1; i < stalls; i++){
			//System.out.println("a["+i+"]:"+a[i]+"   mid:"+mid+"  x:"+x+" a["+i+"]-pow : "+(a[i]-pow));
			if((a[i]-pow) >= mid){
				x++;
				pow = a[i];
				if(x == cows){
					return true;
				}
			}
		}
		return false;
	}
}