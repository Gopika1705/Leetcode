class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(int i=0;i<patterns.length;i++){
            String words=patterns[i];
            if(word.contains(words)){
                count++;
            }
        }
        return count;
    }
}