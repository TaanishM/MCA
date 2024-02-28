package serial;

import org.codehaus.jackson.map.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

class Student {
    private int stdId;
    private String stdName;
    private boolean passed;
    private boolean fail;

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public boolean isFail() {
        return fail;
    }

    public void setFail(boolean fail) {
        this.fail = fail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdId=" + stdId +
                ", stdName='" + stdName + '\'' +
                ", passed=" + passed +
                ", fail=" + fail +
                '}';
    }
}

public class ObjectMap {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        // Sample input data
        int[] studentIds = {101, 102};
        String[] studentNames = {"ram", "sita"};
        ObjectMapper objectMapper = new ObjectMapper();

        for (int i = 0; i < studentIds.length; i++) {
            Student student = new Student();
            student.setStdId(studentIds[i]);
            student.setStdName(studentNames[i]);
            student.setPassed(true);
            student.setFail(false);
            studentList.add(student);
        }
        try {
   String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(studentList);
            
            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
