class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 1;
        int n=num;
        for (int i=2;i<= Math.sqrt(num);i++)
        {
            if (num%i==0 && num/i==i)
            {
                sum+=i;
                
            }
            else if(num%i==0)
            {
                sum = sum+i;
                sum = sum+n/i;
            }
            n=num;
            
        }
        if(sum==num && num!=1){
            return true;
        }
        else{
            return false;
        }

    }
}