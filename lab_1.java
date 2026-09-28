class Substance {
    private String name;
    private double density;
    private double meltingPoint;
    
    public Substance(String name, double density, double meltingPoint) {
        this.name = name;
        this.density = density;
        this.meltingPoint = meltingPoint;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getDensity() {
        return density;
    }
    
    public void setDensity(double density) {
        this.density = density;
    }
    
    public double getMeltingPoint() {
        return meltingPoint;
    }
    
    public void setMeltingPoint(double meltingPoint) {
        this.meltingPoint = meltingPoint;
    }
    
    public double mass(double volume) {
        return density * volume;
    }
    
    public boolean isSolidAt(double temperature) {
        return temperature < meltingPoint;
    }
    
    public double densityInGramsPerCm3() {
        return density / 1000.0;
    }
}

class Water extends Substance {
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

class Cola extends Water {
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


class Main {
    public static void main(String[] args) {
        Cola cola = new Cola("Coca-Cola", 10.6, 42, 1.0);
        
        System.out.println("Масса одного литра: " + cola.mass(1.0));
        System.out.println("При -5 градусах затвердевает? " + cola.isSolidAt(-5));
        
        cola.freeze();
        System.out.println("После заморозки: " + cola.getAggregateState());
    
        System.out.println("Газированная? " + cola.isCarbonated());
        cola.openBottle();
        System.out.println("Газированная? " + cola.isCarbonated());
    
        System.out.println("Диетическая? " + cola.isDiet());
    
        cola.addIce(500);
        System.out.println("после добавления льда сахара стало: " + cola.getSugarAmount());
    }
}
