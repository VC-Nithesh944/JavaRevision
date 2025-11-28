class CarModel{
    String make, model; int year;
    public CarModel(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void display(){
        System.out.println("This Car is made in "+ make + " and the model is "+ model + " in the year " + year);
    }

}

public class Main{
    public static void main(String args[]){
        CarModel car1 = new CarModel("India", "Hyundai", 1990);
        car1.display();
        CarModel car2 = new CarModel("New York", "Ford", 2003);
        car2.display();
    }
}


