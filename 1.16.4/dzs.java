/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.Arrays;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.function.Function;
/*     */ import org.apache.commons.lang3.StringUtils;
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
/*     */ 
/*     */ 
/*     */ public class dzs
/*     */ {
/*     */   private static final cde[] b;
/*     */   
/*     */   static {
/*  48 */     b = (cde[])Arrays.<bkx>stream(bkx.values()).sorted(Comparator.comparingInt(bkx::b)).map(cde::new).toArray(☃ -> new cde[☃]);
/*  49 */   } private static final cde c = new cde(null);
/*     */   
/*  51 */   public static final dzs a = new dzs();
/*     */   
/*  53 */   private final ccn d = new ccn();
/*  54 */   private final ccn e = new cdn();
/*  55 */   private final ccv f = new ccv();
/*  56 */   private final cca g = new cca();
/*  57 */   private final ccf h = new ccf();
/*  58 */   private final ccq i = new ccq();
/*     */   
/*  60 */   private final dvo j = new dvo();
/*  61 */   private final dvz k = new dvz();
/*     */   
/*     */   public void a(bmb ☃, ebm.b b1, dfm dfm1, eag eag1, int i, int j) {
/*  64 */     blx blx = ☃.b();
/*     */     
/*  66 */     if (blx instanceof bkh) {
/*  67 */       ccj ccj; buo buo = ((bkh)blx).e();
/*  68 */       if (buo instanceof btq) {
/*  69 */         GameProfile gameProfile = null;
/*  70 */         if (☃.n()) {
/*  71 */           md md = ☃.o();
/*     */           
/*  73 */           if (md.c("SkullOwner", 10)) {
/*  74 */             gameProfile = mp.a(md.p("SkullOwner"));
/*  75 */           } else if (md.c("SkullOwner", 8) && !StringUtils.isBlank(md.l("SkullOwner"))) {
/*  76 */             gameProfile = new GameProfile(null, md.l("SkullOwner"));
/*  77 */             gameProfile = cdg.b(gameProfile);
/*  78 */             md.r("SkullOwner");
/*  79 */             md.a("SkullOwner", mp.a(new md(), gameProfile));
/*     */           } 
/*     */         } 
/*  82 */         eco.a(null, 180.0F, ((btq)buo).b(), gameProfile, 0.0F, dfm1, eag1, i);
/*     */         
/*     */         return;
/*     */       } 
/*  86 */       if (buo instanceof btm) {
/*  87 */         this.g.a(☃, ((btm)buo).b());
/*  88 */         ccj = this.g;
/*  89 */       } else if (buo instanceof buj) {
/*  90 */         this.h.a(((buj)buo).c());
/*  91 */         ccj = this.h;
/*  92 */       } else if (buo == bup.kW) {
/*  93 */         ccj = this.i;
/*  94 */       } else if (buo == bup.bR) {
/*  95 */         ccj = this.d;
/*  96 */       } else if (buo == bup.ek) {
/*  97 */         ccj = this.f;
/*  98 */       } else if (buo == bup.fr) {
/*  99 */         ccj = this.e;
/* 100 */       } else if (buo instanceof bzs) {
/* 101 */         bkx bkx = bzs.b(blx);
/* 102 */         if (bkx == null) {
/* 103 */           ccj = c;
/*     */         } else {
/* 105 */           ccj = b[bkx.b()];
/*     */         } 
/*     */       } else {
/*     */         return;
/*     */       } 
/* 110 */       ecd.a.a(ccj, dfm1, eag1, i, j);
/*     */       
/*     */       return;
/*     */     } 
/* 114 */     if (blx == bmd.qn) {
/* 115 */       boolean bool = (☃.b("BlockEntityTag") != null);
/*     */       
/* 117 */       dfm1.a();
/* 118 */       dfm1.a(1.0F, -1.0F, -1.0F);
/*     */       
/* 120 */       elr elr = bool ? els.g : els.h;
/*     */       
/* 122 */       dfq dfq = elr.c().a(efo.c(eag1, this.j.a(elr.a()), true, ☃.u()));
/* 123 */       this.j.b().a(dfm1, dfq, i, j, 1.0F, 1.0F, 1.0F, 1.0F);
/*     */       
/* 125 */       if (bool) {
/* 126 */         List<Pair<ccb, bkx>> list = cca.a(bmv.d(☃), cca.a(☃));
/* 127 */         ebz.a(dfm1, eag1, i, j, this.j.a(), elr, false, list, ☃.u());
/*     */       } else {
/* 129 */         this.j.a().a(dfm1, dfq, i, j, 1.0F, 1.0F, 1.0F, 1.0F);
/*     */       } 
/*     */       
/* 132 */       dfm1.b();
/* 133 */     } else if (blx == bmd.qM) {
/* 134 */       dfm1.a();
/* 135 */       dfm1.a(1.0F, -1.0F, -1.0F);
/*     */       
/* 137 */       dfq dfq = efo.c(eag1, this.k.a(dvz.a), false, ☃.u());
/* 138 */       this.k.a(dfm1, dfq, i, j, 1.0F, 1.0F, 1.0F, 1.0F);
/* 139 */       dfm1.b();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dzs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */