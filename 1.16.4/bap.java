/*     */ import java.util.List;
/*     */ import java.util.function.Predicate;
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
/*     */ public class bap
/*     */   extends azw
/*     */ {
/*  31 */   private static final us<Integer> b = uv.a((Class)bap.class, uu.b);
/*     */   private int c;
/*     */   
/*     */   static {
/*  35 */     bo = (☃ -> (☃ == null) ? false : (
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  40 */       (☃ instanceof bfw && (☃.a_() || ((bfw)☃).b_())) ? false : ((☃.dC() != aqq.e))));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private int d;
/*     */ 
/*     */   
/*     */   private static final Predicate<aqm> bo;
/*     */ 
/*     */   
/*     */   public bap(aqe<? extends bap> ☃, brx brx1) {
/*  52 */     super((aqe)☃, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  57 */     super.e();
/*     */     
/*  59 */     this.R.a(b, Integer.valueOf(0));
/*     */   }
/*     */   
/*     */   public int eN() {
/*  63 */     return ((Integer)this.R.<Integer>a(b)).intValue();
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/*  67 */     this.R.b(b, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(us<?> ☃) {
/*  72 */     if (b.equals(☃)) {
/*  73 */       x_();
/*     */     }
/*     */     
/*  76 */     super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/*  81 */     super.b(☃);
/*     */     
/*  83 */     ☃.b("PuffState", eN());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/*  88 */     super.a(☃);
/*     */     
/*  90 */     b(☃.h("PuffState"));
/*     */   }
/*     */ 
/*     */   
/*     */   protected bmb eK() {
/*  95 */     return new bmb(bmd.lU);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/* 100 */     super.o();
/*     */     
/* 102 */     this.bk.a(1, new a(this));
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 107 */     if (!this.l.v && aX() && dS()) {
/* 108 */       if (this.c > 0) {
/*     */         
/* 110 */         if (eN() == 0) {
/* 111 */           a(adq.lS, dG(), dH());
/* 112 */           b(1);
/*     */         }
/* 114 */         else if (this.c > 40 && eN() == 1) {
/* 115 */           a(adq.lS, dG(), dH());
/* 116 */           b(2);
/*     */         } 
/*     */ 
/*     */         
/* 120 */         this.c++;
/* 121 */       } else if (eN() != 0) {
/*     */         
/* 123 */         if (this.d > 60 && eN() == 2) {
/* 124 */           a(adq.lR, dG(), dH());
/* 125 */           b(1);
/* 126 */         } else if (this.d > 100 && eN() == 1) {
/* 127 */           a(adq.lR, dG(), dH());
/* 128 */           b(0);
/*     */         } 
/*     */         
/* 131 */         this.d++;
/*     */       } 
/*     */     }
/* 134 */     super.j();
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 139 */     super.k();
/*     */     
/* 141 */     if (aX() && eN() > 0) {
/* 142 */       List<aqn> ☃ = (List)this.l.a((Class)aqn.class, cc().g(0.3D), bo);
/* 143 */       for (aqn aqn : ☃) {
/* 144 */         if (aqn.aX()) {
/* 145 */           a(aqn);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(aqn ☃) {
/* 152 */     int i = eN();
/* 153 */     if (☃.a(apk.c(this), (1 + i))) {
/* 154 */       ☃.c(new apu(apw.s, 60 * i, 0));
/* 155 */       a(adq.lW, 1.0F, 1.0F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a_(bfw ☃) {
/* 161 */     int i = eN();
/* 162 */     if (☃ instanceof aah && i > 0 && 
/* 163 */       ☃.a(apk.c(this), (1 + i))) {
/* 164 */       if (!aA()) {
/* 165 */         ((aah)☃).b.a(new pq(pq.j, 0.0F));
/*     */       }
/* 167 */       ☃.c(new apu(apw.s, 60 * i, 0));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 174 */     return adq.lQ;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 179 */     return adq.lT;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 184 */     return adq.lV;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp eM() {
/* 189 */     return adq.lU;
/*     */   }
/*     */ 
/*     */   
/*     */   public aqb a(aqx ☃) {
/* 194 */     return super.a(☃).a(s(eN()));
/*     */   }
/*     */   
/*     */   private static float s(int ☃) {
/* 198 */     switch (☃) {
/*     */       case 1:
/* 200 */         return 0.7F;
/*     */       case 0:
/* 202 */         return 0.5F;
/*     */     } 
/* 204 */     return 1.0F;
/*     */   }
/*     */   
/*     */   static class a
/*     */     extends avv {
/*     */     private final bap a;
/*     */     
/*     */     public a(bap ☃) {
/* 212 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 217 */       List<aqm> ☃ = this.a.l.a(aqm.class, this.a.cc().g(2.0D), bap.eO());
/*     */       
/* 219 */       return !☃.isEmpty();
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 224 */       bap.a(this.a, 1);
/* 225 */       bap.b(this.a, 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 230 */       bap.a(this.a, 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 235 */       List<aqm> ☃ = this.a.l.a(aqm.class, this.a.cc().g(2.0D), bap.eO());
/*     */       
/* 237 */       return !☃.isEmpty();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */