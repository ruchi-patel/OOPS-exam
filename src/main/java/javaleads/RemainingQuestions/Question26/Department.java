package javaleads.RemainingQuestions.Question26;

public class Department {
    String departmentName;
    int departmentId;
    String departmentLocation;

    public Department(){

    }
    public Department(String name, int id){
        this.departmentName = name;
        this.departmentId = id;
    }
    public Department(String name, int id, String location){
        this.departmentName = name;
        this.departmentId = id;
        this.departmentLocation = location;
    }

}
