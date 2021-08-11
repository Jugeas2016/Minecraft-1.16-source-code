/*     */ import java.util.Collection;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bku
/*     */   extends blx
/*     */ {
/*     */   public bku(blx.a ☃) {
/*  27 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e(bmb ☃) {
/*  32 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brx brx1, fx fx1, bfw bfw1) {
/*  37 */     if (!brx1.v) {
/*  38 */       a(bfw1, ☃, brx1, fx1, false, bfw1.b(aot.a));
/*     */     }
/*     */     
/*  41 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(boa ☃) {
/*  46 */     bfw bfw = ☃.n();
/*  47 */     brx brx = ☃.p();
/*     */     
/*  49 */     if (!brx.v && bfw != null) {
/*  50 */       fx fx = ☃.a();
/*  51 */       a(bfw, brx.d_(fx), brx, fx, true, ☃.m());
/*     */     } 
/*     */     
/*  54 */     return aou.a(brx.v);
/*     */   }
/*     */   
/*     */   private void a(bfw ☃, ceh ceh1, bry bry1, fx fx1, boolean bool, bmb bmb1) {
/*  58 */     if (!☃.eV()) {
/*     */       return;
/*     */     }
/*     */     
/*  62 */     buo buo = ceh1.b();
/*  63 */     cei<buo, ceh> cei = buo.m();
/*  64 */     Collection<cfj<?>> collection = cei.d();
/*     */     
/*  66 */     String str1 = gm.Q.b(buo).toString();
/*  67 */     if (collection.isEmpty()) {
/*  68 */       a(☃, new of(a() + ".empty", new Object[] { str1 }));
/*     */       
/*     */       return;
/*     */     } 
/*  72 */     md md = bmb1.a("DebugProperty");
/*  73 */     String str2 = md.l(str1);
/*     */     
/*  75 */     cfj<?> cfj = cei.a(str2);
/*  76 */     if (bool) {
/*  77 */       if (cfj == null) {
/*  78 */         cfj = collection.iterator().next();
/*     */       }
/*     */       
/*  81 */       ceh ceh2 = a(ceh1, cfj, ☃.eq());
/*  82 */       bry1.a(fx1, ceh2, 18);
/*  83 */       a(☃, new of(a() + ".update", new Object[] { cfj.f(), a(ceh2, cfj) }));
/*     */     } else {
/*  85 */       cfj = a((Iterable)collection, cfj, ☃.eq());
/*     */       
/*  87 */       String str = cfj.f();
/*  88 */       md.a(str1, str);
/*  89 */       a(☃, new of(a() + ".select", new Object[] { str, a(ceh1, cfj) }));
/*     */     } 
/*     */   }
/*     */   
/*     */   private static <T extends Comparable<T>> ceh a(ceh ☃, cfj<T> cfj1, boolean bool) {
/*  94 */     return ☃.a(cfj1, a(cfj1.a(), ☃.c(cfj1), bool));
/*     */   }
/*     */   
/*     */   private static <T> T a(Iterable<T> ☃, @Nullable T t, boolean bool) {
/*  98 */     return bool ? x.<T>b(☃, t) : x.<T>a(☃, t);
/*     */   }
/*     */   
/*     */   private static void a(bfw ☃, nr nr1) {
/* 102 */     ((aah)☃).a(nr1, no.c, x.b);
/*     */   }
/*     */   
/*     */   private static <T extends Comparable<T>> String a(ceh ☃, cfj<T> cfj1) {
/* 106 */     return cfj1.a((T)☃.c(cfj1));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bku.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */