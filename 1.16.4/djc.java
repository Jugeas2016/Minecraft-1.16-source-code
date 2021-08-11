/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class djc
/*    */   extends dja
/*    */ {
/*    */   private final String c;
/*    */   private final dhe d;
/*    */   private final int e;
/*    */   private final boolean f;
/*    */   private final long g;
/* 18 */   private nr h = new of("mco.reset.world.resetting.screen.title");
/*    */   private final Runnable i;
/*    */   
/*    */   public djc(@Nullable String ☃, @Nullable dhe dhe1, int i, boolean bool, long l, @Nullable nr nr1, Runnable runnable) {
/* 22 */     this.c = ☃;
/* 23 */     this.d = dhe1;
/* 24 */     this.e = i;
/* 25 */     this.f = bool;
/* 26 */     this.g = l;
/* 27 */     if (nr1 != null) {
/* 28 */       this.h = nr1;
/*    */     }
/* 30 */     this.i = runnable;
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/* 35 */     dgb ☃ = dgb.a();
/* 36 */     b(this.h);
/* 37 */     for (int i = 0; i < 25; i++) {
/*    */       try {
/* 39 */         if (c()) {
/*    */           return;
/*    */         }
/*    */         
/* 43 */         if (this.d != null) {
/* 44 */           ☃.g(this.g, this.d.a);
/*    */         } else {
/* 46 */           ☃.a(this.g, this.c, Integer.valueOf(this.e), this.f);
/*    */         } 
/*    */         
/* 49 */         if (c()) {
/*    */           return;
/*    */         }
/*    */         
/* 53 */         this.i.run();
/*    */         
/*    */         return;
/* 56 */       } catch (dhj dhj) {
/* 57 */         if (c()) {
/*    */           return;
/*    */         }
/* 60 */         a(dhj.e);
/* 61 */       } catch (Exception exception) {
/* 62 */         if (c()) {
/*    */           return;
/*    */         }
/* 65 */         a.error("Couldn't reset world");
/* 66 */         a(exception.toString());
/*    */         return;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\djc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */