
    public class MathEX {
        public static void main(String [] args){
        System.out.println(swap(123));
        System.out.println(swap(246));
        System.out.println(swap(368));
        timeLeft(1,15,4,36);
        timeLeft(1,34,8,20);
        }
        public static int swap(int x){
            int ones= x%10*10;
            int tens= x%100/10*1;
            int hundreds= x/100*100;
    
            return hundreds+tens+ones;
        }
        public static void timeLeft(int curhour, int curmin, int dephour, int depmin){
        int totalminutes= (dephour*60+depmin)-(curhour*60+curmin);
        int hours= totalminutes/60;
        int minutes= totalminutes%60;
        
        System.out.println( hours + " hours " + minutes + " mins" );   
        }
        


    }
