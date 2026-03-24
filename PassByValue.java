public class PassByValue{
    public static void main(String[] args){
        int x = 1000;
        addNumber(x);
        IO.println("x"+x);    

    }

     public void addNumber(int number){
        number++;
    }
}