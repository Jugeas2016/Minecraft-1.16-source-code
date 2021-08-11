/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dny
/*    */   extends dot
/*    */ {
/* 13 */   private static final vk a = new vk("textures/gui/demo_background.png"); private dlu b;
/*    */   
/*    */   public dny() {
/* 16 */     super(new of("demo.help.title"));
/*    */ 
/*    */     
/* 19 */     this.b = dlu.a;
/* 20 */     this.c = dlu.a;
/*    */   }
/*    */   private dlu c;
/*    */   protected void b() {
/* 24 */     int ☃ = -16;
/*    */     
/* 26 */     a(new dlj(this.k / 2 - 116, this.l / 2 + 62 + -16, 114, 20, new of("demo.help.buy"), ☃ -> {
/*    */             ☃.o = false;
/*    */             x.i().a("http://www.minecraft.net/store?source=demo");
/*    */           }));
/* 30 */     a(new dlj(this.k / 2 + 2, this.l / 2 + 62 + -16, 114, 20, new of("demo.help.later"), ☃ -> {
/*    */             this.i.a((dot)null);
/*    */             
/*    */             this.i.l.i();
/*    */           }));
/* 35 */     dkd dkd = this.i.k;
/* 36 */     this.b = dlu.a(this.o, new nr[] { new of("demo.help.movementShort", new Object[] { dkd.af
/* 37 */               .j(), dkd.ag.j(), dkd.ah.j(), dkd.ai.j() }), new of("demo.help.movementMouse"), new of("demo.help.jump", new Object[] { dkd.aj
/*    */               
/* 39 */               .j() }), new of("demo.help.inventory", new Object[] { dkd.am
/* 40 */               .j() }) });
/*    */ 
/*    */     
/* 43 */     this.c = dlu.a(this.o, new of("demo.help.fullWrapped"), 218);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃) {
/* 48 */     super.a(☃);
/*    */     
/* 50 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 51 */     this.i.M().a(a);
/* 52 */     int i = (this.k - 248) / 2;
/* 53 */     int j = (this.l - 166) / 2;
/* 54 */     b(☃, i, j, 0, 0, 248, 166);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 59 */     a(☃);
/*    */     
/* 61 */     int k = (this.k - 248) / 2 + 10;
/*    */     
/* 63 */     int m = (this.l - 166) / 2 + 8;
/*    */     
/* 65 */     this.o.b(☃, this.d, k, m, 2039583);
/*    */     
/* 67 */     m = this.b.c(☃, k, m + 12, 12, 5197647);
/* 68 */     this.o.getClass(); this.c.c(☃, k, m + 20, 9, 2039583);
/* 69 */     super.a(☃, i, j, f);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dny.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */