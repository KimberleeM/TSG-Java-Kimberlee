package ClassRoster.controller;

import ClassRoster.dao.ClassRosterDao;
import ClassRoster.dao.ClassRosterDaoException;
import ClassRoster.dto.Student;
import ClassRoster.ui.ClassRosterView;
import ClassRoster.ui.UserIO;
import ClassRoster.ui.UserIOConsoleImpl;
import java.util.List;

/**
 *
 * @author Max
 */
public class ClassRosterController {

    private ClassRosterView view;
    private ClassRosterDao dao;
    private UserIO io = new UserIOConsoleImpl();
    private List<Student> StudentList;

    public ClassRosterController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            while (keepGoing) {
                io.print("Main Menu");
                io.print("1. List Student IDs");
                io.print("2. Create New Student");
                io.print("3. View a Student");
                io.print("4. Remove a Student");
                io.print("5. Exit");

                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        listStudents();
                        break;
                    case 2:
                        createStudent();
                        break;
                    case 3:
                        viewStudent();
                        break;
                    case 4:
                        removeStudent();
                        break;
                    case 5:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();

                }
            }
            exitMessage();
        } catch (ClassRosterDaoException e) {

            view.displayErrorMessage(e.getMessage());
        }
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void createStudent() throws ClassRosterDaoException {
        view.displayCreateStudentBanner();
        Student newStudent = view.getNewStudentInfo();
        dao.addStudent(newStudent.getStudentId(), newStudent);
        view.displayCreateSuccessBanner();
    }

    private void listStudents() throws ClassRosterDaoException {
        view.displayDisplayAllBanner();
        List<Student> studentList = dao.getAllStudents();
        view.displayStudentList(studentList);
    }

    private void viewStudent() throws ClassRosterDaoException {
        view.displayDisplayStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student student = dao.getStudent(studentId);
        view.displayStudent(student);
    }

    private void removeStudent() throws ClassRosterDaoException {
        view.displayRemoveStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student removedStudent = dao.removeStudent(studentId);
        view.displayRemoveResult(removedStudent);
    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();

    }

    public void exitMessage() {
        view.displayExitBanner();
    }

    public ClassRosterController(ClassRosterDao dao, ClassRosterView view) {
        this.dao = dao;
        this.view = view;
    }

}
