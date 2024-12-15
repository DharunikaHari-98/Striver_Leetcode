class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(nums,new ArrayList<>(),res, new boolean[nums.length]);
        return res;
    }
    public static void backtrack(int nums[],List<Integer> templist,List<List<Integer>> res,boolean used[])
    {
        if(nums.length==templist.size())
        {
        res.add(new ArrayList<>(templist));
        return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(used[i]) continue;
            templist.add(nums[i]);
            used[i]=true;
            backtrack(nums,templist,res,used);
            templist.remove(templist.size()-1);
            used[i]=false;
        }
    }
}
