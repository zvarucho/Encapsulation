public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.setMarks("Audi");
        audi.setYear(2018);
        audi.setMaxSpeed("288 km/h");
        System.out.println(audi.getMarks());
        System.out.println(audi.getYear());
        System.out.println(audi.getMaxSpeed());
    }
}