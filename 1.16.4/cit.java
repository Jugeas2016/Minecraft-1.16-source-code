/*    */ import com.mojang.serialization.Codec;
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
/*    */ 
/*    */ public class cit
/*    */   extends cla<cmk>
/*    */ {
/*    */   public cit(Codec<cmk> ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(cfy ☃, bsy bsy1, long l, chx chx1, int i, int j, bsv bsv1, brd brd1, cmk cmk1) {
/* 26 */     chx1.a(l, i, j, 10387320);
/* 27 */     return (chx1.nextFloat() < cmk1.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public cla.a<cmk> a() {
/* 32 */     return a::new;
/*    */   }
/*    */   
/*    */   public static class a extends crv<cmk> {
/*    */     public a(cla<cmk> ☃, int i, int j, cra cra1, int k, long l) {
/* 37 */       super(☃, i, j, cra1, k, l);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(gn ☃, cfy cfy1, csw csw1, int i, int j, bsv bsv1, cmk cmk1) {
/* 42 */       int k = i * 16;
/* 43 */       int m = j * 16;
/*    */       
/* 45 */       fx fx = new fx(k + 9, 90, m + 9);
/*    */       
/* 47 */       this.b.add(new crb.a(fx));
/* 48 */       b();
/*    */     }
/*    */ 
/*    */     
/*    */     public fx a() {
/* 53 */       return new fx((f() << 4) + 9, 0, (g() << 4) + 9);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */