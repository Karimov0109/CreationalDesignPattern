package abstractFactoryMethod.banking;

import abstractFactoryMethod.domain.Developer;
import abstractFactoryMethod.domain.ProjectManager;
import abstractFactoryMethod.domain.ProjectTeamFactory;
import abstractFactoryMethod.domain.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
