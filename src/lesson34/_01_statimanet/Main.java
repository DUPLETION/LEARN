package lesson34._01_statimanet;

import lombok.SneakyThrows;

import java.sql.DriverManager;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Class.forName("com.mysql.cj.jsbc.Driver");

        try (var cn = DriverManager.getConnection("jdbc:mysql://localhost:3306")){

        }
    }
}