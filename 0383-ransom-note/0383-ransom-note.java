class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> rm = new HashMap<>();
        HashMap<Character,Integer> mm = new HashMap<>();
        for(char c : ransomNote.toCharArray()){
            rm.put(c,rm.getOrDefault(c,0)+1);
        }
         for(char c : magazine.toCharArray()){
            mm.put(c,mm.getOrDefault(c,0)+1);
        }
        for(char ch : rm.keySet()){
            if(!mm.containsKey(ch) || (rm.get(ch)>mm.get(ch)))
            return false;
        }
        return true;
    }
}