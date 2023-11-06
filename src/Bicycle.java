public class Bicycle extends Transport implements HasTyre{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку у велосипеда");
    }

    public void check(){
        checkTyres(this);
    }
}
