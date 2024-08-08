
public class Bubble_sort{
	public static void main(String[] args) {
		int nums[]= {6,5,3,9,1,2};
		int temp=0;
		int n=nums.length;
		for(int i=0;i<n-1;i++) {
		   if(nums[i]>nums[i+1]) {
			temp=nums[i];
			nums[i]=nums[i+1];
			nums[i+1]=temp;
		   }		
		}
		for(int num:nums) {
			System.out.print(num +" ");
		}
		
	}

}
