public class CAT {
    String name;
    int age;

    public CAT(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Important()
    public void printer(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
