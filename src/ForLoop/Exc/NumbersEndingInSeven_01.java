package ForLoop.Exc;

public class NumbersEndingInSeven_01 {
    public static void main(String[] args) {
        for (int i = 7; i <= 997; i+= 10) {
            if (i % 10 == 7){
                System.out.println(i);
            }

        }
    }
}
