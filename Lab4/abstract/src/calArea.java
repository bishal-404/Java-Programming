interface calArea
{   double getArea();
}
interface calPerimeter{
    double getPerimeter();
}
class calulation_of_rectangle implements calArea,calPerimeter{
    private double width;
    private double height;
    calulation_of_rectangle(double width,double hight){
        this.height=height;
        this.width=width;
    }
    public double getArea(){return width*height;}
    public double getPerimeter(){return 2*(width+height);}
}

public class main1 {
    public static void main(String []args){
        calulation_of_rectangle r=new calulation_of_rectangle(5,10);
        System.out.println("area="+r.getArea());
    }
}
}
