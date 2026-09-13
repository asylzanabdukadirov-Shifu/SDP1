public class SmartWatchBuilder {

    private String brand;
    private String model;
    private String screenType;
    private boolean gpsEnabled;
    private boolean heartRateMonitor;
    private boolean waterResistance;
    private String strap;
    private String color;

    public SmartWatchBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public SmartWatchBuilder setModel(String model) {
        this.model = model;
        return this;
    }
    public SmartWatchBuilder setScreenType(String screenType) {
        this.screenType = screenType;
        return this;
    }
    public SmartWatchBuilder setGpsEnabled(boolean gpsEnabled) {
        this.gpsEnabled = gpsEnabled;
        return this;
    }
    public SmartWatchBuilder setHeartRateMonitor(boolean heartRateMonitor) {
        this.heartRateMonitor = heartRateMonitor;
        return this;
    }
    public SmartWatchBuilder setWaterResistance(boolean waterResistance) {
        this.waterResistance = waterResistance;
        return this;
    }
    public SmartWatchBuilder setStrap(String strap) {
        this.strap = strap;
        return this;
    }
    public SmartWatchBuilder setColor(String color) {
        this.color = color;
        return this;
    }
    public SmartWatch build() {

        if (brand == null ) {
            throw new IllegalStateException("Brand is required");
        }
        if (model == null ) {
            throw new IllegalStateException("Model is required");
        }
        if (color == null ) {
            throw new IllegalStateException("Screen type is required");
        }
        return new SmartWatch(
                brand,
                model,
                screenType,
                gpsEnabled,
                heartRateMonitor,
                waterResistance,
                strap,
                color
        );
    }
}