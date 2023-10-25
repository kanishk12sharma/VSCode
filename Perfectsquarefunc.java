import java.util.Scanner;

public class Perfectsquarefunc {
            static void checkperfectsquare() {
                Scanner s = new Scanner(System.in);
                System.out.println("ENTER THE NUMBER TO BE CHECK ");
                int n = s.nextInt();
                int i=2;
                s.close();
                for (;i <= n / 2; i++) {
                    if (i * i == n) {
                        System.out.println("IT IS AN PERFECT SQUARE");
                        break;
                    }   
                }
                if(i>n/2)
                    System.out.println("NOT A PERFECT SQUARE");
                
            }
            public static void main(String[] args) {
                checkperfectsquare();
            }
        }
