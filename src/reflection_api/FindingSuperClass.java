package reflection_api;

public class FindingSuperClass {

    public static void main(String[] args) {

        // instantiating the o with child class constructor
        Object o = new FindingSuperClass();

        // getting the class name
        Class<?> c = o.getClass();
        System.out.println("Class name is : " + c.getSimpleName());

        // getting the super class name
        Class<?> sup = c.getSuperclass();
        System.out.println("Class name is : " + sup.getSimpleName());

        // getting the package name
        Package p = c.getPackage();
        System.out.println("Package : " + p.getName());
    }
}
