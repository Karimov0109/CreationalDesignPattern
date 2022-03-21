package factoryMethod.developers;

import factoryMethod.interfaces.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Cpp developer writes Cpp code...");
    }
}
