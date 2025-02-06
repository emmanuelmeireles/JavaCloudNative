package Metodos;

public class App {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        smartTV.ligar();
        System.out.println("Novo Status -> tv ligada ? " + smartTV.ligada );
        smartTV.desligar();
        System.out.println("Novo Status -> tv desligada ? " + smartTV.ligada );

        smartTV.canalAcima();
        smartTV.canalAbaixo();
        smartTV.canalAbaixo();
        smartTV.canalAcima();
        System.out.println("canal atual é: "  + smartTV.canal);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        System.out.println("o volume atual é " + smartTV.volume);

       
        
        System.out.println("tv ligada: " + smartTV.ligada);
        System.out.println("qual o canal: " + smartTV.canal);
        System.out.println("qual o volume:  " + smartTV.volume);
        
    }
}
