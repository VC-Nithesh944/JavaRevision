class PointModel{
    int x , y;
    PointModel(int x, int y){
        this.x = x;
        this.y = y;
    }

    PointModel(double x, double y ){
        this.x = (int) x;
        this.y = (int) y;
    }

    void display(){
        System.out.println("(x, y) : " + '(' + x + ',' + y + ')');
    }
}

public class Point {
    public static void main(String[] args) {
        PointModel p1 = new PointModel(4, 8);
        p1.display();
        PointModel p2 = new PointModel(4.5, 6.9);
        p2.display();
    }
}
