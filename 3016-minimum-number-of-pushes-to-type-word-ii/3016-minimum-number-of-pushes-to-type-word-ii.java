class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int arr[]=new int[map.size()];
        int idx=0;
        for(int a:map.values()){
            arr[idx++]=a;
        }
        Arrays.sort(arr);
        int push=0;
        int count=0;
        for(int i=arr.length-1;i>=0;i--){
            push+=arr[i]*((count/8)+1);
            count++;
        }
        return push;
    }
}