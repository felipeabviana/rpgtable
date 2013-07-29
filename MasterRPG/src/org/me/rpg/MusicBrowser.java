/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.rpg;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import javax.swing.table.*;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;
import javax.imageio.ImageIO;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.net.URL;

/**
 *
 * @author Leo
 */
public class MusicBrowser extends JPanel {
    
    private FileSystemView fileSystemView;
    private JTree tree;
    private DefaultTreeModel treeModel;
    private File currentFile;
    private ListSelectionListener listSelectionListener;
    private boolean cellSizesSet = false;
    private int rowIconPadding = 6;
    private JTable table;
    
    public MusicBrowser() {
	this.setSize(200,150);
        this.add(new JButton("sair"));
        this.setVisible(true);
        this.setBackground(Color.DARK_GRAY);
    }
    
    
            
            
}
