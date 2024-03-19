public class Principal{
    public static void main(String[] args){
        double[] a = {23, 3.4, 567.65};

        String message = "";

        for (double i : a){
            message = message  + i + " ";
        }

        System.out.println(message);
    }
}