import java.util.Arrays;

class Solution {
    public int strStr(String hs, String nd) {
        // Edge Case: Agar needle empty string hai to LeetCode ke mutabik 0 return hona chahiye
        if (nd.length() == 0) return 0;
        
        char m[] = hs.toCharArray();
        char n[] = nd.toCharArray();
        
        // Agar needle haystack se badi hai to match ho hi nahi sakta
        if (n.length > m.length) return -1;
        
        char arr[] = new char[n.length];
        int idx = 0;
        
        // GALATI 1 FIX: yahan '<=' aayega takki aakhri substring bhi check ho sake
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
        
        // GALATI 2 FIX: Hamesha -1 return karein agar loop ke andar kuch match nahi mila
        return -1; 
    }
}
