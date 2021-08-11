/*     */ import com.google.common.collect.Sets;
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
/*     */ 
/*     */ 
/*     */ public class eoa
/*     */   implements eof
/*     */ {
/*  23 */   private static final Set<buo> a = Sets.newHashSet((Object[])new buo[] { bup.J, bup.K, bup.L, bup.M, bup.N, bup.O, bup.mh, bup.mq, bup.V, bup.W, bup.X, bup.Y, bup.Z, bup.aa, bup.mj, bup.ms, bup.ah, bup.ai, bup.aj, bup.ak, bup.al, bup.am, bup.iK, bup.mn });
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
/*  50 */   private static final nr b = new of("tutorial.find_tree.title");
/*  51 */   private static final nr c = new of("tutorial.find_tree.description");
/*     */   
/*     */   private final eoe d;
/*     */   private dms e;
/*     */   private int f;
/*     */   
/*     */   public eoa(eoe ☃) {
/*  58 */     this.d = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  63 */     this.f++;
/*     */     
/*  65 */     if (this.d.f() != bru.b) {
/*  66 */       this.d.a(eog.f);
/*     */       
/*     */       return;
/*     */     } 
/*  70 */     if (this.f == 1) {
/*  71 */       dzm ☃ = (this.d.e()).s;
/*  72 */       if (☃ != null) {
/*  73 */         for (buo buo : a) {
/*  74 */           if (☃.bm.h(new bmb(buo))) {
/*  75 */             this.d.a(eog.e);
/*     */             return;
/*     */           } 
/*     */         } 
/*  79 */         if (a(☃)) {
/*  80 */           this.d.a(eog.e);
/*     */           
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } 
/*  86 */     if (this.f >= 6000 && 
/*  87 */       this.e == null) {
/*  88 */       this.e = new dms(dms.a.c, b, c, false);
/*  89 */       this.d.e().an().a(this.e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/*  96 */     if (this.e != null) {
/*  97 */       this.e.b();
/*  98 */       this.e = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dwt ☃, dcl dcl1) {
/* 104 */     if (dcl1.c() == dcl.a.b) {
/* 105 */       ceh ceh = ☃.d_(((dcj)dcl1).a());
/* 106 */       if (a.contains(ceh.b())) {
/* 107 */         this.d.a(eog.c);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bmb ☃) {
/* 114 */     for (buo buo : a) {
/* 115 */       if (☃.b() == buo.h()) {
/* 116 */         this.d.a(eog.e);
/*     */         return;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean a(dzm ☃) {
/* 123 */     for (buo buo : a) {
/* 124 */       if (☃.D().a(aea.a.b(buo)) > 0) {
/* 125 */         return true;
/*     */       }
/*     */     } 
/* 128 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eoa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */