public interface HasTyre {
    default void updateTyre(){
        System.out.println("Меняем покрышку");
    };
    default void checkTyres(Transport transport){
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
