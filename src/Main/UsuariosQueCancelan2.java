package Main;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;




public class UsuariosQueCancelan2 {

    
 public void PDF(String ruta){
     try{
         FileOutputStream archivo = new FileOutputStream(ruta);
         Document doc  = new Document();
         PdfWriter.getInstance(doc, archivo);
         doc.open();
         doc.add(new Paragraph("Hola"));
         doc.close();
     }catch(Exception e){
         
     }
     Desktop abrir;
     File file = new File(ruta);
     if(Desktop.isDesktopSupported()){
         abrir = Desktop.getDesktop();
          try{
         abrir.open(file);
     }catch(IOException exx){
         exx.getStackTrace();
     }
     }else{
         System.out.println("No");
     }
    
     
 }
}
