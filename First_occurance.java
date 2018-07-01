import java.util.*;

class First_occurance {
	
	public static void main(String[] args) {
		int[] a = {1,1,2,2,2,2,2,2,2,3,4,4,5,5,6};
		System.out.println(binarySearrch(a,4)+1);
	}

	static int binarySearrch(int[] a, int key){
		int s = 0;
		int e = a.length-1;
		int ans = 0;
		while(s <= e){
			int mid = (s+(e-s)/2);
			if(a[mid] == key){
				ans = mid;
				e = mid -1;
			}else if(a[mid] < key){
				s = mid+1;
			}else{
				e = mid -1;
			}
		}
		return ans;
	}
}