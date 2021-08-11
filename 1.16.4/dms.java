/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import javax.annotation.Nullable;
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
/*    */ public class dms
/*    */   implements dmq
/*    */ {
/*    */   private final a c;
/*    */   private final nr d;
/*    */   private final nr e;
/* 20 */   private dmq.a f = dmq.a.a;
/*    */   private long g;
/*    */   private float h;
/*    */   private float i;
/*    */   private final boolean j;
/*    */   
/*    */   public dms(a ☃, nr nr1, @Nullable nr nr2, boolean bool) {
/* 27 */     this.c = ☃;
/* 28 */     this.d = nr1;
/* 29 */     this.e = nr2;
/* 30 */     this.j = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public dmq.a a(dfm ☃, dmr dmr1, long l) {
/* 35 */     dmr1.b().M().a(a);
/* 36 */     RenderSystem.color3f(1.0F, 1.0F, 1.0F);
/* 37 */     dmr1.b(☃, 0, 0, 0, 96, a(), d());
/* 38 */     this.c.a(☃, dmr1, 6, 6);
/*    */     
/* 40 */     if (this.e == null) {
/* 41 */       (dmr1.b()).g.b(☃, this.d, 30.0F, 12.0F, -11534256);
/*    */     } else {
/* 43 */       (dmr1.b()).g.b(☃, this.d, 30.0F, 7.0F, -11534256);
/* 44 */       (dmr1.b()).g.b(☃, this.e, 30.0F, 18.0F, -16777216);
/*    */     } 
/*    */     
/* 47 */     if (this.j) {
/* 48 */       int i; dkw.a(☃, 3, 28, 157, 29, -1);
/* 49 */       float f = (float)afm.b(this.h, this.i, ((float)(l - this.g) / 100.0F));
/*    */       
/* 51 */       if (this.i >= this.h) {
/* 52 */         i = -16755456;
/*    */       } else {
/* 54 */         i = -11206656;
/*    */       } 
/* 56 */       dkw.a(☃, 3, 28, (int)(3.0F + 154.0F * f), 29, i);
/* 57 */       this.h = f;
/* 58 */       this.g = l;
/*    */     } 
/*    */     
/* 61 */     return this.f;
/*    */   }
/*    */   
/*    */   public void b() {
/* 65 */     this.f = dmq.a.b;
/*    */   }
/*    */   
/*    */   public void a(float ☃) {
/* 69 */     this.i = ☃;
/*    */   }
/*    */   
/*    */   public enum a {
/* 73 */     a(0, 0),
/* 74 */     b(1, 0),
/* 75 */     c(2, 0),
/* 76 */     d(0, 1),
/* 77 */     e(1, 1),
/* 78 */     f(2, 1);
/*    */     
/*    */     private final int g;
/*    */     
/*    */     private final int h;
/*    */     
/*    */     a(int ☃, int i) {
/* 85 */       this.g = ☃;
/* 86 */       this.h = i;
/*    */     }
/*    */     
/*    */     public void a(dfm ☃, dkw dkw1, int i, int j) {
/* 90 */       RenderSystem.enableBlend();
/* 91 */       dkw1.b(☃, i, j, 176 + this.g * 20, this.h * 20, 20, 20);
/* 92 */       RenderSystem.enableBlend();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dms.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */