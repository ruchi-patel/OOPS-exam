package javaleads.RemainingQuestions.Question26;

public class Question26Main {
    public static void main(String[] args) {
        Department object1 = new Department();
        System.out.println(object1.departmentId);
        System.out.println(object1.departmentName);
        System.out.println(object1.departmentLocation);

        Department object2 = new Department("mike", 1);
        System.out.println(object2.departmentId);
        System.out.println(object2.departmentName);
        System.out.println(object2.departmentLocation);

        Department object3 = new Department("john",2,"VA");
        System.out.println(object3.departmentId);
        System.out.println(object3.departmentName);
        System.out.println(object3.departmentLocation);
    }
}
