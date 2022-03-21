package abstractFactoryMethod;

import abstractFactoryMethod.banking.BankingTeamFactory;
import abstractFactoryMethod.domain.Developer;
import abstractFactoryMethod.domain.ProjectManager;
import abstractFactoryMethod.domain.ProjectTeamFactory;
import abstractFactoryMethod.domain.Tester;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
