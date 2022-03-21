package factoryMethod.factory;

import factoryMethod.developers.JavaDeveloper;
import factoryMethod.interfaces.Developer;
import factoryMethod.interfaces.DeveloperFactory;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
