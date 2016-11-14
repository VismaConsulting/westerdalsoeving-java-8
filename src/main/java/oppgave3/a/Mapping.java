package oppgave3.a;

import java.util.HashMap;
import java.util.Map;

/**
 * 14.11.2016
 *
 * @author <a href="mailto:leo-andreas.ervik@visma.com">Leo-Andreas Ervik</a>.
 */
public class Mapping {

    private Map<Integer, String> cars;

    public Mapping() {
        cars = new HashMap<>();
        cars.put(1, "BMW");
        cars.put(2, "Audi");
        cars.put(3, "Rolls Royce");
        cars.put(4, "Toyota");
        cars.put(5, "Hyundai");
        cars.put(6, "Tesla");
        cars.put(7, "Mitsubishi");
        cars.put(8, "Rover");
        cars.put(9, "Renault");
        cars.put(10, "Pontiac");
        cars.put(11, "Ford");
    }

    // Before Java 8
    public String collectedResult(String search) {
        String result = "";
        for(Map.Entry<Integer, String> entry : cars.entrySet()){
            if(search.equals(entry.getValue())) {
                result = entry.getValue();
            }
        }
        return result;
    }
}
