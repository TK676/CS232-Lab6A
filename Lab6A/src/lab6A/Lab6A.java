package lab6A;


public class Lab6A {
 
   public static void main(String[] args) {
      
    double totRectangleArea = 0, totCircleArea = 0, totTriangleArea = 0;
    Shape s1=new Circle(5.5);
    Shape s2=new Circle(4.5);
    Shape s3=new Rectangle(3,4);
    Shape s4=new Rectangle(4,5);
    Shape s5=new Triangle(4,4);
    Shape s6=new Triangle(5,5);
    Shape shapes[] = {s1,s2,s3,s4,s5,s6};
        
    for(int i=0; i<shapes.length; i++) {
        if(shapes[i] instanceof Circle) {
            totCircleArea += shapes[i].area();
        }
        else if(shapes[i] instanceof Rectangle) {
            totRectangleArea += shapes[i].area();
        }
        else if(shapes[i] instanceof Triangle) {
            totTriangleArea += shapes[i].area();
        }
    }
 
    System.out.printf("Total Triangle Area : %.2f\n", totTriangleArea);
    System.out.printf("Total Circle Area : %.2f\n",totCircleArea);
    System.out.printf("Total Rectangle Area : %.2f\n",totRectangleArea);
   }
}
