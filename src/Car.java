public class Car extends Transport implements HasTyre, HasEngine{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку у машины");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель у машины");
    }

    public void check(){
        checkTyres(this);
        checkEngine();
    }
}
