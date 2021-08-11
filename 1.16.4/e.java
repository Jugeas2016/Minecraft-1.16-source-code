/*    */ import java.util.Arrays;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum e
/*    */ {
/*  8 */   a(0, 1, 2),
/*  9 */   b(1, 0, 2),
/* 10 */   c(0, 2, 1),
/* 11 */   d(1, 2, 0),
/* 12 */   e(2, 0, 1),
/* 13 */   f(2, 1, 0);
/*    */   
/*    */   private final int[] g;
/*    */   private final a h;
/*    */   private static final e[][] i;
/*    */   
/*    */   e(int ☃, int i, int j) {
/* 20 */     this.g = new int[] { ☃, i, j };
/* 21 */     this.h = new a();
/* 22 */     this.h.a(0, a(0), 1.0F);
/* 23 */     this.h.a(1, a(1), 1.0F);
/* 24 */     this.h.a(2, a(2), 1.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   static {
/* 29 */     i = x.<e[][]>a(new e[(values()).length][(values()).length], ☃ -> {
/*    */           for (e e1 : values()) {
/*    */             for (e e2 : values()) {
/*    */               int[] arrayOfInt = new int[3];
/*    */               for (int i = 0; i < 3; i++) {
/*    */                 arrayOfInt[i] = e1.g[e2.g[i]];
/*    */               }
/*    */               e e3 = Arrays.<e>stream(values()).filter(()).findFirst().get();
/*    */               ☃[e1.ordinal()][e2.ordinal()] = e3;
/*    */             } 
/*    */           } 
/*    */         });
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public e a(e ☃) {
/* 46 */     return i[ordinal()][☃.ordinal()];
/*    */   }
/*    */   
/*    */   public int a(int ☃) {
/* 50 */     return this.g[☃];
/*    */   }
/*    */   
/*    */   public a a() {
/* 54 */     return this.h;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */