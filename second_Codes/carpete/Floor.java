package carpete;

public class Floor {
    private double width;
    private double length;

    public Floor(double widht, double lenght) {
        if(widht >= 0 && lenght >= 0){
            this.width = widht;
            this.length = lenght;
        }else if(lenght >= 0){
            this.length = lenght;
            this.width = 0;
        }else if(widht >= 0){
            this.length = 0;
            this.width = widht;
        }else {
            this.width = 0;
            this.length = 0;
        }
    }

    public double getArea(){
        return this.length * this.width;
    }
}
