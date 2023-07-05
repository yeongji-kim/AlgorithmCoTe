class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        answer = 2 * a * b;
        // toSting() 처럼 object를 String으로
        int sSum = Integer.parseInt(String.valueOf(a) + String.valueOf(b));    
        
        answer = (sSum>answer) ? sSum : answer ;
        
        
        return answer;
    }
}