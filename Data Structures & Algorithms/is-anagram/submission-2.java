class Solution {
    public boolean isAnagram(String s, String t) {
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i:a)
        {
            if(a[i]!=b[i])
            {
                return false;
            }
        }
        return true;
    }
}
