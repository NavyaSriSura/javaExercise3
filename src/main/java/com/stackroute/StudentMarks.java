package com.stackroute;

public class StudentMarks {
    public String checkGrade(int array[], int numberOfStudents) {
        String var = "Valid Marks";
        for (int i = 0; i < numberOfStudents; i++) {
            if (array[i] < 0 || array[i] > 100)
                var = "Invalid Marks";
            break;
        }
        return var;
    }
}
