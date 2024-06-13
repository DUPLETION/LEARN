package lesson33._01_trainig;

import static lesson33._01_trainig.Utils.extract;
import static lesson33._01_trainig.Utils.printAnimals;

public class Mian {
    public static void main(String[] args) {
        //printAnimals(extract());
        var animals = extract();
        printAnimals(animals);
    }
}
