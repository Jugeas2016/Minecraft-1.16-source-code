/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class cxs
/*    */ {
/* 13 */   private static final Logger a = LogManager.getLogger();
/*    */   private final String b;
/*    */   private boolean c;
/*    */   
/*    */   public cxs(String ☃) {
/* 18 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public abstract void a(md parammd);
/*    */   
/*    */   public abstract md b(md parammd);
/*    */   
/*    */   public void b() {
/* 26 */     a(true);
/*    */   }
/*    */   
/*    */   public void a(boolean ☃) {
/* 30 */     this.c = ☃;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 34 */     return this.c;
/*    */   }
/*    */   
/*    */   public String d() {
/* 38 */     return this.b;
/*    */   }
/*    */   
/*    */   public void a(File ☃) {
/* 42 */     if (!c()) {
/*    */       return;
/*    */     }
/*    */     
/* 46 */     md md = new md();
/* 47 */     md.a("data", b(new md()));
/* 48 */     md.b("DataVersion", w.a().getWorldVersion());
/*    */     
/*    */     try {
/* 51 */       mn.a(md, ☃);
/* 52 */     } catch (IOException iOException) {
/* 53 */       a.error("Could not save data {}", this, iOException);
/*    */     } 
/* 55 */     a(false);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cxs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */