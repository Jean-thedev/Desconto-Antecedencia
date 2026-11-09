public class Reserva {
    private String nomeCliente;
    private String dataReserva;
    private int diasParaEvento;
    private double valorBase;
    public Reserva(String nomeCliente, String dataReserva, int diasParaEvento, double valorBase) {
        this.nomeCliente = nomeCliente;
        this.dataReserva = dataReserva;
        this.diasParaEvento = diasParaEvento;
        this.valorBase = valorBase;
    }

    public double calcularValorFinal(){
        if(diasParaEvento>15){
            return valorBase * 0.85;
        }
        else if(diasParaEvento>=7 && diasParaEvento<=15){
            return valorBase * 0.90;
        }
        else if(diasParaEvento>=3 && diasParaEvento <=6){
            return valorBase * 0.95;
        }
        else{
            return valorBase;
        }
        
    }

    public void dadosReserva(){
        String porcentagem = "0%";
        if (diasParaEvento > 15){
            porcentagem = "15%";
        } 
        else if (diasParaEvento >= 7 && diasParaEvento<=15){
            porcentagem = "10%";
        } 
        else if (diasParaEvento >= 3 && diasParaEvento<=6){
            porcentagem = "5%";
        } 

        System.out.println("Nome: "+this.nomeCliente);
        System.out.println("Valor Base: R$"+this.valorBase);
        System.out.println("Desconto: "+ porcentagem);
        System.out.println("Valor Final: R$"+ calcularValorFinal());
        System.out.println();
    }


}
