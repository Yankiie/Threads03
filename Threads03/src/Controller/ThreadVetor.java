package Controller;


public class ThreadVetor extends Thread {
    private int[] vetor = new int [1000];
    private int operador;
    private int a;
        public ThreadVetor(int operador, int[] vetor){
            this.operador = operador;
            this.vetor = vetor;
    }
        public void run() {
            if ((operador % 2) == 0){

                long tempoinicial = System.nanoTime();
                tempoinicial = System.currentTimeMillis();
                for (int i = 0; i < vetor.length; i ++){
                    a = a+vetor[i];
                }
                long tempofinal = System.nanoTime();
                tempofinal = System.currentTimeMillis();
                long tempototal = (tempofinal - tempoinicial);
                System.out.println("Tempo no FOR " +tempototal+ "s.");
            }
            else {
                long tempoinicial = System.nanoTime();
                tempoinicial = System.currentTimeMillis();
                for (int i = 0; i < vetor.length; i ++){
                    a = a+vetor[i];
                }
                long tempofinal = System.nanoTime();
                tempofinal = System.currentTimeMillis();
                long tempototal = tempofinal - tempoinicial;
                System.out.println("Tempo no FOREACH " +tempototal+ "s.");
        }
    }
}


