/*    */ import java.io.BufferedWriter;
/*    */ import java.io.IOException;
/*    */ import java.nio.file.Files;
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.attribute.FileAttribute;
/*    */ import java.util.Iterator;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jo
/*    */   implements hm
/*    */ {
/* 19 */   private static final Logger b = LogManager.getLogger();
/*    */   
/*    */   private final hl c;
/*    */   
/*    */   public jo(hl ☃) {
/* 24 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hn ☃) throws IOException {
/* 29 */     Path path = this.c.b();
/*    */     
/* 31 */     for (Iterator<Path> iterator = this.c.a().iterator(); iterator.hasNext(); ) { Path path1 = iterator.next();
/* 32 */       Files.walk(path1, new java.nio.file.FileVisitOption[0]).filter(☃ -> ☃.toString().endsWith(".nbt")).forEach(path2 -> a(path2, a(☃, path2), path1)); }
/*    */   
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 38 */     return "NBT to SNBT";
/*    */   }
/*    */   
/*    */   private String a(Path ☃, Path path1) {
/* 42 */     String str = ☃.relativize(path1).toString().replaceAll("\\\\", "/");
/* 43 */     return str.substring(0, str.length() - ".nbt".length());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public static Path a(Path ☃, String str, Path path1) {
/*    */     try {
/* 53 */       md md = mn.a(Files.newInputStream(☃, new java.nio.file.OpenOption[0]));
/* 54 */       nr nr = md.a("    ", 0);
/* 55 */       String str1 = nr.getString() + "\n";
/* 56 */       Path path = path1.resolve(str + ".snbt");
/* 57 */       Files.createDirectories(path.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
/* 58 */       try (BufferedWriter ☃ = Files.newBufferedWriter(path, new java.nio.file.OpenOption[0])) {
/* 59 */         bufferedWriter.write(str1);
/*    */       } 
/* 61 */       b.info("Converted {} from NBT to SNBT", str);
/* 62 */       return path;
/* 63 */     } catch (IOException iOException) {
/* 64 */       b.error("Couldn't convert {} from NBT to SNBT at {}", str, ☃, iOException);
/* 65 */       return null;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\jo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */