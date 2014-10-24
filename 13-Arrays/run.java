public class run{
    //frontPiece problem
    public int[] frontPiece(int[] nums) {
	int[] ans;
	if (nums.length>1){
	    ans = new int[2];
	    ans[0]=nums[0];
	    ans[1]=nums[1];
	}
	else if (nums.length>0){
	    ans = new int[1];
	    ans[0] = nums[0];
	}
	else {ans = new int[0];}
	return ans;
    }
    // Sum13 problem
    public int sum13(int[] nums) {
	int ans = 0;
	for (int i=0; i<nums.length; i++){
	    if (nums[i] != 13){
		ans+=nums[i];
	    }
	    else {i+=1;}
	}
	return ans;
    }

}
