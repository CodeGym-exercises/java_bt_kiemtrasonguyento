import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 1000; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }


    }
    static boolean isPrime(int number){
        if(number<2){
            return false;
        }else if(number==2){
            return true;
        }else {
            for(int i = 2; i <= (number/2); i++){
                if(number%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
