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
/*    */ public class ego
/*    */   extends efw<bdw, dvq<bdw>>
/*    */ {
/*    */   public static final vk[] g;
/* 15 */   public static final vk a = new vk("textures/" + ear.g.b().a() + ".png"); static {
/* 16 */     g = (vk[])ear.h.stream().map(☃ -> new vk("textures/" + ☃.b().a() + ".png")).toArray(☃ -> new vk[☃]);
/*    */   }
/*    */   public ego(eet ☃) {
/* 19 */     super(☃, new dvq<>(), 0.0F);
/*    */     
/* 21 */     a(new eiw(this));
/*    */   }
/*    */ 
/*    */   
/*    */   public dcn a(bdw ☃, float f) {
/* 26 */     int i = ☃.eO();
/* 27 */     if (i > 0 && ☃.eQ()) {
/* 28 */       fx fx1 = ☃.eM();
/* 29 */       fx fx2 = ☃.eP();
/*    */       
/* 31 */       double d1 = (i - f) / 6.0D;
/* 32 */       d1 *= d1;
/* 33 */       double d2 = (fx1.u() - fx2.u()) * d1;
/* 34 */       double d3 = (fx1.v() - fx2.v()) * d1;
/* 35 */       double d4 = (fx1.w() - fx2.w()) * d1;
/*    */       
/* 37 */       return new dcn(-d2, -d3, -d4);
/*    */     } 
/* 39 */     return super.a(☃, f);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(bdw ☃, ecz ecz1, double d1, double d2, double d3) {
/* 45 */     if (super.a(☃, ecz1, d1, d2, d3)) {
/* 46 */       return true;
/*    */     }
/*    */ 
/*    */     
/* 50 */     dcn dcn1 = dcn.b(☃.eM());
/* 51 */     dcn dcn2 = dcn.b(☃.eP());
/*    */     
/* 53 */     if (☃.eO() > 0 && ☃.eQ() && ecz1.a(new dci(dcn2.b, dcn2.c, dcn2.d, dcn1.b, dcn1.c, dcn1.d))) {
/* 54 */       return true;
/*    */     }
/*    */     
/* 57 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bdw ☃) {
/* 62 */     if (☃.eS() == null) {
/* 63 */       return a;
/*    */     }
/* 65 */     return g[☃.eS().b()];
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bdw ☃, dfm dfm1, float f1, float f2, float f3) {
/* 70 */     super.a(☃, dfm1, f1, f2 + 180.0F, f3);
/*    */     
/* 72 */     dfm1.a(0.0D, 0.5D, 0.0D);
/* 73 */     dfm1.a(☃.eL().f().b());
/* 74 */     dfm1.a(0.0D, -0.5D, 0.0D);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ego.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */