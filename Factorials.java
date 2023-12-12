public class Factorials {
    
    public static void main(String [] args){
        Factorials fact = new Factorials();
        System.out.println(fact.calcFactorial(6));
        for(int factorial = 1; factorial <=20; factorial++){
            System.out.println(fact.calcFactorial(factorial));
        }
        System.out.println(fact.calcE(6));
    }
    



    public long calcFactorial(int num){
        int facts = num;
        long factorial = 1;
        while (facts>0){
            factorial = factorial*facts;
            facts = facts-1;
        }
        return factorial;
    }

    public long calcE(long e){
        int factor = 1.0;
        long olde = e;
        e = 1+(1.0/calcFactorial(factor));
        while(e-olde > 0.001){
            ++factor;
        e = e + (1.0/calcFactorial(factor));
        }
        return e;
    }


}