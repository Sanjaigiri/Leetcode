class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:nums1)set.add(i);
        for(int j:nums2){
            if(set.contains(j)){
              list.add(j);
              set.remove(j);
            }
        }
    int res[] = new int [list.size()];
    for(int i = 0; i<res.length; i++){
        res[i] = list.get(i);
     }
     return res;
    }
}