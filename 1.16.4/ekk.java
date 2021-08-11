/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.nio.file.Files;
/*    */ import java.nio.file.NoSuchFileException;
/*    */ import java.nio.file.Path;
/*    */ import java.util.Collection;
/*    */ import java.util.Collections;
/*    */ import java.util.function.Predicate;
/*    */ import java.util.stream.Collectors;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ekk
/*    */   extends ekg
/*    */ {
/*    */   private final File b;
/*    */   
/*    */   public ekk(File ☃) {
/* 21 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public File a(vk ☃) {
/* 26 */     return new File(this.b, ☃.toString().replace(':', '/'));
/*    */   }
/*    */ 
/*    */   
/*    */   public File a(String ☃) {
/* 31 */     return new File(this.b, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<vk> a(String ☃, String str1, int i, Predicate<String> predicate) {
/* 36 */     Path path = this.b.toPath().resolve(str1);
/* 37 */     try (Stream<Path> ☃ = Files.walk(path.resolve(☃), i, new java.nio.file.FileVisitOption[0]))
/* 38 */     { return (Collection)stream
/* 39 */         .filter(☃ -> Files.isRegularFile(☃, new java.nio.file.LinkOption[0]))
/* 40 */         .filter(☃ -> !☃.endsWith(".mcmeta"))
/* 41 */         .filter(path -> ☃.test(path.getFileName().toString()))
/* 42 */         .map(path2 -> new vk(☃, path1.relativize(path2).toString().replaceAll("\\\\", "/")))
/* 43 */         .collect(Collectors.toList()); }
/* 44 */     catch (NoSuchFileException noSuchFileException) {  }
/* 45 */     catch (IOException iOException)
/* 46 */     { a.warn("Unable to getFiles on {}", ☃, iOException); }
/*    */     
/* 48 */     return Collections.emptyList();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ekk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */