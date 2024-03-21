import java.util.Scanner; 


public class Domino_pilling {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        int m = input.nextInt(); 
        int n = input.nextInt(); 


        int s = m * n; 

        int tedad = s / 2 ;
        System.out.println(tedad);
    }
}