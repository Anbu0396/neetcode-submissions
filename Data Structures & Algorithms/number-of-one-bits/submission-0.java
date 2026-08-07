class Solution {
    public int hammingWeight(int n) {
        int a=0;
        while(n>0)
        {   
            if(n%2==1)
            a++;
            n/=2;
        }
        return a;
    }
}
