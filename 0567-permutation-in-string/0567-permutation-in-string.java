class Solution { 
    public boolean checkInclusion(String s1, String s2) { 
 
        int n = s1.length(); 
 
        if (n > s2.length()) 
            return false; 
 
        int[] count = new int[26]; 
 
        // Count characters in s1 
        for (char c : s1.toCharArray()) { 
            count[c - 'a']++; 
        } 
 
        // Sliding window 
        for (int i = 0; i <= s2.length() - n; i++) { 
 
            int[] temp = new int[26]; 
 
            for (int j = i; j < i + n; j++) { 
                temp[s2.charAt(j) - 'a']++; 
            } 
 
            boolean same = true;

            for (int k = 0; k < 26; k++) {
                if (count[k] != temp[k]) {
                    same = false;
                    break;
                }
            }

            if (same)
                return true;
        } 
 
        return false; 
    } 
}