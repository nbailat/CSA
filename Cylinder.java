public class Cylinder {
    private double height;
    private Circle base;

    public Cylinder(double radius, double h){
        base = new Circle(radius);
        height = h;
    }
    public double vol(){
        double b = base.findareaofCircle(); 
        double v = b * height;
        return v;
    } 
    public double sa(){
        double c = base.findcircumferenceofCircle();
        double b = base.findareaofCircle();
        double surface = (2 * b)+(c * height);
        return surface;

    }
}
