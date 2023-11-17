public class CrapsGame
{
  private int point = 0;

  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  The parameter total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  Returns 1 if player won, -1 if player lost,
   *  0 if player continues rolling.
   */
  public int processRoll(int total)
  {
    if (point==0 && (total == 2 || total == 3 || total == 12)){
      return result;
    }
    if (point==0 && (total == 11 || total == 7)){
      return result;
    }
    else if (point == 0 && (total != 2 || total!= 3 || total!= 12 || total != 11 || total != 7)){
      return point == total;
    }
      
      return result;
  }

  /**
   *  Returns the saved point
   */
  public int getPoint()
  {
    return point;
  }

  public static void main(String[] args) {
    Die die = new Die();
    die.roll();
 System.out.println(die.getNumDots());
}

}

