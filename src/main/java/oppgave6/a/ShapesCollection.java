package oppgave6.a;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * 14.11.2016
 *
 * @author <a href="mailto:leo-andreas.ervik@visma.com">Leo-Andreas Ervik</a>.
 */
public class ShapesCollection {

    public static void main(String[] args) {
        ShapesCollection shapesCollection = new ShapesCollection();

        shapesCollection.sortShapesByHeightUsingSequentialStream();
        shapesCollection.sortShapesByHeightUsingParrallelStream();
    }

    private List<Shape> shapes;

    public ShapesCollection() {
        shapes = new ArrayList<>();
        populateRandom(1000000);
    }

    public List<Shape> sortShapesByHeightUsingSequentialStream() {
        List<Shape> temp;
        long time = System.currentTimeMillis();

        temp = shapes.stream()
                .sorted((s1, s2) -> Double.compare(s2.getHeight(), s1.getHeight()))
                .collect(Collectors.toList());

        System.out.println("Elapsed time, sequential: " + (System.currentTimeMillis() - time) + " ms");
        return temp;
    }

    public List<Shape> sortShapesByHeightUsingParrallelStream() {
        List<Shape> temp;
        long time = System.currentTimeMillis();

        temp = shapes.parallelStream()
                .sorted((s1, s2) -> Double.compare(s2.getHeight(), s1.getHeight()))
                .collect(Collectors.toList());

        System.out.println("Elapsed time, parallel: " + (System.currentTimeMillis() - time) + " ms");
        return temp;
    }

    private void populateRandom(Integer numElements) {
        Random r = new Random();
        for(int i = 0; i < numElements; i++){
            shapes.add(
                    new Shape(
                            r.nextDouble(), r.nextDouble(), r.nextDouble()
                    )
            );
        }
    }
}