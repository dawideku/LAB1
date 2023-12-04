package company.org;

public class Alg {
    public void kolejna(int n){
        int licznik = 1;
        System.out.println("Podana liczba: " + n);
        while(n != 1 && licznik < 1000){
            if (n % 2 == 0){
                n = n/2;
                System.out.print("(P)");
            }else{
                n = n * 3 + 1;
                System.out.print("(NP)");
            }
            System.out.println(licznik + " iteracja, wynik: " + n);
            licznik+=1;
        }
    }
}
