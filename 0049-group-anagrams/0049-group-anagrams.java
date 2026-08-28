class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();
        for(String c : strs){
            char ch []= c.toCharArray();
            Arrays.sort(ch);
            String new1 = new String(ch);
            if(!mp.containsKey(new1)){
                mp.put(new1,new ArrayList<>());
            }
            mp.get(new1).add(c);
        }
        return new ArrayList<>(mp.values());
    }
}