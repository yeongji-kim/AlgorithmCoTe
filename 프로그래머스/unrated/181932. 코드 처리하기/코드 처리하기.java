class Solution {
    public String solution(String code) {
         String answer = "";
            int idx, mode=0;
            int size = code.length();

            for(idx=0; idx<size; idx++){
                if(mode==0){
                    if(code.charAt(idx)=='1') mode=1;
                    else if(idx%2==0)
                            answer+=code.charAt(idx);
                }
                else if(mode==1){
                    if(code.charAt(idx)=='1') mode=0;
                    else if(idx%2 == 1)
                        answer += code.charAt(idx);
                }
            }
            if(answer.isEmpty()){
                return "EMPTY";
            }

            return answer;
        }
}
