package org.springcamp.report1;

import org.springcamp.report1.model.Department;
import org.springcamp.report1.model.Professor;
import org.springcamp.report1.model.Student;
import org.springcamp.report1.model.University;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // 제너릭 사용해서 ArrayList 생성
        final ArrayList<University> universityList = new ArrayList<>();
        final ArrayList<Department> departmentList = new ArrayList<>();
        final ArrayList<Professor> professorList = new ArrayList<>();
        final ArrayList<Student> studentList = new ArrayList<>();


        // 3개씩 객체 생성해서 ArrayList에 추가
        // University List
        final University uni1 = new University();
        final University uni2 = new University();
        final University uni3 = new University();

        universityList.add(uni1);
        universityList.add(uni2);
        universityList.add(uni3);

        // Department List
        final Department dep1 = new Department();
        final Department dep2 = new Department();
        final Department dep3 = new Department();

        departmentList.add(dep1);
        departmentList.add(dep2);
        departmentList.add(dep3);

        // Professor List
        final Professor prof1 = new Professor();
        final Professor prof2 = new Professor();
        final Professor prof3 = new Professor();

        professorList.add(prof1);
        professorList.add(prof2);
        professorList.add(prof3);

        // Student List
        final Student std1 = new Student();
        final Student std2 = new Student();
        final Student std3 = new Student();

        studentList.add(std1);
        studentList.add(std2);
        studentList.add(std3);


        // ArrayList를 돌면서 각 객체의 toString 메소드 실행
        for (final University u : universityList) {
            System.out.println(u.toString());
        }
        for (final Department d : departmentList) {
            System.out.println(d.toString());
        }
        for (final Professor p : professorList) {
            System.out.println(p.toString());
        }
        for (final Student s : studentList) {
            System.out.println(s.toString());
        }
    }
}
