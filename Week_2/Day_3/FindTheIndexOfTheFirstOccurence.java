import java.util.Arrays;

class Solution {
    public int strStr(String hs, String nd) {
        if (nd.length() == 0) return 0;
        
        char m[] = hs.toCharArray();
        char n[] = nd.toCharArray();
        

        if (n.length > m.length) return -1;
        
        char arr[] = new char[n.length];
        int idx = 0;
        

        for (int i = 0; i <= m.length - n.length; i++) {
            idx = 0;
            for (int j = i; j < i + n.length; j++) {
                arr[idx] = m[j];
                idx++;
            }
            if (Arrays.equals(arr, n)) {
                return i; // Sahi match milte hi index return karein
            } 
        }
        
        return -1; 
    }
}
