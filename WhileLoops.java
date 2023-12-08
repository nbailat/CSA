public class WhileLoops {
    
    public static void main(String [] args){
        WhileLoops loop = new WhileLoops();
        System.out.println(loop.addOdds(12));
        System.out.println(loop.addOdds(4));
        System.out.println(loop.addOdds(33));
        System.out.println(loop.sumDigits(73));
        System.out.println(loop.sumDigits(1500000));
        System.out.println(loop.sumDigits(756218));
        System.out.println(loop.howManyYears(111.2, 120));
        System.out.println(loop.howManyYears(111.2, 150));
        loop.printSum(6);
        loop.printSum(8);
        loop.printSum(2);
        System.out.println(loop.isPerfectSquare(25));
        System.out.println(loop.isPerfectSquare(45));
        System.out.println(loop.isPerfectSquare(5));
        System.out.println(loop.isPerfectSquare(49));

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
        while(num>0){
        dig = num%10;
        sum = sum +dig;
        num = num/10;
        }
        return sum;
    }

    public int howManyYears(double startpop, double endpop){
        double rate = 0.0113;
        int years = 0;
        double pop = startpop;
        
        while(pop<endpop){
            pop = pop+pop*rate;
            years++;    
        }
            System.out.print("Years:");
            return years;
    }

    public void printSum(int num){
        int sum = 0;
        int dig = 0;
        System.out.println("n = " + num);
        while(dig<num){
            dig = dig+1;
            sum = sum+dig;
            System.out.print(dig);
            if (dig<num){
            System.out.print(" + ");     
           }
        }
            System.out.println(" = " + sum);
    }

    public boolean isPerfectSquare(int n){
        int sum = 0;
        int dig = 1;
        while(n>sum){
            sum = sum+dig;
            dig = dig+2;
           
        }    
        if(sum == n){
            return true;
        } else {
            return false;
        }

    }
}
