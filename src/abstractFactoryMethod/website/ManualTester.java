package abstractFactoryMethod.website;

import abstractFactoryMethod.domain.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website code...");
    }
}
