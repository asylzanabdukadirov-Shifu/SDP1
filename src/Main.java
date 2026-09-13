public class Main {

    public static void main(String[] args) {

        SmartWatchDirector director = new SmartWatchDirector();

        SmartWatch sportWatch = director.createSportWatch()
                .setBrand("Rolex")
                .setModel("IDK")
                .setColor("green")
                .build();

        SmartWatch sportWatch2 = director.createSportWatch()
                .setBrand("Samsung")
                .setModel("Galaxy Watch")
                .setColor("Silver")
                .build();

        SmartWatch classicWatch = director.createClassicWatch()
                .setBrand("Apple")
                .setModel("Watch Series")
                .setColor("White")
                .build();

        sportWatch.showInfo();

        System.out.println();

        sportWatch2.showInfo();

        System.out.println();

        classicWatch.showInfo();
    }
}