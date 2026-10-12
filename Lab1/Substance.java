public class Substance {
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