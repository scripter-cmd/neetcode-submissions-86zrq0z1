class Solution {
    public boolean isAnagram(String s, String t) {
        int hash[]=new int[123];    
        for(int i=0;i<s.length();i++)
        {
            hash[s.charAt(i)]++;
            hash[t.charAt(i)]--;
        }
        for(int i:hash)
        {
            if(i!=0)
            {
                return false;
            }
        }
        return true;
    }
}
