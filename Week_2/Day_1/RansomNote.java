class Solution {
    public boolean canConstruct(String rn, String mg) {
        int m=rn.length();
        int n=mg.length();
        StringBuilder sb = new StringBuilder(mg);
        int k=0;
        for(int i=0;i<m;i++)//aa
        {
            char ch=rn.charAt(i);
            for(int j=0;j<n;j++)//ab
            {
                if(ch==sb.charAt(j))
                {
                    k=0;
                sb.setCharAt(j,' ');
                    break;
                }
                else
                {
                    k=1; 
                }
            }
            if(k==1)
            break;
        }
    if(k==1)
    return false;
    else
    return true;
    }
}
