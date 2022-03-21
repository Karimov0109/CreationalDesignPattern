package abstractFactoryMethod.website;

import abstractFactoryMethod.domain.Developer;
import abstractFactoryMethod.domain.ProjectManager;
import abstractFactoryMethod.domain.ProjectTeamFactory;
import abstractFactoryMethod.domain.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
