package lesson32._04_extended;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(var fos = new FileOutputStream("src/lesson32/_04_extended/out.txt")){
            var oos = new ObjectOutputStream(fos);
            var fis = new FileInputStream("src/lesson32/_04_extended/out.txt");
            var ois = new ObjectInputStream(fis);


            var extObj = new ExtendedClass("Vasia", "Pupkin", "Thi$Myp@ss");
            System.out.println(extObj);

            oos.writeObject(extObj);
            System.out.println("_--------------------------------");

            var fromFile = (ExtendedClass)ois.readObject();
            System.out.println(fromFile);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
