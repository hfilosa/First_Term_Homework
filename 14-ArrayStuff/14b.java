public class 14b{
    public int sum67(int[] nums) {
	int ans=0;
	boolean six=false;
	for (int i=0;i<nums.length;i++){
	    if (nums[i]!=6 && !six){
		ans+=nums[i];}
	    if (nums[i] == 6) {
		six=true;}
	    if (nums[i] == 7) {
		six = false;}
	}
	return ans;
    }
    
    public boolean more14(int[] nums) {
	int num1 = 0;
	int num4 = 0;
	for (int i=0;i<nums.length;i++) {
	    if (nums[i]==1){
		num1+=1;}
	    if (nums[i]==4){
		num4+=1;}
	}
	return (num1-num4)>0;
    }

    public int[] tenRun(int[] nums) {
	int[] ans= new int[nums.length];
	boolean mult=false;
	int val=0;
	for (int i=0;i<nums.length;i++){
	    if (nums[i]%10 == 0){
		mult=true;
		val=nums[i];
		ans[i]=nums[i];
	    }
	    else if (nums[i]%10 != 0 && mult){
		ans[i]=val; 
	    }
	    else if (nums[i]%10 != 0 && !mult){
		ans[i]=nums[i];
	    }
	}
	return ans;
    }

    public boolean tripleUp(int[] nums) {
	for (int i=0;i<nums.length-2;i++){
	    if (nums[i+1]-nums[i] == 1 && nums[i+2]-nums[i+1]  == 1){
		return true;
	    }
	}
	return false;
    }

    public boolean canBalance(int[] nums) {
	for (int i=0;i<nums.length;i++){
	    int front=0;
	    int back=0;
	    for (int f=0;f<=i;f++){
		front+=nums[f];
	    }
	    for (int b=i+1;b<nums.length;b++){
		back+=nums[b];
	    }
	    if (front == back){
		return true;
	    }
	}
	return false;
    }

    public int[] seriesUp(int n) {
	int[] ans = new int[(((n*n) + n)) / 2];
	int pos=0;
	for (int i=0;i<=n;i++){
	    for (int x=1;x<i+1;x++){
		ans[pos]=x;
		pos++;
	    }
	}
	return ans;
    }

    public int maxMirror(int[] nums) {
	int ans=0;
	int[] rer = new int[nums.length];
	int j=0;
	for (int i=nums.length-1;i>=0;i--){
	    rer[j] = nums[i];
	    j+=1;
	}
	for (int i=0;i<nums.length;i++){
	    for (int x=0;x<nums.length;x++){
		if (nums[i] == rer[x]){
		    int y=i;
		    int z=x;
		    int ans1=1;
		    if (ans1>ans){
			ans = ans1;
		    }
		    if (y+1 < nums.length && z+1<rer.length){
			y=i+1;
			z=x+1;}
		    else{break;}
		    while(nums[y]==rer[z]){
			ans1+=1;
			if (y+1 < nums.length && z+1<rer.length){
			    y+=1;
			    z+=1;
			}
			else {break;}
		    }
		    if (ans1>ans){
			ans = ans1;
		    }
		}
	    }
	}
	return ans;
    }
}
