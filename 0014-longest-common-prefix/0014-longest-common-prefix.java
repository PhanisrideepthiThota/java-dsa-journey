class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res="";
        for(int i=0;i<strs[0].length();i++)
        {
            char cur=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length()){
                    return res;
                }
                if(strs[j].charAt(i)!=cur){
                    return res;
                }
            }
            res+=cur;
        }
         return res;
    }
}