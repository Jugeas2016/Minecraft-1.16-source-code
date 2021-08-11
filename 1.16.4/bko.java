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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bko
/*     */   extends blx
/*     */ {
/*     */   private final cuw a;
/*     */   
/*     */   public bko(cuw ☃, blx.a a1) {
/*  36 */     super(a1);
/*  37 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public aov<bmb> a(brx ☃, bfw bfw1, aot aot1) {
/*  42 */     bmb bmb = bfw1.b(aot1);
/*  43 */     dcl dcl = a(☃, bfw1, (this.a == cuy.a) ? brf.b.b : brf.b.a);
/*  44 */     if (dcl.c() == dcl.a.a) {
/*  45 */       return aov.c(bmb);
/*     */     }
/*     */     
/*  48 */     if (dcl.c() == dcl.a.b) {
/*  49 */       dcj dcj = (dcj)dcl;
/*  50 */       fx fx1 = dcj.a();
/*  51 */       gc gc = dcj.b();
/*  52 */       fx fx2 = fx1.a(gc);
/*     */       
/*  54 */       if (!☃.a(bfw1, fx1) || !bfw1.a(fx2, gc, bmb)) {
/*  55 */         return aov.d(bmb);
/*     */       }
/*     */       
/*  58 */       if (this.a == cuy.a) {
/*  59 */         ceh ceh1 = ☃.d_(fx1);
/*     */         
/*  61 */         if (ceh1.b() instanceof but) {
/*  62 */           cuw cuw1 = ((but)ceh1.b()).b(☃, fx1, ceh1);
/*  63 */           if (cuw1 != cuy.a) {
/*  64 */             bfw1.b(aea.c.b(this));
/*  65 */             bfw1.a(cuw1.a(aef.c) ? adq.bo : adq.bm, 1.0F, 1.0F);
/*  66 */             bmb bmb1 = bmc.a(bmb, bfw1, new bmb(cuw1.a()));
/*  67 */             if (!☃.v) {
/*  68 */               ac.j.a((aah)bfw1, new bmb(cuw1.a()));
/*     */             }
/*  70 */             return aov.a(bmb1, ☃.s_());
/*     */           } 
/*     */         } 
/*     */         
/*  74 */         return aov.d(bmb);
/*     */       } 
/*  76 */       ceh ceh = ☃.d_(fx1);
/*  77 */       fx fx3 = (ceh.b() instanceof byc && this.a == cuy.c) ? fx1 : fx2;
/*     */       
/*  79 */       if (a(bfw1, ☃, fx3, dcj)) {
/*  80 */         a(☃, bmb, fx3);
/*  81 */         if (bfw1 instanceof aah) {
/*  82 */           ac.y.a((aah)bfw1, fx3, bmb);
/*     */         }
/*  84 */         bfw1.b(aea.c.b(this));
/*  85 */         return aov.a(a(bmb, bfw1), ☃.s_());
/*     */       } 
/*  87 */       return aov.d(bmb);
/*     */     } 
/*     */ 
/*     */     
/*  91 */     return aov.c(bmb);
/*     */   }
/*     */   
/*     */   protected bmb a(bmb ☃, bfw bfw1) {
/*  95 */     if (!bfw1.bC.d) {
/*  96 */       return new bmb(bmd.lK);
/*     */     }
/*  98 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, bmb bmb1, fx fx1) {}
/*     */   
/*     */   public boolean a(@Nullable bfw ☃, brx brx1, fx fx1, @Nullable dcj dcj1) {
/* 105 */     if (!(this.a instanceof cuv)) {
/* 106 */       return false;
/*     */     }
/*     */     
/* 109 */     ceh ceh = brx1.d_(fx1);
/* 110 */     buo buo = ceh.b();
/* 111 */     cva cva = ceh.c();
/* 112 */     boolean bool1 = ceh.a(this.a);
/*     */ 
/*     */     
/* 115 */     boolean bool2 = (ceh.g() || bool1 || (buo instanceof byc && ((byc)buo).a(brx1, fx1, ceh, this.a)));
/*     */     
/* 117 */     if (!bool2)
/*     */     {
/*     */       
/* 120 */       return (dcj1 != null && a(☃, brx1, dcj1.a().a(dcj1.b()), null));
/*     */     }
/*     */     
/* 123 */     if (brx1.k().d() && this.a.a(aef.b)) {
/* 124 */       int i = fx1.u();
/* 125 */       int j = fx1.v();
/* 126 */       int k = fx1.w();
/*     */       
/* 128 */       brx1.a(☃, fx1, adq.ej, adr.e, 0.5F, 2.6F + (brx1.t.nextFloat() - brx1.t.nextFloat()) * 0.8F);
/*     */       
/* 130 */       for (int m = 0; m < 8; m++) {
/* 131 */         brx1.a(hh.L, i + Math.random(), j + Math.random(), k + Math.random(), 0.0D, 0.0D, 0.0D);
/*     */       }
/* 133 */       return true;
/*     */     } 
/*     */     
/* 136 */     if (buo instanceof byc && this.a == cuy.c) {
/* 137 */       ((byc)buo).a(brx1, fx1, ceh, ((cuv)this.a).a(false));
/* 138 */       a(☃, brx1, fx1);
/* 139 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 143 */     if (!brx1.v && bool1 && !cva.a()) {
/* 144 */       brx1.b(fx1, true);
/*     */     }
/*     */ 
/*     */     
/* 148 */     if (brx1.a(fx1, this.a.h().g(), 11) || ceh.m().b()) {
/* 149 */       a(☃, brx1, fx1);
/* 150 */       return true;
/*     */     } 
/*     */     
/* 153 */     return false;
/*     */   }
/*     */   
/*     */   protected void a(@Nullable bfw ☃, bry bry1, fx fx1) {
/* 157 */     adp adp = this.a.a(aef.c) ? adq.bl : adq.bj;
/* 158 */     bry1.a(☃, fx1, adp, adr.e, 1.0F, 1.0F);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bko.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */