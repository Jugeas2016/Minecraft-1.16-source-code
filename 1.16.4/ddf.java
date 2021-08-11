/*    */ import it.unimi.dsi.fastutil.doubles.DoubleList;
/*    */ 
/*    */ 
/*    */ public class ddf
/*    */   extends ddh
/*    */ {
/*    */   private final ddh b;
/*    */   private final gc.a c;
/*  9 */   private static final DoubleList d = (DoubleList)new dct(1);
/*    */   
/*    */   public ddf(ddh ☃, gc.a a1, int i) {
/* 12 */     super(a(☃.a, a1, i));
/* 13 */     this.b = ☃;
/* 14 */     this.c = a1;
/*    */   }
/*    */   
/*    */   private static dcw a(dcw ☃, gc.a a1, int i) {
/* 18 */     return new ddg(☃, a1
/* 19 */         .a(i, 0, 0), a1
/* 20 */         .a(0, i, 0), a1
/* 21 */         .a(0, 0, i), a1
/* 22 */         .a(i + 1, ☃.a, ☃.a), a1
/* 23 */         .a(☃.b, i + 1, ☃.b), a1
/* 24 */         .a(☃.c, ☃.c, i + 1));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected DoubleList a(gc.a ☃) {
/* 30 */     if (☃ == this.c) {
/* 31 */       return d;
/*    */     }
/* 33 */     return this.b.a(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ddf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */