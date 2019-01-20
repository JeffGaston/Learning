import java.util.Scanner;
public class Test {
    public static Scanner kb= new Scanner(System.in); 
    public static void main (String[] args){
        int N= kb.nextInt();
        
        for(int i= 1; i<= 10; i++){
            int sum= N*i;
            System.out.println(N + " * "+ i+ " = "+ sum);
        }
    }
}
