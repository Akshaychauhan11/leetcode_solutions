class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[256];
        for(char ch:magazine.toCharArray()){
            freq[ch]+=1;
        }
        for(char ch:ransomNote.toCharArray()){
            if(freq[ch]>=1){
                freq[ch]--;
            }else{
                return false;
            }
        }
        return true;
        
    }
}