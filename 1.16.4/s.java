/*    */ import java.io.IOException;
/*    */ import java.nio.file.FileAlreadyExistsException;
/*    */ import java.nio.file.Files;
/*    */ import java.nio.file.InvalidPathException;
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.Paths;
/*    */ import java.nio.file.attribute.FileAttribute;
/*    */ import java.util.regex.Matcher;
/*    */ import java.util.regex.Pattern;
/*    */ 
/*    */ public class s
/*    */ {
/* 13 */   private static final Pattern a = Pattern.compile("(<name>.*) \\((<count>\\d*)\\)", 66);
/*    */ 
/*    */   
/* 16 */   private static final Pattern b = Pattern.compile(".*\\.|(?:COM|CLOCK\\$|CON|PRN|AUX|NUL|COM[1-9]|LPT[1-9])(?:\\..*)?", 2);
/*    */   
/*    */   public static String a(Path ☃, String str1, String str2) throws IOException {
/* 19 */     for (char c : w.e) {
/* 20 */       str1 = str1.replace(c, '_');
/*    */     }
/*    */     
/* 23 */     str1 = str1.replaceAll("[./\"]", "_");
/*    */     
/* 25 */     if (b.matcher(str1).matches()) {
/* 26 */       str1 = "_" + str1 + "_";
/*    */     }
/*    */     
/* 29 */     Matcher matcher = a.matcher(str1);
/* 30 */     int i = 0;
/* 31 */     if (matcher.matches()) {
/* 32 */       str1 = matcher.group("name");
/* 33 */       i = Integer.parseInt(matcher.group("count"));
/*    */     } 
/* 35 */     if (str1.length() > 255 - str2.length()) {
/* 36 */       str1 = str1.substring(0, 255 - str2.length());
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     while (true) {
/* 42 */       String str = str1;
/* 43 */       if (i != 0) {
/* 44 */         String str3 = " (" + i + ")";
/* 45 */         int j = 255 - str3.length();
/* 46 */         if (str.length() > j) {
/* 47 */           str = str.substring(0, j);
/*    */         }
/* 49 */         str = str + str3;
/*    */       } 
/*    */       
/* 52 */       str = str + str2;
/*    */       
/* 54 */       Path path = ☃.resolve(str);
/*    */       try {
/* 56 */         Path path1 = Files.createDirectory(path, (FileAttribute<?>[])new FileAttribute[0]);
/* 57 */         Files.deleteIfExists(path1);
/* 58 */         return ☃.relativize(path1).toString();
/* 59 */       } catch (FileAlreadyExistsException fileAlreadyExistsException) {
/* 60 */         i++;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public static boolean a(Path ☃) {
/* 66 */     Path path = ☃.normalize();
/* 67 */     return path.equals(☃);
/*    */   }
/*    */   
/*    */   public static boolean b(Path ☃) {
/* 71 */     for (Path path : ☃) {
/* 72 */       if (b.matcher(path.toString()).matches()) {
/* 73 */         return false;
/*    */       }
/*    */     } 
/*    */     
/* 77 */     return true;
/*    */   }
/*    */   
/*    */   public static Path b(Path ☃, String str1, String str2) {
/* 81 */     String str = str1 + str2;
/* 82 */     Path path = Paths.get(str, new String[0]);
/*    */     
/* 84 */     if (path.endsWith(str2)) {
/* 85 */       throw new InvalidPathException(str, "empty resource name");
/*    */     }
/*    */     
/* 88 */     return ☃.resolve(path);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */