public class SmartWatchDirector {
    public SmartWatchBuilder createSportWatch() {

        return new SmartWatchBuilder()
                .setScreenType("AMOLED")
                .setGpsEnabled(true)
                .setHeartRateMonitor(true)
                .setWaterResistance(true)
                .setStrap("Silicone");
    }
    public SmartWatchBuilder createClassicWatch() {

        return new SmartWatchBuilder()
                .setScreenType("OLED")
                .setGpsEnabled(false)
                .setHeartRateMonitor(false)
                .setWaterResistance(true)
                .setStrap("Leather");
    }
}
