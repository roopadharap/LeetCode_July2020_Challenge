class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> lst = new ArrayList<List<Integer>>();
        dfs(graph, 0, graph.length-1, new ArrayList(), lst);
        return lst;
    }
    
    public void dfs(int[][] graph, int src, int dest, List<Integer> curr, List<List<Integer>> lst)
    {
        if(src == dest)
            lst.add(curr);
        
        curr.add(src);
        
        for(Integer v : graph[src])
        {
            List<Integer> tmp = new ArrayList<>(curr);
            dfs(graph, v, dest, tmp, lst);
        }
    }
}