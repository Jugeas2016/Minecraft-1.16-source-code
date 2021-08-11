/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bft
/*    */ {
/*    */   public boolean a;
/*    */   public boolean b;
/*    */   public boolean c;
/*    */   public boolean d;
/*    */   public boolean e = true;
/* 12 */   private float f = 0.05F;
/* 13 */   private float g = 0.1F;
/*    */   
/*    */   public void a(md ☃) {
/* 16 */     md md1 = new md();
/*    */     
/* 18 */     md1.a("invulnerable", this.a);
/* 19 */     md1.a("flying", this.b);
/* 20 */     md1.a("mayfly", this.c);
/* 21 */     md1.a("instabuild", this.d);
/* 22 */     md1.a("mayBuild", this.e);
/* 23 */     md1.a("flySpeed", this.f);
/* 24 */     md1.a("walkSpeed", this.g);
/* 25 */     ☃.a("abilities", md1);
/*    */   }
/*    */   
/*    */   public void b(md ☃) {
/* 29 */     if (☃.c("abilities", 10)) {
/* 30 */       md md1 = ☃.p("abilities");
/*    */       
/* 32 */       this.a = md1.q("invulnerable");
/* 33 */       this.b = md1.q("flying");
/* 34 */       this.c = md1.q("mayfly");
/* 35 */       this.d = md1.q("instabuild");
/*    */       
/* 37 */       if (md1.c("flySpeed", 99)) {
/* 38 */         this.f = md1.j("flySpeed");
/* 39 */         this.g = md1.j("walkSpeed");
/*    */       } 
/* 41 */       if (md1.c("mayBuild", 1)) {
/* 42 */         this.e = md1.q("mayBuild");
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public float a() {
/* 48 */     return this.f;
/*    */   }
/*    */   
/*    */   public void a(float ☃) {
/* 52 */     this.f = ☃;
/*    */   }
/*    */   
/*    */   public float b() {
/* 56 */     return this.g;
/*    */   }
/*    */   
/*    */   public void b(float ☃) {
/* 60 */     this.g = ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bft.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */