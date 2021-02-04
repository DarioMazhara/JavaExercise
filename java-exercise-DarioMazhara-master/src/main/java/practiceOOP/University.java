package practiceOOP;

import java.io.*;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;


/** A class that represents a University */
public class University {
    // Instance variables
    private String name; // name of the university (like University of San Francisco)
    private List<Student> students; // list of students at this university

    /**
     * Constructor for class University.
     * Takes the name of university as a parameter
     * @param name name of university
     */
    public University(String name) {
        // TODO: initialize instance variable name
        this.name = name;
        // TODO: Initialize ArrayList students

        students = new ArrayList<Student>();
    }

    /**
     * Create a student a student with this name and id and
     * add the student to the list of students
     * @param studentName name of the student
     * @param studentId id of the student
     */
    public void addStudent(String studentName, int studentId) {
        // TODO: create a student with this name and id
        students.add(new Student(studentName, studentId));
    }

    /** Return true if a person with the given name is a student at this university,
     * and false otherwise.
     * For the purpose of this exercise we assume that names are unique.
     * @param name name of the person
     * @return true if this person is a student at this university
     */
    public boolean findStudent(String name) {
        // TODO: check if the student with this name is in the ArrayList
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name))
                return true;
        }
        return false;
    }

    /**
     * Return a string representation of the university
     * @return a string that contains the name of the university on the first line, and
     * then includes students, one on each line:
     * name, id
     */
    public String toString() {
        // TODO: return a string representation of the university - see description above
        String studentsString = "";
        for (int i = 0; i < students.size(); i++) {
            studentsString += students.get(i).getName() + ", " + students.get(i).getId() + "\n";
        }
        return this.name + " University\n" + studentsString; // remember to change this
    }

    /**
     * Sorts the ArrayList of students by name in increasing order.
     */
    public void sort() {
        // TODO: sort students.
        // No need to implementing sorting from scratch. You may use Collections.sort method

        // Note: implement compareTo method in class Student first for sorting to work

        //Confused how and why to use compareTo for this?

    }

}