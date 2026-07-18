class Solution {
    public int scoreOfString(String s) {
        int a=0;
        for(int i=0;i<s.length()-1;i++)
        {
            a=a+Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
        }
        return a;
    }
}