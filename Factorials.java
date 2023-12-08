public class Factorials {
    
    public static void main(String [] args){
        Factorials fact = new Factorials();
        System.out.println(fact.calcFactorial(6));
        for(int n)
    

    }

    public int calcFactorial(int num){
        int facts = num;
        int factorial = 1;
        while (facts>0){
            factorial = factorial*facts;
            facts = facts-1;
        }
        return factorial;
    }
}
