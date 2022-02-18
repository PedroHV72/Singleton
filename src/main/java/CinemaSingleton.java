import java.util.HashSet;
import java.util.Set;

public class CinemaSingleton {
    private static final CinemaSingleton INSTANCE = new CinemaSingleton();
    private Set<String> poltronasDisponiveis;

    public static CinemaSingleton getInstance() {
        return INSTANCE;
    }

    private CinemaSingleton() {
        this.poltronasDisponiveis = new HashSet<>();
        poltronasDisponiveis.add("1");
        poltronasDisponiveis.add("1");
    }

    public boolean bookPoltrona(String poltrona) {
        return poltronasDisponiveis.remove(poltrona);
    }
}
