class RectModel{
    int length, width;
    RectModel(int length, int width){
        this.length = length;
        this.width = width;
    }

    RectModel(RectModel rectangle){
        this.length = rectangle.length;
        this.width = rectangle.width;
    }

    void display(){
        System.out.println("Rectangle has lenght of "+ this.length + " and widht of "+ this.width);
    }
}

public class Rectangle {
    public static void main(String[] args) {
        RectModel rect1 = new RectModel(100, 80);
        RectModel rect2 = new RectModel(rect1);

        rect2.display();
    }
}
