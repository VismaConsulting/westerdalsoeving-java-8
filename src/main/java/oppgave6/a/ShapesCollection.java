package oppgave6.a;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        populateRandom(10000);
    }

    public List<Shape> sortShapesByHeightUsingSequentialStream() {
        List<Shape> temp = new ArrayList<>();
        Long time = System.currentTimeMillis();
        /*
            WRITE SEQUENTIAL STREAM SORT HERE
         */
        System.out.println("Elapsed time, : " + (System.currentTimeMillis() - time));
        return temp;
    }

    public List<Shape> sortShapesByHeightUsingParrallelStream() {
        List<Shape> temp = new ArrayList<>();
        Long time = System.currentTimeMillis();
        /*
            WRITE PARALLEL STREAM SORT HERE
         */
        System.out.println("Elapsed time: " + (System.currentTimeMillis() - time));
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
