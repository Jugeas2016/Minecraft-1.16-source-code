/*    */ import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
/*    */ import it.unimi.dsi.fastutil.longs.LongSet;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class brs
/*    */   extends cxs
/*    */ {
/* 11 */   private LongSet a = (LongSet)new LongOpenHashSet();
/*    */   
/*    */   public brs() {
/* 14 */     super("chunks");
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(md ☃) {
/* 19 */     this.a = (LongSet)new LongOpenHashSet(☃.o("Forced"));
/*    */   }
/*    */ 
/*    */   
/*    */   public md b(md ☃) {
/* 24 */     ☃.a("Forced", this.a.toLongArray());
/* 25 */     return ☃;
/*    */   }
/*    */   
/*    */   public LongSet a() {
/* 29 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\brs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */