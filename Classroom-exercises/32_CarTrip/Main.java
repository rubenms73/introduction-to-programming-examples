public class Main {
    public static void main(String[] args) {
        CarTrip trip = new CarTrip(200, 12, 1.50);
        System.out.println(trip);
        System.out.printf("Total cost: %.2f euros%n", trip.totalCost());
        System.out.printf("Consumption: %.2f litres/100 km%n", trip.consumptionPer100Km());
        System.out.printf("Cost: %.2f euros/km%n", trip.costPerKm());
    }
}
