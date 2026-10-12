public class Water extends Substance {
    private String aggregateState;
    private boolean carbonated;
    private double volume;
    
    public Water(double density, double meltingPoint, String aggregateState, boolean carbonated, double volume) {
        super("Water", density, meltingPoint);
        this.aggregateState = aggregateState;
        this.carbonated = carbonated;
        this.volume = volume;
    }
    
    public String getAggregateState() {
        return aggregateState;
    }
    
    public void setAggregateState(String agr) {
        this.aggregateState = agr;
    }
    
    public boolean isCarbonated() {
        return carbonated;
    }
    
    public void setCarbonated(boolean crb) {
        this.carbonated = crb;
    }
    
    public double getVolume() {
        return volume;
    }
    
    public void setVolume(double vlm) {
        this.volume = vlm;
    }
    
    public void freeze() {
        aggregateState = "solid";
    }
    
    public void boil() {
        aggregateState = "gas";
    }
    
    public void condense() {
        aggregateState = "liquid";
    }
    
    public void addWater(double liters) {
        volume = volume + liters;
    }
}