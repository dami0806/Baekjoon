class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        int arr = 0;

        for(int i = 0; i<words.length-1; i++) {
             
                if((!(words[i].charAt(words[i].length()-1)
                     == (words[i+1].charAt(0))
                    )) || (isSame(words, i+1)) ) {
                    answer[0] = ((i+1)%n)+1;
                    answer[1] = ((i+1)/n)+1;
                    
                    break;
                }
        }
        
        return answer;
    }
    public boolean isSame(String[] words, int index) {
        // 중복
        for(int i = 0 ;i<index; i++) {
            if(words[i].equals(words[index])) {
                return true;
            }
        }
        return false;
    }
}