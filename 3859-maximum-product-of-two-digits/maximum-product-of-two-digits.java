class Solution {
    public int maxProduct(int n) {
        ArrayList <Integer>list =new ArrayList<>();
        while(n>0)
        {
            int rem = n%10;
            list.add(rem);
            n = n/10;
        }
        Collections.sort(list);
        int a = list.size();
        int a1 = list.get(a-1);
        int a2 = list.get(a-2);
        return a1 * a2;

    }
}