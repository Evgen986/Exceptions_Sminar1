public class Task4 {
    public static void main(String[] args) {
        try{
            System.out.println("До опператора throw");
            throw new ArithmeticException();
        }catch (ArithmeticException e){
            System.out.println("Исключение перехвачено");
        }
        System.out.println("После блока try/catch");
    }
}
