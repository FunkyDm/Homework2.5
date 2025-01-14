package pro.sky.collectionStart.model;

public class Employee {
    private final String firstName;

    private final String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Сотрудник: " + firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (this.getClass() != other.getClass() || other == null) return false;
        Employee employee = (Employee) other;
        return firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName);
    }
}