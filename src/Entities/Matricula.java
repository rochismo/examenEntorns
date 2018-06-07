package Entities;

public class Matricula {
    private Estudiant estudiant;
    private float cost;

    public Matricula(Estudiant estudiant) {
        this.estudiant = estudiant;
        cost = getCostMatricula();
    }

    private float getCostMatricula(){
        int credits = 0;
        float total;
        // Changed to enhanced for loop
        for (Object o : estudiant.getAssignatures()) {
            Assignatura element = (Assignatura) o;
            credits = credits + element.getCredits();
        }

        total = credits * 15;
        return total;
    }

    public float getCost() {
        return cost;
    }

    public Estudiant getEstudiant() {
        return estudiant;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}