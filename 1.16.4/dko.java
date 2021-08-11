/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
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
/*     */ 
/*     */ 
/*     */ public class dko
/*     */ {
/*  30 */   private final gh<dkn> a = new gh<>(32);
/*  31 */   private final Map<buo, Set<cfj<?>>> b = Maps.newHashMap();
/*     */   
/*     */   public static dko a() {
/*  34 */     dko ☃ = new dko();
/*     */     
/*  36 */     ☃.a((☃, bra1, fx1, i) -> 
/*  37 */         (bra1 == null || fx1 == null) ? -1 : dzr.a(bra1, (☃.c(bwd.a) == cfd.a) ? fx1.c() : fx1), new buo[] { bup.gZ, bup.gY });
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  42 */     ☃.a(bwd.a, new buo[] { bup.gZ, bup.gY });
/*     */     
/*  44 */     ☃.a((☃, bra1, fx1, i) -> 
/*  45 */         (bra1 == null || fx1 == null) ? brv.a(0.5D, 1.0D) : dzr.a(bra1, fx1), new buo[] { bup.i, bup.aS, bup.aR, bup.eC });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  51 */     ☃.a((☃, bra1, fx1, i) -> brr.a(), new buo[] { bup.ai });
/*  52 */     ☃.a((☃, bra1, fx1, i) -> brr.b(), new buo[] { bup.aj });
/*     */     
/*  54 */     ☃.a((☃, bra1, fx1, i) -> 
/*  55 */         (bra1 == null || fx1 == null) ? brr.c() : dzr.b(bra1, fx1), new buo[] { bup.ah, bup.ak, bup.al, bup.am, bup.dP });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  61 */     ☃.a((☃, bra1, fx1, i) -> 
/*  62 */         (bra1 == null || fx1 == null) ? -1 : dzr.c(bra1, fx1), new buo[] { bup.A, bup.lc, bup.eb });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  68 */     ☃.a((☃, bra1, fx1, i) -> bzd.b(((Integer)☃.c(bzd.e)).intValue()), new buo[] { bup.bS });
/*  69 */     ☃.a(bzd.e, new buo[] { bup.bS });
/*     */     
/*  71 */     ☃.a((☃, bra1, fx1, i) -> 
/*  72 */         (bra1 == null || fx1 == null) ? -1 : dzr.a(bra1, fx1), new buo[] { bup.cH });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  78 */     ☃.a((☃, bra1, fx1, i) -> 14731036, new buo[] { bup.dM, bup.dL });
/*     */     
/*  80 */     ☃.a((☃, bra1, fx1, i) -> { int j = ((Integer)☃.c(cam.a)).intValue(); int k = j * 32; int m = 255 - j * 8; int n = j * 4; return k << 16 | m << 8 | n; }new buo[] { bup.dO, bup.dN });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  87 */     ☃.a(cam.a, new buo[] { bup.dO, bup.dN });
/*     */     
/*  89 */     ☃.a((☃, bra1, fx1, i) -> 
/*  90 */         (bra1 == null || fx1 == null) ? 7455580 : 2129968, new buo[] { bup.dU });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  96 */     return ☃;
/*     */   }
/*     */   
/*     */   public int a(ceh ☃, brx brx1, fx fx1) {
/* 100 */     dkn dkn = this.a.a(gm.Q.a(☃.b()));
/*     */     
/* 102 */     if (dkn != null) {
/* 103 */       return dkn.getColor(☃, null, null, 0);
/*     */     }
/*     */     
/* 106 */     cvb cvb = ☃.d(brx1, fx1);
/* 107 */     return (cvb != null) ? cvb.ai : -1;
/*     */   }
/*     */   
/*     */   public int a(ceh ☃, @Nullable bra bra1, @Nullable fx fx1, int i) {
/* 111 */     dkn dkn = this.a.a(gm.Q.a(☃.b()));
/* 112 */     return (dkn == null) ? -1 : dkn.getColor(☃, bra1, fx1, i);
/*     */   }
/*     */   
/*     */   public void a(dkn ☃, buo... arrayOfBuo) {
/* 116 */     for (buo buo1 : arrayOfBuo) {
/* 117 */       this.a.a(☃, gm.Q.a(buo1));
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(Set<cfj<?>> ☃, buo... arrayOfBuo) {
/* 122 */     for (buo buo1 : arrayOfBuo) {
/* 123 */       this.b.put(buo1, ☃);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(cfj<?> ☃, buo... arrayOfBuo) {
/* 128 */     a((Set<cfj<?>>)ImmutableSet.of(☃), arrayOfBuo);
/*     */   }
/*     */   
/*     */   public Set<cfj<?>> a(buo ☃) {
/* 132 */     return (Set<cfj<?>>)this.b.getOrDefault(☃, ImmutableSet.of());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dko.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */