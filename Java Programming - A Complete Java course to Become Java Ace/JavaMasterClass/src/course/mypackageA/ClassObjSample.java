package course.mypackageA;

import course.mypackageB.Pearson;

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