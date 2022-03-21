package factoryMethod.factory;

import factoryMethod.developers.CppDeveloper;
import factoryMethod.developers.Developer;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
