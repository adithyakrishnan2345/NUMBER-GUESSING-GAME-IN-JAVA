import java.util.Scanner;
public class Main 
    {
        public static void main(String args[]) 
        {
          Scanner sc=new Scanner(System.in);
          int random = (int)(100*Math.random());
          int a=sc.nextInt();
          int guess=0,flag=0;
          System.out.println("The number is chosen between 1 and 100");
          System.out.println("YOU HAVE "+a+" TRIES TO GUESS THE NUMBER CORRECTLY");
          while(a>0)
           {
           guess=sc.nextInt();
           if(guess==random)
            {
              System.out.println("CORRECT");
               flag=1;
               break;
            }
           else if(guess<random)
            {
              System.out.println("THE ENTERED NUMBER IS LESSER THAN THAT OF THE GUESSED NUMBER");
            }
           else if(guess>random)
             {
                System.out.println("THE ENTERED NUMBER IS BIGGER THAN THAT OF THE GUESSED NUMBER");
             }
           a--;
           }
           if(flag==0)
           {
             System.out.println("YOU HAVE RUN OUT OF TRIALS");
             System.out.println("THE CORRECT NUMBER WAS "+a);
          }
        }
      }
