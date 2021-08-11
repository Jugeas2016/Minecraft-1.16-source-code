/*    */ import com.google.common.base.Predicates;
/*    */ import java.util.function.Predicate;
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
/*    */ public final class aqd
/*    */ {
/* 17 */   public static final Predicate<aqa> a = aqa::aX; public static final Predicate<aqa> c; public static final Predicate<aqa> d; public static final Predicate<aqa> e;
/* 18 */   public static final Predicate<aqm> b = aqm::aX; public static final Predicate<aqa> f; public static final Predicate<aqa> g; static {
/* 19 */     c = (☃ -> (☃.aX() && !☃.bs() && !☃.br()));
/* 20 */     d = (☃ -> (☃ instanceof aon && ☃.aX()));
/* 21 */     e = (☃ -> (!(☃ instanceof bfw) || (!☃.a_() && !((bfw)☃).b_())));
/* 22 */     f = (☃ -> (!(☃ instanceof bfw) || (!☃.a_() && !((bfw)☃).b_() && ☃.l.ad() != aor.a)));
/* 23 */     g = (☃ -> !☃.a_());
/*    */   }
/*    */   
/*    */   public static class a implements Predicate<aqa> { private final bmb a;
/*    */     
/*    */     public a(bmb ☃) {
/* 29 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean a(@Nullable aqa ☃) {
/* 34 */       if (!☃.aX()) {
/* 35 */         return false;
/*    */       }
/* 37 */       if (!(☃ instanceof aqm)) {
/* 38 */         return false;
/*    */       }
/* 40 */       aqm aqm = (aqm)☃;
/* 41 */       return aqm.e(this.a);
/*    */     } }
/*    */ 
/*    */   
/*    */   public static Predicate<aqa> a(double ☃, double d1, double d2, double d3) {
/* 46 */     double d = d3 * d3;
/* 47 */     return aqa1 -> (aqa1 != null && aqa1.h(☃, d1, d2) <= d3);
/*    */   }
/*    */   
/*    */   public static Predicate<aqa> a(aqa ☃) {
/* 51 */     ddp ddp = ☃.bG();
/* 52 */     ddp.a a = (ddp == null) ? ddp.a.a : ddp.l();
/* 53 */     if (a == ddp.a.b) {
/* 54 */       return (Predicate<aqa>)Predicates.alwaysFalse();
/*    */     }
/* 56 */     return g.and(aqa1 -> {
/*    */           if (!aqa1.aU()) {
/*    */             return false;
/*    */           }
/*    */           if (☃.l.v && (!(aqa1 instanceof bfw) || !((bfw)aqa1).ez())) {
/*    */             return false;
/*    */           }
/*    */           ddp ddp2 = aqa1.bG();
/*    */           ddp.a a2 = (ddp2 == null) ? ddp.a.a : ddp2.l();
/*    */           if (a2 == ddp.a.b) {
/*    */             return false;
/*    */           }
/* 68 */           boolean bool = (ddp1 != null && ddp1.a(ddp2));
/* 69 */           return ((a1 == ddp.a.d || a2 == ddp.a.d) && bool) ? false : (
/*    */ 
/*    */             
/* 72 */             !((a1 == ddp.a.c || a2 == ddp.a.c) && !bool));
/*    */         });
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Predicate<aqa> b(aqa ☃) {
/* 80 */     return aqa1 -> {
/*    */         while (aqa1.br()) {
/*    */           aqa1 = aqa1.ct();
/*    */           if (aqa1 == ☃)
/*    */             return false; 
/*    */         } 
/*    */         return true;
/*    */       };
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aqd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */