package core;

public class Car {
    private String number;
    private int height;
    private double weight;
    private boolean hasVehicle;
    private boolean isSpecial;

    public void setNumber(String carNumber) {
        number = carNumber;
    }

    public String getNumber() {
        return number;
    }
    public void setHeight(int carHeight){
        height = carHeight;
    }
    public int getHeight(){
        return height;
    }
    public void setWeight(double carWeight){
        weight = carWeight;
    }
    public double getWeight(){
        return weight;
    }
    public void setHasVehicle(boolean carHasVehicle) {
        hasVehicle = carHasVehicle;
    }

    public boolean getHasVehicle() {
        return hasVehicle;
    }
    public void setIsSpecial(boolean carIsSpecial) {
        isSpecial = carIsSpecial;
    }

    public boolean getIsSpecial() {
        return isSpecial;
    }


    public String toString() {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
                special + "Автомобиль с номером " + number +
                ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}