public class Haiku {
    public int getSyllables(int k){
        if (k%2!=0){
            return 5;
        }
        return 7;
    }

    public String printRhythm(){
        for (int i=0; i<3; i++){
            for (int j=1; j<getSyllables(); j++){
                    System.out.print("ta-")
            }
            System.out.println("ta");
       }
    }
}