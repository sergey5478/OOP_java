package Seminar1.Task1;

public class Elite extends Product{
    private double wight;
    private double volume;

    // public Elite(double wight, double volume){
    //     this.wight = wight;
    //     this.volume = volume;
    // }

    public Elite(String name, double price, double wight, double volume){
        super(name, price);
        this.wight = wight;
        this.volume = volume;
    }
    

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    
}
