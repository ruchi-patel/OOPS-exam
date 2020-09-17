package javaleads.RemainingQuestions.Question30;

public class Question30 {

    public static void main(String[] args) {
        int numberOfEmployees = 5;

        EngineerFirm engineerFirm = new EngineerFirm(numberOfEmployees);

        int[] salaries = new int[]{10, 20, 30, 40, 50};

        engineerFirm.assignSalaries(salaries);

        engineerFirm.minSalary();
        engineerFirm.maxSalary();
        engineerFirm.averageSalary();


        int[] salaries2 = new int[]{10, 20, 30, 40, 50, 10};
        try {
            engineerFirm.assignSalaries(salaries2);
        } catch (MismatchLengthException e) {
            System.out.println("Salary array length was not matching with engineeringFirm salary");
        }

        AccountantFirm accountantFirm = new AccountantFirm(numberOfEmployees);
        int[] accountantSalaries = new int[]{1, 2, 3, 4, 5};

        accountantFirm.assignSalaries(accountantSalaries);

        accountantFirm.minSalary();
        accountantFirm.maxSalary();
        accountantFirm.averageSalary();


        int[] accountantSalaries2 = new int[]{10, 20, 30, 40, 50, 10};
        try {
            accountantFirm.assignSalaries(accountantSalaries2);
        } catch (MismatchLengthException e) {
            System.out.println("Salary array length was not matching with accountantFirm salary");
        }

    }
}
