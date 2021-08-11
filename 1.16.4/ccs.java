/*    */ import java.util.Random;
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
/*    */ public class ccs
/*    */   extends cdd
/*    */ {
/* 17 */   private static final Random a = new Random();
/*    */ 
/*    */   
/* 20 */   private gj<bmb> b = gj.a(9, bmb.b);
/*    */   
/*    */   protected ccs(cck<?> ☃) {
/* 23 */     super(☃);
/*    */   }
/*    */   
/*    */   public ccs() {
/* 27 */     this(cck.f);
/*    */   }
/*    */ 
/*    */   
/*    */   public int Z_() {
/* 32 */     return 9;
/*    */   }
/*    */   
/*    */   public int h() {
/* 36 */     d((bfw)null);
/* 37 */     int ☃ = -1;
/* 38 */     int i = 1;
/*    */     
/* 40 */     for (int j = 0; j < this.b.size(); j++) {
/* 41 */       if (!((bmb)this.b.get(j)).a() && a.nextInt(i++) == 0) {
/* 42 */         ☃ = j;
/*    */       }
/*    */     } 
/*    */     
/* 46 */     return ☃;
/*    */   }
/*    */   
/*    */   public int a(bmb ☃) {
/* 50 */     for (int i = 0; i < this.b.size(); i++) {
/* 51 */       if (((bmb)this.b.get(i)).a()) {
/* 52 */         a(i, ☃);
/* 53 */         return i;
/*    */       } 
/*    */     } 
/*    */     
/* 57 */     return -1;
/*    */   }
/*    */ 
/*    */   
/*    */   protected nr g() {
/* 62 */     return new of("container.dispenser");
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, md md1) {
/* 67 */     super.a(☃, md1);
/*    */     
/* 69 */     this.b = gj.a(Z_(), bmb.b);
/* 70 */     if (!b(md1)) {
/* 71 */       aoo.b(md1, this.b);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public md a(md ☃) {
/* 77 */     super.a(☃);
/*    */     
/* 79 */     if (!c(☃)) {
/* 80 */       aoo.a(☃, this.b);
/*    */     }
/* 82 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected gj<bmb> f() {
/* 87 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(gj<bmb> ☃) {
/* 92 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected bic a(int ☃, bfv bfv1) {
/* 97 */     return new bir(☃, bfv1, this);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ccs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */