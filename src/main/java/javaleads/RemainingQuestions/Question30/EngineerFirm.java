package javaleads.RemainingQuestions.Question30;

public class EngineerFirm implements Company {
    int[] income;

    public EngineerFirm(int numberOfEmployees) {
        income = new int[numberOfEmployees];
    }

    @Override
    public void assignSalaries(int[] salaries) {
        if (salaries.length != income.length) {
            throw new MismatchLengthException();
        } else {
            income = salaries;
        }
    }

    @Override
    public void averageSalary() {
        int sum = 0;
        for (int i = 0; i<income.length; i++) {
            sum = sum + income[i];
        }
        float average = (float)sum/income.length;
        System.out.println("Average salary of engineer employees: " + average);
    }

    @Override
    public void maxSalary() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<income.length; i++) {
            if (max < income[i]) {
                max = income[i];
            }
        }
        System.out.println("Max salary of the engineer employee: " + max);
    }

    @Override
    public void minSalary() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<income.length; i++) {
            if (min > income[i]) {
                min = income[i];
            }
        }
        System.out.println("Min salary of the engineer employee: " + min);
    }
}
