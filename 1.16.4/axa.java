/*    */ import java.util.EnumSet;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class axa
/*    */   extends avv
/*    */ {
/*    */   private final bbb a;
/*    */   private final double b;
/*    */   private double c;
/*    */   private double d;
/*    */   private double e;
/*    */   
/*    */   public axa(bbb ☃, double d) {
/* 20 */     this.a = ☃;
/* 21 */     this.b = d;
/* 22 */     a(EnumSet.of(avv.a.a));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 27 */     if (this.a.eW() || !this.a.bs()) {
/* 28 */       return false;
/*    */     }
/* 30 */     dcn ☃ = azj.a(this.a, 5, 4);
/* 31 */     if (☃ == null) {
/* 32 */       return false;
/*    */     }
/* 34 */     this.c = ☃.b;
/* 35 */     this.d = ☃.c;
/* 36 */     this.e = ☃.d;
/* 37 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 42 */     this.a.x().a(this.c, this.d, this.e, this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 47 */     return (!this.a.eW() && !this.a.x().m() && this.a.bs());
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 52 */     if (!this.a.eW() && this.a.cY().nextInt(50) == 0) {
/* 53 */       aqa ☃ = this.a.cn().get(0);
/* 54 */       if (☃ == null) {
/*    */         return;
/*    */       }
/*    */       
/* 58 */       if (☃ instanceof bfw) {
/* 59 */         int i = this.a.fc();
/* 60 */         int j = this.a.fj();
/* 61 */         if (j > 0 && this.a.cY().nextInt(j) < i) {
/* 62 */           this.a.i((bfw)☃);
/*    */           return;
/*    */         } 
/* 65 */         this.a.v(5);
/*    */       } 
/*    */       
/* 68 */       this.a.be();
/* 69 */       this.a.fm();
/* 70 */       this.a.l.a(this.a, (byte)6);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\axa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */