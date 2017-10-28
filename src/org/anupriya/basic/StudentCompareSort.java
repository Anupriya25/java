package org.anupriya.basic;

import java.util.*;

public class StudentCompareSort {
    public static void main(String args[]) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jack", "Male"));
        students.add(new Student("Skylar", "Female"));
        students.add(new Student("Skylar", "Male"));
        students.add(new Student("Shelly", "Male"));
        students.add(new Student("Veronica", "Female"));
        students.add(new Student("Veronica", "Female"));
        students.add(new Student("Shelly", "Male"));
        students.add(new Student("Veronica", "Male"));
//        StudentCompare studentCompare = new StudentCompare();
//        Collections.sort(students, studentCompare);
//        System.out.println(students);

        //testing equality
        // List<String> sameName = new ArrayList<>();
        Set<String> sameName = new HashSet<>();
        // System.out.println(students.contains(new Student("Jack111111", "Male")));
/*
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getName().equals(students.get(j).getName()) && !(students.get(i).getGender().equals(students.get(j).getGender()))) {
                    sameName.add(students.get(i).getName());
                }
            }
        }
*/
        // System.out.println(sameName);
        Set<Student> students1 = new HashSet<>();
        students1.addAll(students);


        System.out.println("set" + students1);

        for (Student student : students) {
            Student unisexNameStudent = new Student(student.getName(), student.getGender().equals("Male") ? "Female" : "Male");
            System.out.println(unisexNameStudent);

            if (students1.contains(unisexNameStudent)) {
                sameName.add(unisexNameStudent.getName());
            }
        }
        System.out.println(sameName);


    }

//    static class StudentCompare implements Comparator<Student> {
//        @Override
//        public int compare(Student o1, Student o2) {
//
//
//            return o1.compareTo(o2) * -1;
//
////            return o1.getName().compareTo(o2.getName());
//        }
//    }

    static class Student implements Comparable<Student> {
        String name;
        String gender;

        public Student(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }


        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            return Objects.equals(gender, ((Student) obj).gender) && Objects.equals(name, ((Student) obj).name);
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public int compareTo(Student o) {
            if (name.equals(o.getName())) {
                return gender.compareTo(o.getGender());
            } else {
                return name.compareTo(o.getName());
            }
        }
    }


}
