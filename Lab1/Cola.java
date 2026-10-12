public class Cola extends Water {
    private String brand;
    private double sugarAmount;
    private double calories;
    
    public Cola(String brand, double sugarAmount, double calories, double volume) {
        super(1040.0, -1.0, "liquid", true, volume);
        this.brand = brand;
        this.sugarAmount = sugarAmount;
        this.calories = calories;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brd) {
        this.brand = brd;
    }
    
    public double getSugarAmount() {
        return sugarAmount;
    }
    
    public void setSugarAmount(double sgr) {
        this.sugarAmount = sgr;
    }
    
    public double getCalories() {
        return calories;
    }
    
    public void setCalories(double clr) {
        this.calories = clr;
    }
    
    public void openBottle() {
        setCarbonated(false);
    }
    
    public boolean isDiet() {
        return sugarAmount < 0.5;
    }
    
    public void addIce(double gramms) {
        double addedLiters = gramms / 1000.0;
        double newVolume = getVolume() + addedLiters;
        
        sugarAmount = sugarAmount * getVolume() / newVolume;
        calories = calories * getVolume() / newVolume;
        setVolume(newVolume);
    }
}
