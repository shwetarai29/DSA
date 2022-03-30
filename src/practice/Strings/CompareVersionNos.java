package practice.Strings;

import java.util.*;

public class CompareVersionNos {
    public static int compareVersion(String v1, String v2) {
        ArrayList<String> a = new ArrayList<>(Arrays.asList(v1.split("[.]")));
        ArrayList<String> b = new ArrayList<>(Arrays.asList(v2.split("[.]")));

        while (a.size() > b.size())
            b.add("0");
        while (a.size() < b.size())
            a.add("0");

        for (int i = 0, j = 0; i < a.size() && j < b.size(); i++, j++) {
            double d1 = Double.parseDouble(a.get(i));
            double d2 = Double.parseDouble(b.get(j));

            if (d1 > d2)
                return 1;
            else if (d1 < d2)
                return -1;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(compareVersion("1.1.0", "1.1.1"));
    }
}


class Employee{
    int id;
    String name;
    List<String> no;
    Address add;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(no, employee.no) && Objects.equals(add, employee.add);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, no, add);
    }

    public static void main(String[] args) {
        Set<Employee> x = new TreeSet<>();
        x.add(new Employee());
    }
}

class Address{
    String place;
}