/*    */ import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cuh
/*    */   extends cun<cuh.a>
/*    */ {
/*    */   protected cuh(cgj ☃) {
/* 12 */     super(bsf.b, ☃, new a(new Long2ObjectOpenHashMap()));
/*    */   }
/*    */ 
/*    */   
/*    */   protected int d(long ☃) {
/* 17 */     long l = gp.e(☃);
/* 18 */     cgb cgb = a(l, false);
/* 19 */     if (cgb == null) {
/* 20 */       return 0;
/*    */     }
/* 22 */     return cgb.a(
/* 23 */         gp.b(fx.b(☃)), 
/* 24 */         gp.b(fx.c(☃)), 
/* 25 */         gp.b(fx.d(☃)));
/*    */   }
/*    */   
/*    */   public static final class a
/*    */     extends cui<a> {
/*    */     public a(Long2ObjectOpenHashMap<cgb> ☃) {
/* 31 */       super(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public a a() {
/* 36 */       return new a(this.a.clone());
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cuh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */