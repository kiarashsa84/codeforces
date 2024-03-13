import java.util.Scanner; 

public class Team {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int tedad_soal = input.nextInt(); 
        int solved = 0; 
        
        for(int i = 0 ; i < tedad_soal; i++){
            int result = 0; 
            for (int j = 0; j < 3; j++){
                int pos = input.nextInt(); 
                if (pos == 1){
                    result ++; 
                }

            }
            if (result >= 2){
                solved++; 
            }
        }

        System.out.println(solved);
    }
}
