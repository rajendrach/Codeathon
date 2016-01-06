public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()==1) return true;
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Map<String,String> map1 = new HashMap<String, String>();
        for(int i = 0; i<s1.length;i++){
            String key = String.valueOf(s1[i]);
            String check = String.valueOf(s2[i]);
            if(map1.containsKey(key)){
                String sample = map1.get(key);
                if(!map1.get(key).equals(check)) return false;
            }else{
                if(map1.containsValue(check)) return false;
            map1.put(key,check);
            }
        }
        return true;
    }
}
