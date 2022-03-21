package factoryMethod.factory;

import factoryMethod.developers.JavaDeveloper;
import factoryMethod.developers.Developer;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
