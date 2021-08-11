/*    */ import java.util.EnumSet;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class axo
/*    */   extends axx
/*    */ {
/*    */   private final bai a;
/*    */   private aqm b;
/* 17 */   private final azg c = (new azg()).a(64.0D);
/*    */   
/*    */   public axo(bai ☃) {
/* 20 */     super(☃, false, true);
/* 21 */     this.a = ☃;
/* 22 */     a(EnumSet.of(avv.a.d));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 27 */     dci ☃ = this.a.cc().c(10.0D, 8.0D, 10.0D);
/* 28 */     List<aqm> list = this.a.l.a((Class)bfj.class, this.c, this.a, ☃);
/* 29 */     List<bfw> list1 = this.a.l.a(this.c, this.a, ☃);
/*    */     
/* 31 */     for (aqm aqm1 : list) {
/* 32 */       bfj bfj = (bfj)aqm1;
/* 33 */       for (bfw bfw : list1) {
/* 34 */         int i = bfj.g(bfw);
/*    */         
/* 36 */         if (i <= -100) {
/* 37 */           this.b = bfw;
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 42 */     if (this.b == null) {
/* 43 */       return false;
/*    */     }
/*    */     
/* 46 */     if (this.b instanceof bfw && (this.b.a_() || ((bfw)this.b).b_())) {
/* 47 */       return false;
/*    */     }
/*    */     
/* 50 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 55 */     this.a.h(this.b);
/* 56 */     super.c();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\axo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */