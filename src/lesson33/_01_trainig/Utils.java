package lesson33._01_trainig;

import lombok.experimental.UtilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@UtilityClass
public class Utils {
    public static List<AnimalModel> extract(){
        var animals = new ArrayList<AnimalModel>();
        try(var sc = new Scanner(new FileInputStream("src/lesson33/_01_trainig/file.csv"))){
            while (sc.hasNextLine()){
                try {
                    animals.add(AnimalFactory.getInstance(sc.nextLine()));
                }catch (TrainingException e) {
                    System.err.println(e);
                    System.err.println("Message: " + e.getMessage());
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return animals;
    }

    public static void printAnimals(List<AnimalModel> animals){
        animals.forEach(System.out::println);
    }
}
