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
/*    */ 
/*    */ 
/*    */ public class bpp
/*    */   extends bps
/*    */ {
/* 18 */   private static final String[] d = new String[] { "all", "undead", "arthropods" };
/*    */ 
/*    */ 
/*    */   
/* 22 */   private static final int[] e = new int[] { 1, 5, 5 };
/*    */ 
/*    */ 
/*    */   
/* 26 */   private static final int[] f = new int[] { 11, 8, 8 };
/*    */ 
/*    */ 
/*    */   
/* 30 */   private static final int[] g = new int[] { 20, 20, 20 };
/*    */ 
/*    */   
/*    */   public final int a;
/*    */ 
/*    */   
/*    */   public bpp(bps.a ☃, int i, aqf... arrayOfAqf) {
/* 37 */     super(☃, bpt.f, arrayOfAqf);
/* 38 */     this.a = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int ☃) {
/* 43 */     return e[this.a] + (☃ - 1) * f[this.a];
/*    */   }
/*    */ 
/*    */   
/*    */   public int b(int ☃) {
/* 48 */     return a(☃) + g[this.a];
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 53 */     return 5;
/*    */   }
/*    */ 
/*    */   
/*    */   public float a(int ☃, aqq aqq1) {
/* 58 */     if (this.a == 0) {
/* 59 */       return 1.0F + Math.max(0, ☃ - 1) * 0.5F;
/*    */     }
/* 61 */     if (this.a == 1 && aqq1 == aqq.b) {
/* 62 */       return ☃ * 2.5F;
/*    */     }
/* 64 */     if (this.a == 2 && aqq1 == aqq.c) {
/* 65 */       return ☃ * 2.5F;
/*    */     }
/* 67 */     return 0.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bps ☃) {
/* 72 */     return !(☃ instanceof bpp);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bmb ☃) {
/* 77 */     if (☃.b() instanceof bkd) {
/* 78 */       return true;
/*    */     }
/* 80 */     return super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(aqm ☃, aqa aqa1, int i) {
/* 85 */     if (aqa1 instanceof aqm) {
/* 86 */       aqm aqm1 = (aqm)aqa1;
/*    */       
/* 88 */       if (this.a == 2 && aqm1.dC() == aqq.c) {
/* 89 */         int j = 20 + ☃.cY().nextInt(10 * i);
/* 90 */         aqm1.c(new apu(apw.b, j, 3));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bpp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */