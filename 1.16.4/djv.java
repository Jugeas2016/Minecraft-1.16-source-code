/*    */ import com.mojang.datafixers.DataFixer;
/*    */ import java.io.File;
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
/*    */ public class djv
/*    */ {
/* 17 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   private final File b;
/*    */   
/*    */   private final DataFixer c;
/* 22 */   private final dzo[] d = new dzo[9];
/*    */   private boolean e;
/*    */   
/*    */   public djv(File ☃, DataFixer dataFixer) {
/* 26 */     this.b = new File(☃, "hotbar.nbt");
/* 27 */     this.c = dataFixer;
/*    */     
/* 29 */     for (int i = 0; i < 9; i++) {
/* 30 */       this.d[i] = new dzo();
/*    */     }
/*    */   }
/*    */   
/*    */   private void b() {
/*    */     try {
/* 36 */       md ☃ = mn.b(this.b);
/* 37 */       if (☃ == null) {
/*    */         return;
/*    */       }
/*    */ 
/*    */       
/* 42 */       if (!☃.c("DataVersion", 99)) {
/* 43 */         ☃.b("DataVersion", 1343);
/*    */       }
/*    */       
/* 46 */       ☃ = mp.a(this.c, aga.d, ☃, ☃.h("DataVersion"));
/*    */       
/* 48 */       for (int i = 0; i < 9; i++) {
/* 49 */         this.d[i].a(☃.d(String.valueOf(i), 10));
/*    */       }
/* 51 */     } catch (Exception ☃) {
/* 52 */       a.error("Failed to load creative mode options", ☃);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a() {
/*    */     try {
/* 58 */       md ☃ = new md();
/* 59 */       ☃.b("DataVersion", w.a().getWorldVersion());
/* 60 */       for (int i = 0; i < 9; i++) {
/* 61 */         ☃.a(String.valueOf(i), a(i).a());
/*    */       }
/* 63 */       mn.b(☃, this.b);
/* 64 */     } catch (Exception ☃) {
/* 65 */       a.error("Failed to save creative mode options", ☃);
/*    */     } 
/*    */   }
/*    */   
/*    */   public dzo a(int ☃) {
/* 70 */     if (!this.e) {
/* 71 */       b();
/* 72 */       this.e = true;
/*    */     } 
/* 74 */     return this.d[☃];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\djv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */