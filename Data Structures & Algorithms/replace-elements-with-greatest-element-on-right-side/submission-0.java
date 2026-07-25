class Solution {
    public int[] replaceElements(int[] arr) {
        int[] a=new int[arr.length];
        for(int i=1;i<arr.length;i++)
        {
            int max=arr[i];
            for(int j=i;j<arr.length;j++)
            {
                if(max<arr[j])
                    max=arr[j];
            }
            a[i-1]=max;
        }
        a[arr.length-1]=-1;
        return a;
    }
}