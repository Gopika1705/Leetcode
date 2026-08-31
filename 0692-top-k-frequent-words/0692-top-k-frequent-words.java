class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<k;i++){
            int max=0;
            String ans="";
            for(String j:map.keySet()){
                if(map.get(j)>max || (map.get(j)==max && j.compareTo(ans)<0)){
                    max=map.get(j);
                    ans=j;
                }
            }
            arr.add(ans);
            map.remove(ans);
        }
        return arr;
    }
}