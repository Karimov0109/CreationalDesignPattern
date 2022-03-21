package factoryMethod.factory;

import factoryMethod.developers.PhpDeveloper;
import factoryMethod.developers.Developer;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
