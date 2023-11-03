public class Conditionals {

    public static void main(String [] args){
        Conditionals condition = new Conditionals();
        System.out.println(condition.chimpTrouble(true, true));
        System.out.println(condition.chimpTrouble(false, false));
        System.out.println(condition.chimpTrouble(true, false));
        System.out.println(condition.chimpTrouble (false, true));
        System.out.println();

        System.out.println("posneg");
        System.out.println(condition.negPos(1, -1, false));
        System.out.println(condition.negPos(-1, 1, false));
        System.out.println(condition.negPos(1, 1, false));
        System.out.println(condition.negPos(-1, -1, false));
        System.out.println(condition.negPos(-4, -5, true));
        System.out.println(condition.negPos(-4, 5, true));
        System.out.println(condition.negPos(4, 5, true));
        System.out.println(condition.negPos(4, -5, true));
        System.out.println();

        System.out.println("phone pickup");
        System.out.println(condition.pickUpPhone(false, false, true));
        System.out.println(condition.pickUpPhone(true, true, true));
        System.out.println(condition.pickUpPhone(true, true, false));
        System.out.println(condition.pickUpPhone(false, true, false));
        System.out.println(condition.pickUpPhone(true, false, false));
        System.out.println(condition.pickUpPhone(false, false, false));
        System.out.println();

        System.out.println("alarm set");
        System.out.println(condition.setAlarm(1, false));
        System.out.println(condition.setAlarm(5, false));
        System.out.println(condition.setAlarm(0, false));
        System.out.println(condition.setAlarm(2, true));
        System.out.println(condition.setAlarm(4, true));
        System.out.println(condition.setAlarm(6, true));
        System.out.println();
   
        System.out.println("same onesdigit");
        System.out.println(condition.onesDigitSame(23, 19, 13));
        System.out.println(condition.onesDigitSame(23, 19, 12));
        System.out.println(condition.onesDigitSame(23, 19, 3));
        System.out.println(condition.onesDigitSame(423, 13, 3));
        System.out.println(condition.onesDigitSame(23, 29, 25));
        System.out.println();

        System.out.println("jackblack");
        System.out.println(condition.blackjack(19, 21));
        System.out.println(condition.blackjack(21, 19));
        System.out.println(condition.blackjack(19, 22));
        System.out.println(condition.blackjack(8, 8));
        System.out.println(condition.blackjack(25, 24));
        System.out.println(condition.blackjack(17, 9));
        System.out.println(condition.blackjack(12, 18));
        System.out.println();
    }
    public boolean chimpTrouble(boolean aSmile, boolean bSmile){
        if ((aSmile == true && bSmile == true) || aSmile == false && bSmile == false){
            return true;
        } else {
            return false;
        }
    }
    public int negPos(int x, int y, boolean negative){
        if (((x < 0) == negative == true || y < 0) == negative == true){
            return x*y;
        } else {
            return x*y*-1;
        }
    }
    public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        if ((isMorning == true && isMom == false)  || isAsleep == true){
            return false;    
        } if (isAsleep == false && isMorning == true && isMom == true){
            return true;

        }
        return isMorning;
    }
    public String setAlarm(int d, boolean vaycay){
        if (vaycay == true){
            return "Off";
        } else if (d==0 || d==6){ 
            return "10:00";
        }
            return "7:00";     
    }
    public int onesDigitSame(int fst, int snd, int trd){
        int onesfst = x%10*10;
        int onessnd = x%10*10;
        int onestrd = x%10*10;
    }
}