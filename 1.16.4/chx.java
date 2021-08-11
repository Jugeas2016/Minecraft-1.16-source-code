/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ public class chx
/*    */   extends Random
/*    */ {
/*    */   private int a;
/*    */   
/*    */   public chx() {}
/*    */   
/*    */   public chx(long ☃) {
/* 12 */     super(☃);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(int ☃) {
/* 20 */     for (int i = 0; i < ☃; i++) {
/* 21 */       next(1);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   protected int next(int ☃) {
/* 27 */     this.a++;
/* 28 */     return super.next(☃);
/*    */   }
/*    */   
/*    */   public long a(int ☃, int i) {
/* 32 */     long l = ☃ * 341873128712L + i * 132897987541L;
/* 33 */     setSeed(l);
/* 34 */     return l;
/*    */   }
/*    */   
/*    */   public long a(long ☃, int i, int j) {
/* 38 */     setSeed(☃);
/*    */     
/* 40 */     long l1 = nextLong() | 0x1L;
/* 41 */     long l2 = nextLong() | 0x1L;
/* 42 */     long l3 = i * l1 + j * l2 ^ ☃;
/* 43 */     setSeed(l3);
/* 44 */     return l3;
/*    */   }
/*    */   
/*    */   public long b(long ☃, int i, int j) {
/* 48 */     long l = ☃ + i + (10000 * j);
/* 49 */     setSeed(l);
/* 50 */     return l;
/*    */   }
/*    */   
/*    */   public long c(long ☃, int i, int j) {
/* 54 */     setSeed(☃);
/* 55 */     long l1 = nextLong();
/* 56 */     long l2 = nextLong();
/* 57 */     long l3 = i * l1 ^ j * l2 ^ ☃;
/* 58 */     setSeed(l3);
/* 59 */     return l3;
/*    */   }
/*    */   
/*    */   public long a(long ☃, int i, int j, int k) {
/* 63 */     long l = i * 341873128712L + j * 132897987541L + ☃ + k;
/* 64 */     setSeed(l);
/* 65 */     return l;
/*    */   }
/*    */   
/*    */   public static Random a(int ☃, int i, long l1, long l2) {
/* 69 */     return new Random(l1 + (☃ * ☃ * 4987142) + (☃ * 5947611) + (i * i) * 4392871L + (i * 389711) ^ l2);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\chx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */