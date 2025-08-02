package backround;

public class Car {
    private String brand;
    private int maxSpeed;
    public void run(){
        System.out.println("xe "+brand+" đang chạy với tốc độ tối đa "+ maxSpeed +" km/h");
    }
    public Car(String brand, int maxSpeed){
        this.brand=brand;
        this.maxSpeed=maxSpeed;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public boolean kiemTra(){
        if (maxSpeed<=90)
            return true;
        else
            return false;
    }
}
