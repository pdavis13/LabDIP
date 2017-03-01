package dip.lab1;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {
    private double hourlyRate;
    private double totalHrsForYear;

    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }
    
    @Override
    public final double getAnnualCompensation(){
        return getHourlyRate() * getTotalHrsForYear();
    }

    
    public final double getTotalHrsForYear() {
        return totalHrsForYear;
    }
    
    public final void setTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
    }
    
    public final double getHourlyRate() {
        return hourlyRate;
    }
    
    public final void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
