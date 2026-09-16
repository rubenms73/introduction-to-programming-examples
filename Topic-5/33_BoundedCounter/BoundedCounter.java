/** Constructor arguments must satisfy the exercise preconditions.
 * Invalid setter values leave the previous valid state unchanged. */
public class BoundedCounter {
    private int minimum;
    private int maximum;
    private int value;

    public BoundedCounter(int minimum, int maximum, int initialValue) {
        // Precondition: minimum <= initialValue <= maximum.
        this.minimum = minimum;
        this.maximum = maximum;
        this.value = initialValue;
    }

    public int getMinimum() {
        return minimum;
    }

    public boolean setMinimum(int minimum) {
        if (minimum > maximum || value < minimum) {
            return false;
        }
        this.minimum = minimum;
        return true;
    }

    public int getMaximum() {
        return maximum;
    }

    public boolean setMaximum(int maximum) {
        if (maximum < minimum || value > maximum) {
            return false;
        }
        this.maximum = maximum;
        return true;
    }

    public int getValue() {
        return value;
    }

    public boolean setValue(int value) {
        if (value < minimum || value > maximum) {
            return false;
        }
        this.value = value;
        return true;
    }

    public boolean increment() {
        if (value == maximum) {
            return false;
        }
        value++;
        return true;
    }

    public boolean decrement() {
        if (value == minimum) {
            return false;
        }
        value--;
        return true;
    }

    public void reset() {
        value = minimum;
    }

    @Override
    public String toString() {
        return "Counter[" + minimum + ".." + maximum + "] = " + value;
    }
}
