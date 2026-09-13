public class SmartWatch {
    private String brand;
    private String model;
    private String screenType;
    private boolean gpsEnabled;
    private boolean heartRateMonitor;
    private boolean waterResistance;
    private String strap;
    private String color;

    public SmartWatch(
            String brand,
            String model,
            String screenType,
            boolean gpsEnabled,
            boolean heartRateMonitor,
            boolean waterResistance,
            String strap,
            String color) {

        this.brand = brand;
        this.model = model;
        this.screenType = screenType;
        this.gpsEnabled = gpsEnabled;
        this.heartRateMonitor = heartRateMonitor;
        this.waterResistance = waterResistance;
        this.strap = strap;
        this.color = color;
    }
    public void showInfo() {
        System.out.println("characteristics:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen: " + screenType);
        System.out.println("GPS: " + gpsEnabled);
        System.out.println("Heart Rate Monitor: " + heartRateMonitor);
        System.out.println("Water Resistance: " + waterResistance);
        System.out.println("Strap: " + strap);
        System.out.println("Color: " + color);
    }

}