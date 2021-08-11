/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bci
/*    */ {
/*  8 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   private final bbr b;
/* 11 */   private final bcb[] c = new bcb[bch.c()];
/*    */   private bcb d;
/*    */   
/*    */   public bci(bbr ☃) {
/* 15 */     this.b = ☃;
/*    */     
/* 17 */     a(bch.k);
/*    */   }
/*    */   
/*    */   public void a(bch<?> ☃) {
/* 21 */     if (this.d != null && ☃ == this.d.i()) {
/*    */       return;
/*    */     }
/*    */     
/* 25 */     if (this.d != null) {
/* 26 */       this.d.e();
/*    */     }
/*    */     
/* 29 */     this.d = b(☃);
/* 30 */     if (!this.b.l.v) {
/* 31 */       this.b.ab().b(bbr.b, Integer.valueOf(☃.b()));
/*    */     }
/* 33 */     a.debug("Dragon is now in phase {} on the {}", ☃, this.b.l.v ? "client" : "server");
/*    */     
/* 35 */     this.d.d();
/*    */   }
/*    */   
/*    */   public bcb a() {
/* 39 */     return this.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public <T extends bcb> T b(bch<T> ☃) {
/* 44 */     int i = ☃.b();
/* 45 */     if (this.c[i] == null) {
/* 46 */       this.c[i] = ☃.a(this.b);
/*    */     }
/* 48 */     return (T)this.c[i];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bci.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */