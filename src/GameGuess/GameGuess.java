package GameGuess;

public class GameGuess {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
         p1 = new Player();
         p2 = new Player();
         p3 = new Player();

         int targetNumber = (int)(Math.random() * 10);
        System.out.println("target number is "+ targetNumber);
         while(true) {
             int p1GuessNumber = p1.guess();
             int p2GuessNumber = p2.guess();
             int p3GuessNumber = p3.guess();

             if (p1GuessNumber == targetNumber) {
                 System.out.println("P1 player is winner " + p1GuessNumber);
             }
             if (p2GuessNumber == targetNumber) {
                 System.out.println("P2 player is winner " + p2GuessNumber);
             }
             if (p3GuessNumber == targetNumber) {
                 System.out.println("P3 player is winner " + p3GuessNumber);
             }
             if((p1GuessNumber != targetNumber) && (p2GuessNumber != targetNumber) && p3GuessNumber != targetNumber){
                 System.out.println("try again");
             } else {
                 break;
             }

         }
    }
}
