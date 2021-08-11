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
/*    */ public class bxn
/*    */   extends buo
/*    */ {
/* 15 */   public static final cey a = bys.a;
/* 16 */   public static final cey b = bys.b;
/* 17 */   public static final cey c = bys.c;
/* 18 */   public static final cey d = bys.d;
/* 19 */   public static final cey e = bys.e;
/* 20 */   public static final cey f = bys.f;
/*    */   
/* 22 */   private static final Map<gc, cey> g = bys.g;
/*    */   
/*    */   public bxn(ceg.c ☃) {
/* 25 */     super(☃);
/* 26 */     j(((ceh)this.n.b()).a(a, Boolean.valueOf(true)).a(b, Boolean.valueOf(true)).a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(true)).a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf(true)));
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(bny ☃) {
/* 31 */     brc brc = ☃.p();
/* 32 */     fx fx = ☃.a();
/*    */     
/* 34 */     return n()
/* 35 */       .a(f, Boolean.valueOf((this != brc.d_(fx.c()).b())))
/* 36 */       .a(e, Boolean.valueOf((this != brc.d_(fx.b()).b())))
/* 37 */       .a(a, Boolean.valueOf((this != brc.d_(fx.d()).b())))
/* 38 */       .a(b, Boolean.valueOf((this != brc.d_(fx.g()).b())))
/* 39 */       .a(c, Boolean.valueOf((this != brc.d_(fx.e()).b())))
/* 40 */       .a(d, Boolean.valueOf((this != brc.d_(fx.f()).b())));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 46 */     if (ceh1.a(this)) {
/* 47 */       return ☃.a(g.get(gc1), Boolean.valueOf(false));
/*    */     }
/* 49 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, bzm bzm1) {
/* 54 */     return ☃
/* 55 */       .a(g.get(bzm1.a(gc.c)), ☃.c(a))
/* 56 */       .a(g.get(bzm1.a(gc.d)), ☃.c(c))
/* 57 */       .a(g.get(bzm1.a(gc.f)), ☃.c(b))
/* 58 */       .a(g.get(bzm1.a(gc.e)), ☃.c(d))
/* 59 */       .a(g.get(bzm1.a(gc.b)), ☃.c(e))
/* 60 */       .a(g.get(bzm1.a(gc.a)), ☃.c(f));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, byg byg1) {
/* 66 */     return ☃
/* 67 */       .a(g.get(byg1.b(gc.c)), ☃.c(a))
/* 68 */       .a(g.get(byg1.b(gc.d)), ☃.c(c))
/* 69 */       .a(g.get(byg1.b(gc.f)), ☃.c(b))
/* 70 */       .a(g.get(byg1.b(gc.e)), ☃.c(d))
/* 71 */       .a(g.get(byg1.b(gc.b)), ☃.c(e))
/* 72 */       .a(g.get(byg1.b(gc.a)), ☃.c(f));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(cei.a<buo, ceh> ☃) {
/* 78 */     ☃.a((cfj<?>[])new cfj[] { e, f, a, b, c, d });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bxn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */