class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[256];

        // initialize all to -1
        for (int i = 0; i < 256; i++) {
            lastSeen[i] = -1;
        }

        int L = 0;
        int max = 0;

        for (int R = 0; R < s.length(); R++) {
            char c = s.charAt(R);

            if (lastSeen[c] >= L) {
                L = lastSeen[c] + 1;
            }

            lastSeen[c] = R;
            max = Math.max(max, R - L + 1);
        }

        return max;
    }
}
