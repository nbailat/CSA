public class AdvForLoops {
    
    public static void main (String [] args){
        AdvForLoops adv = new AdvForLoops();
        adv.eights();
    }

    public void eights(){
        for (int e = 1; e>=4; e++){
            for (int i = 8; i>=e; i= i-2){
                for (int g=i; g>=i; g--){
                    System.out.print(" ");
                    System.out.println(i);
                }
            }
        }
    }
}
