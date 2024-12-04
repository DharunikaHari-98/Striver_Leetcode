class Solution {
    public String frequencySort(String s) {
        int freq[]=new int[256];
        for(char c:s.toCharArray())
        {
            freq[c]++;
        }
        List<Character> li=new ArrayList<>();
        for(int c=0;c<256;c++)
        {
            for(int i=0;i<freq[c];i++)
            {
                 li.add((char)c);
            }
        }
        li.sort((a, b) -> Integer.compare(freq[b], freq[a]));
        StringBuilder sb=new StringBuilder();
        for(char c:li)
        {
            sb.append(c);
        }
        return sb.toString();
    }
}
