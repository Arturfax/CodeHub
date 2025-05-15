public abstract class MotorVehicle {

    protected String mark;
    protected String model;
    protected String color;
    protected double length;
    protected double width;
    protected double height;
    protected Engine engine;

    public MotorVehicle(String mark, String model, String color, double length, double width,
                        double height, Engine engine) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
        this.engine = engine;
    }
}
