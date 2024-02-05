public class Human implements Info {
    public String name;

    public Human(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("hello");
    }

    public void Showinfo() {

        System.out.println("my name is: "+this.name);
    }
}
