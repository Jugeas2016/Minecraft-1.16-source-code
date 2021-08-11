/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class diy
/*    */   extends dja
/*    */ {
/*    */   private final long c;
/*    */   private final int d;
/*    */   private final dot e;
/*    */   private final String f;
/*    */   
/*    */   public diy(long ☃, int i, String str, dot dot1) {
/* 19 */     this.c = ☃;
/* 20 */     this.d = i;
/* 21 */     this.e = dot1;
/* 22 */     this.f = str;
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/* 27 */     b(new of("mco.download.preparing"));
/* 28 */     dgb ☃ = dgb.a();
/*    */     
/* 30 */     for (int i = 0; i < 25; i++) {
/*    */       try {
/* 32 */         if (c()) {
/*    */           return;
/*    */         }
/* 35 */         dhd dhd = ☃.b(this.c, this.d);
/* 36 */         a(1);
/* 37 */         if (c()) {
/*    */           return;
/*    */         }
/* 40 */         a(new dhv(this.e, dhd, this.f, ☃ -> { 
/*    */               })); return;
/* 42 */       } catch (dhj dhj) {
/* 43 */         if (c()) {
/*    */           return;
/*    */         }
/* 46 */         a(dhj.e);
/* 47 */       } catch (dhi dhi) {
/* 48 */         if (c()) {
/*    */           return;
/*    */         }
/* 51 */         a.error("Couldn't download world data");
/* 52 */         a(new dhw(dhi, this.e));
/*    */         return;
/* 54 */       } catch (Exception exception) {
/* 55 */         if (c()) {
/*    */           return;
/*    */         }
/* 58 */         a.error("Couldn't download world data", exception);
/* 59 */         a(exception.getLocalizedMessage());
/*    */         return;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\diy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */