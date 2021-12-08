import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;

/**
 * Main Class
 * @author  Kizeev Ilya
 * @version  1.0
 */
public class Main {
    /**
     * Programs entry point
     * @param args params
     */
    public static void main(String[] args) {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("products.xml");

            DAO dao = new DAO();

            dao.printAllProducts(document);
            dao.printOnlyKettles(document);
            dao.printProductsWithMinimalCost(document);

        } catch (ParserConfigurationException | IOException | SAXException | XPathExpressionException e) {
            e.printStackTrace();
        }
    }
}
