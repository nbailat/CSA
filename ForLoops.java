public class ForLoops {

    public static void main(String [] args){
        ForLoops frlps = new ForLoops();
        System.out.println(frlps.addEvens(4));
        System.out.println(frlps.addEvens(9));

    }

    public int addEvens(int n){
        int sum = 0;
        for(int evens=2; evens<=n;){
            sum = sum + evens;
            evens = evens + 2;
        }
        return sum;
    }
}
