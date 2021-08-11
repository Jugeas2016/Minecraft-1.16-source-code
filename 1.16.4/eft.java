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
/*    */ public class eft
/*    */   extends eeu<bgl>
/*    */ {
/* 14 */   private static final vk a = new vk("textures/entity/llama/spit.png");
/*    */   
/* 16 */   private final dut<bgl> e = new dut<>();
/*    */   
/*    */   public eft(eet ☃) {
/* 19 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bgl ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/* 24 */     dfm1.a();
/*    */     
/* 26 */     dfm1.a(0.0D, 0.15000000596046448D, 0.0D);
/* 27 */     dfm1.a(g.d.a(afm.g(f2, ☃.r, ☃.p) - 90.0F));
/* 28 */     dfm1.a(g.f.a(afm.g(f2, ☃.s, ☃.q)));
/*    */     
/* 30 */     this.e.a(☃, f2, 0.0F, -0.1F, 0.0F, 0.0F);
/*    */     
/* 32 */     dfq dfq = eag1.getBuffer(this.e.a(a));
/* 33 */     this.e.a(dfm1, dfq, i, ejw.a, 1.0F, 1.0F, 1.0F, 1.0F);
/*    */     
/* 35 */     dfm1.b();
/*    */     
/* 37 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bgl ☃) {
/* 42 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eft.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */