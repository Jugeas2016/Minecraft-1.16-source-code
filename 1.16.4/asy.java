/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
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
/*     */ public class asy
/*     */   extends arv<aqn>
/*     */ {
/*     */   private int b;
/*     */   @Nullable
/*     */   private cxd c;
/*     */   @Nullable
/*     */   private fx d;
/*     */   private float e;
/*     */   
/*     */   public asy() {
/*  39 */     this(150, 250);
/*     */   }
/*     */   
/*     */   public asy(int ☃, int i) {
/*  43 */     super(
/*  44 */         (Map<ayd<?>, aye>)ImmutableMap.of(ayd.D, aye.c, ayd.t, aye.b, ayd.m, aye.a), ☃, i);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(aag ☃, aqn aqn1) {
/*  55 */     if (this.b > 0) {
/*  56 */       this.b--;
/*  57 */       return false;
/*     */     } 
/*     */     
/*  60 */     arf<?> arf = aqn1.cJ();
/*  61 */     ayf ayf = arf.<ayf>c(ayd.m).get();
/*     */     
/*  63 */     boolean bool = a(aqn1, ayf);
/*  64 */     if (!bool && a(aqn1, ayf, ☃.T())) {
/*  65 */       this.d = ayf.a().b();
/*  66 */       return true;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  71 */     arf.b(ayd.m);
/*  72 */     if (bool) {
/*  73 */       arf.b(ayd.D);
/*     */     }
/*  75 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(aag ☃, aqn aqn1, long l) {
/*  80 */     if (this.c == null || this.d == null) {
/*  81 */       return false;
/*     */     }
/*     */     
/*  84 */     Optional<ayf> optional = aqn1.cJ().c(ayd.m);
/*  85 */     ayj ayj = aqn1.x();
/*  86 */     return (!ayj.m() && optional.isPresent() && !a(aqn1, optional.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(aag ☃, aqn aqn1, long l) {
/*  91 */     if (aqn1.cJ().a(ayd.m) && !a(aqn1, aqn1.cJ().<ayf>c(ayd.m).get()) && aqn1.x().t())
/*     */     {
/*  93 */       this.b = ☃.u_().nextInt(40);
/*     */     }
/*     */     
/*  96 */     aqn1.x().o();
/*  97 */     aqn1.cJ().b(ayd.m);
/*  98 */     aqn1.cJ().b(ayd.t);
/*  99 */     this.c = null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(aag ☃, aqn aqn1, long l) {
/* 104 */     aqn1.cJ().a(ayd.t, this.c);
/* 105 */     aqn1.x().a(this.c, this.e);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void d(aag ☃, aqn aqn1, long l) {
/* 111 */     cxd cxd1 = aqn1.x().k();
/* 112 */     arf<?> arf = aqn1.cJ();
/* 113 */     if (this.c != cxd1) {
/* 114 */       this.c = cxd1;
/* 115 */       arf.a(ayd.t, cxd1);
/*     */     } 
/*     */     
/* 118 */     if (cxd1 == null || this.d == null) {
/*     */       return;
/*     */     }
/*     */     
/* 122 */     ayf ayf = arf.<ayf>c(ayd.m).get();
/*     */     
/* 124 */     if (ayf.a().b().j(this.d) > 4.0D && 
/* 125 */       a(aqn1, ayf, ☃.T())) {
/* 126 */       this.d = ayf.a().b();
/* 127 */       c(☃, aqn1, l);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean a(aqn ☃, ayf ayf1, long l) {
/* 134 */     fx fx1 = ayf1.a().b();
/* 135 */     this.c = ☃.x().a(fx1, 0);
/* 136 */     this.e = ayf1.b();
/*     */     
/* 138 */     arf<?> arf = ☃.cJ();
/* 139 */     if (a(☃, ayf1)) {
/* 140 */       arf.b(ayd.D);
/*     */     } else {
/* 142 */       boolean bool = (this.c != null && this.c.j());
/* 143 */       if (bool) {
/* 144 */         arf.b(ayd.D);
/* 145 */       } else if (!arf.a(ayd.D)) {
/* 146 */         arf.a(ayd.D, Long.valueOf(l));
/*     */       } 
/*     */       
/* 149 */       if (this.c != null) {
/* 150 */         return true;
/*     */       }
/*     */       
/* 153 */       dcn dcn = azj.b((aqu)☃, 10, 7, dcn.c(fx1));
/* 154 */       if (dcn != null) {
/* 155 */         this.c = ☃.x().a(dcn.b, dcn.c, dcn.d, 0);
/* 156 */         return (this.c != null);
/*     */       } 
/*     */     } 
/* 159 */     return false;
/*     */   }
/*     */   
/*     */   private boolean a(aqn ☃, ayf ayf1) {
/* 163 */     return (ayf1.a().b().k(☃.cB()) <= ayf1.c());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\asy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */