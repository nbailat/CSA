public class MathEX {
    public static void main(String [] args){
    System.out.println(swap(123));
    System.out.println(swap(246));
    System.out.println(swap(368));
    }
    public static int swap(int x){
        int ones= x%10*10;
        int tens= x%100/10*1;
        int hundreds= x/100*100;

        return hundreds+tens+ones;
    }
}
