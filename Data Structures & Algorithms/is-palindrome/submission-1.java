class Solution {
    public boolean isPalindrome(String s) {
        char[] c=s.toCharArray();
        int left=0,right=s.length()-1;
        while(left<=right)
        {
            if(Character.isLetterOrDigit(c[left]))
            {
                if(Character.isLetterOrDigit(c[right]))
                {
                    if(Character.toLowerCase(c[left])==Character.toLowerCase(c[right]))
                    {
                        left++;
                        right--;
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    right--;
                }
            }
            else
            {
                left++;
            }
        }
        return true;
    }
}
