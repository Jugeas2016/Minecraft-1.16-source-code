/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
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
/*     */ public class bmw
/*     */   extends bkv
/*     */ {
/*  24 */   private static final Set<buo> c = Sets.newHashSet((Object[])new buo[] { bup.cG, bup.j, bup.k, bup.l, bup.bX, bup.i, bup.E, bup.dT, bup.C, bup.D, bup.cE, bup.cC, bup.cM, bup.iE, bup.jM, bup.jN, bup.jO, bup.jP, bup.jQ, bup.jR, bup.jS, bup.jT, bup.jU, bup.jV, bup.jW, bup.jX, bup.jY, bup.jZ, bup.ka, bup.kb, bup.cN });
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  58 */   protected static final Map<buo, ceh> a = Maps.newHashMap((Map)ImmutableMap.of(bup.i, bup.iE
/*  59 */         .n()));
/*     */ 
/*     */   
/*     */   public bmw(bnh ☃, float f1, float f2, blx.a a1) {
/*  63 */     super(f1, f2, ☃, c, a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(ceh ☃) {
/*  68 */     return (☃.a(bup.cC) || ☃.a(bup.cE));
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(boa ☃) {
/*  73 */     brx brx = ☃.p();
/*  74 */     fx fx = ☃.a();
/*     */     
/*  76 */     ceh ceh = brx.d_(fx);
/*  77 */     if (☃.j() != gc.a) {
/*  78 */       bfw bfw = ☃.n();
/*  79 */       ceh ceh1 = a.get(ceh.b());
/*  80 */       ceh ceh2 = null;
/*     */       
/*  82 */       if (ceh1 != null && brx.d_(fx.b()).g()) {
/*  83 */         brx.a(bfw, fx, adq.nb, adr.e, 1.0F, 1.0F);
/*  84 */         ceh2 = ceh1;
/*  85 */       } else if (ceh.b() instanceof buy && ((Boolean)ceh.c(buy.b)).booleanValue()) {
/*  86 */         if (!brx.s_()) {
/*  87 */           brx.a((bfw)null, 1009, fx, 0);
/*     */         }
/*  89 */         buy.c(brx, fx, ceh);
/*  90 */         ceh2 = ceh.a(buy.b, Boolean.valueOf(false));
/*     */       } 
/*     */       
/*  93 */       if (ceh2 != null) {
/*  94 */         if (!brx.v) {
/*  95 */           brx.a(fx, ceh2, 11);
/*  96 */           if (bfw != null) {
/*  97 */             ☃.m().a(1, bfw, bfw1 -> bfw1.d(☃.o()));
/*     */           }
/*     */         } 
/* 100 */         return aou.a(brx.v);
/*     */       } 
/* 102 */       return aou.c;
/*     */     } 
/*     */     
/* 105 */     return aou.c;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bmw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */