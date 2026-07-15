package Day11;

public class Problem3 {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.getAge());
    }
}

class Student {
    private int age = 18;

    int getAge() {
        return age;
    }
}

    
