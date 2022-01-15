package programming.with.classes;

public class Student {
    private String name;
    private int groupNumber;
    private int[] academicRecord = new int[5];

    public Student(String name, int groupNumber, int[] academicRecord){
        this.name = name;
        this.groupNumber = groupNumber;
        this.academicRecord = academicRecord;
    }

    public String getName() {
        return name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getAcademicRecord() {
        return academicRecord;
    }

    public void setAcademicRecord(int[] academicRecord) {
        this.academicRecord = academicRecord;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        boolean flag = true;
        for (int number : academicRecord) {
            if (number < 9) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Name: " + name);
            System.out.println("Group: " + groupNumber + "\n");
        }
    }
}
