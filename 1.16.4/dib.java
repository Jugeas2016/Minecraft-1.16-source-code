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
/*    */ public class dib
/*    */   extends eoo
/*    */ {
/* 15 */   private static final nr a = new of("mco.account.privacyinfo");
/*    */   private final dot b;
/* 17 */   private dlu c = dlu.a;
/*    */   
/*    */   public dib(dot ☃) {
/* 20 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b() {
/* 25 */     eoj.a(a.getString());
/*    */     
/* 27 */     nr ☃ = new of("mco.account.update");
/* 28 */     nr nr1 = nq.h;
/* 29 */     int i = Math.max(this.o.a(☃), this.o.a(nr1)) + 30;
/* 30 */     nr nr2 = new of("mco.account.privacy.info");
/* 31 */     int j = (int)(this.o.a(nr2) * 1.2D);
/* 32 */     a(new dlj(this.k / 2 - j / 2, j(11), j, 20, nr2, ☃ -> x.i().a("https://aka.ms/MinecraftGDPR")));
/*    */ 
/*    */     
/* 35 */     a(new dlj(this.k / 2 - i + 5, j(13), i, 20, ☃, ☃ -> x.i().a("https://aka.ms/UpdateMojangAccount")));
/*    */ 
/*    */     
/* 38 */     a(new dlj(this.k / 2 + 5, j(13), i, 20, nr1, ☃ -> this.i.a(this.b)));
/*    */ 
/*    */ 
/*    */     
/* 42 */     this.c = dlu.a(this.o, a, (int)Math.round(this.k * 0.9D));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 47 */     a(☃);
/* 48 */     this.c.a(☃, this.k / 2, 15, 15, 16777215);
/* 49 */     super.a(☃, i, j, f);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */