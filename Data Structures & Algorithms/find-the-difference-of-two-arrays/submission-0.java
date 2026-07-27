class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> a = new ArrayList<>();
        a.add(new ArrayList<>());
        a.add(new ArrayList<>());

        for (int i : nums1) {
            int flag = 0;

            for (int j : nums2) {
                if (i == j) {
                    flag = 1;
                    break;
                }
            }

            if (flag != 1 && !a.get(0).contains(i))
                a.get(0).add(i);
        }

        for (int i : nums2) {
            int flag = 0;

            for (int j : nums1) {
                if (i == j) {
                    flag = 1;
                    break;
                }
            }

            if (flag != 1 && !a.get(1).contains(i))
                a.get(1).add(i);
        }

        return a;
    }
}