import Entities.*;

import java.util.Arrays;

public class Main {

    private static final Assignatura[] assignaturas = new Assignatura[]{
            new Assignatura(1, "Xarxes", 150, 6, true),
            new Assignatura(2, "Sistemes Operatius", 100, 4, true),
            new Assignatura(2, "Entorns", 75, 3, true)
    };

    public static void main(String[] args) {
        Estudiant josep = new Estudiant(2018090103, "Josep", "Garcia Marti",
                "12345678X", 1, Arrays.asList(assignaturas));
        Matricula matricula = new Matricula(josep);
        System.out.println("El cost de la matrícula es: " + matricula.getCost());
    }
}
