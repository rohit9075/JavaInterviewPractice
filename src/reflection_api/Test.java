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

        //
        Class<?> obj = test.getClass();

        System.out.println(obj.getClass());
        System.out.println(obj.getSimpleName());

        Constructor<?>[] constructors = obj.getConstructors();

        System.out.println("Number of constructores  : " + constructors.length);

        Constructor<?> con = constructors[0];


        Object object;

        try {
            object = con.newInstance("vivek kumar", "Dhawangere");
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
