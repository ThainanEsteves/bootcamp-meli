package poo.aula1;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class TemperaturasGlobais {

    public static  void main(String[] args){
        //Primeira implementação utilizando conceitos aprendidos na primeira aula
        //firstImplemention();
        secondImplementation();

    }

    public static void firstImplemention(){
        String[] cidades = {"Londres","Madrid","Nova York","Buenos Aires","Asucion","São Paulo", "Lima","Santiago de Chile","Lisboa","Tokio"};
        Integer temperatura[][] = new Integer [10][2];
        Integer temp_minima = 0;
        Integer temp_max = 0;
        String cidade_escolhida_min = "";
        String cidade_escolhida_max = "";

        //tmp Londres
        temperatura[0][0] = -2;
        temperatura[0][1] = 33;

        //tmp Madrid
        temperatura[1][0] = -3;
        temperatura[1][1] = 32;

        //tmp NY
        temperatura[2][0] = -8;
        temperatura[2][1] = 27;

        //tmp BA
        temperatura[3][0] = 4;
        temperatura[3][1] = 37;

        //tmp Asu
        temperatura[4][0] = 6;
        temperatura[4][1] = 42;

        //tmp SP
        temperatura[5][0] = 5;
        temperatura[5][1] = 43;

        //tmp Li
        temperatura[6][0] = 0;
        temperatura[6][1] = 39;

        //tmp SC
        temperatura[7][0] = -7;
        temperatura[7][1] = 26;

        //tmp Lis
        temperatura[8][0] = -1;
        temperatura[8][1] = 31;

        //tmp To
        temperatura[9][0] = -10;
        temperatura[9][1] = 35;



        for(int row = 0; row < 10; row++){
            Integer vec_tempmin = temperatura[row][0];
            Integer vec_tempmax = temperatura[row][1];

            if(vec_tempmin < temp_minima){
                temp_minima = vec_tempmin;
                cidade_escolhida_min = cidades[row];
            }

            if(vec_tempmax > temp_max){
                temp_max = vec_tempmax;
                cidade_escolhida_max = cidades[row];
            }

        }


        System.out.println("A temperatura mais baixa foi em "+ cidade_escolhida_min + " Com " + temp_minima +"C");
        System.out.println("A temperatura mais Alta foi em "+ cidade_escolhida_max + " Com " + temp_max +"C");



    }

    public static void secondImplementation(){
        HashMap <String, Integer[]> cidades = new HashMap<>();
        cidades.put("Londres",          new Integer[] {-2,33});
        cidades.put("Madrid",           new Integer[] {-3,32});
        cidades.put("Nova York",        new Integer[] {-8,27});
        cidades.put("Buenos Aires",     new Integer[] {4,37});
        cidades.put("Asucion",          new Integer[] {6,42});
        cidades.put("São Paulo",        new Integer[] {5,43});
        cidades.put("Lima",             new Integer[] {0,39});
        cidades.put("Santiago de Chile",new Integer[] {-7,26});
        cidades.put("Lisboa",           new Integer[] {-1,31});
        cidades.put("Tokio",            new Integer[] {-10,35});

        Integer positivo_maior = 0;
        Integer negativo_maior = 0;
        String cidade_escolhida_positivo = "";
        String cidade_escolhida_negativo = "";

        for(Map.Entry<String,Integer[]> entrada : cidades.entrySet()){
            Integer[] temperatura = entrada.getValue();
            Integer temp_min = temperatura[0];
            Integer temp_max = temperatura[1];


            if(temp_min < negativo_maior){
                negativo_maior = temp_min;
                cidade_escolhida_negativo = entrada.getKey();
            }
            if(temp_max > positivo_maior){
                positivo_maior = temp_max;
                cidade_escolhida_positivo = entrada.getKey();
            }

        }
        System.out.println("A temperatura mais baixa foi em "+ cidade_escolhida_negativo + " Com " + negativo_maior +"C");
        System.out.println("A temperatura mais Alta foi em "+ cidade_escolhida_positivo + " Com " + positivo_maior +"C");
    }
}
