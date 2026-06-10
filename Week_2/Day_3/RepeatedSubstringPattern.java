class Solution {
    public boolean repeatedSubstringPattern(String s) {
        // Create the double string s + s
        String doubled = s + s;
        
        // Remove the first and last characters and check for s
        return doubled.substring(1, doubled.length() - 1).contains(s);//abababa->babab this contins abab    TRUE
        //2.aba->ababa->bab->this not contains aba hence false
    }
}
