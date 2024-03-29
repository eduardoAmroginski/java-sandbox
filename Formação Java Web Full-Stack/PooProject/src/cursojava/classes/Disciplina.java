package cursojava.classes;

import java.util.Objects;

// Essa classe Disciplina servirá para todos os objetos e instancias de notas e materias
public class Disciplina {

    double nota;
    String disciplina;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Double.compare(that.getNota(), getNota()) == 0 && getDisciplina().equals(that.getDisciplina());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNota(), getDisciplina());
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nota=" + nota +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}
