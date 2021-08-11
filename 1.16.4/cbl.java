/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class cbl
/*     */   extends bzt
/*     */ {
/*  24 */   public static final cfb c = bxm.aq;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  30 */   private static final Map<gc, ddh> d = Maps.newEnumMap((Map)ImmutableMap.of(gc.c, 
/*  31 */         buo.a(0.0D, 4.5D, 14.0D, 16.0D, 12.5D, 16.0D), gc.d, 
/*  32 */         buo.a(0.0D, 4.5D, 0.0D, 16.0D, 12.5D, 2.0D), gc.f, 
/*  33 */         buo.a(0.0D, 4.5D, 0.0D, 2.0D, 12.5D, 16.0D), gc.e, 
/*  34 */         buo.a(14.0D, 4.5D, 0.0D, 16.0D, 12.5D, 16.0D)));
/*     */ 
/*     */   
/*     */   public cbl(ceg.c ☃, cfq cfq1) {
/*  38 */     super(☃, cfq1);
/*  39 */     j(((ceh)this.n.b()).a(c, gc.c).a(a, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public String i() {
/*  44 */     return h().a();
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  49 */     return d.get(☃.c(c));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/*  54 */     return brz1.d_(fx1.a(((gc)☃.c(c)).f())).c().b();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ceh a(bny ☃) {
/*  60 */     ceh ceh = n();
/*  61 */     cux cux = ☃.p().b(☃.a());
/*     */     
/*  63 */     brz brz = ☃.p();
/*  64 */     fx fx = ☃.a();
/*     */     
/*  66 */     gc[] arrayOfGc = ☃.e();
/*  67 */     for (gc gc : arrayOfGc) {
/*  68 */       if (gc.n().d()) {
/*     */ 
/*     */ 
/*     */         
/*  72 */         gc gc1 = gc.f();
/*     */         
/*  74 */         ceh = ceh.a(c, gc1);
/*  75 */         if (ceh.a(brz, fx)) {
/*  76 */           return ceh.a(a, Boolean.valueOf((cux.a() == cuy.c)));
/*     */         }
/*     */       } 
/*     */     } 
/*  80 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  85 */     if (gc1.f() == ☃.c(c) && !☃.a(bry1, fx1)) {
/*  86 */       return bup.a.n();
/*     */     }
/*  88 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/*  93 */     return ☃.a(c, bzm1.a((gc)☃.c(c)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/*  98 */     return ☃.a(byg1.a((gc)☃.c(c)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 103 */     ☃.a((cfj<?>[])new cfj[] { c, a });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cbl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */