package abstractFactoryMethod.website;

import abstractFactoryMethod.domain.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
