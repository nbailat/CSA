public class ForLoops {

    public static void main(String [] args){
        ForLoops frlps = new ForLoops();
        System.out.println(frlps.addEvens(4));
        System.out.println(frlps.addEvens(9));
        System.out.println(frlps.addEvens(12));
        frlps.printSquaresBack(8);
        frlps.sillyNumbers();
        frlps.sillyNumbers2();
        frlps.dollarsAndStars();

    }

    public int addEvens(int n){
        int sum = 0;
        for(int evens=2; evens<=n;){
            sum = sum + evens;
            evens = evens + 2;
        }
        return sum;
    }

    public void printSquaresBack(int n){
        for(int num =n; num>=1; num--){
            System.out.print(num*num+" ");
        }
        
    }

    public void sillyNumbers(){
        for(int i=1; i<=3; i++){
            System.out.println();
            for(int j=0; j<10; j++){
                for(int s=1; s<=3;s++){
                    System.out.print(j);
                }
                
            }
        }
    }

    public void sillyNumbers2(){
        for(int i=0; i<=3; i++){
            System.out.println();
            for(int j=9; j>0; j--){
                for(int s=1; s<=j;s++){
                    System.out.print(j);
                }

            }
        }
    }

    public void dollarsAndStars(){
        for (int i =0; i<=7;i++){
            System.out.println();
            for(int j=12; j>=1; j--){
                System.out.print("*");
                }
            }
        }
    }


