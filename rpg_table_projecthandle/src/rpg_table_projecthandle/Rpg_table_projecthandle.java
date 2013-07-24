/*
 * This class is responsible for handling the project file in XML format.
 * The project file contains all the information the SW needs to play a
 * functional rpg campain. The XML of a project with data is show above:
 * <project>
	<projectname>projeto</projectname>
	<narration>
		<texts>
			<textfile id = "1">caminho_do_arquivo_texto_1</textfile>
			<textfile id = "2">caminho_do_arquivo_texto_2</textfile>
		<texts>
		<musics>
			<musicfile id = "1">caminho_do_arquivo_musica_1</musicfile>
			<musicfile id = "2">caminho_do_arquivo_musica_2</musicfile>
		</musics>
		<images>
			<imagefile id = "1">caminho_do_arquivo_imagem_1</imagefile>
			<imagefile id = "2">caminho_do_arquivo_imagem_2</imagefile>
		</images>
		<characters>
			<characterdata id = "1">
				<name>nome_1</name>
				<photo>caminho_da_imagem_1</photo>
			</characterdata>
			<characterdata id = "2">
				<name>nome_2</name>
				<photo>caminho_da_imagem_2</photo>
			</characterdata>
		</characters>
	</narration>
	<battle>
	</battle>
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
 *  This class provides the following function to handle project files
 * 
 * main (test purposes)
 * OK create_new_project_file
 * load_project_file
 * OK save_project_file
 * insert_character
 * remove_character
 * insert_music
 * remove_music
 * insert_text
 * remove_text
 * insert_map
 * remove_map
 * rename_project
 * 
 * @author ninjamanco
 */

public class Rpg_table_projecthandle {

    // ======== Atributes ==========
    private DocumentBuilderFactory docFactory;
    private DocumentBuilder docBuilder;
    private Document doc;
    
    // ============== Class constructor ==============
    Rpg_table_projecthandle() {
            
        //try to avoid errors
        try{
            // Creation of objects that will build the xml 
            docFactory = DocumentBuilderFactory.newInstance();
            docBuilder = docFactory.newDocumentBuilder();
            doc = docBuilder.newDocument();
        }catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        }
      }
    
    // ============== NEW PROJECT ==============
    //Function called when a new project must be created
    //It creates the data structure empty
    //Inputs:
    //newName - project name
    public void create_new_project_file(String newName) { 
        
            // Root elements
            Element rootElement = doc.createElement("project");
            doc.appendChild(rootElement);
            
            // First Level Elements
            //Project name data
            Element projectname = this.doc.createElement("projectname");
            rootElement.appendChild(projectname);
            
            //Narration section
            Element narration = this.doc.createElement("narration");
            rootElement.appendChild(narration);
            
            //Batle section
            Element battle = this.doc.createElement("battle");
            rootElement.appendChild(battle);
            
            // Narration section - creation of other elements
            
            //Texts section
            Element texts = this.doc.createElement("texts");
            narration.appendChild(texts);
            
            //Musics section
            Element musics = this.doc.createElement("musics");
            narration.appendChild(musics);
            
            //Images section
            Element images = this.doc.createElement("images");
            narration.appendChild(images);
            
            //Characters section
            Element characters = this.doc.createElement("characters");
            narration.appendChild(characters);
    }
    
    
    // ============== SAVE ==============
    //newDir - project save directory
    public void save_project_file(String newDir) {
        try {
        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(this.doc);
        StreamResult result = new StreamResult(new File(newDir));

        // Output to console for testing
        // StreamResult result = new StreamResult(System.out);

        transformer.transform(source, result);

        System.out.println("File saved!");
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
      }
    }
    
    // ============== insert_character ==============
    public void insert_character(String newName)
    {
        
    }
    
    // ============== remove_character ==============
    
    
    // ============== SAVE ==============
    
    
    // ============== SAVE ==============
    
    
    // ============== SAVE ==============
    
    
    // ============== SAVE ==============
    
    
    // ============== SAVE ==============
    
    
    // ============== SAVE ==============
    
    
    // ============== SAVE ==============
    
    
    // ============== SAVE ==============
    
    
    // ============== SAVE ==============
    
    
    // ============== SAVE ==============
    
    
    // ============== SAVE ==============
    
}

