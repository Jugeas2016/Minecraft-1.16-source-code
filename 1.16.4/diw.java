/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class diw
/*    */   extends dja
/*    */ {
/*    */   private final dgq c;
/*    */   private final dhs d;
/*    */   
/*    */   public diw(dgq ☃, dhs dhs1) {
/* 14 */     this.c = ☃;
/* 15 */     this.d = dhs1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/* 20 */     b(new of("mco.configure.world.closing"));
/* 21 */     dgb ☃ = dgb.a();
/*    */     
/* 23 */     for (int i = 0; i < 25; i++) {
/* 24 */       if (c()) {
/*    */         return;
/*    */       }
/*    */       
/*    */       try {
/* 29 */         boolean bool = ☃.f(this.c.a).booleanValue();
/* 30 */         if (bool) {
/* 31 */           this.d.a();
/* 32 */           this.c.e = dgq.b.a;
/* 33 */           a(this.d);
/*    */           break;
/*    */         } 
/* 36 */       } catch (dhj dhj) {
/* 37 */         if (c()) {
/*    */           return;
/*    */         }
/* 40 */         a(dhj.e);
/* 41 */       } catch (Exception exception) {
/* 42 */         if (c()) {
/*    */           return;
/*    */         }
/* 45 */         a.error("Failed to close server", exception);
/* 46 */         a("Failed to close the server");
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\diw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */