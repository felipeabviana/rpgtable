/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg_table_projecthandle;
 
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author ninjamanco
 */
public class Rpg_table_projecthandle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        create_new_project_file("teste1");
        
    }
    
    
    public static void create_new_project_file(String newName) {
        try {
            // ==== Creation of objects that will build the xml ====
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            
            // ==== Root elements ====
            Element rootElement = doc.createElement("project");
            doc.appendChild(rootElement);
            
            // ==== First Level Elements ====
            //Project name data
            Element projectname = doc.createElement("projectname");
            rootElement.appendChild(projectname);
            
            //Narration section
            Element narration = doc.createElement("narration");
            rootElement.appendChild(narration);
            
            //Batle section
            Element battle = doc.createElement("battle");
            rootElement.appendChild(battle);
            
            // ==== Narration section - creation of other elements ====
            
            //Texts section
            Element texts = doc.createElement("texts");
            narration.appendChild(texts);
            
            //Musics section
            Element musics = doc.createElement("musics");
            narration.appendChild(musics);
            
            //Images section
            Element images = doc.createElement("images");
            narration.appendChild(images);
            
            //Characters section
            Element characters = doc.createElement("characters");
            narration.appendChild(characters);
            
            // ==== Populate texts section with data ====
            

            // ==== write the content into xml file ====
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:\\Users\\Public\\Documents\\file.xml"));

            // Output to console for testing
            // StreamResult result = new StreamResult(System.out);

            transformer.transform(source, result);

            System.out.println("File saved!");

      } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
      } catch (TransformerException tfe) {
            tfe.printStackTrace();
      }
    }
}





 
 
	