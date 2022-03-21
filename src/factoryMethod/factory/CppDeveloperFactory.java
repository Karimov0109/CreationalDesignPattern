package factoryMethod.factory;

import factoryMethod.developers.CppDeveloper;
import factoryMethod.interfaces.Developer;
import factoryMethod.interfaces.DeveloperFactory;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
