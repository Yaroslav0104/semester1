package semester1.practice07;

public class Processor {
    private String model;
    private double frequencyGHz;
    private double price;

    public Processor(String model, double frequencyGHz, double price) {
        this.model = model;
        this.frequencyGHz = frequencyGHz;
        this.price = (price >= 0) ? price : 0.0;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public double getFrequencyGHz() {
        return frequencyGHz;
    }
}
