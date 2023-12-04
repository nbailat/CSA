public class WhileLoops {
    
    public static void main(String [] args){
        WhileLoops loop = new WhileLoops();
        System.out.println(loop.addOdds(12));
        System.out.println(loop.addOdds(4));
        System.out.println(loop.addOdds(33));
        System.out.println(loop.howManyYears(120, 150));
        System.out.println(loop.howManyYears(111.2, 120));
        System.out.println(loop.howManyYears(111.2, 150));
    }   
    public int addOdds(int n){
        int sum = 0;
        int odd = 1;
        while(odd<=n){
            sum = odd + sum;
            odd = odd +2;
        }
            return sum;
    }

    public int sumDigits(int num){
        int sum = 0;
        int dig;
        while(num%){
        

        }
    }

    public int howManyYears(double startpop, double endpop){
        double rate = 0.0113;
        int years = 0;
        double pop = startpop;
        
        while(pop<endpop){
            pop = pop+pop*rate;
            years++;    
        }
            return years;
    }
}
