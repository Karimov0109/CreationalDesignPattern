package factoryMethod.factory;

import factoryMethod.developers.PhpDeveloper;
import factoryMethod.interfaces.Developer;
import factoryMethod.interfaces.DeveloperFactory;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
