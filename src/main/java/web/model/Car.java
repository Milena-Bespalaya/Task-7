package web.model;

public class Car {
    String model;
    String color;
    int series;

    public Car(String model, String color, int series) {
        this.model = model;
        this.color = color;
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", series=" + series +
                '}';
    }
}
