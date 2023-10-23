public class Circle {
    private double radius;
    
    public Circle(double r){
        radius = r;

    }
    
    public double findareaofCircle(){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double findcircumferenceofCircle(){
        double circum = (Math.PI*2)*radius;
        return circum;
    }
}
 