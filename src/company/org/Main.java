package company.org;

public class Main {
    public static void main(String[] args){
        if (args.length != 2){
            System.out.println("Podano złą liczbe argumentów");
        }
        else {
            for (String arg : args) {
                if (!arg.matches("\\d+")){
                    System.out.println("Co najmniej jeden z argumentow nie jest liczba");
                    return;
                }
            }
            Prime licz = new Prime();
            int a = Integer.parseInt(args[0]);
            System.out.println("ilosc liczb pierwszych mniejszych/rownych " + a + ": " + licz.liczba(a));
            Alg obl = new Alg();
            int b = Integer.parseInt(args[1]);
            obl.kolejna(b);
        }
    }
}