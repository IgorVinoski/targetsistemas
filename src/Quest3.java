import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import javax.swing.text.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.math.BigDecimal;

public class Quest3 {
    /*
    Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
     */
    public static void main(String[] args) {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        double[] valores;
        int[] dias;
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();


            org.w3c.dom.Document doc = builder.parse("dados.xml");

            NodeList listaDeValores = doc.getElementsByTagName("valor");
            NodeList listaDeDias = doc.getElementsByTagName("dia");
            int tamanhoLista = listaDeValores.getLength();
            valores = new double[tamanhoLista];
            dias = new int[tamanhoLista];
            for (int i = 0; i < tamanhoLista; i++) {

                Node noValor = listaDeValores.item(i);
                Node noDias = listaDeDias.item(i);
                if (noValor.getNodeType() == Node.ELEMENT_NODE) {

                    org.w3c.dom.Element elementoValor = (org.w3c.dom.Element) noValor;

                    String valor = elementoValor.getTextContent();

                    System.out.println(valor);


                    valores[i] = Double.parseDouble(valor);
                    System.out.println(valores[i]);

                }
                if(noDias.getNodeType() == Node.ELEMENT_NODE){

                    org.w3c.dom.Element elementoDia = (org.w3c.dom.Element) noDias;

                    String dia = elementoDia.getTextContent();

                    System.out.println(dia);


                    dias[i] = Integer.parseInt(dia);
                    System.out.println(dias[i]);
                }

            }


        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new RuntimeException(e);
        }


        double menorValor = 0, maiorValor = 0;
        for(int i =0; i<valores.length; i++){
            if(valores[i]<menorValor){
                menorValor=valores[i];


            }if(valores[i]>maiorValor){
                maiorValor=valores[i];
            }



        }
        System.out.println("MAIOR VALOR: " + maiorValor);
        System.out.println("MENOR VALOR: " + menorValor);



        long soma = 0, media =0;
        for(int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        media = soma/valores.length;


        System.out.println("A MÉDIA DE VALORES MENSAL É DE: " + media);

        int quantidadededias = 0;
        for(int i = 0; i<valores.length; i++){
            if(media<valores[i]){
                quantidadededias++;
            }
        }

        System.out.println("A QUANTIDADE DE DIAS EM QUE O FATURAMENTO FOI MAIOR QUE A MÉDIA É DE: " + quantidadededias);

    }
}
