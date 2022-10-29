/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.io.*;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author yash
 */
public class Compress {
    public static void method(File file) throws IOException{
        
        String fileDirectory = file.getParent();
        System.out.println(fileDirectory);
        
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(fileDirectory + "/Compresssedfile.gz");
//        
        GZIPOutputStream gzipOS = new GZIPOutputStream(fos);
        
        byte[] buffer = new byte[512];
        
        int len;
        
        while((len = fis.read(buffer)) != -1){
            System.out.println(len);
            gzipOS.write(buffer,0, len);
        }
        
        gzipOS.close();
        fos.close();
        fis.close();      
    }
    
    public static void main(String[] args) throws IOException{
        File path = new File("/Users/yash/NetBeansProjects/CompressorDecompressor/src/compressordecompressor/Testfile.txt");
        method(path);
    }
}


