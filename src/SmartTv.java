public class SmartTv {
    // Sistemas que tornam a Smart TV funcional.
    boolean ligada = false;
    int canal = 1;
    int volume = 1;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal atual: " + canal);
    }
    
    public void aumentarCanal() {
        canal++;
        System.out.println("Canal atual: " + canal);
    }
    
    public void diminuirCanal(){
        canal--;
        System.out.println("Canal atual: " + canal);
    }
    
    
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: "+ volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: "+ volume);
    }

    public void ligar(){
        ligada = true;
        System.out.println("Olá!");
    }
    
    public void desligar(){
        ligada = false;
        System.out.println("Até mais!");
    }

}



