package testebanco;

import java.util.ArrayList;
import webservice.dao.AlunoDao;
import webservice.dao.AtividadeDao;
import webservice.dao.ProfessorDao;
import webservice.dao.TurmaDao;
import webservice.entidades.atividade.Atividade;
import webservice.entidades.atividade.Classificacao;
import webservice.entidades.atividade.Endereco;
import webservice.entidades.atividade.Pontuacao;
import webservice.entidades.pessoa.Aluno;
import webservice.entidades.pessoa.Professor;
import webservice.entidades.turma.Turma;

/**
 *
 * @author matheush
 */
public class TesteBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*PERSISTÊNCIA CLASSE ATIVIDADE
        Atividade atividade = new Atividade(
                "teste3",
                "coisa3",
                "20/28/2017",
                "18:20",
                new Endereco(
                        "Rua Batisti",
                        "Gressler",
                        4302,
                        "Casa"),
                new Pontuacao(1002, 502, 220));
        atividade.setClassificacao(new Classificacao("Inf4am", "inf3am", "inf2at"));
        //INSERT
        new AtividadeDao().insert(atividade);
        
        //GET ALL
        ArrayList<Atividade> atividades = new ArrayList<>();
        atividades = new AtividadeDao().findAll();
        
        for (int i = 0; i < atividades.size(); i++) {
            System.out.println("Atividade findAll: " + atividades.get(i).getNome());
        }
        
        //GET COM QUERY
        ArrayList<Atividade> atividadesQuery = new ArrayList<>();
        atividadesQuery = new AtividadeDao().find("TesTe2");
        
        for (int i = 0; i < atividadesQuery.size(); i++) {
            System.out.println("Atividade find: " + atividadesQuery.get(i).getNome());
        }
        
        //EXCLUIR
        new AtividadeDao().delete("582a84ee35659e234e6f732c");
        
        //ALTERAÇÃO
        Atividade atividade = new Atividade(
                "testeAltera",
                "coisaAltera",
                "20/28/2017",
                "18:20",
                new Endereco(
                        "Rua Batisti",
                        "Gressler",
                        4302,
                        "Casa"),
                new Pontuacao(1002, 502, 220));
        atividade.setClassificacao(new Classificacao("Inf2am", "inf4am", "inf2at"));
        //ENVIAR O ID E A ATIVIDADE COM AS ALTERAÇÕES
        new AtividadeDao().update("582a849235659e231aaa3050", atividade);
        
        
        //PERSISTENCIA TURMA
        Turma turma = new Turma();
        
        turma.setNome("Inf Laranja");
        turma.setCurso("Informática");
        turma.setAnoInicio(2013);
        turma.setPontos(1000);
        
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add("aluno" + i);
        }
        arrayList.add("201317770234");
        turma.setAlunos(arrayList);
        
        new TurmaDao().insert(turma);
        
        //GET ALL
        ArrayList<Turma> turmas = new ArrayList<>();
        turmas = new TurmaDao().findAll();
        
        for (int i = 0; i < turmas.size(); i++) {
            System.out.println("Turma findAll: " + turmas.get(i).getNome());
            for (int j = 0; j < turmas.get(i).getAlunos().size(); j++) {
                System.out.println("Alunos: " + turmas.get(i).getAlunos().get(j));
            }
        }
        
        //GET COM QUERY
        ArrayList<Turma> turmas = new ArrayList<>();
        turmas = new TurmaDao().find("Inf");
        
        for (int i = 0; i < turmas.size(); i++) {
            System.out.println("Turma findQuery: " + turmas.get(i).getNome());
            for (int j = 0; j < turmas.get(i).getAlunos().size(); j++) {
                System.out.println("Alunos: " + turmas.get(i).getAlunos().get(j));
            }
        }
        
        
        Turma turma = new Turma();
        
        turma.setNome("Refri preta");
        turma.setCurso("Informática");
        turma.setAnoInicio(2013);
        turma.setPontos(1000);
        
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add("aluno" + i);
        }
        arrayList.add("201317770066");
        turma.setAlunos(arrayList);
        
        new TurmaDao().update("5833752135659e2b65463bd8", turma);
        
        
        Aluno aluno = new Aluno();
        aluno.setNome("Eduan");
        aluno.setEmail("eduan@mail.com");
        aluno.setSenha("123456");
        aluno.setMatricula("201317770066");
        
        new AlunoDao().insert(aluno);
        */

        
        Professor p = new Professor();
        
        p.setNome("teste2");
        p.setEmail("mail2@ifsul.edu.br");
        p.setSenha("2souza123");
        p.setSiape("2109832");
        
        new ProfessorDao().insert(p);
    }
}
