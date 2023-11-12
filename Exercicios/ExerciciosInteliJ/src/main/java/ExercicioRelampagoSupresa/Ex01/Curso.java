package ExercicioRelampagoSupresa.Ex01;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private Professor coordenador;
    private ArrayList<Turma> turmas;
    private ArrayList<Aluno> alunos;

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador)
    {
        this.coordenador = coordenador;
    }

    public String getNomeCoordenador() {
        if (this.coordenador == null) {
            throw new NullPointerException("Curso sem coordenador");
        }
        return this.coordenador.getNome();
    }

    public void adicionarTurma(Turma turma)
    {
        turmas.add(turma);
    }

    public List<Turma> getTurmas()
    {
        return turmas;
    }
    public void adicionarAluno(Aluno aluno)
    {
        alunos.add(aluno);
    }
    public List<Aluno> getAlunos()
    {
        return alunos;
    }
    public List<String> getNomesProfessores(Curso... cursos) {
        List<String> nomesProfessores = new ArrayList<>();

        for (Curso curso : cursos) {
            for (Turma turma : curso.getTurmas()) {
                Professor professor = turma.getProfessor();
                if (professor != null) {
                    nomesProfessores.add(professor.getNome());
                }
            }
        }

        return nomesProfessores;
    }

    public List<String> getNomesAlunos(Curso... cursos) {
        List<String> nomesAlunos = new ArrayList<>();

        for (Curso curso : cursos) {
            for (Turma turma : curso.getTurmas()) {
                Aluno aluno = alunos.get;
                if (professor != null) {
                    nomesProfessores.add(professor.getNome());
                }
            }
        }

        return nomesProfessores;
    }
}
