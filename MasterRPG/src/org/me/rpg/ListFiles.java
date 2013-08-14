/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.rpg;

/**
 *
 * @author Leo
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*
 * This class can list the following extensions for this types of file:
 * -Image: .jpg(.jpeg), .png
 * -Music: .mp3, .wmv
 * -Text: .txt
 */
public class ListFiles{
    
    //Lists by type
    static List<String> musicList = new  ArrayList();
    static List<String> textList = new  ArrayList();
    static List<String> imageList = new  ArrayList();
    
    //Default path for the lists
    private static final String defaultMusicDir = "C:\\Users\\Public\\Music";
    private static final String defaultTextDir = "C:\\Users\\Public\\Documents";
    private static final String defaultImageDir = "C:\\Users\\Public\\Pictures";
    
    //Set list of images
    public static void setListFilesImg(String directory){
        String files;
        File folder = new File(directory);
        File[] listOfFiles = folder.listFiles();
        
        
        for (int i = 0; i < listOfFiles.length; i++){
            if (listOfFiles[i].isFile()){
            files = listOfFiles[i].getName();
                if (files.endsWith(".jpg") || files.endsWith(".JPG") ||
                    files.endsWith(".jpeg") || files.endsWith(".JPEG") ||
                    files.endsWith(".png") || files.endsWith(".PNG")){
                   imageList.add(files);
                 }
              }
        }
        
    }
    //Set list of images with default directory
    public static void setListFilesImg(){
        String files;
        File folder = new File(defaultImageDir);
        File[] listOfFiles = folder.listFiles();
                
        for (int i = 0; i < listOfFiles.length; i++){
            if (listOfFiles[i].isFile()){
            files = listOfFiles[i].getName();
                if (files.endsWith(".jpg") || files.endsWith(".JPG") ||
                    files.endsWith(".jpeg") || files.endsWith(".JPEG") ||
                    files.endsWith(".png") || files.endsWith(".PNG")){
                   imageList.add(files);
                 }
              }
        }
    }
    
    public List getListFilesImg(){
        return imageList;
    }
    //Set list of music
    public static void setListFilesMusic(String directory){
        String files;
        File folder = new File(directory);
        File[] listOfFiles = folder.listFiles();
                
        for (int i = 0; i < listOfFiles.length; i++){
            if (listOfFiles[i].isFile()){
            files = listOfFiles[i].getName();
                if (files.endsWith(".mp3") || files.endsWith(".mp3") ||
                    files.endsWith(".wmv") || files.endsWith(".WMV")){
                   musicList.add(files);                    
                 }
              }
        }
    }
    //Set list of music with default directory
    public static void setListFilesMusic(){
        String files;
        File folder = new File(defaultMusicDir.toString());
        File[] listOfFiles = folder.listFiles();
                
        for (int i = 0; i < listOfFiles.length; i++){
            if (listOfFiles[i].isFile()){
            files = listOfFiles[i].getName();
                if (files.endsWith(".mp3") || files.endsWith(".mp3") ||
                    files.endsWith(".wmv") || files.endsWith(".WMV")){
                   musicList.add(files);
                    
                 }
              }
        }
    }
    
    public List getListFilesMusic(){
        return musicList;
    }
    //Set list of text
    public static void setListFilesText(String directory){
        String files;
        File folder = new File(directory);
        File[] listOfFiles = folder.listFiles();
        
        for (int i = 0; i < listOfFiles.length; i++){
            if (listOfFiles[i].isFile()){
            files = listOfFiles[i].getName();
                if (files.endsWith(".txt") || files.endsWith(".TXT")){
                   textList.add(files);
                 }
              }
        }
    }
    //Set list of texts with default directory
    public static void setListFilesText(){
        String files;
        File folder = new File(defaultTextDir);
        File[] listOfFiles = folder.listFiles();
        
        for (int i = 0; i < listOfFiles.length; i++){
            if (listOfFiles[i].isFile()){
            files = listOfFiles[i].getName();
                if (files.endsWith(".txt") || files.endsWith(".TXT")){
                   textList.add(files);
                 }
              }
        }
    }
    
    public List getListFilesText(){
        return textList;
    }
}