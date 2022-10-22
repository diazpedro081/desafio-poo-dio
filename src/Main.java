import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso primeiroCursoJava = new Curso();
        primeiroCursoJava.setTitulo(" Curso Java");
        primeiroCursoJava.setDescricao(" Curso Basico voltado para iniciantes");
        primeiroCursoJava.setCargaHoraria(8);

        Curso segundoCursoJavaPoo = new Curso();
        segundoCursoJavaPoo.setTitulo(" Curso Java POO");
        segundoCursoJavaPoo.setDescricao(" Curso voltado para Oreientação a objeto");
        segundoCursoJavaPoo.setCargaHoraria(12);

        Mentoria primeiraMentoriaJava = new Mentoria();
        primeiraMentoriaJava.setTitulo(" Mentoria pro Curso Java");
        primeiraMentoriaJava.setDescricao(" Mentoria voltado para iniciantes em Java");
        primeiraMentoriaJava.setData(LocalDate.now());

        Mentoria segundaMentoriaJavaPoo = new Mentoria();
        segundaMentoriaJavaPoo.setTitulo(" Mentoria pro Curso Java POO");
        segundaMentoriaJavaPoo.setDescricao(" Mentoria voltado para Java POO");
        segundaMentoriaJavaPoo.setData(LocalDate.now());

        // System.out.println(primeiroCursoJava);
        // System.out.println(segundoCursoJavaPoo);
        // System.out.println(primeiraMentoriaJava);
        // System.out.println(segundaMentoriaJavaPoo);

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("BootCamp Java Ifood");
        bootcampJava.setDescricao("bootcamp com treinamneto voltado para o mercado");
        bootcampJava.getConteudo().add(primeiroCursoJava);
        bootcampJava.getConteudo().add(primeiraMentoriaJava);

        Bootcamp bootcampJavaPoo = new Bootcamp();
        bootcampJavaPoo.setNome("BootCamp SpringBoot");
        bootcampJavaPoo.setDescricao("BootCamp SpringBoot com treinamneto voltado para o mercado");
        bootcampJavaPoo.getConteudo().add(segundoCursoJavaPoo);
        bootcampJavaPoo.getConteudo().add(segundaMentoriaJavaPoo);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcampJava);
        System.out.println("Conteudos incritos pedro" + devPedro.getConteudosInscritos());
        devPedro.progradir();
        System.out.println("Conteudos concluidos pedro" + devPedro.getConteudosConcluidos());
        System.out.println("Conteudos incritos pedro" + devPedro.getConteudosInscritos());
        System.out.println("XP" + devPedro.calcularTotalXp());

        System.out.println("-----------------------------------");

        Dev devEduardo = new Dev();
        devEduardo.setNome("Eduardo");
        devEduardo.inscreverBootcamp(bootcampJavaPoo);
        System.out.println("Conteudos incritos Eduardo" + devEduardo.getConteudosInscritos());
        devEduardo.progradir();
        System.out.println("Conteudos conluidos Eduardo" + devEduardo.getConteudosConcluidos());
        System.out.println("Conteudos incritos Eduardo" + devEduardo.getConteudosInscritos());
        System.out.println("XP" + devEduardo.calcularTotalXp());

    }
}