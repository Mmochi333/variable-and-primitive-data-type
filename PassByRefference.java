public class PassByRefference {
    public static void main(String[] args){
        int x = 1000;
        addNumber(x);
        IO.println("X "+x);
    }

    public static void addNumber(int number){
        number++;
    }
}