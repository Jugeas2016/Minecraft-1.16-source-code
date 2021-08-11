/*    */ import java.io.File;
/*    */ import java.io.FileFilter;
/*    */ import java.util.function.Consumer;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ public class abt
/*    */   implements aby {
/*    */   private static final FileFilter a;
/*    */   private final File b;
/*    */   private final abx c;
/*    */   
/*    */   static {
/* 13 */     a = (☃ -> {
/* 14 */         boolean bool1 = (☃.isFile() && ☃.getName().endsWith(".zip"));
/* 15 */         boolean bool2 = (☃.isDirectory() && (new File(☃, "pack.mcmeta")).isFile());
/*    */         
/* 17 */         return (bool1 || bool2);
/*    */       });
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public abt(File ☃, abx abx1) {
/* 24 */     this.b = ☃;
/* 25 */     this.c = abx1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(Consumer<abu> ☃, abu.a a1) {
/* 30 */     if (!this.b.isDirectory())
/*    */     {
/* 32 */       this.b.mkdirs();
/*    */     }
/* 34 */     File[] arrayOfFile = this.b.listFiles(a);
/* 35 */     if (arrayOfFile == null) {
/*    */       return;
/*    */     }
/* 38 */     for (File file : arrayOfFile) {
/* 39 */       String str = "file/" + file.getName();
/* 40 */       abu abu = abu.a(str, false, a(file), a1, abu.b.a, this.c);
/* 41 */       if (abu != null) {
/* 42 */         ☃.accept(abu);
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   private Supplier<abj> a(File ☃) {
/* 48 */     if (☃.isDirectory()) {
/* 49 */       return () -> new abi(☃);
/*    */     }
/* 51 */     return () -> new abh(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\abt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */