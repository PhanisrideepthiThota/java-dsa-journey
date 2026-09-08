class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        long res=0;
        while(x>0){
            int last=x%10;
            res=res*10+last;
            x=x/10;
        }
        if(res>Integer.MAX_VALUE)
        return false;
       
       return temp==res;
    }
}