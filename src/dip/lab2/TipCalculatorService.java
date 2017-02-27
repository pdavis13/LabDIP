package dip.lab2;

/**
 *
 * @author pdavis13
 */
public class TipCalculatorService {
    private TipCalculator tipCalculator;

    public double getCalculatedTip(){
        return tipCalculator.getTip();
    }
    
    public TipCalculatorService(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }
    
    public TipCalculator getTipCalculator() {
        return tipCalculator;
    }
    
    public void setTipCalculator(TipCalculator tipCalculator){
        this.tipCalculator = tipCalculator;
    }
}
