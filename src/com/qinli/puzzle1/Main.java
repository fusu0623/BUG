package com.qinli.puzzle1;


/**
 * @Author Cambria
 * @creat 2021/2/3 23:29
 */
public class Main {
    static Student[] students = new Student[4];

    public static void main(String[] args) {

        students[1] = new Student("法外狂徒张三",20);
        students[2] = new Student("李四",21);
        students[3] = new Student("王五",19);

        printStu();
    }

    static void printStu(){
        for (int i=1;i<=3;i++) {
            System.out.println("姓名：" + students[i].name);
            System.out.println("年龄：" + students[i].age);
        }
    }
}
