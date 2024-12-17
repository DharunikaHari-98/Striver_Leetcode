class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> combinations=new ArrayList<>();
        backtrack(candidates,target,0,combinations,res);
        return res;
    }
    public void backtrack(int[] candidates,int target,int start,List<Integer> combinations,List<List<Integer>> res)
    {
             if(target==0)
             {
                res.add(new ArrayList<>(combinations));
                return;
             }
             for(int i=start;i<candidates.length;i++)
             {
                if(candidates[i]<=target)
                {
                    combinations.add(candidates[i]);
                    backtrack(candidates,target-candidates[i],i,combinations,res);
                    combinations.remove(combinations.size()-1);
                }
             }
    }
}
