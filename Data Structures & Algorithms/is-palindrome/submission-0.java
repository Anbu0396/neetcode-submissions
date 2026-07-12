class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String r = s.replaceAll("[^a-z0-9]", "");
        int n=r.length();
        for(int i=0;i<n/2;i++)
        {
            if(r.charAt(i)!=r.charAt(n-1-i))
                return false;
        }
        return true;
    }
}
