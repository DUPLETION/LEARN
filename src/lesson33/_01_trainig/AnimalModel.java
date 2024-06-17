package lesson33._01_trainig;

import lombok.*;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@Data
public class AnimalModel {
    private int id;
    private String name;
    private int age;



    public void setAge(int age) {
        this.age = age;
    }
}
