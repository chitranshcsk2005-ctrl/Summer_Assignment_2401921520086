class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int temp=0;
        for(int i=0;i<n-1;i++)
            if(nums[i]==0 )
                temp++;             
        for(int t=0;t<temp;t++)
        {
            for(int i =0;i<n-1;i++)
            {
                if(nums[i]==0)
                {
                    int k=nums[i+1];
                    nums[i+1]=nums[i];
                    nums[i]=k;
                }
            }
        }
        
        
    }
}
