/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class djd
/*    */   extends dja
/*    */ {
/*    */   private final dgg c;
/*    */   private final long d;
/*    */   private final dhs e;
/*    */   
/*    */   public djd(dgg ☃, long l, dhs dhs1) {
/* 17 */     this.c = ☃;
/* 18 */     this.d = l;
/* 19 */     this.e = dhs1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/* 24 */     b(new of("mco.backup.restoring"));
/* 25 */     dgb ☃ = dgb.a();
/*    */     
/* 27 */     for (int i = 0; i < 25; i++) {
/*    */       try {
/* 29 */         if (c()) {
/*    */           return;
/*    */         }
/* 32 */         ☃.c(this.d, this.c.a);
/* 33 */         a(1);
/* 34 */         if (c()) {
/*    */           return;
/*    */         }
/* 37 */         a(this.e.c());
/*    */         return;
/* 39 */       } catch (dhj dhj) {
/* 40 */         if (c()) {
/*    */           return;
/*    */         }
/* 43 */         a(dhj.e);
/* 44 */       } catch (dhi dhi) {
/* 45 */         if (c()) {
/*    */           return;
/*    */         }
/* 48 */         a.error("Couldn't restore backup", dhi);
/* 49 */         a(new dhw(dhi, this.e));
/*    */         return;
/* 51 */       } catch (Exception exception) {
/* 52 */         if (c()) {
/*    */           return;
/*    */         }
/* 55 */         a.error("Couldn't restore backup", exception);
/* 56 */         a(exception.getLocalizedMessage());
/*    */         return;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\djd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */