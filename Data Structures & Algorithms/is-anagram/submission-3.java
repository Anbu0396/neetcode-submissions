class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        Map<Character,Integer> sm=new HashMap<>();
        Map<Character,Integer> tm=new HashMap<>();
        for(char a:s.toCharArray())
        {
            if(sm.containsKey(a))
                sm.put(a,sm.get(a)+1);
            else
                sm.put(a,1);
        }
        for(char a:t.toCharArray())
        {
            if(tm.containsKey(a))
                tm.put(a,tm.get(a)+1);
            else
                tm.put(a,1);
        }
        return sm.equals(tm);
    }
}
