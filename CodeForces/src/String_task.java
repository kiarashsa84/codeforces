
import java.util.Scanner; 

public class String_task {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        String line = input.nextLine(); 
        line = line.toLowerCase(); 

        String d_line = line.replaceAll("[aoeiuAOEIU]", ""); 

         

        for (char c : d_line.toCharArray()){
            System.out.print("." + c) ; 
        }

        
        
    }
}