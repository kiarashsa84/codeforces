import java.util.Scanner; 

public class TheatreSquare {


    static long max(long a, long b){

        return (a > b)? a : b; 
    }
    static long min(long a, long b){
        return (a > b) ? b: a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        long n = input.nextLong(); 
        long m = input.nextLong(); 
        long a = input.nextLong(); 
        double cnt = 0;
        

        long ma = max(n, m); 
        long mi = min(n,m);

        double tekrari = Math.ceil((double)ma / (double)a); 
        double tedad_amodi = Math.ceil((double)mi / (double)a); 

        if (ma < a){
            System.out.println(1);
        }
        else {
            cnt = tedad_amodi * tekrari; 
            // while (mi >= a) {
            //     cnt += tekrari; 
            //     mi -= a;
            // }
            // if (mi > 0){
            //     cnt += tekrari;
            // }
            System.out.println((long)cnt);
        }

        

        
    
    }
}
