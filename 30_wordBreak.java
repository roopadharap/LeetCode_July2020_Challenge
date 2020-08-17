class Solution {
    HashMap<Integer, List<String>> hm;
    
    public List<String> wordBreak(String s, List<String> wordDict) {
        hm = new HashMap<>();
        return wordBreakHelper(s, s.length(), wordDict);
    }
    
    private List<String> wordBreakHelper(String s, int end, List<String> wordDict)
    {
        List<String> lst = new ArrayList<>();
        
        if(end == 0)
            return new ArrayList<>(Arrays.asList(""));
        
        if(hm.containsKey(end))
            return hm.get(end);
        
        for(int i=0; i<end; i++)
        {
            String substr = s.substring(i,end);
            
            if(wordDict.contains(substr))
            {
                List<String> tmp = wordBreakHelper(s, i, wordDict);
                
                for(String n : tmp)
                {
                    lst.add(n.length() == 0? substr : n + " " + substr);
                }
            }
        }
        
        hm.put(end, lst);
        return lst;
    }
}