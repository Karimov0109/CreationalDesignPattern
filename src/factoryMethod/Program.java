package factoryMethod;

import factoryMethod.factory.CppDeveloperFactory;
import factoryMethod.factory.JavaDeveloperFactory;
import factoryMethod.factory.PhpDeveloperFactory;
import factoryMethod.developers.Developer;
import factoryMethod.factory.DeveloperFactory;

public class Program {
    public static void main(String[] args) {
//        DeveloperFactory developerFactory = new CppDeveloperFactory();
//        Developer developer = developerFactory.createDeveloper();
//        developer.writeCode();

        DeveloperFactory developerFactory = createDeveloperBySpecialty("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("cpp")){
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty");
        }
    }
}
