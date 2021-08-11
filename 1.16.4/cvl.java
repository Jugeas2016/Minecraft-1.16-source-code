/*    */ import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
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
/*    */ public class cvl
/*    */   implements cvj<cvh>
/*    */ {
/*    */   private final Long2IntLinkedOpenHashMap a;
/*    */   private final int b;
/*    */   private final ctz c;
/*    */   private final long d;
/*    */   private long e;
/*    */   
/*    */   public cvl(int ☃, long l1, long l2) {
/* 23 */     this.d = b(l1, l2);
/* 24 */     this.c = new ctz(new Random(l1));
/*    */     
/* 26 */     this.a = new Long2IntLinkedOpenHashMap(16, 0.25F);
/* 27 */     this.a.defaultReturnValue(-2147483648);
/* 28 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public cvh b(cwv ☃) {
/* 33 */     return new cvh(this.a, this.b, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public cvh a(cwv ☃, cvh cvh1) {
/* 38 */     return new cvh(this.a, Math.min(1024, cvh1.a() * 4), ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public cvh a(cwv ☃, cvh cvh1, cvh cvh2) {
/* 43 */     return new cvh(this.a, Math.min(1024, Math.max(cvh1.a(), cvh2.a()) * 4), ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(long ☃, long l1) {
/* 48 */     long l = this.d;
/* 49 */     l = afk.a(l, ☃);
/* 50 */     l = afk.a(l, l1);
/* 51 */     l = afk.a(l, ☃);
/* 52 */     l = afk.a(l, l1);
/* 53 */     this.e = l;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int ☃) {
/* 58 */     int i = (int)Math.floorMod(this.e >> 24L, ☃);
/* 59 */     this.e = afk.a(this.e, this.d);
/* 60 */     return i;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ctz b() {
/* 70 */     return this.c;
/*    */   }
/*    */   
/*    */   private static long b(long ☃, long l1) {
/* 74 */     long l2 = l1;
/* 75 */     l2 = afk.a(l2, l1);
/* 76 */     l2 = afk.a(l2, l1);
/* 77 */     l2 = afk.a(l2, l1);
/*    */     
/* 79 */     long l3 = ☃;
/* 80 */     l3 = afk.a(l3, l2);
/* 81 */     l3 = afk.a(l3, l2);
/* 82 */     l3 = afk.a(l3, l2);
/* 83 */     return l3;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cvl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */