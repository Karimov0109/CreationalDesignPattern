package abstractFactoryMethod.website;

import abstractFactoryMethod.domain.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project");
    }
}
