class Solution {
    public int lengthOfLongestSubstring(String s) {

    char[] str=s.toCharArray();

    Map<Character,Integer> map=new HashMap<>();

    int maxLen=0,left=0;

    for(int right=0;right<s.length();right++){

        if(map.containsKey(str[right])){
            
            left=map.get(str[right])+1;
           
        }
        
            map.put(str[right],right);
        

        maxLen=Math.max(maxLen,right-left+1);

    }

    return maxLen;
    }
}