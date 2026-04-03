class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map= new HashMap<>();
        
        for(String words: strs){
          char [] chArr= words.toCharArray();

           Arrays.sort(chArr);
           String key= new String(chArr);
           map.putIfAbsent(key, new ArrayList<>());
           map.get(key).add(words);
        }

        return new ArrayList<>(map.values());
    }
}