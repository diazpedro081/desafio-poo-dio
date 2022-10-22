import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso primeiroCurso = new Curso();
        primeiroCurso.setTitulo(" Curso Java");
        primeiroCurso.setDescricao(" Curso Basico voltado para iniciantes");
        primeiroCurso.setCargaHoraria(8);

        Curso segundoCurso = new Curso();
        segundoCurso.setTitulo(" Curso Java POO");
        segundoCurso.setDescricao(" Curso voltado para Oreientação a objeto");
        segundoCurso.setCargaHoraria(12);

        Mentoria primeiraMentoria = new Mentoria();
        primeiraMentoria.setTitulo(" Mentoria pro Curso Java");
        primeiraMentoria.setDescricao(" Mentoria voltado para iniciantes em Java");
        primeiraMentoria.setData(LocalDate.now());

        Mentoria segundaMentoria = new Mentoria();
        segundaMentoria.setTitulo(" Mentoria pro Curso Java POO");
        segundaMentoria.setDescricao(" Mentoria voltado para Java POO");
        segundaMentoria.setData(LocalDate.now());

        System.out.println(primeiroCurso);
        System.out.println(segundoCurso);
        System.out.println(primeiraMentoria);
        System.out.println(segundaMentoria);
    }
}