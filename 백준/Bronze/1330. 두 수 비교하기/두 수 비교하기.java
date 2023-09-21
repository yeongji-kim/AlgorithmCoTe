    import java.util.*;
    class Main {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            String num = sc.nextLine();
            String[] arr = new String[2];
             arr =   num.split(" ");
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            
            if(A > B) {
                System.out.println(">");
            } else if(A < B) {
                System.out.println("<");
            } else {
                System.out.println("==");
            }
            
            
        }
    }