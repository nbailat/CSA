public class Conditionals {

    public static void main(String [] args){
        Conditionals condition = new Conditionals();
        System.out.println("trouble chimp");
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
        if (aSmile == bSmile){
            return true;
        } else {
            return false;
        }
    }
    public boolean negPos(int x, int y, boolean negative){
        if ((negative == true) && x < 0 && y < 0){
            return true;
        } else if (((negative == false) && x*y < 0)){
            return true;
        }
            return false;
        }
    
    public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        if ((isAsleep == true) || isMorning == true && isMom != true){
            return false;    
        } 
        return true;
    }
    public String setAlarm(int d, boolean vaycay){
        if (vaycay == true && d==0 || d==6){
            return "Off";
        } if ((vaycay == true) && d>0 && d<6){ 
            return "10:00";
        } if (vaycay == false && d==0 || d==6)
            return "10:00";
            return "7:00";     
    }
    public boolean onesDigitSame(int fst, int snd, int trd){
        int onesfst = fst%10*10;
        int onessnd = snd%10*10;
        int onestrd = trd%10*10;

        if (((onesfst == onessnd) || onessnd == onestrd) || onesfst == onestrd){
            return true;
        } else {
            return false;
        }
    }
    public int blackjack(int card1, int card2){
        if (((card1 <= 21) && card1 >= card2) || card2 > 21 && card1 <= 21){
            return card1;
        }
        else if (((card2 <= 21) && card2 > card1) || card1 > 21 && card2 <= 21){
            return card2;
        } 
            return 0;
    }
}
