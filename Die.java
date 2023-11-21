public class Die{
    private int die;
    
    public static void main(String[] args) {
        Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());
    }
    
    public void roll(){
        die = (int)(Math.random() * 6 + 1);
    }
    public int getNumDots(){
        return die;
    }

}

