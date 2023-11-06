public interface HasTrailer {
    default void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
