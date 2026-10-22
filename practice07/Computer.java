package semester1.practice07;

public class Computer {
    private String title;
    private Processor cpu;
    private Memory ram;
    private double casePrice;

    public Computer(String title, Processor cpu, Memory ram, double casePrice) {
        this.title = title;
        this.cpu = cpu;
        this.ram = ram;
        this.casePrice = (casePrice >= 0) ? casePrice : 0.0;
    }

    public double calculateTotalPrice() {
        double cpuPrice = (cpu != null) ? cpu.getPrice() : 0.0;
        double ramPrice = (ram != null) ? ram.getPrice() : 0.0;
        return cpuPrice + ramPrice + casePrice;
    }

    public void upgradeMemory(Memory newRam) {
        if (newRam != null) {
            this.ram = newRam;
            System.out.println("Успішний апгрейд! Встановлено нову оперативну пам'ять об'ємом " + newRam.getSizeGB() + " GB.");
        }
    }

    public void printSpecs() {
        System.out.println("Комп'ютер: " + title);
        if (cpu != null) {
            System.out.println("Процесор: " + cpu.getModel() + " (" + cpu.getFrequencyGHz() + " GHz) — Ціна: " + cpu.getPrice() + " грн");
        }
        if (ram != null) {
            System.out.println("Оперативна пам'ять: " + ram.getSizeGB() + " GB (" + ram.getFrequencyMHz() + " MHz) — Ціна: " + ram.getPrice() + " грн");
        }
        System.out.println("Ціна корпусу (з блоком живлення): " + casePrice + " грн");
        System.out.println("Загальна вартість ПК: " + calculateTotalPrice() + " грн");
    }
}
