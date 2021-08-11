/*    */ import java.util.EnumSet;
/*    */ import java.util.Random;
/*    */ import javax.annotation.Nullable;
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
/*    */ public class axc
/*    */   extends avv
/*    */ {
/*    */   private final aqu a;
/*    */   private final int b;
/*    */   @Nullable
/*    */   private fx c;
/*    */   
/*    */   public axc(aqu ☃, int i) {
/* 25 */     this.a = ☃;
/* 26 */     this.b = i;
/* 27 */     a(EnumSet.of(avv.a.a));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 32 */     if (this.a.bs()) {
/* 33 */       return false;
/*    */     }
/*    */     
/* 36 */     if (this.a.l.M()) {
/* 37 */       return false;
/*    */     }
/*    */     
/* 40 */     if (this.a.cY().nextInt(this.b) != 0) {
/* 41 */       return false;
/*    */     }
/*    */     
/* 44 */     aag ☃ = (aag)this.a.l;
/*    */     
/* 46 */     fx fx1 = this.a.cB();
/* 47 */     if (!☃.a(fx1, 6)) {
/* 48 */       return false;
/*    */     }
/*    */     
/* 51 */     dcn dcn = azj.a(this.a, 15, 7, fx1 -> -☃.b(gp.a(fx1)));
/* 52 */     this.c = (dcn == null) ? null : new fx(dcn);
/* 53 */     return (this.c != null);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 58 */     return (this.c != null && !this.a.x().m() && this.a.x().h().equals(this.c));
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 63 */     if (this.c == null) {
/*    */       return;
/*    */     }
/* 66 */     ayj ☃ = this.a.x();
/* 67 */     if (☃.m() && 
/* 68 */       !this.c.a(this.a.cA(), 10.0D)) {
/* 69 */       dcn dcn1 = dcn.c(this.c);
/*    */ 
/*    */       
/* 72 */       dcn dcn2 = this.a.cA();
/* 73 */       dcn dcn3 = dcn2.d(dcn1);
/*    */       
/* 75 */       dcn1 = dcn3.a(0.4D).e(dcn1);
/*    */       
/* 77 */       dcn dcn4 = dcn1.d(dcn2).d().a(10.0D).e(dcn2);
/* 78 */       fx fx1 = new fx(dcn4);
/* 79 */       fx1 = this.a.l.a(chn.a.f, fx1);
/*    */       
/* 81 */       if (!☃.a(fx1.u(), fx1.v(), fx1.w(), 1.0D))
/*    */       {
/* 83 */         g();
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   private void g() {
/* 90 */     Random ☃ = this.a.cY();
/* 91 */     fx fx1 = this.a.l.a(chn.a.f, this.a.cB().b(-8 + ☃.nextInt(16), 0, -8 + ☃.nextInt(16)));
/* 92 */     this.a.x().a(fx1.u(), fx1.v(), fx1.w(), 1.0D);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\axc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */