/** Constructor arguments must satisfy the exercise preconditions.
 * Invalid setter values leave the previous valid state unchanged. */
public class CarTrip {
    private double kilometres;
    private double litres;
    private double fuelCostPerLitre;

    public CarTrip(double kilometres, double litres, double fuelCostPerLitre) {
        setKilometres(kilometres);
        setLitres(litres);
        setFuelCostPerLitre(fuelCostPerLitre);
    }

    public double getKilometres() {
        return kilometres;
    }

    public void setKilometres(double kilometres) {
        if (kilometres >= 0) {
            this.kilometres = kilometres;
        }
    }

    public double getLitres() {
        return litres;
    }

    public void setLitres(double litres) {
        if (litres >= 0) {
            this.litres = litres;
        }
    }

    public double getFuelCostPerLitre() {
        return fuelCostPerLitre;
    }

    public void setFuelCostPerLitre(double fuelCostPerLitre) {
        if (fuelCostPerLitre >= 0) {
            this.fuelCostPerLitre = fuelCostPerLitre;
        }
    }

    public double totalCost() {
        return litres * fuelCostPerLitre;
    }

    public double consumptionPer100Km() {
        if (kilometres == 0) {
            return 0;
        }
        return litres * 100.0 / kilometres;
    }

    public double costPerKm() {
        if (kilometres == 0) {
            return 0;
        }
        return totalCost() / kilometres;
    }

    @Override
    public String toString() {
        return kilometres + " km, " + litres + " litres, "
                + fuelCostPerLitre + " euro/litre";
    }
}
