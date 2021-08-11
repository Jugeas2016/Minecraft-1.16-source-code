/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.stream.Collectors;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class asf<E extends aqm>
/*     */   extends arv<E>
/*     */ {
/*     */   private final Set<ayd<?>> b;
/*     */   private final a c;
/*     */   private final b d;
/*  25 */   private final aup<arv<? super E>> e = new aup<>();
/*     */   
/*     */   public asf(Map<ayd<?>, aye> ☃, Set<ayd<?>> set, a a1, b b1, List<Pair<arv<? super E>, Integer>> list) {
/*  28 */     super(☃);
/*  29 */     this.b = set;
/*  30 */     this.c = a1;
/*  31 */     this.d = b1;
/*  32 */     list.forEach(☃ -> this.e.a(☃.getFirst(), ((Integer)☃.getSecond()).intValue()));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean b(aag ☃, E e, long l) {
/*  38 */     return this.e.c()
/*  39 */       .filter(☃ -> (☃.a() == arv.a.b))
/*  40 */       .anyMatch(arv1 -> arv1.b(☃, aqm1, l));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(long ☃) {
/*  46 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(aag ☃, E e, long l) {
/*  51 */     this.c.a(this.e);
/*     */     
/*  53 */     this.d.a(this.e, ☃, e, l);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void d(aag ☃, E e, long l) {
/*  59 */     this.e.c()
/*  60 */       .filter(☃ -> (☃.a() == arv.a.b))
/*  61 */       .forEach(arv1 -> arv1.f(☃, aqm1, l));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void c(aag ☃, E e, long l) {
/*  67 */     this.e.c()
/*  68 */       .filter(☃ -> (☃.a() == arv.a.b))
/*  69 */       .forEach(arv1 -> arv1.g(☃, aqm1, l));
/*     */     
/*  71 */     this.b.forEach(e.cJ()::b);
/*     */   }
/*     */   
/*     */   enum a {
/*  75 */     a((String)(☃ -> { 
/*  76 */       })), b((String)aup::a);
/*     */     
/*     */     private final Consumer<aup<?>> c;
/*     */ 
/*     */     
/*     */     a(Consumer<aup<?>> ☃) {
/*  82 */       this.c = ☃;
/*     */     }
/*     */     
/*     */     public void a(aup<?> ☃) {
/*  86 */       this.c.accept(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   enum b {
/*  91 */     a
/*     */     {
/*     */       public <E extends aqm> void a(aup<arv<? super E>> ☃, aag aag1, E e, long l) {
/*  94 */         ☃.c()
/*  95 */           .filter(☃ -> (☃.a() == arv.a.a))
/*  96 */           .filter(arv1 -> arv1.e(☃, aqm1, l))
/*  97 */           .findFirst();
/*     */       }
/*     */     },
/* 100 */     b
/*     */     {
/*     */       public <E extends aqm> void a(aup<arv<? super E>> ☃, aag aag1, E e, long l) {
/* 103 */         ☃.c()
/* 104 */           .filter(☃ -> (☃.a() == arv.a.a))
/* 105 */           .forEach(arv1 -> arv1.e(☃, aqm1, l));
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */     
/*     */     public abstract <E extends aqm> void a(aup<arv<? super E>> param1aup, aag param1aag, E param1E, long param1Long);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 117 */     Set<? extends arv<? super E>> ☃ = (Set<? extends arv<? super E>>)this.e.c().filter(☃ -> (☃.a() == arv.a.b)).collect(Collectors.toSet());
/*     */     
/* 119 */     return "(" + getClass().getSimpleName() + "): " + ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\asf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */