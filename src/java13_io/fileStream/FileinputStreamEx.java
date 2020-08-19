package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileinputStreamEx {
   public static void main(String[] args) {
      
      //입력 대상 파일 객체
      
      File file = new File("./src/java13_io/fileStream", "Hello");
      byte [] buf = new byte[1024];
      int len = -1;
      StringBuilder sb = new StringBuilder();
      
      
      System.out.println("[test] exists : " + file.exists());
      
      FileInputStream fis = null; //파일 입력 객체      
      
      try {
         fis = new FileInputStream(file);
         try {
            while ((len = fis.read(buf))!=-1) {
               sb.append(new String(buf,0,len));
            }
         } catch (IOException e) {
            e.printStackTrace();
         }
         
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } finally {
         try {
            fis.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
         
      }
      System.out.println("<<입력된 데이터>>");
      System.out.println(sb);
   }
}