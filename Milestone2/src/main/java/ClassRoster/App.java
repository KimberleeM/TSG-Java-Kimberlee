package ClassRoster;

import ClassRoster.controller.ClassRosterController;
import ClassRoster.dao.ClassRosterDao;
import ClassRoster.dao.ClassRosterDaoFileImpl;
import ClassRoster.ui.ClassRosterView;
import ClassRoster.ui.UserIO;
import ClassRoster.ui.UserIOConsoleImpl;

/**
 *
 * @author Max
 */
public class App {

    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIo);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        ClassRosterController controller = new ClassRosterController(myDao, myView);
        controller.run();
    }

}
