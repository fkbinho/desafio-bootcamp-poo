import br.com.fkbinho.desafio.dominio.BootCamp;
import br.com.fkbinho.desafio.dominio.Curso;
import br.com.fkbinho.desafio.dominio.Dev;
import br.com.fkbinho.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprendendo Linguagem Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScrip");
        curso2.setDescricao("Aprendendo JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria primeiro emprego Java");
        mentoria.setDescricao("Passo a passo para conseguir o 1º emprego");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Do zero ao master");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devKleber = new Dev();
        devKleber.setNome("Kleber");
        devKleber.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos Inscritos Kleber: " + devKleber.getConteudosInscritos());
        devKleber.progredir();
        devKleber.progredir();
        devKleber.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Kleber: " + devKleber.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Kleber: " + devKleber.getConteudosConcluidos());
        System.out.println("XP:" + devKleber.calcularTotalXp());

        System.out.println("-------");

        Dev devDany = new Dev();
        devDany.setNome("Dany");
        devDany.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos Inscritos Dany: " + devDany.getConteudosInscritos());
        devDany.progredir();
        devDany.progredir();
        devDany.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Dany: " + devDany.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Dany: " + devDany.getConteudosConcluidos());
        System.out.println("XP:" + devDany.calcularTotalXp());
    }
}