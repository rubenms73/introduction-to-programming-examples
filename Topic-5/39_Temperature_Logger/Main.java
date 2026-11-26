/** Tests the Reading and DailyLog classes. */
public class Main
{
    /**
     * Records the temperatures of a morning and searches them.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        DailyLog log = new DailyLog("2026-12-01");
        System.out.println("Empty log: " + log);
        System.out.println("Maximum of an empty log: " + log.maximum());

        // The readings do not arrive in the order of the hours
        log.addReading(new Reading(8, 9.5));
        log.addReading(new Reading(10, 14.0));
        log.addReading(new Reading(9, 12.5));
        log.addReading(new Reading(11, 14.0));
        System.out.println("Log: " + log);

        System.out.println("Second reading at 09:00: " + log.addReading(new Reading(9, 20.0)));
        System.out.println("Adding null: " + log.addReading(null));
        System.out.println("Readings stored: " + log.getSize());

        System.out.println("Reading at 09:00: " + log.getReading(9));
        System.out.println("Reading at 15:00: " + log.getReading(15));
        System.out.println("Maximum (first of two at 14.0): " + log.maximum());
        System.out.println("Average: " + log.average());
        System.out.println("Hours above 12 degrees: " + log.hoursAbove(12.0));

        DailyLog copy = new DailyLog(log);
        System.out.println("Copy equals original: " + copy.equals(log));
        copy.addReading(new Reading(12, 15.5));
        System.out.println("After adding to the copy: " + copy.equals(log));

        Reading returned = log.getReading(8);
        returned.setTemperature(30.0);
        System.out.println("Reading at 08:00 after changing the returned copy: " + log.getReading(8));
    }
}
