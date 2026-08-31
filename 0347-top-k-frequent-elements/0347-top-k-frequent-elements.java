class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[k];

        // Find maximum frequency k times
        for (int i = 0; i < k; i++) {

            int max = -1;
            int ans = 0;

            for (int key : map.keySet()) {
                if (map.get(key) > max) {
                    max = map.get(key);
                    ans = key;
                }
            }

            result[i] = ans;
            map.remove(ans);
        }

        return result;
    }
}