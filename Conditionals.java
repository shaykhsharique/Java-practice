public class Conditionals {
    public static void main(String[] args) {
        int salary = 25400;

        // Basic Conditional Logic (If-Else Ladder)
        if (salary > 20000) {
            salary += 3000;
        } else if (salary > 10000) {
            salary += 2000;
        } else {
            salary += 1000;
        }

        System.out.println("Updated Salary: " + salary);
    }
}

