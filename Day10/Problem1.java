package Day10;

public class Problem1 {
    public static void main(String[] args) {
         Employee e = new Employee();

        e.setId(101);

        System.out.println(e.getId());
}

}
class Employee {
    private int id;

    void setId(int id) {
        this.id = id;
    }

    int getId() {
        return id;
    }
}