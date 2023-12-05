package attTRYCATCH;

import java.util.*;

public class att1 {            //calcular massa (sem erro)
    public static void main(String[] args) {
        try {
            Double gravidade = 9.81;
            Scanner scnPeso = new Scanner(System.in);
            System.out.println("Digite seu peso");
            Double peso = scnPeso.nextDouble();
            System.out.println("Sua massa é de: " + (peso / gravidade));
            scnPeso.close();
            Thread.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Ops! Aconteceu um erro: " + e);
        }
    }
}
