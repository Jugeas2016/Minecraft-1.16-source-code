/*     */ import java.util.Optional;
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
/*     */ public class bkq
/*     */   extends blx
/*     */   implements bno
/*     */ {
/*  24 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bkq(blx.a ☃) {
/*  31 */     super(☃);
/*     */   }
/*     */   
/*     */   public static boolean d(bmb ☃) {
/*  35 */     md md = ☃.o();
/*  36 */     return (md != null && (md.e("LodestoneDimension") || md.e("LodestonePos")));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e(bmb ☃) {
/*  41 */     return (d(☃) || super.e(☃));
/*     */   }
/*     */   
/*     */   public static Optional<vj<brx>> a(md ☃) {
/*  45 */     return brx.f.parse(mo.a, ☃.c("LodestoneDimension")).result();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bmb ☃, brx brx1, aqa aqa1, int i, boolean bool) {
/*  50 */     if (brx1.v) {
/*     */       return;
/*     */     }
/*     */     
/*  54 */     if (d(☃)) {
/*  55 */       md md = ☃.p();
/*  56 */       if (md.e("LodestoneTracked") && !md.q("LodestoneTracked")) {
/*     */         return;
/*     */       }
/*     */       
/*  60 */       Optional<vj<brx>> optional = a(md);
/*  61 */       if (optional.isPresent() && optional.get() == brx1.Y() && md.e("LodestonePos") && 
/*  62 */         !((aag)brx1).y().a(azr.w, mp.b(md.p("LodestonePos")))) {
/*  63 */         md.r("LodestonePos");
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aou a(boa ☃) {
/*  71 */     fx fx = ☃.a();
/*  72 */     brx brx = ☃.p();
/*     */     
/*  74 */     if (brx.d_(fx).a(bup.no)) {
/*  75 */       brx.a((bfw)null, fx, adq.hu, adr.h, 1.0F, 1.0F);
/*     */       
/*  77 */       bfw bfw = ☃.n();
/*  78 */       bmb bmb = ☃.m();
/*  79 */       boolean bool = (!bfw.bC.d && bmb.E() == 1);
/*     */       
/*  81 */       if (bool) {
/*  82 */         a(brx.Y(), fx, bmb.p());
/*     */       } else {
/*  84 */         bmb bmb1 = new bmb(bmd.mh, 1);
/*  85 */         md md = bmb.n() ? bmb.o().g() : new md();
/*  86 */         bmb1.c(md);
/*  87 */         if (!bfw.bC.d) {
/*  88 */           bmb.g(1);
/*     */         }
/*  90 */         a(brx.Y(), fx, md);
/*  91 */         if (!bfw.bm.e(bmb1)) {
/*  92 */           bfw.a(bmb1, false);
/*     */         }
/*     */       } 
/*     */       
/*  96 */       return aou.a(brx.v);
/*     */     } 
/*  98 */     return super.a(☃);
/*     */   }
/*     */   
/*     */   private void a(vj<brx> ☃, fx fx1, md md1) {
/* 102 */     md1.a("LodestonePos", mp.a(fx1));
/* 103 */     brx.f.encodeStart(mo.a, ☃).resultOrPartial(a::error).ifPresent(mt1 -> ☃.a("LodestoneDimension", mt1));
/* 104 */     md1.a("LodestoneTracked", true);
/*     */   }
/*     */ 
/*     */   
/*     */   public String f(bmb ☃) {
/* 109 */     return d(☃) ? "item.minecraft.lodestone_compass" : super.f(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bkq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */