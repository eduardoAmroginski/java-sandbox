package exercises;


class Employee{
    String emp_name;
    int emp_id;
    String address;
}

public class SecondExercise {
    public static void main(String[] args){
        System.out.println(printDetails());
    }
    public static String printDetails(){
        // TODO : Return the result here [ex: return "hello";]

        Employee emp = new Employee();

        emp.emp_name = "James";
        emp.emp_id = 1001;
        emp.address = "13th St, New York";

        return "Employee Name is " + emp.emp_name + " and Employee ID is "+ emp.emp_id + " and Employee Address is " + emp.address ;

    }
}
