/*    */ import com.mojang.datafixers.DataFixer;
/*    */ import java.io.File;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cyk
/*    */ {
/* 20 */   private static final Logger b = LogManager.getLogger();
/*    */   private final File c;
/*    */   protected final DataFixer a;
/*    */   
/*    */   public cyk(cyg.a ☃, DataFixer dataFixer) {
/* 25 */     this.a = dataFixer;
/* 26 */     this.c = ☃.a(cye.c).toFile();
/* 27 */     this.c.mkdirs();
/*    */   }
/*    */   
/*    */   public void a(bfw ☃) {
/*    */     try {
/* 32 */       md md = ☃.e(new md());
/* 33 */       File file1 = File.createTempFile(☃.bT() + "-", ".dat", this.c);
/* 34 */       mn.a(md, file1);
/*    */       
/* 36 */       File file2 = new File(this.c, ☃.bT() + ".dat");
/* 37 */       File file3 = new File(this.c, ☃.bT() + ".dat_old");
/* 38 */       x.a(file2, file1, file3);
/* 39 */     } catch (Exception exception) {
/* 40 */       b.warn("Failed to save player data for {}", ☃.R().getString());
/*    */     } 
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public md b(bfw ☃) {
/* 46 */     md md = null;
/*    */     try {
/* 48 */       File file = new File(this.c, ☃.bT() + ".dat");
/* 49 */       if (file.exists() && file.isFile()) {
/* 50 */         md = mn.a(file);
/*    */       }
/* 52 */     } catch (Exception exception) {
/* 53 */       b.warn("Failed to load player data for {}", ☃.R().getString());
/*    */     } 
/* 55 */     if (md != null) {
/* 56 */       int i = md.c("DataVersion", 3) ? md.h("DataVersion") : -1;
/* 57 */       ☃.f(mp.a(this.a, aga.b, md, i));
/*    */     } 
/* 59 */     return md;
/*    */   }
/*    */   
/*    */   public String[] a() {
/* 63 */     String[] ☃ = this.c.list();
/* 64 */     if (☃ == null) {
/* 65 */       ☃ = new String[0];
/*    */     }
/*    */     
/* 68 */     for (int i = 0; i < ☃.length; i++) {
/* 69 */       if (☃[i].endsWith(".dat")) {
/* 70 */         ☃[i] = ☃[i].substring(0, ☃[i].length() - 4);
/*    */       }
/*    */     } 
/*    */     
/* 74 */     return ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */