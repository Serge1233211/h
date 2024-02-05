public class Main {
    public static void main(String[] args) {
        Info info1 =new Human ("human");
        Animal info2 =new Animal(1);
        outputInfo(info2);
        outputInfo(info1);
    }
    public static void outputInfo(Info info) {
        info.Showinfo();
    }
}