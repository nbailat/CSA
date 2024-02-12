public class Complex {
    private double num;
    private double inum;

    public static void main(String [] args){
        Complex d = new Complex(2, 3);
        Complex e = new Complex(4,1);

        Complex f = new Complex(4.3, 5.3);
        Complex g = new Complex(5.5,6.24);

        Complex h = new Complex(0.0, 4);
        Complex i = new Complex(-3, -4);
        
        System.out.println(d.abs());
        System.out.println(e.abs());
        System.out.println(e.add(d));
        System.out.println(f.add(g));
        System.out.println(h.add(i));
        System.out.println(d.multiply(e));
        System.out.println(f.multiply(g));
        System.out.println(h.multiply(i));
        System.out.println(e.add(-3.0));
        System.out.println(h.add(7.0));
        System.out.println(d.multiply(2));
        System.out.println(f.multiply(-4.0));

    }

    public Complex(double a, double b){
        num = a;
        inum = b;
    }

    public Complex(double a){
        this(a,0.0);
    }

    public double abs(){
        double temp = Math.pow(num, 2) + Math.pow(inum, 2);
        return Math.sqrt(temp);
    }

    public Complex add(Complex other){
        Complex v = new Complex(this.num+other.num,this.inum+other.inum);
        return v;
    }
    public Complex add(double num){
        return new Complex((this.num+num),(inum));
    }
    public String toString(){
        return num + " + " + inum + "i";
    }

    public Complex multiply(Complex other){
        double f = this.num*other.num;
        double g = this.num*other.inum;
        double h = this.inum*other.num;
        double j = this.inum*other.inum*-1;

        Complex x = new Complex(f+j,h+g);
        return x;
    }

    public Complex multiply(double k){
        return new Complex((this.num*k),(this.inum*k));
    }

    
}
