package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Operation {
    public static void main(String[] args) {

        //1.  Find total Engineers count
        List<Engineer> engineers = EngineerRestCall.getEngineers();
        System.out.println(engineers.stream().count());

        //2. Find total number of male and female
        Map<String, Long> collectMaleFemale = engineers.stream().
                collect(Collectors.groupingBy(Engineer::getGender, Collectors.counting()));
        collectMaleFemale.forEach((k,v) -> System.out.println(k + " = " + v));

        //3. Find maximum salary of engineer
        Engineer engineerWithMaxSal = engineers.stream().sorted(Comparator.comparingDouble(Engineer::getSalary).reversed()).findFirst().get();
        Engineer engineerWithMaxSalary = engineers.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Engineer::getSalary))).get();
        System.out.println(engineerWithMaxSal);

        //4. Find all departments name
        List<String> departments = engineers.stream().map(e -> e.getDepartment()).distinct().collect(Collectors.toList());
        departments.forEach(System.out::println);

        //5. Find average salary of male and female engineer
        Map<String, Double> maleFemaleAvgSal = engineers.stream()
                .collect(Collectors.groupingBy(Engineer::getGender, Collectors.averagingDouble(Engineer::getSalary)));

        //6. Find the number of engineer working in each department
        Map<String, Long> engInEachDept = engineers.stream().collect(Collectors.groupingBy(Engineer::getDepartment, Collectors.counting()));
        engInEachDept.forEach((k,v) -> System.out.println(k + " = " + v));

        //7. Find the engineers who have joined after 2015
        List<Engineer> engineers_2015 = engineers.stream().filter(e -> e.yearOfJoining > 2015).collect(Collectors.toList());
        engineers_2015.forEach(System.out::println);

        //8. Find youngest employee from product department
        Engineer maleEngineerProductWala = engineers.stream()
                .filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("Product Development"))
                .min(Comparator.comparingInt(Engineer::getAge)).get();
        System.out.println(maleEngineerProductWala);

        //9. Name of all engineer in each department
        Map<String, List<Engineer>> departmentWiseName = engineers.stream().collect(Collectors.groupingBy(Engineer::getDepartment));
        departmentWiseName.forEach((k,v) -> System.out.println(k + " = " + v));

        //10. Max age of engineer

        Engineer engineerWithMaxAge = engineers.stream().max(Comparator.comparingInt(Engineer::getAge)).get();
        int asInt = engineers.stream().mapToInt(Engineer::getAge).max().getAsInt();
        System.out.println(engineerWithMaxAge);
        System.out.println(asInt);

        //11. Find all engineers name and add comma while printing
        List<String> empNames = engineers.stream().map(Engineer::getName).collect(Collectors.toList());
        String empList = String.join(",", empNames);
        System.out.println(empList);
    }
}


