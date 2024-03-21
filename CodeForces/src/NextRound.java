import java.util.Scanner;

public class NextRound {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 

        int cnt = 0; 
        

        int n = input.nextInt(); 
        int k = input.nextInt(); 

        int[] scores = new int[n]; 

        for(int i =0; i < n ; i ++){
            int cur = input.nextInt(); 
            
            scores[i] = cur; 


        }

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if (scores[j] > scores[i]){
                    int temp = scores[j]; 
                    scores[j] =  scores[i]; 
                    scores[i] = temp; 
                }
            }
        }
        int kth = scores[k-1]; 
        for (int i = 0; i < n ; i++){
            if (scores[i] >= kth){
                if(scores[i] > 0)cnt++; 
                
            }
        }
        System.out.println(cnt);
    }

}