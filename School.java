package school;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Teepop Ueangsawat
 * Main School
 */
public class School {

    ArrayList<Student> student = new ArrayList<Student>();
    ArrayList<Teacher> teacher = new ArrayList<Teacher>();
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        School test = new School();
        test.process();
    }

    // --------------------- M E N U ---------------------
    public void process() {
        boolean working = true;
        int input;
        while (working) {
            System.out.println("----------Menu----------");
            System.out.println("(1) student");
            System.out.println("(2) teacher");
            System.out.print("> ");
            input = scan.nextInt();
            if (input == 1) {
                System.out.println("----------Student----------");
                System.out.println("(1) list");
                System.out.println("(2) data");
                System.out.println("(3) add");
                System.out.println("(4) delete");
                System.out.print("> ");
                input = scan.nextInt();
                switch (input) {
                    case 1:
                        printStudentList();
                        break;
                    case 2:
                        studentData();
                        break;
                    case 3:
                        addStudent();
                        break;
                    case 4:
                        deleteStudent();
                        break;
                }
            } else if (input == 2) {
                System.out.println("----------Teacher----------");
                System.out.println("(1) list");
                System.out.println("(2) data");
                System.out.println("(3) add");
                System.out.println("(4) delete");
                System.out.print("> ");
                input = scan.nextInt();
                switch (input) {
                    case 1:
                        printTeacherList();
                        break;
                    case 2:
                        teacherData();
                        break;
                    case 3:
                        addTeacher();
                        break;
                    case 4:
                        deleteTeacher();
                        break;
                }
            }
        }
    }

    // ---------------------- S T U D E N T ------------------------
    public void addStudent() {
        System.out.println("----------Add Student----------");
        System.out.print("Input student ID\t: ");
        int studentID = scan.nextInt();
        System.out.print("Input student name\t: ");
        String studentName = scan.next();
        System.out.print("Input Advisor ID (If don't have input \"-\")\t: ");
        String advisorID = scan.next();
        Student newStudent = null;
        if (advisorID.equals("-")) {
            newStudent = new Student(studentID, studentName, null);
        }else {
            for(Teacher advisor : teacher){
                if(advisorID.equals(advisor.getTeacherID())){
                    newStudent = new Student(studentID, studentName, advisor);
                }
            }
        }
        student.add(newStudent);
    }

    public void deleteStudent() {
        System.out.println("----------Delete Student----------");
        printStudentList();
        System.out.println("Input Student ID");
        System.out.print("> ");
        int deleteID = scan.nextInt();
        int i = 0;
        for (Student student : student) {
            if (student.getStudentID() == deleteID) {
                this.student.remove(this.student.get(i));
            }
            i++;
        }
    }

    public void printStudentList() {
        for (Student student : student) {
            System.out.println(student.getStudentID() + "\t\t" + student.getStudentName());
        }
    }

    public void studentData() {
        System.out.println("------------ data ------------");
        System.out.println("input student ID");
        System.out.print("> ");
        int dataID = scan.nextInt();
        for (Student student : student) {
            if (student.getStudentID() == dataID) {
                System.out.println("Student ID : " + student.getStudentID());
                System.out.println("Student Name : " + student.getStudentName());
                System.out.print("Student's Advisor : ");
                if (student.getAdvisor() == null) {
                    System.out.println("-");
                } else {
                    System.out.println(student.getAdvisor().getTeacherName());
                }
            }
        }
    }

    // --------------------- T E A C H E R --------------------------
    public void addTeacher() {
        System.out.println("----------Add Teacher----------");
        System.out.print("Input teacher ID\t: ");
        int teacherID = scan.nextInt();
        System.out.print("Input teacher name\t: ");
        String teacherName = scan.next();
        Teacher newTeacher = new Teacher(teacherID, teacherName);
        teacher.add(newTeacher);
    }

    public void deleteTeacher() {
        System.out.println("----------Delete Student----------");
        printTeacherList();
        System.out.println("Input Teacher ID");
        System.out.print("> ");
        int deleteID = scan.nextInt();
        int i = 0;
        for (Teacher teacher : teacher) {
            if (teacher.getTeacherID() == deleteID) {
                this.teacher.remove(this.teacher.get(i));
            }
            i++;
        }
    }
    
    public void printTeacherList() {
        for (Teacher teacher : teacher) {
            System.out.println(teacher.getTeacherID() + "\t\t" + teacher.getTeacherName());
        }
    }
    
    public void teacherData() {
        System.out.println("------------ data ------------");
        System.out.println("input teacher ID");
        System.out.print("> ");
        int dataID = scan.nextInt();
        for (Teacher teacher : teacher) {
            if (teacher.getTeacherID() == dataID) {
                System.out.println("Teacher ID : " + teacher.getTeacherID());
                System.out.println("Teacher Name : " + teacher.getTeacherName());
                System.out.println("Advisee list");
                for (Student student : student) {
                    System.out.println("fdsafdfa");
                    System.out.println(student.getAdvisor() .getTeacherID());
                    if (student.getAdvisor().getTeacherID() == teacher.getTeacherID()){
                        System.out.println(student.getStudentID() + "\t" + student.getStudentName());
                    }
                }
            }
        }
    }
}
