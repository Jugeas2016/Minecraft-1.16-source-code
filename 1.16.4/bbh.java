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
/*     */ public class bbh
/*     */   extends bbb
/*     */ {
/*  25 */   private final bbi bw = new bbi(this);
/*     */   
/*     */   private boolean bx;
/*     */   
/*     */   private int by;
/*     */   
/*     */   public bbh(aqe<? extends bbh> ☃, brx brx1) {
/*  32 */     super((aqe)☃, brx1);
/*     */   }
/*     */   
/*     */   public static ark.a eL() {
/*  36 */     return fi()
/*  37 */       .a(arl.a, 15.0D)
/*  38 */       .a(arl.d, 0.20000000298023224D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void eK() {
/*  43 */     a(arl.m).a(fq());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void eV() {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected adp I() {
/*  53 */     super.I();
/*  54 */     if (a(aef.b)) {
/*  55 */       return adq.ny;
/*     */     }
/*  57 */     return adq.nu;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected adp dq() {
/*  63 */     super.dq();
/*  64 */     return adq.nv;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/*  69 */     super.e(☃);
/*  70 */     return adq.nw;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp av() {
/*  75 */     if (this.t) {
/*  76 */       if (bs()) {
/*  77 */         this.bv++;
/*  78 */         if (this.bv > 5 && this.bv % 3 == 0)
/*  79 */           return adq.nz; 
/*  80 */         if (this.bv <= 5) {
/*  81 */           return adq.nB;
/*     */         }
/*     */       } else {
/*  84 */         return adq.nB;
/*     */       } 
/*     */     }
/*  87 */     return adq.nx;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void d(float ☃) {
/*  92 */     if (this.t) {
/*  93 */       super.d(0.3F);
/*     */     } else {
/*  95 */       super.d(Math.min(0.1F, ☃ * 25.0F));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fn() {
/* 101 */     if (aE()) {
/* 102 */       a(adq.nA, 0.4F, 1.0F);
/*     */     } else {
/* 104 */       super.fn();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public aqq dC() {
/* 110 */     return aqq.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public double bc() {
/* 115 */     return super.bc() - 0.1875D;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 120 */     super.k();
/*     */     
/* 122 */     if (eM() && this.by++ >= 18000) {
/* 123 */       ad();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 129 */     super.b(☃);
/*     */     
/* 131 */     ☃.a("SkeletonTrap", eM());
/* 132 */     ☃.b("SkeletonTrapTime", this.by);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 137 */     super.a(☃);
/*     */     
/* 139 */     t(☃.q("SkeletonTrap"));
/* 140 */     this.by = ☃.h("SkeletonTrapTime");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bt() {
/* 145 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float dM() {
/* 150 */     return 0.96F;
/*     */   }
/*     */   
/*     */   public boolean eM() {
/* 154 */     return this.bx;
/*     */   }
/*     */   
/*     */   public void t(boolean ☃) {
/* 158 */     if (☃ == this.bx) {
/*     */       return;
/*     */     }
/*     */     
/* 162 */     this.bx = ☃;
/* 163 */     if (☃) {
/* 164 */       this.bk.a(1, this.bw);
/*     */     } else {
/* 166 */       this.bk.a(this.bw);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public apy a(aag ☃, apy apy1) {
/* 173 */     return aqe.aw.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public aou b(bfw ☃, aot aot1) {
/* 178 */     bmb bmb = ☃.b(aot1);
/*     */     
/* 180 */     if (!eW()) {
/* 181 */       return aou.c;
/*     */     }
/*     */     
/* 184 */     if (w_()) {
/* 185 */       return super.b(☃, aot1);
/*     */     }
/*     */     
/* 188 */     if (☃.eq()) {
/* 189 */       f(☃);
/* 190 */       return aou.a(this.l.v);
/*     */     } 
/*     */     
/* 193 */     if (bs()) {
/* 194 */       return super.b(☃, aot1);
/*     */     }
/*     */     
/* 197 */     if (!bmb.a()) {
/* 198 */       if (bmb.b() == bmd.lO && !M_()) {
/* 199 */         f(☃);
/* 200 */         return aou.a(this.l.v);
/*     */       } 
/*     */ 
/*     */       
/* 204 */       aou aou = bmb.a(☃, this, aot1);
/* 205 */       if (aou.a()) {
/* 206 */         return aou;
/*     */       }
/*     */     } 
/*     */     
/* 210 */     h(☃);
/* 211 */     return aou.a(this.l.v);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bbh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */