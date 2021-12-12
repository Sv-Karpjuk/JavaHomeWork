package com.pb.karpjuk.hw11_test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonTester {
    public static void main(String args[]) {

        GsonTester tester = new GsonTester();
        try {
            //Student student = new Student();
            //student.setAge(10);
            //student.setName("Mahesh");
            //tester.writeJSON(student);
           // Student[] student1 = tester.readJSON();

            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("D:/student.json"));

            Student[] student = gson.fromJson(bufferedReader, Student[].class);


            System.out.println(student);
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

}

class Student {
    private String name;
    private int age;
    public Student(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student [ name: "+name+", age: "+ age+ " ]";
    }
}
