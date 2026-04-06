class Solution {
    public boolean hasDuplicate(int[] nums) {
        int hash[]=new int[10];
        boolean flag=false;
        for(int i=0;i<nums.length;i++)
        {
            if(hash[nums[i]]!=0)
            {
                flag=true;
                break;
            }
            hash[nums[i]]++;
            
        }
        return flag;
    }
}