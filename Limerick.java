public class Limerick {
    public int getSyllables(int k){
        if (k==1 || k==2 || k==5){
            return 9;
        }
        return 6;
    }

    public String printRhythm(){
        for (int i=0; i<5; i++){
            for (int j=1; j<getSyllables(); j++){
                    System.out.print("ta-")
            }
            System.out.println("ta");
       }
    }
    
}