class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ss=s.toCharArray();
        Arrays.sort(ss);
        char[] ts=t.toCharArray();
        Arrays.sort(ts);
        return Arrays.equals(ts,ss);
    }
}
