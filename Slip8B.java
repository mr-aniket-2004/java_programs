import java.util.*;
abstract class Shape {
    final float pi = 3.14f;
    abstract void area();
}


class circle extends Shape{
    float radius =0.0f;
    circle(float r)
    {
        radius = r;
        
    }
     public void area()
    {
        float result = pi*radius*radius;
        System.out.println("the area of cicle : "+result);
    }
}

class sphere extends Shape
{   
    float r = 0.0f;
    sphere(float a)
    {
        r=a;
    }
    public void area()
    {
        float res = 4*pi*r*r;
        System.out.println("the area of sphere : "+res);
    }
}

public class Slip8B {
    
        public static void main(String arg[])
    {
        circle c1 = new circle(3.5f);
        c1.area();

        sphere s1 = new sphere(3.2f);
        s1.area();
    }
}
