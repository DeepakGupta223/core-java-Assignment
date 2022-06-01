import java.util.Scanner;

class RectangleProgram {
    int length; 
    int breadth; 
    int area; 
   
    public RectangleProgram()
    {
    	length = 0;
    	breadth= 0;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        breadth = sc.nextInt();
    }

    void calculate() {
        area = length * breadth;
        
    }

    void display() {
        System.out.println("Area of Rectangle = " + area);
       
    }

    public static void main(String args[]) {
        RectangleProgram obj1 = new RectangleProgram();
        obj1.input();
        obj1.calculate();
        obj1.display();
        System.out.println("--------------");
        RectangleProgram obj2 = new RectangleProgram();
        obj2.input();
        obj2.calculate();
        obj2.display();
        System.out.println("----------------");
        RectangleProgram obj3 = new RectangleProgram();
        obj3.input();
        obj3.calculate();
        obj3.display();
        System.out.println("-----------------");
        RectangleProgram obj4 = new RectangleProgram();
        obj4.input();
        obj4.calculate();
        obj4.display();
        System.out.println("-------------------");
        RectangleProgram obj5 = new RectangleProgram();
        obj5.input();
        obj5.calculate();
        obj5.display();
    }
}