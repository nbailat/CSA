public class Complex {
    private double num;
    private double inum;

    public static void main(String [] args){
        Complex d = new Complex(2, 3);
        Complex e = new Complex(4,1);
        System.out.println(d.abs());
        System.out.println(d.abs());
        System.out.println(e.add(d));
        System.out.println(d.add(e));
        System.out.println(d.multiply(e));
        System.out.println(e.multiply(d));

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

    public String toString(){
        return num + " + " + inum + "i";
    }

    public Complex multiply(Complex other){
        double f = this.num*other.num;
        double g = this.num*other.inum;
        double h = other.num*this.num;
        double j = other.num*this.inum;

        Complex x = new Complex(f+h,g+j);
        return x;
    }

    public Complex multiply(double num2, double inum2){
        double f = this.num*other.num;
        double g = this.num*other.inum;
        double h = other.num*this.num;
        double j = other.num*this.inum;

        Complex x = new Complex(f+h,g+j);
        return x;
    }

    public Complex add(double other){
        double v = this.num+other.num;
        double b = this.inum+other.inum;
        return v + "+" + b;
    }
}
