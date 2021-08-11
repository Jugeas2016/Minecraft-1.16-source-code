/*    */ import com.google.common.collect.Maps;
/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.HashMap;
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
/*    */ 
/*    */ public class csc
/*    */   extends csy
/*    */ {
/* 20 */   public static final Codec<csc> a = Codec.unit(() -> b);
/*    */   
/* 22 */   public static final csc b = new csc();
/*    */   
/*    */   private final Map<buo, buo> c;
/*    */   
/*    */   private csc() {
/* 27 */     this.c = x.<Map<buo, buo>>a(Maps.newHashMap(), ☃ -> {
/*    */           ☃.put(bup.m, bup.np);
/*    */           ☃.put(bup.bJ, bup.np);
/*    */           ☃.put(bup.b, bup.nt);
/*    */           ☃.put(bup.du, bup.nu);
/*    */           ☃.put(bup.dv, bup.nu);
/*    */           ☃.put(bup.ci, bup.nq);
/*    */           ☃.put(bup.lh, bup.nq);
/*    */           ☃.put(bup.lj, bup.nB);
/*    */           ☃.put(bup.dS, bup.ny);
/*    */           ☃.put(bup.lf, bup.ny);
/*    */           ☃.put(bup.hV, bup.ns);
/*    */           ☃.put(bup.lv, bup.ns);
/*    */           ☃.put(bup.hR, bup.nC);
/*    */           ☃.put(bup.hQ, bup.nC);
/*    */           ☃.put(bup.hX, bup.nx);
/*    */           ☃.put(bup.lt, bup.nx);
/*    */           ☃.put(bup.lJ, bup.nz);
/*    */           ☃.put(bup.lH, bup.nz);
/*    */           ☃.put(bup.et, bup.nr);
/*    */           ☃.put(bup.eu, bup.nr);
/*    */           ☃.put(bup.dx, bup.nw);
/*    */           ☃.put(bup.dw, bup.nv);
/*    */           ☃.put(bup.dH, bup.dI);
/*    */         });
/*    */   }
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
/*    */   public ctb.c a(brz ☃, fx fx1, fx fx2, ctb.c c1, ctb.c c2, csx csx1) {
/* 67 */     buo buo = this.c.get(c2.b.b());
/* 68 */     if (buo == null) {
/* 69 */       return c2;
/*    */     }
/* 71 */     ceh ceh1 = c2.b;
/* 72 */     ceh ceh2 = buo.n();
/* 73 */     if (ceh1.b(cak.a)) {
/* 74 */       ceh2 = ceh2.a(cak.a, ceh1.c(cak.a));
/*    */     }
/* 76 */     if (ceh1.b(cak.b)) {
/* 77 */       ceh2 = ceh2.a(cak.b, ceh1.c(cak.b));
/*    */     }
/* 79 */     if (ceh1.b(bzw.a)) {
/* 80 */       ceh2 = ceh2.a(bzw.a, ceh1.c(bzw.a));
/*    */     }
/* 82 */     return new ctb.c(c2.a, ceh2, c2.c);
/*    */   }
/*    */ 
/*    */   
/*    */   protected cta<?> a() {
/* 87 */     return cta.h;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\csc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */