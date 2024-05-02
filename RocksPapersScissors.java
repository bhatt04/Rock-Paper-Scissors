import java.util.* ; //random and scanner 

public class RocksPapersScissors{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            
            String[] rps = { "r" , "p" , "s" };
            String computerMove = rps[new Random().nextInt(rps.length)];  // to get a random number between 0-2 (rps length is 3)
 

        
        String playerMove;
        while(true)         //to get a valid move if move=r/s/p/s break out of loop print invalid move otherwise 
        {
            System.out.println("ENTER YOUR MOVE:\n[rock ~ r / paper ~ p / scissors ~ s]");  
            playerMove = scanner.nextLine();
            if(playerMove.equals("r") || playerMove.equals("p")||playerMove.equals("s") ){
                break;
            }
            System.out.println( playerMove + " is not a valid move.");
        }

        System.out.println("Computer Played:" + computerMove);

        if(playerMove.equals(computerMove))
        {
            System.out.println(" The game was a tie !");
        }


        else if(playerMove.equals("r"))
        {
            if(computerMove.equals("p"))
            {
                System.out.println("You lose!");
            }else if(computerMove.equals("s"))
            {
                System.out.println("You win!");
            }
        }

        else if(playerMove.equals("p"))
        {
            if(computerMove.equals("r"))
            {
                System.out.println("You win!");
            }else if(computerMove.equals("s"))
            {
                System.out.println("You lose!");
            }
        }

        else if(playerMove.equals("s"))
        {
            if(computerMove.equals("p"))
            {
                System.out.println("You win!");
            }else if(computerMove.equals("r"))
            {
                System.out.println("You lose!");
            }
        }

        System.out.println("\nPlay Again?? \n (y/n)");
        String playAgain = scanner.nextLine();
        if(!playAgain.equals("y"))
        {
            System.out.println("ThankYou!\nCome back later!");
            break;
        }
    }
}
}
