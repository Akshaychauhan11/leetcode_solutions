class Solution {
    public int smallestEvenMultiple(int n) {
        int s = 0;
        if (n%2==0){
          return n;
        }
        else{
            return(2*n);
        }
    }
}