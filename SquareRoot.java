
class SquareRoot {
	
	public static void main(String[] args) {

		System.out.println(sqrt(36, 4));
	}

	static double sqrt(int x, int p){
		int s = 0;
		int e = x;
		double ans = 0;
		while(s<=e){
			int mid = (s+e)/2;
			System.out.println("s:"+s+"  e:"+e+"  mid:"+mid+"  ans:"+ans);
			if(mid*mid == x){
				return mid;
			}
			else if(mid*mid < x){
				s = mid+1;
			}else{
				e = mid -1;
			}
			ans = mid;
		}


		for(int i = 0; i < p; i++){
			for(int j =0 j <= 9; j++){
				if(ans+i <= x){
					ans = 
				}
			}
		}

		return ans;
	}
}