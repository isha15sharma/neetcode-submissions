class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr=new int[k];

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //map--> 1-1 2-2 3-3

        List<Integer>list=new ArrayList<>(map.keySet());
        list.sort((a,b)-> map.get(b)-map.get(a));

        for(int i=0;i<k;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
