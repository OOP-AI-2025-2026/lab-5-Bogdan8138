package ua.opnu;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ivanov", "Petro", 40);
        Person p2 = new Student("Palamarchuk", "Bogdan", 18, "AI-244", "ST-000123");
        Person p3 = new Lecturer("Sydorenko", "Olena", 35, "PMI", 28000);

        Person[] people = new Person[] { p1, p2, p3 };

        for (Person p : people) {
            System.out.println(p.toString());
        }
    }
}
