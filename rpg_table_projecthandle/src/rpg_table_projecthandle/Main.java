/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg_table_projecthandle;

/**
 *
 * @author ninja_001
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // ============== MAIN ==============
        //Main function to test the class - in real Sw the function will be called
        //from the GUI or other real main function.
        
        Rpg_table_projecthandle ProjectTest = new Rpg_table_projecthandle();
        ProjectTest.create_new_project_file("newName");
        ProjectTest.save_project_file("C:\\Users\\Public\\Documents\\file.xml");
    }
}
