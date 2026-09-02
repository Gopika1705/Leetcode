class Solution {
    public String countAndSay(int n) {

        String s = "1";

        for (int x = 2; x <= n; x++) {

            StringBuilder ans = new StringBuilder();

            int i = 0;

            while (i < s.length()) {

                int count = 0;
                char ch = s.charAt(i);

                while (i < s.length() && s.charAt(i) == ch) {
                    count++;
                    i++;
                }

                ans.append(count);
                ans.append(ch);
            }

            s = ans.toString();
        }

        return s;
    }
}