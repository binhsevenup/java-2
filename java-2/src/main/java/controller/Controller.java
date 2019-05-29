package controller;

import entity.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    private ArrayList<Student> list = new ArrayList<>();

    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Enroll ID: ");
        String enrolId = scanner.nextLine();
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        Student student = new Student(enrolId, firstName, lastName, age);
        list.add(student);
    }

    public void save() throws IOException {
        String format = "|%15-10s|%25-10s|%35-20s\n";
        FileWriter fileWriter = new FileWriter("src/main/resources/students.dat");
        fileWriter.write(" EnrolID" + "        " + "Fullname" + "                 " + "Age" + "\n");
        fileWriter.write("---------  ---------------------------  -----\n");
        for (Student student :
                list) {
            fileWriter.write(" " +student.getEnrollId() + "           " + student.getFirstName() + " " + student.getLastName() + "                " + student.getAge() + "\n");
        }
        fileWriter.close();
        System.out.println("Completed");
    }

    public void display() throws IOException {
        FileReader fileReader = new FileReader("src/main/resources/students.dat");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

    }
}
