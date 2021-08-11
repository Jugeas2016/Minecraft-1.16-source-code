/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
/*     */ import java.util.function.Function;
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
/*     */ public class eik<T extends aqm, M extends dum<T>, A extends dum<T>>
/*     */   extends eit<T, M>
/*     */ {
/*  23 */   private static final Map<String, vk> a = Maps.newHashMap();
/*     */   private final A b;
/*     */   private final A c;
/*     */   
/*     */   public eik(egk<T, M> ☃, A a1, A a2) {
/*  28 */     super(☃);
/*  29 */     this.b = a1;
/*  30 */     this.c = a2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, eag eag1, int i, T t, float f1, float f2, float f3, float f4, float f5, float f6) {
/*  35 */     a(☃, eag1, t, aqf.e, i, a(aqf.e));
/*  36 */     a(☃, eag1, t, aqf.d, i, a(aqf.d));
/*  37 */     a(☃, eag1, t, aqf.c, i, a(aqf.c));
/*  38 */     a(☃, eag1, t, aqf.f, i, a(aqf.f));
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, eag eag1, T t, aqf aqf1, int i, A a) {
/*  42 */     bmb bmb = t.b(aqf1);
/*  43 */     if (!(bmb.b() instanceof bjy)) {
/*     */       return;
/*     */     }
/*     */     
/*  47 */     bjy bjy = (bjy)bmb.b();
/*  48 */     if (bjy.b() != aqf1) {
/*     */       return;
/*     */     }
/*     */     
/*  52 */     ((dum)aC_()).a((dum)a);
/*     */     
/*  54 */     a(a, aqf1);
/*     */     
/*  56 */     boolean bool1 = b(aqf1);
/*  57 */     boolean bool2 = bmb.u();
/*     */     
/*  59 */     if (bjy instanceof bkz) {
/*  60 */       int j = ((bkz)bjy).b(bmb);
/*  61 */       float f1 = (j >> 16 & 0xFF) / 255.0F;
/*  62 */       float f2 = (j >> 8 & 0xFF) / 255.0F;
/*  63 */       float f3 = (j & 0xFF) / 255.0F;
/*     */       
/*  65 */       a(☃, eag1, i, bjy, bool2, a, bool1, f1, f2, f3, null);
/*     */ 
/*     */       
/*  68 */       a(☃, eag1, i, bjy, bool2, a, bool1, 1.0F, 1.0F, 1.0F, "overlay");
/*     */     } else {
/*  70 */       a(☃, eag1, i, bjy, bool2, a, bool1, 1.0F, 1.0F, 1.0F, null);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(A ☃, aqf aqf1) {
/*  75 */     ☃.d_(false);
/*     */ 
/*     */     
/*  78 */     switch (null.a[aqf1.ordinal()]) {
/*     */       case 1:
/*  80 */         ((dum)☃).f.h = true;
/*  81 */         ((dum)☃).g.h = true;
/*     */         break;
/*     */       
/*     */       case 2:
/*  85 */         ((dum)☃).h.h = true;
/*  86 */         ((dum)☃).i.h = true;
/*  87 */         ((dum)☃).j.h = true;
/*     */         break;
/*     */       
/*     */       case 3:
/*  91 */         ((dum)☃).h.h = true;
/*  92 */         ((dum)☃).k.h = true;
/*  93 */         ((dum)☃).l.h = true;
/*     */         break;
/*     */       
/*     */       case 4:
/*  97 */         ((dum)☃).k.h = true;
/*  98 */         ((dum)☃).l.h = true;
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(dfm ☃, eag eag1, int i, bjy bjy1, boolean bool1, A a, boolean bool2, float f1, float f2, float f3, @Nullable String str) {
/* 105 */     dfq dfq = efo.a(eag1, eao.a(a(bjy1, bool2, str)), false, bool1);
/* 106 */     a.a(☃, dfq, i, ejw.a, f1, f2, f3, 1.0F);
/*     */   }
/*     */   
/*     */   private A a(aqf ☃) {
/* 110 */     return b(☃) ? this.b : this.c;
/*     */   }
/*     */   
/*     */   private boolean b(aqf ☃) {
/* 114 */     return (☃ == aqf.d);
/*     */   }
/*     */   
/*     */   private vk a(bjy ☃, boolean bool, @Nullable String str) {
/* 118 */     String str1 = "textures/models/armor/" + ☃.ab_().d() + "_layer_" + (bool ? 2 : 1) + ((str == null) ? "" : ("_" + str)) + ".png";
/* 119 */     return a.computeIfAbsent(str1, vk::new);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eik.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */