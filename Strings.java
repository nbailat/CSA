public class Strings{
    public static void main(String[] args) {
        System.out.println(scroll("Hello World"));
        System.out.println(scroll("happy"));
        System.out.println(scroll("h"));
        
        System.out.println(convertName(" Reubenstein, Lori Renee "));
        System.out.println(convertName("Biden,Joe"));
        System.out.println(convertName("the Clown, Bozo"));
        
        System.out.println(negative("0010111001"));
        System.out.println(negative("11111111"));
        
        /*System.out.println("04/20/2014 becomes " + dateString("04/20/2014"));
        
        System.out.println("04/20/2014 becomes" + dateString2("04/20/2014"));
        System.out.println("4/20/2014 becomes" + dateString2("4/20/2014"));
        System.out.println("04/2/2014 becomes" + dateString2("04/2/2014"));
        System.out.println("4/2/2014 becomes" + dateString2("4/2/2014"));
        
        System.out.println("\nstartsWith");
        System.out.println(startsWith("architecture", "arch"));
        System.out.println(startsWith("architecture", "a"));
        System.out.println(startsWith("arch", "architecture"));
        System.out.println(startsWith("architecture", "rch"));
        System.out.println(startsWith("architecture", "architecture"));
        
        System.out.println("\nendsWith");
        System.out.println(endsWith("astronomy", "nomy"));
        System.out.println(endsWith("astronomy", "y"));
        System.out.println(endsWith("astronomy", "nom"));
        System.out.println(endsWith("nomy", "astronomy"));
        System.out.println(endsWith("astronomy", "astronomy"));
        
        System.out.println("\nremoveTag");
        System.out.println(removeTag("<b>Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World</b>", "head"));
        System.out.println(removeTag("Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World", "b"));
        System.out.println(removeTag("</img>Hello World<img>", "img"));
        System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
        System.out.println(removeTag("<title>Hello World</title> Happy Birthday",
        "title"));
        System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));
        /* */
    }

    public static String scroll(String s){
        return s.substring(1)+s.charAt(0);
    }

    public static String convertName(String t){
        t = t.trim();
        String n = t.substring(t.indexOf(",")) + " ";
        String a = t.substring(0,t.indexOf(","));
        a = a.trim();
        n = n+a;
        n = n.substring(1);
        return n.trim();
    }

    public static String negative(String r){
        r.replace( 0, 2);
        r.replace(1, 0);
        r.replace(2, 1);
    }
}