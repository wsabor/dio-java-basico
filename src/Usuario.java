public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV =  new SmartTV();

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Volume atual: " + smartTV.volume);
        System.out.println("Canal atual: " + smartTV.canal);

        smartTV.ligar();
        System.out.println("TV ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("TV ligada? " + smartTV.ligada);

        smartTV.aumentarVolume();
        System.out.println("Volume: " + smartTV.volume);

        smartTV.diminuirVolume();
        System.out.println("Volume: " + smartTV.volume);

        smartTV.aumentarCanal();
        System.out.println("Canal: " + smartTV.canal);

        smartTV.diminuirCanal();
        System.out.println("Canal: " + smartTV.canal);

        smartTV.mucarCanal(16);
        System.out.println("Canal atual: " + smartTV.canal);
    }
}
