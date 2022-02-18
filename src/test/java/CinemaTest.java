public class CinemaTest {
    public static void main(String[] args) {
        agendarPoltrona("1");
        agendarPoltrona("1");
    }

    private static void agendarPoltrona(String poltrona) {
        CinemaSingleton cinema1 = CinemaSingleton.getInstance();
        System.out.println(cinema1.bookPoltrona(poltrona));
    }
}
