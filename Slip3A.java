abstract class shape
{
    final float pi =3.14f;
    abstract void volume();
    abstract void area();
}

class cone extends shape
{
    float r;
    float h;
    float l;
    cone(float a,float b,float c)
    {
        r=a;
        h=b;
        l=c;
    }
    public void volume()
    {
        System.out.print("\n the volume of cone : "+ ((pi*r*r*h)/3));
    }
    public void area()
    {
        System.out.print("\n total area of cone: "+ ((pi*r*r*(r+l))));
    }
}
class cylinder extends shape
{
    float r,h;
    cylinder(float a,float b)
    {
        r=a;
        h=b;
    }
    public void volume()
    {
        System.out.print("\n the volume of cylinder : "+ ((pi*r*r*h)));
    }
    public void area()
    {
        System.out.print("\n total area of cylinder: "+ ((2*pi*r*h)+(2*pi*r*r)));
    }
}

public class Slip3A
{
    public static void main(String arg[])
    {
        cone c1= new cone(1.0f, 2.0f, 3.0f);
        c1.volume();
        c1.area();

        cylinder c2 = new cylinder(2.0f, 3.0f);
        c2.volume();
        c2.area();
    }
}