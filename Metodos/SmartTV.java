package Metodos;

public class SmartTV {
    boolean ligada = false ;
    int canal = 1;
    int volume = 25;

    // aumentar e diminuir
    public void aumentarVolume(){
        volume ++;
        System.out.println("o volume atual é: " + volume);
        
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("o volume atual é: " + volume);
        
    }
    //ligar desligar
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    //mudar de canal 

    public void canalAcima(){
        canal++;
        System.out.println(canal);
    }
    public void canalAbaixo(){
        canal--;
        System.out.println(canal);
    }



}
