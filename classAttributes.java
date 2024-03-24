public class classAttributes {

     int x=13;

    public static void main(String[] args){

        classAttributes number1 = new classAttributes();
        classAttributes number2 = new classAttributes();
        
        number2.x = 12;
        number1.x = 23;

        System.out.println(number1.x);
        System.out.println(number2.x);
    }
    
}
