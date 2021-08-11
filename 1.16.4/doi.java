/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class doi
/*     */ {
/*  37 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   public static <T extends bic> void a(@Nullable bje<T> ☃, djz djz1, int i, nr nr1) {
/*  40 */     if (☃ == null) {
/*  41 */       a.warn("Trying to open invalid screen with name: {}", nr1.getString());
/*     */       
/*     */       return;
/*     */     } 
/*  45 */     a<T, ?> a = a(☃);
/*  46 */     if (a == null) {
/*     */       
/*  48 */       a.warn("Failed to create screen for menu type: {}", gm.ac.b(☃));
/*     */       return;
/*     */     } 
/*  51 */     a.a(nr1, ☃, djz1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private static <T extends bic> a<T, ?> a(bje<T> ☃) {
/*  57 */     return (a<T, ?>)b.get(☃);
/*     */   }
/*     */   
/*     */   static interface a<T extends bic, U extends dot & dqq<T>> {
/*     */     default void a(nr ☃, bje<T> bje1, djz djz1, int i) {
/*  62 */       U u = create(bje1.a(i, djz1.s.bm), djz1.s.bm, ☃);
/*     */       
/*  64 */       djz1.s.bp = ((dqq<bic>)u).h();
/*  65 */       djz1.a((dot)u);
/*     */     }
/*     */     
/*     */     U create(T param1T, bfv param1bfv, nr param1nr);
/*     */   }
/*     */   
/*  71 */   private static final Map<bje<?>, a<?, ?>> b = Maps.newHashMap();
/*     */   
/*     */   private static <M extends bic, U extends dot & dqq<M>> void a(bje<? extends M> ☃, a<M, U> a1) {
/*  74 */     a<?, ?> a2 = b.put(☃, a1);
/*  75 */     if (a2 != null) {
/*  76 */       throw new IllegalStateException("Duplicate registration for " + gm.ac.b(☃));
/*     */     }
/*     */   }
/*     */   
/*     */   static {
/*  81 */     a(bje.a, dpz::new);
/*  82 */     a(bje.b, dpz::new);
/*  83 */     a(bje.c, dpz::new);
/*  84 */     a(bje.d, dpz::new);
/*  85 */     a(bje.e, dpz::new);
/*  86 */     a(bje.f, dpz::new);
/*     */     
/*  88 */     a(bje.g, dqd::new);
/*     */     
/*  90 */     a(bje.h, dpr::new);
/*  91 */     a(bje.i, dps::new);
/*  92 */     a(bje.j, dpt::new);
/*  93 */     a(bje.k, dpw::new);
/*  94 */     a(bje.l, dqa::new);
/*  95 */     a(bje.m, dqg::new);
/*  96 */     a(bje.n, dqh::new);
/*  97 */     a(bje.o, dqi::new);
/*  98 */     a(bje.p, dqj::new);
/*  99 */     a(bje.q, dqo::new);
/* 100 */     a(bje.r, dqp::new);
/* 101 */     a(bje.s, dqr::new);
/* 102 */     a(bje.t, dqu::new);
/* 103 */     a(bje.u, dqw::new);
/* 104 */     a(bje.v, dqx::new);
/* 105 */     a(bje.w, dpx::new);
/* 106 */     a(bje.x, dqy::new);
/*     */   }
/*     */   
/*     */   public static boolean a() {
/* 110 */     boolean ☃ = false;
/* 111 */     for (bje<?> bje : gm.ac) {
/* 112 */       if (!b.containsKey(bje)) {
/* 113 */         a.debug("Menu {} has no matching screen", gm.ac.b(bje));
/* 114 */         ☃ = true;
/*     */       } 
/*     */     } 
/* 117 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\doi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */