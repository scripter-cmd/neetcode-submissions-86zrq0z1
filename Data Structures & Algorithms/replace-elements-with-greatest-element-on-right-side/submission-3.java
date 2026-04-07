class Solution {
    public int[] replaceElements(int[] arr) {
        int ans[]=new int[arr.length];
        
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=-1;
        }
        // System.out.println(Arrays.toString(ans));

        for(int i=1;i<arr.length;i++)
        {
            int max=arr[i];
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]>max)
                {
                    max=arr[j];
                }
            }
            ans[i-1]=max;
        }
        return ans;
    }
}