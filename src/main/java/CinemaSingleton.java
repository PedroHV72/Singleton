public class CinemaSingleton {
    private CinemaSingleton() {};
    private static CinemaSingleton instance = new CinemaSingleton();
    public static CinemaSingleton getInstance() {
        return instance;
    }

    private int poltrona;

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }
}
