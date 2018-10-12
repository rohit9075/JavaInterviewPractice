package reflection_api;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {

    public String name, city;

    public Test(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public static void main(String[] args) {

        Test test = new Test("Rohit", "Bangalore");

        // getting the object reference of test class
        Class<?> obj = test.getClass();

        // printing the fully qualified class name and simple class name;
        System.out.println(obj.getClass());
        System.out.println(obj.getSimpleName());

        // getting the list of the constructor
        Constructor<?>[] constructors = obj.getConstructors();

        // printing the number of constructor
        System.out.println("Number of constructores  : " + constructors.length);

        // getting the construction at first position
        Constructor<?> con = constructors[0];


        // creating the object of the Object Class.
        Object object;

        try {

            //  Instantiating the object using test constructor
            object = con.newInstance("vivek kumar", "Dhawangere");

            // printing the object.
            System.out.println(object);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
