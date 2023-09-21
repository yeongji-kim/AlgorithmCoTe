import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String inputR = sc.nextLine();
        String arrgs[] = inputR.split(" ");
        Long arrgi[] = new Long[3];
        for(int i = 0; i <arrgs.length; i ++) {
            arrgi[i] = Long.parseLong(arrgs[i]);  
        }
        System.out.println(arrgi[0]+arrgi[1]+arrgi[2]);
        
        sc.close();
    }
}