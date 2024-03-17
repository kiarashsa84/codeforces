import java.util.regex.Pattern;
import java.util.regex.Matcher; 
import java.util.Scanner; 

public class Bitplusplus {

    public static void main(String[] args) {
         
        Pattern pt = Pattern.compile("\\+{2}X|X\\+{2}");

        Scanner input = new Scanner(System.in); 
        int cnt = input.nextInt(); 
        input.nextLine();
        int x = 0; 

        for (int i = 0; i < cnt; i++){
            String line = input.nextLine(); 
            Matcher mt = pt.matcher(line); 
            if(mt.matches()){
                x++; 
            }
            else{
                x--;
            }

        }
        System.out.println(x);
        

    }
}