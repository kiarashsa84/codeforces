import java.util.Scanner;

public class NextRound {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 

        int cnt = 0; 

        int n = input.nextInt(); 
        int k = input.nextInt(); 

        for(int i =0; i < n ; i ++){
            int cur = input.nextInt(); 
            cur--; 
            if (cur >= k){
                cnt++; 
            }


        }

        System.out.println(cnt);
    }

}