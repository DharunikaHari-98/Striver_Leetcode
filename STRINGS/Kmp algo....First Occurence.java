class Solution {
    public int strStr(String haystack, String needle) {
        int[] lps=constructlps(needle);
        //List<Integer> al=new ArrayList<>();
        int i=0,j=0;
        while(i<haystack.length())
        {
            if(needle.charAt(j)==haystack.charAt(i))
            {
                i++;
                j++;
            }
            if(j==needle.length())
            return i-j;
            else if(i<haystack.length() && haystack.charAt(i)!=needle.charAt(j))
            {
                if(j!=0)
                {
                j=lps[j-1];
                }
                else
                {
                i++;
                }

            }
        }
        return -1;
    }
    private static  int[] constructlps(String needle)
    {
          int lps[]=new int[needle.length()];
          int i=1;
          int len=0;
          while(i<needle.length())
          {
            if(needle.charAt(i)==needle.charAt(len))
            {
                len++;
                lps[i]=len;
                i++;
            }else
            {
                if(len!=0)
                {
                    len=lps[len-1];
                }
                else
                {
                    lps[i]=0;
                    i++;
                }
            }
        
          }
          return lps;
    }
}
