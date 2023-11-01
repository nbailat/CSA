public class Conditionals {

    public static boolean chimpTrouble(boolean aSmile, boolean bSmile){
        if ((aSmile == true && bSmile == true) || aSmile == false && bSmile == false){
            return true;
        } else {
            return false;
        }
    }
    public static int negPos(int x, int y, boolean negative){
        if (((x < 0) == negative == true || y < 0) == negative == true){
            return x*y;
        } else {
            return x*y*-1;
        }
    }
    public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        if (isAsleep == true || isMorning == true){
            return false;    
        } if (isAsleep == false && isMorning == true && isMom == true){
            return true;

        }
        return isMorning;
    }
    public static String setAlarm(String name, int d, boolean vaycay){
        if (d<6 && d>0 && vaycay == false){
            return "7:00";
        } if (d==0 || d==6){
            return "10:00";
        }
        else (vaycay == true){
            return "Off";
        }
    }
}
