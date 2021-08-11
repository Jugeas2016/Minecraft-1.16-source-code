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
/*     */ public class cbb
/*     */   extends bxm
/*     */   implements bzu
/*     */ {
/*  29 */   public static final cey a = cex.u;
/*  30 */   public static final cfe<cff> b = cex.ab;
/*  31 */   public static final cey c = cex.w;
/*  32 */   public static final cey d = cex.C;
/*     */ 
/*     */   
/*  35 */   protected static final ddh e = buo.a(0.0D, 0.0D, 0.0D, 3.0D, 16.0D, 16.0D);
/*  36 */   protected static final ddh f = buo.a(13.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*  37 */   protected static final ddh g = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 3.0D);
/*  38 */   protected static final ddh h = buo.a(0.0D, 0.0D, 13.0D, 16.0D, 16.0D, 16.0D);
/*  39 */   protected static final ddh i = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D);
/*  40 */   protected static final ddh j = buo.a(0.0D, 13.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*     */   
/*     */   protected cbb(ceg.c ☃) {
/*  43 */     super(☃);
/*  44 */     j(((ceh)this.n.b()).a(aq, gc.c).a(a, Boolean.valueOf(false)).a(b, cff.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  49 */     if (!((Boolean)☃.c(a)).booleanValue()) {
/*  50 */       return (☃.c(b) == cff.a) ? j : i;
/*     */     }
/*     */     
/*  53 */     switch (null.a[((gc)☃.c(aq)).ordinal()])
/*     */     
/*     */     { default:
/*  56 */         return h;
/*     */       case 2:
/*  58 */         return g;
/*     */       case 3:
/*  60 */         return f;
/*     */       case 4:
/*  62 */         break; }  return e;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/*  68 */     switch (null.b[cxe1.ordinal()]) {
/*     */       case 1:
/*  70 */         return ((Boolean)☃.c(a)).booleanValue();
/*     */       case 2:
/*  72 */         return ((Boolean)☃.c(d)).booleanValue();
/*     */       case 3:
/*  74 */         return ((Boolean)☃.c(a)).booleanValue();
/*     */     } 
/*  76 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  82 */     if (this.as == cva.J) {
/*  83 */       return aou.c;
/*     */     }
/*     */     
/*  86 */     ☃ = ☃.a(a);
/*  87 */     brx1.a(fx1, ☃, 2);
/*     */     
/*  89 */     if (((Boolean)☃.c(d)).booleanValue()) {
/*  90 */       brx1.I().a(fx1, cuy.c, cuy.c.a(brx1));
/*     */     }
/*     */     
/*  93 */     a(bfw1, brx1, fx1, ((Boolean)☃.c(a)).booleanValue());
/*  94 */     return aou.a(brx1.v);
/*     */   }
/*     */   
/*     */   protected void a(@Nullable bfw ☃, brx brx1, fx fx1, boolean bool) {
/*  98 */     if (bool) {
/*  99 */       int i = (this.as == cva.J) ? 1037 : 1007;
/* 100 */       brx1.a(☃, i, fx1, 0);
/*     */     } else {
/* 102 */       int i = (this.as == cva.J) ? 1036 : 1013;
/* 103 */       brx1.a(☃, i, fx1, 0);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, buo buo1, fx fx2, boolean bool) {
/* 109 */     if (brx1.v) {
/*     */       return;
/*     */     }
/*     */     
/* 113 */     boolean bool1 = brx1.r(fx1);
/* 114 */     if (bool1 != ((Boolean)☃.c(c)).booleanValue()) {
/* 115 */       if (((Boolean)☃.c(a)).booleanValue() != bool1) {
/* 116 */         ☃ = ☃.a(a, Boolean.valueOf(bool1));
/* 117 */         a((bfw)null, brx1, fx1, bool1);
/*     */       } 
/* 119 */       brx1.a(fx1, ☃.a(c, Boolean.valueOf(bool1)), 2);
/*     */       
/* 121 */       if (((Boolean)☃.c(d)).booleanValue()) {
/* 122 */         brx1.I().a(fx1, cuy.c, cuy.c.a(brx1));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/* 129 */     ceh ceh = n();
/* 130 */     cux cux = ☃.p().b(☃.a());
/*     */     
/* 132 */     gc gc = ☃.j();
/* 133 */     if (☃.c() || !gc.n().d()) {
/* 134 */       ceh = ceh.a(aq, ☃.f().f()).a(b, (gc == gc.b) ? cff.b : cff.a);
/*     */     } else {
/* 136 */       ceh = ceh.a(aq, gc).a(b, ((☃.k()).c - ☃.a().v() > 0.5D) ? cff.a : cff.b);
/*     */     } 
/* 138 */     if (☃.p().r(☃.a())) {
/* 139 */       ceh = ceh.a(a, Boolean.valueOf(true)).a(c, Boolean.valueOf(true));
/*     */     }
/* 141 */     return ceh.a(d, Boolean.valueOf((cux.a() == cuy.c)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 146 */     ☃.a((cfj<?>[])new cfj[] { aq, a, b, c, d });
/*     */   }
/*     */ 
/*     */   
/*     */   public cux d(ceh ☃) {
/* 151 */     if (((Boolean)☃.c(d)).booleanValue()) {
/* 152 */       return cuy.c.a(false);
/*     */     }
/* 154 */     return super.d(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 159 */     if (((Boolean)☃.c(d)).booleanValue()) {
/* 160 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*     */     }
/*     */     
/* 163 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cbb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */