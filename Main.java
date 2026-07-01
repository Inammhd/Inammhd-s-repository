import java.util.Random;
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        
        System.out.print("Who are you?\n>");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        
        int h = 0, t = 0;
        Random random = new Random();
        
        System.out.println("Tossing a coin...");
        
        for(int i = 0;i < 3;i++){
            if(random.nextInt(2) == 1){
                System.out.println("Round " + (i + 1) +": Heads");
                h++;
            }
            else{
                System.out.println("Round " + (i + 1) +": Tails");
                t++;    
            }
        }
        
        System.out.println("Heads: "+ h +", Tails: "+ t);

        if (h > t) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }
}
