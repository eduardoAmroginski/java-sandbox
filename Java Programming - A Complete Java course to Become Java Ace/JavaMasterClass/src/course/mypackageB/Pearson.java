package course.mypackageB;

public class Pearson {
    public String  name;
    public int age;
    public String gender;

    public void sleep(){
        if (age < 10){
            System.out.println(name + " will sleep more than 12 hours in a day");
        } else if (age > 10 && age <=50) {
            System.out.println(name + " will sleep less than 10 hours in a day");
        } else {
            System.out.println(name + " will sleep average than 10 hours in a day");
        }
    }
}