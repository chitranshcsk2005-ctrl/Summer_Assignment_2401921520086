class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ana=new ArrayList<>();
        char[] m = s.toCharArray();//string 1 abab
        char[] n = p.toCharArray(); //string 2 ab
        char arr[] = new char[n.length];
        Arrays.sort(n);
        int idx=0;
        for(int i=0;i<=m.length-n.length;i++)
        {
            idx=0;
            for(int j=i;j<i+n.length;j++)
            {
                arr[idx]=m[j];
                idx++;
            }
            Arrays.sort(arr);
            if(Arrays.equals(arr,n))
            ana.add(i);
        }
    return ana;       
    }
}
