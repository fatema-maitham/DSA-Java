/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practiceactivitiesweek1;
import java.util.ArrayList;

public class PracticeActivitiesWeek1 {

    public static void main(String[] args) {
        Student s = new Student("Fatema", 101, 3.8);
        s.display();
        s.setGpa(3.9);

        System.out.println(s.getGpa());
        
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());
        
        Lecturer lecturer = new Lecturer("Ali", 40, "Java");
        CollegeStudent student = new CollegeStudent("Sara", 20, 3.8);

        lecturer.display();
        lecturer.teach();

        student.display();
        student.study();
        
        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Top: " + stack.peek());
        System.out.println("Removed: " + stack.pop());
        System.out.println("Size: " + stack.size());
        System.out.println("Is empty: " + stack.isEmpty());
        
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(80);
        marks.add(90);
        marks.add(70);
        marks.add(85);

        marks.remove(2);

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        double average = (double) total / marks.size();

        System.out.println("Marks: " + marks);
        System.out.println("Average: " + average);
        
        // Exercise 6:
        // An array has a fixed size, so it is suitable when
        // the number of students is known.
        //
        // An ArrayList has a dynamic size and can grow or shrink,
        // so it is more suitable when the number of students is unknown.
        //
        // Therefore, ArrayList<Integer> is better for storing
        // grades when the number of students is unknown.
        
    }
}
