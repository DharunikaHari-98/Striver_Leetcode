class Solution
{
        static class Pair {
    char character;
    int count;

    Pair(char character, int count) {
        this.character = character;
        this.count = count;
    }
}
    public static String reduced_String(int k, String s)
    {
        if(k==1)
        return "";
        Stack<Pair> stack=new Stack<>();
        
        for(char ch:s.toCharArray())
        {
            if(!stack.isEmpty() && stack.peek().character==ch)
            {
            stack.peek().count++;
            if(stack.peek().count==k)
            
            {
                   stack.pop();
            }
         
            }
            else
            {
                stack.push(new Pair(ch,1));
            }
        }
    
        StringBuilder sb=new StringBuilder();
        for(Pair p:stack)
        {
            sb.append(String.valueOf(p.character).repeat(p.count));
        }
        return sb.toString();
    }
    
}
