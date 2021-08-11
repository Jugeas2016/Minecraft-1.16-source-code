/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.EnumMap;
/*    */ import java.util.Map;
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
/*    */ public class bys
/*    */   extends buo
/*    */ {
/* 18 */   private static final gc[] i = gc.values();
/*    */   
/* 20 */   public static final cey a = cex.I;
/* 21 */   public static final cey b = cex.J;
/* 22 */   public static final cey c = cex.K;
/* 23 */   public static final cey d = cex.L;
/* 24 */   public static final cey e = cex.G;
/* 25 */   public static final cey f = cex.H; public static final Map<gc, cey> g;
/*    */   static {
/* 27 */     g = x.<Map<gc, cey>>a(Maps.newEnumMap(gc.class), ☃ -> {
/*    */           ☃.put(gc.c, a);
/*    */           ☃.put(gc.f, b);
/*    */           ☃.put(gc.d, c);
/*    */           ☃.put(gc.e, d);
/*    */           ☃.put(gc.b, e);
/*    */           ☃.put(gc.a, f);
/*    */         });
/*    */   }
/*    */   protected final ddh[] h;
/*    */   
/*    */   protected bys(float ☃, ceg.c c1) {
/* 39 */     super(c1);
/*    */     
/* 41 */     this.h = a(☃);
/*    */   }
/*    */   
/*    */   private ddh[] a(float ☃) {
/* 45 */     float f1 = 0.5F - ☃;
/* 46 */     float f2 = 0.5F + ☃;
/*    */     
/* 48 */     ddh ddh1 = buo.a((f1 * 16.0F), (f1 * 16.0F), (f1 * 16.0F), (f2 * 16.0F), (f2 * 16.0F), (f2 * 16.0F));
/*    */     
/* 50 */     ddh[] arrayOfDdh1 = new ddh[i.length];
/*    */     
/* 52 */     for (int i = 0; i < i.length; i++) {
/* 53 */       gc gc1 = i[i];
/* 54 */       arrayOfDdh1[i] = dde.a(0.5D + 
/* 55 */           Math.min(-☃, gc1.i() * 0.5D), 0.5D + 
/* 56 */           Math.min(-☃, gc1.j() * 0.5D), 0.5D + 
/* 57 */           Math.min(-☃, gc1.k() * 0.5D), 0.5D + 
/* 58 */           Math.max(☃, gc1.i() * 0.5D), 0.5D + 
/* 59 */           Math.max(☃, gc1.j() * 0.5D), 0.5D + 
/* 60 */           Math.max(☃, gc1.k() * 0.5D));
/*    */     } 
/*    */ 
/*    */     
/* 64 */     ddh[] arrayOfDdh2 = new ddh[64];
/* 65 */     for (int j = 0; j < 64; j++) {
/* 66 */       ddh ddh2 = ddh1;
/* 67 */       for (int k = 0; k < i.length; k++) {
/* 68 */         if ((j & 1 << k) != 0) {
/* 69 */           ddh2 = dde.a(ddh2, arrayOfDdh1[k]);
/*    */         }
/*    */       } 
/* 72 */       arrayOfDdh2[j] = ddh2;
/*    */     } 
/* 74 */     return arrayOfDdh2;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(ceh ☃, brc brc1, fx fx1) {
/* 79 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 84 */     return this.h[h(☃)];
/*    */   }
/*    */   
/*    */   protected int h(ceh ☃) {
/* 88 */     int i = 0;
/* 89 */     for (int j = 0; j < i.length; j++) {
/* 90 */       if (((Boolean)☃.c(g.get(i[j]))).booleanValue()) {
/* 91 */         i |= 1 << j;
/*    */       }
/*    */     } 
/* 94 */     return i;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bys.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */