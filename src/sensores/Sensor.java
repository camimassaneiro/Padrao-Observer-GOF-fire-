package sensores;
import java.util.Random;

// DADOS
public interface Sensor {

	static Random random = new Random();

	double getMedicao();
}
