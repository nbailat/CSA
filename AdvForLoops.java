public class AdvForLoops {
    
    public static void main (String [] args){
        AdvForLoops adv = new AdvForLoops();
        adv.eights();
        adv.alternate(5);
    }

    public void eights(){
        for (int i = 8; i>=2; i= i-2){
            for (int g=8; g>i; g=g-2){
                System.out.print(" ");
            }
            for (int h = 1; h<=i; h++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void alternate(int n){
        for (int a=1; a<=n; a++){
            if (a%2==1){
                for (int l=1; l<=n-1; l++)
            }
            for (int l=a; l>=1; a--){
                for ()
                
                System.out.print(a);
            }
        }
    }
}
