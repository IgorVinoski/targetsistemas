import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import javax.swing.text.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Quest3 {
    public static void main(String[] args) {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();


            org.w3c.dom.Document doc = builder.parse("dados.xml");

            NodeList listaDeValores = doc.getElementsByTagName("valor");

            int tamanhoLista = listaDeValores.getLength();
            for(int i = 0; i< tamanhoLista; i++){

                Node noValor = listaDeValores.item(i);

                if(noValor.getNodeType() == Node.ELEMENT_NODE){

                    org.w3c.dom.Element elementoValor = (org.w3c.dom.Element) noValor;

                    String valor = elementoValor.getTextContent();

                    System.out.println(valor);
                    int valores[] = new int[tamanhoLista];

                     valores[i] = Integer.parseInt(valor);


                }

            }


        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new RuntimeException(e);
        }

    }
}
