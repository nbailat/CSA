public class Factorials {
    
    public static void main(String [] args){
        Factorials fact = new Factorials();
        System.out.println(fact.calcFactorial(6));
        for(int factorial = 1; factorial <=20; factorial++){
            System.out.println(fact.calcFactorial(factorial));
        }
        System.out.println(fact.calcE());
        System.out.printf("e is %2.3f \n", fact.calcEX(1));
        System.out.printf("e is %2.3f \n", fact.calcEX(2));
        System.out.printf("e is %2.3f \n", fact.calcEX(3));
        System.out.printf("e is %2.3f \n", fact.calcEX(4));
        System.out.printf("e is %2.3f \n", fact.calcEX(5));
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

    public double calcE(){
        double e = 1.0;
        int factor = 1;
        double olde = 0;
        e = 1+(1.0/calcFactorial(factor));
        while(e-olde > 0.001){
            olde=e; 
            ++factor;
            e = e + (1.0/calcFactorial(factor)); 
        }
        return e;
    }

    public double calcEX(int x){
        int pow = 1;
        double e = 1.0;
        int factor = 1;
        double olde = 0;
        e = 1.0+(Math.pow(x, pow)/calcFactorial(factor));
        while(e-olde > 0.001){
            olde=e; 
            ++factor;
            ++pow;
            e = e + (Math.pow(x, pow)/calcFactorial(factor));
            
            
    }
        return e;

    }

}