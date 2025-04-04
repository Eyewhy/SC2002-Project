package menus.project.users;

import java.util.Arrays;

import menus.HomeMenu;
import menus.Menu;
import menus.users.applicant.ApplyMenu;

public class ManagerProjectMenu {
    private static class BaseClass extends Menu {
        public BaseClass(String d, String i) {
            super(d,i);
        };
        public void menu() {};
    }

    private static BaseClass baseClass = new BaseClass(
        "Manager Project Options", 
        ""
    );

    public static void setOptions() {
        // TODO add manager's available options
        baseClass.setOptions(Arrays.asList(
            HomeMenu.get(),
            ApplyMenu.get()
        ));
    }

    public static Menu get() {
        return baseClass;
    }
}
