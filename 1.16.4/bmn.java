/*     */ import java.util.List;
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
/*     */ public class bmn
/*     */   extends blx
/*     */ {
/*     */   public bmn(blx.a ☃) {
/*  26 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb r() {
/*  31 */     return bnv.a(super.r(), bnw.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(bmb ☃, brx brx1, aqm aqm1) {
/*  36 */     bfw bfw = (aqm1 instanceof bfw) ? (bfw)aqm1 : null;
/*     */     
/*  38 */     if (bfw instanceof aah) {
/*  39 */       ac.z.a((aah)bfw, ☃);
/*     */     }
/*  41 */     if (!brx1.v) {
/*  42 */       List<apu> list = bnv.a(☃);
/*  43 */       for (apu apu : list) {
/*  44 */         if (apu.a().a()) {
/*  45 */           apu.a().a(bfw, bfw, aqm1, apu.c(), 1.0D); continue;
/*     */         } 
/*  47 */         aqm1.c(new apu(apu));
/*     */       } 
/*     */     } 
/*     */     
/*  51 */     if (bfw != null) {
/*  52 */       bfw.b(aea.c.b(this));
/*  53 */       if (!bfw.bC.d) {
/*  54 */         ☃.g(1);
/*     */       }
/*     */     } 
/*     */     
/*  58 */     if (bfw == null || !bfw.bC.d) {
/*  59 */       if (☃.a())
/*  60 */         return new bmb(bmd.nw); 
/*  61 */       if (bfw != null) {
/*  62 */         bfw.bm.e(new bmb(bmd.nw));
/*     */       }
/*     */     } 
/*     */     
/*  66 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int e_(bmb ☃) {
/*  71 */     return 32;
/*     */   }
/*     */ 
/*     */   
/*     */   public bnn d_(bmb ☃) {
/*  76 */     return bnn.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public aov<bmb> a(brx ☃, bfw bfw1, aot aot1) {
/*  81 */     return bmc.a(☃, bfw1, aot1);
/*     */   }
/*     */ 
/*     */   
/*     */   public String f(bmb ☃) {
/*  86 */     return bnv.d(☃).b(a() + ".effect.");
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bmb ☃, @Nullable brx brx1, List<nr> list, bnl bnl1) {
/*  91 */     bnv.a(☃, list, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e(bmb ☃) {
/*  96 */     return (super.e(☃) || !bnv.a(☃).isEmpty());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bks ☃, gj<bmb> gj1) {
/* 101 */     if (a(☃))
/* 102 */       for (bnt bnt : gm.U) {
/* 103 */         if (bnt != bnw.a)
/* 104 */           gj1.add(bnv.a(new bmb(this), bnt)); 
/*     */       }  
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bmn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */