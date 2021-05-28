package exercicios.exercicio03;

public class Relogio {
    private int hora, minuto, segundo;

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public void setHora(int novaHora) {
        if(novaHora >=0 && novaHora < 24) {
            hora = novaHora;
        }
        
    }
    public int getHora() {
        return hora;
    }
}
