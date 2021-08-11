/*    */ import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
/*    */ import it.unimi.dsi.fastutil.longs.LongSet;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class crt
/*    */   extends cxs
/*    */ {
/* 11 */   private LongSet a = (LongSet)new LongOpenHashSet();
/* 12 */   private LongSet b = (LongSet)new LongOpenHashSet();
/*    */   
/*    */   public crt(String ☃) {
/* 15 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(md ☃) {
/* 20 */     this.a = (LongSet)new LongOpenHashSet(☃.o("All"));
/* 21 */     this.b = (LongSet)new LongOpenHashSet(☃.o("Remaining"));
/*    */   }
/*    */ 
/*    */   
/*    */   public md b(md ☃) {
/* 26 */     ☃.a("All", this.a.toLongArray());
/* 27 */     ☃.a("Remaining", this.b.toLongArray());
/* 28 */     return ☃;
/*    */   }
/*    */   
/*    */   public void a(long ☃) {
/* 32 */     this.a.add(☃);
/* 33 */     this.b.add(☃);
/*    */   }
/*    */   
/*    */   public boolean b(long ☃) {
/* 37 */     return this.a.contains(☃);
/*    */   }
/*    */   
/*    */   public boolean c(long ☃) {
/* 41 */     return this.b.contains(☃);
/*    */   }
/*    */   
/*    */   public void d(long ☃) {
/* 45 */     this.b.remove(☃);
/*    */   }
/*    */   
/*    */   public LongSet a() {
/* 49 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */