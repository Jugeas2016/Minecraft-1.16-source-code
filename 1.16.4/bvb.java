/*     */ import java.util.function.Predicate;
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
/*     */ public class bvb
/*     */   extends bxm
/*     */   implements bnq
/*     */ {
/*  28 */   public static final cfb a = bxm.aq;
/*     */   
/*     */   @Nullable
/*     */   private cem b;
/*     */   
/*     */   @Nullable
/*     */   private cem c;
/*     */   
/*     */   @Nullable
/*     */   private cem d;
/*     */   @Nullable
/*     */   private cem e;
/*     */   private static final Predicate<ceh> f;
/*     */   
/*     */   protected bvb(ceg.c ☃) {
/*  43 */     super(☃);
/*  44 */     j(((ceh)this.n.b()).a(a, gc.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/*  49 */     if (ceh1.a(☃.b())) {
/*     */       return;
/*     */     }
/*  52 */     a(brx1, fx1);
/*     */   }
/*     */   
/*     */   public boolean a(brz ☃, fx fx1) {
/*  56 */     return (c().a(☃, fx1) != null || e().a(☃, fx1) != null);
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1) {
/*  60 */     cem.b b = d().a(☃, fx1);
/*  61 */     if (b != null) {
/*  62 */       for (int i = 0; i < d().b(); i++) {
/*  63 */         cel cel = b.a(0, i, 0);
/*  64 */         ☃.a(cel.d(), bup.a.n(), 2);
/*  65 */         ☃.c(2001, cel.d(), buo.i(cel.a()));
/*     */       } 
/*     */       
/*  68 */       bau bau = aqe.az.a(☃);
/*  69 */       fx fx2 = b.a(0, 2, 0).d();
/*  70 */       bau.b(fx2.u() + 0.5D, fx2.v() + 0.05D, fx2.w() + 0.5D, 0.0F, 0.0F);
/*  71 */       ☃.c(bau);
/*     */       
/*  73 */       for (aah aah : ☃.<aah>a(aah.class, bau.cc().g(5.0D))) {
/*  74 */         ac.n.a(aah, bau);
/*     */       }
/*     */       
/*  77 */       for (int j = 0; j < d().b(); j++) {
/*  78 */         cel cel = b.a(0, j, 0);
/*  79 */         ☃.a(cel.d(), bup.a);
/*     */       } 
/*     */     } else {
/*  82 */       b = t().a(☃, fx1);
/*  83 */       if (b != null) {
/*  84 */         for (int i = 0; i < t().c(); i++) {
/*  85 */           for (int k = 0; k < t().b(); k++) {
/*  86 */             cel cel = b.a(i, k, 0);
/*  87 */             ☃.a(cel.d(), bup.a.n(), 2);
/*  88 */             ☃.c(2001, cel.d(), buo.i(cel.a()));
/*     */           } 
/*     */         } 
/*     */         
/*  92 */         fx fx2 = b.a(1, 2, 0).d();
/*     */         
/*  94 */         bai bai = aqe.K.a(☃);
/*  95 */         bai.u(true);
/*  96 */         bai.b(fx2.u() + 0.5D, fx2.v() + 0.05D, fx2.w() + 0.5D, 0.0F, 0.0F);
/*  97 */         ☃.c(bai);
/*     */         
/*  99 */         for (aah aah : ☃.<aah>a(aah.class, bai.cc().g(5.0D))) {
/* 100 */           ac.n.a(aah, bai);
/*     */         }
/*     */         
/* 103 */         for (int j = 0; j < t().c(); j++) {
/* 104 */           for (int k = 0; k < t().b(); k++) {
/* 105 */             cel cel = b.a(j, k, 0);
/* 106 */             ☃.a(cel.d(), bup.a);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/* 115 */     return n().a(a, ☃.f().f());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 120 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */   static {
/* 123 */     f = (☃ -> (☃ != null && (☃.a(bup.cU) || ☃.a(bup.cV))));
/*     */   }
/*     */   private cem c() {
/* 126 */     if (this.b == null) {
/* 127 */       this
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 134 */         .b = cen.a().a(new String[] { " ", "#", "#" }).a('#', cel.a(cer.a(bup.cE))).b();
/*     */     }
/*     */     
/* 137 */     return this.b;
/*     */   }
/*     */   
/*     */   private cem d() {
/* 141 */     if (this.c == null) {
/* 142 */       this
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 150 */         .c = cen.a().a(new String[] { "^", "#", "#" }).a('^', cel.a(f)).a('#', cel.a(cer.a(bup.cE))).b();
/*     */     }
/*     */     
/* 153 */     return this.c;
/*     */   }
/*     */   
/*     */   private cem e() {
/* 157 */     if (this.d == null) {
/* 158 */       this
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 166 */         .d = cen.a().a(new String[] { "~ ~", "###", "~#~" }).a('#', cel.a(cer.a(bup.bF))).a('~', cel.a(cep.a(cva.a))).b();
/*     */     }
/*     */     
/* 169 */     return this.d;
/*     */   }
/*     */   
/*     */   private cem t() {
/* 173 */     if (this.e == null) {
/* 174 */       this
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 183 */         .e = cen.a().a(new String[] { "~^~", "###", "~#~" }).a('^', cel.a(f)).a('#', cel.a(cer.a(bup.bF))).a('~', cel.a(cep.a(cva.a))).b();
/*     */     }
/*     */     
/* 186 */     return this.e;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bvb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */