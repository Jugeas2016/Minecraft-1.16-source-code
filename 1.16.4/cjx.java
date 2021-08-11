/*    */ import com.mojang.serialization.Codec;
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
/*    */ 
/*    */ 
/*    */ public class cjx
/*    */   extends cla<cmc>
/*    */ {
/*    */   private final int u;
/*    */   private final boolean v;
/*    */   private final boolean w;
/*    */   
/*    */   public cjx(Codec<cmc> ☃, int i, boolean bool1, boolean bool2) {
/* 22 */     super(☃);
/* 23 */     this.u = i;
/* 24 */     this.v = bool1;
/* 25 */     this.w = bool2;
/*    */   }
/*    */ 
/*    */   
/*    */   public cla.a<cmc> a() {
/* 30 */     return (☃, i, j, cra1, k, l) -> new a(this, i, j, cra1, k, l);
/*    */   }
/*    */   
/*    */   public static class a extends cqz<cmc> {
/*    */     private final cjx e;
/*    */     
/*    */     public a(cjx ☃, int i, int j, cra cra1, int k, long l) {
/* 37 */       super(☃, i, j, cra1, k, l);
/* 38 */       this.e = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(gn ☃, cfy cfy1, csw csw1, int i, int j, bsv bsv1, cmc cmc1) {
/* 43 */       fx fx = new fx(i * 16, cjx.a(this.e), j * 16);
/*    */       
/* 45 */       kk.a();
/*    */       
/* 47 */       coe.a(☃, cmc1, cro::new, cfy1, csw1, fx, (List)this.b, this.d, cjx.b(this.e), cjx.c(this.e));
/*    */       
/* 49 */       b();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cjx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */