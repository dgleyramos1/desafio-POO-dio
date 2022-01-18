import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String [] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso js");
        curso1.setDescricao("Curso de Javascript");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso java");
        curso2.setDescricao("Curso de Java");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Dgley Ramos");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + dev.getConteudoInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos: " + dev.getConteudoInscritos());
        System.out.println("Conteúdos concluídos: " + dev.getConteudoConcluidos());
        System.out.println("------------");
        System.out.println("XP:" + dev.calcularTotalXp());


        Dev dev2 = new Dev();
        dev.setNome("João Gonçalez");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + dev2.getConteudoInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos: " + dev2.getConteudoInscritos());
        System.out.println("Conteúdos concluídos: " + dev2.getConteudoConcluidos());
        System.out.println("------------");
        System.out.println("XP:" + dev2.calcularTotalXp());

    }
}
