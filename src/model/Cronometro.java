package model;

public class Cronometro {

    private long inicio_ms;
    private long inicio_ns;

    private long duracion_ms;
    private long duracion_ns;

    public void iniciar(){
        inicio_ms = System.currentTimeMillis();
        inicio_ns = System.nanoTime();
    }

    public void parar(){
        duracion_ms = System.currentTimeMillis() - inicio_ms;
        duracion_ns = System.nanoTime() - inicio_ns;
    }

    public String getDuracionMs(){
        return "Milisegundos \n" +
                "Milisegundos " + duracion_ms + "\n" +
                "Segundos " + (double)duracion_ms/1000;
    }

    public String getDuracionNs(){
        return "Nanosegundos \n" +
                "Nanosegundos " + duracion_ns + "\n" +
                "Segundos " + (double)duracion_ns/1000000000;
    }

}
