package review3;

public class WhileLoop {
    public static void main(String[] args) {

        int time=9;

        while(time>7){
            System.out.println("Hi");
            time--; // if we have time++; then it will be infinitive loop
        }

        System.out.println("Value of time = "+time);

    }
}
