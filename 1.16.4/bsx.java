/*    */ import com.google.common.hash.Hashing;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bsx
/*    */ {
/*    */   private final a a;
/*    */   private final long b;
/*    */   private final bta c;
/*    */   
/*    */   public bsx(a ☃, long l, bta bta1) {
/* 13 */     this.a = ☃;
/* 14 */     this.b = l;
/* 15 */     this.c = bta1;
/*    */   }
/*    */   
/*    */   public static long a(long ☃) {
/* 19 */     return Hashing.sha256().hashLong(☃).asLong();
/*    */   }
/*    */   
/*    */   public bsx a(bsy ☃) {
/* 23 */     return new bsx(☃, this.b, this.c);
/*    */   }
/*    */   
/*    */   public bsv a(fx ☃) {
/* 27 */     return this.c.a(this.b, ☃.u(), ☃.v(), ☃.w(), this.a);
/*    */   }
/*    */   
/*    */   public bsv a(double ☃, double d1, double d2) {
/* 31 */     int i = afm.c(☃) >> 2;
/* 32 */     int j = afm.c(d1) >> 2;
/* 33 */     int k = afm.c(d2) >> 2;
/* 34 */     return a(i, j, k);
/*    */   }
/*    */   
/*    */   public bsv b(fx ☃) {
/* 38 */     int i = ☃.u() >> 2;
/* 39 */     int j = ☃.v() >> 2;
/* 40 */     int k = ☃.w() >> 2;
/* 41 */     return a(i, j, k);
/*    */   }
/*    */   
/*    */   public bsv a(int ☃, int i, int j) {
/* 45 */     return this.a.b(☃, i, j);
/*    */   }
/*    */   
/*    */   public static interface a {
/*    */     bsv b(int param1Int1, int param1Int2, int param1Int3);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */