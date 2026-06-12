class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0;       // read pointer
        int index = 0;   // write pointer

        while (i < n) {
            char curr = chars[i];
            int count = 0;

            // Count consecutive same characters
            while (i < n && chars[i] == curr) {
                count++;
                i++;
            }

            // Write the character
            chars[index++] = curr;

            // If count > 1, write its digits
            if (count > 1) {
                String s = String.valueOf(count);
                for (char ch : s.toCharArray()) {
                    chars[index++] = ch;
                }
            }
        }

        return index;
    }
}
