/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dmo
/*    */   implements dmq
/*    */ {
/* 15 */   private static final nr c = new of("recipe.toast.title");
/* 16 */   private static final nr d = new of("recipe.toast.description");
/*    */   
/* 18 */   private final List<boq<?>> e = Lists.newArrayList();
/*    */   private long f;
/*    */   private boolean g;
/*    */   
/*    */   public dmo(boq<?> ☃) {
/* 23 */     this.e.add(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public dmq.a a(dfm ☃, dmr dmr1, long l) {
/* 28 */     if (this.g) {
/* 29 */       this.f = l;
/* 30 */       this.g = false;
/*    */     } 
/*    */     
/* 33 */     if (this.e.isEmpty()) {
/* 34 */       return dmq.a.b;
/*    */     }
/*    */     
/* 37 */     dmr1.b().M().a(a);
/* 38 */     RenderSystem.color3f(1.0F, 1.0F, 1.0F);
/* 39 */     dmr1.b(☃, 0, 0, 0, 32, a(), d());
/*    */     
/* 41 */     (dmr1.b()).g.b(☃, c, 30.0F, 7.0F, -11534256);
/* 42 */     (dmr1.b()).g.b(☃, d, 30.0F, 18.0F, -16777216);
/*    */     
/* 44 */     boq<?> boq = this.e.get((int)(l / Math.max(1L, 5000L / this.e.size()) % this.e.size()));
/* 45 */     bmb bmb = boq.h();
/*    */     
/* 47 */     RenderSystem.pushMatrix();
/* 48 */     RenderSystem.scalef(0.6F, 0.6F, 1.0F);
/* 49 */     dmr1.b().ad().c(bmb, 3, 3);
/* 50 */     RenderSystem.popMatrix();
/*    */     
/* 52 */     dmr1.b().ad().c(boq.c(), 8, 8);
/* 53 */     return (l - this.f >= 5000L) ? dmq.a.b : dmq.a.a;
/*    */   }
/*    */   
/*    */   private void a(boq<?> ☃) {
/* 57 */     this.e.add(☃);
/* 58 */     this.g = true;
/*    */   }
/*    */   
/*    */   public static void a(dmr ☃, boq<?> boq1) {
/* 62 */     dmo dmo1 = ☃.<dmo>a(dmo.class, b);
/* 63 */     if (dmo1 == null) {
/* 64 */       ☃.a(new dmo(boq1));
/*    */     } else {
/* 66 */       dmo1.a(boq1);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dmo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */