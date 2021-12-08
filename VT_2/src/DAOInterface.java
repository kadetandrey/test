import org.w3c.dom.Document;
import javax.xml.xpath.XPathExpressionException;

/**
 * Interface
 * @version 1.0
 * @author Kizeev Ilya
 */
public interface DAOInterface {
    /**
     * Method for output list of products
     * @param document - source file
     * @throws XPathExpressionException - exception
     */
    void printAllProducts(Document document) throws XPathExpressionException;
    /**
     * Method for output kettles
     * @param document - source file
     * @throws XPathExpressionException - exception
     */
    void printOnlyKettles(Document document) throws XPathExpressionException;
    /**
     * Method for output product with minimal cost
     * @param document - source file
     * @throws XPathExpressionException - exception
     */
    void printProductsWithMinimalCost(Document document) throws XPathExpressionException;
}
