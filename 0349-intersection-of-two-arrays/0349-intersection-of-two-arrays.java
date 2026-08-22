class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> l1 = new ArrayList<>();
        for(int n: nums1){
            l1.add(n);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums2){
            if(l1.contains(n))
                set.add(n);
        }
        int arr[] = new int [set.size()];
        int i =0;
        for(int v : set){
            arr[i] = v;
            i++;
        }
        return arr;
    }
}