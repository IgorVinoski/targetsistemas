public class Quest4 {
    public static void main(String[] args) {
        double[] faturamento = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};


        double total= 0;

        for(int i = 0; i < faturamento.length; i++) {
            total += faturamento[i];
        }


        System.out.println("PERCENTUAL SP: " + (faturamento[0]/total)*100 + " %");
        System.out.println("PERCENTUAL RJ: " + (faturamento[1]/total)*100 + " %");
        System.out.println("PERCENTUAL MG: " + (faturamento[2]/total)*100 + " %");
        System.out.println("PERCENTUAL ES: " + (faturamento[3]/total)*100 + " %");
        System.out.println("PERCENTUAL OUTROS: " + (faturamento[4]/total)*100 + " %");

    }


}
