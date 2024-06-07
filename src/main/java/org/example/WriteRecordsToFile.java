package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WriteRecordsToFile {

    public static void main(String[] args) {
        List<Person> records = Arrays.asList(new Person("Bhar32", 29),
                new Person("Arya", 30),
                new Person("Golu", 9),
                new Person("shivam", 2));

        writeDataToFile();
        Map<Boolean, List<Person>> map = records.stream()
                .collect(Collectors.partitioningBy(person -> person.getAge() > 18));

        writeDataToFile(map.get(false), "adult");
    }

    private static List<Person> writeDataToFile() {
        List<Person> list = new ArrayList<>();
        String url = "jdbc:mysql://localhost:3306/testDB";
        String username = "root";
        String password = "root";
        try(Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from Person");) {
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                Person person = new Person(name, age);
                list.add(person);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private static void writeDataToFile(List<Person> people, String adult) {
        /*ObjectMapper objectMapper = new ObjectMapper();

        try(FileWriter fileWriter = new FileWriter(adult)) {
            objectMapper.writeAsString(fileWriter, adult);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }
}
