public class ClassObjSample {

    public static void main(String[] args) {
        Pearson alex = new Pearson();
        alex.name = "Alex";
        alex.age = 55;
        alex.gender = "Male";
        alex.sleep();

        Pearson mia = new Pearson();
        mia.name = "Mia";
        mia.age = 40;
        mia.gender = "Female";
        mia.sleep();

        Pearson james = new Pearson();
        james.name = "James";
        james.age = 3;
        james.gender = "Male";
        james.sleep();

    }

}

class Pearson {
   String  name;
   int age;
   String gender;

   void sleep(){
       if (age < 10){
           System.out.println(name + " will sleep more than 12 hours in a day");
       } else if (age > 10 && age <=50) {
           System.out.println(name + " will sleep less than 10 hours in a day");
       } else {
           System.out.println(name + " will sleep average than 10 hours in a day");
       }
   }
}