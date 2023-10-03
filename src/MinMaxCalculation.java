/**
 * A simple class to compute minimum and maximum given a set of numbers.
 */
public class MinMaxCalculation {
    
    /**
     * Compute the minimum given a set of numbers.
     */
    public double min( double ... numbers){
        double curMin = numbers[0];
        for (double num : numbers){
            if (num < curMin) {
                curMin = num;
            }
        }
        return curMin;
    }

    /**
     * Compute the maximum given a set of numbers.
     */
    public double max( double ... numbers){
        double curMax = numbers[0];
        for (double num : numbers){
            if (num > curMax) {
                curMax = num;
            }
        }
        return curMax;
    }
}
