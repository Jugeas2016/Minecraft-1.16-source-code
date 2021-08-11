/*    */ import com.google.common.hash.HashFunction;
/*    */ import com.google.common.hash.Hashing;
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.JsonElement;
/*    */ import java.io.BufferedWriter;
/*    */ import java.io.IOException;
/*    */ import java.nio.file.Files;
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.attribute.FileAttribute;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ public interface hm
/*    */ {
/* 15 */   public static final HashFunction a = Hashing.sha1();
/*    */   
/*    */   void a(hn paramhn) throws IOException;
/*    */   
/*    */   String a();
/*    */   
/*    */   static void a(Gson ☃, hn hn1, JsonElement jsonElement, Path path) throws IOException {
/* 22 */     String str1 = ☃.toJson(jsonElement);
/* 23 */     String str2 = a.hashUnencodedChars(str1).toString();
/*    */     
/* 25 */     if (!Objects.equals(hn1.a(path), str2) || !Files.exists(path, new java.nio.file.LinkOption[0])) {
/* 26 */       Files.createDirectories(path.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
/* 27 */       try (BufferedWriter ☃ = Files.newBufferedWriter(path, new java.nio.file.OpenOption[0])) {
/* 28 */         bufferedWriter.write(str1);
/*    */       } 
/*    */     } 
/* 31 */     hn1.a(path, str2);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\hm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */