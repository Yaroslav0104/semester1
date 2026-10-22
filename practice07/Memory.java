package semester1.practice07;

public class Memory {
    private int sizeGB;
    private int frequencyMHz;
    private double price;

    public Memory(int sizeGB, int frequencyMHz, double price) {
        this.sizeGB = (sizeGB > 0) ? sizeGB : 0;
        this.frequencyMHz = (frequencyMHz > 0) ? frequencyMHz : 0;
        this.price = (price >= 0) ? price : 0.0;
    }

    public double getPrice() {
        return price;
    }

    public int getSizeGB() {
        return sizeGB;
    }

    public int getFrequencyMHz() {
        return frequencyMHz;
    }
}
