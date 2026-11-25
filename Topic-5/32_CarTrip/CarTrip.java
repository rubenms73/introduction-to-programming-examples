/**
 * A car trip with its distance, the fuel used and the price of the fuel.
 * The constructor arguments must satisfy the preconditions of the
 * exercise. Invalid setter values leave the previous valid state
 * unchanged.
 */
public class CarTrip
{
    /** The distance travelled, in kilometres. */
    private double kilometres;

    /** The fuel used, in litres. */
    private double litres;

    /** The price of the fuel, in euros per litre. */
    private double fuelCostPerLitre;

    /**
     * Creates a trip.
     *
     * @param kilometres the distance, not negative
     * @param litres the fuel used, not negative
     * @param fuelCostPerLitre the price of the fuel, not negative
     */
    public CarTrip(double kilometres, double litres, double fuelCostPerLitre)
    {
        setKilometres(kilometres);
        setLitres(litres);
        setFuelCostPerLitre(fuelCostPerLitre);
    }

    /**
     * Returns the distance.
     *
     * @return the distance in kilometres
     */
    public double getKilometres()
    {
        return kilometres;
    }

    /**
     * Changes the distance. A negative value is ignored.
     *
     * @param kilometres the new distance
     */
    public void setKilometres(double kilometres)
    {
        if (kilometres >= 0)
            this.kilometres = kilometres;
    }

    /**
     * Returns the fuel used.
     *
     * @return the fuel used in litres
     */
    public double getLitres()
    {
        return litres;
    }

    /**
     * Changes the fuel used. A negative value is ignored.
     *
     * @param litres the new amount of fuel
     */
    public void setLitres(double litres)
    {
        if (litres >= 0)
            this.litres = litres;
    }

    /**
     * Returns the price of the fuel.
     *
     * @return the price in euros per litre
     */
    public double getFuelCostPerLitre()
    {
        return fuelCostPerLitre;
    }

    /**
     * Changes the price of the fuel. A negative value is ignored.
     *
     * @param fuelCostPerLitre the new price
     */
    public void setFuelCostPerLitre(double fuelCostPerLitre)
    {
        if (fuelCostPerLitre >= 0)
            this.fuelCostPerLitre = fuelCostPerLitre;
    }

    /**
     * Calculates the cost of the fuel used.
     *
     * @return the cost in euros
     */
    public double totalCost()
    {
        return litres * fuelCostPerLitre;
    }

    /**
     * Calculates the fuel used every 100 km.
     *
     * @return the litres per 100 km, or 0 if the distance is 0
     */
    public double consumptionPer100Km()
    {
        if (kilometres == 0)
            return 0;
        return litres * 100.0 / kilometres;
    }

    /**
     * Calculates the cost of each kilometre.
     *
     * @return the euros per kilometre, or 0 if the distance is 0
     */
    public double costPerKm()
    {
        if (kilometres == 0)
            return 0;
        return totalCost() / kilometres;
    }

    /**
     * Returns the data of the trip.
     *
     * @return the text that represents the trip
     */
    @Override
    public String toString()
    {
        return String.format("%s km, %s litres, %s euro/litre",
                kilometres, litres, fuelCostPerLitre);
    }
}
