/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collection;
/*     */ import java.util.Set;
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
/*     */ public class bgc
/*     */   extends bga
/*     */ {
/*  30 */   private static final us<Integer> f = uv.a((Class)bgc.class, uu.b);
/*     */ 
/*     */ 
/*     */   
/*  34 */   private bnt g = bnw.a;
/*  35 */   private final Set<apu> ag = Sets.newHashSet();
/*     */   private boolean ah;
/*     */   
/*     */   public bgc(aqe<? extends bgc> ☃, brx brx1) {
/*  39 */     super((aqe)☃, brx1);
/*     */   }
/*     */   
/*     */   public bgc(brx ☃, double d1, double d2, double d3) {
/*  43 */     super((aqe)aqe.c, d1, d2, d3, ☃);
/*     */   }
/*     */   
/*     */   public bgc(brx ☃, aqm aqm1) {
/*  47 */     super((aqe)aqe.c, aqm1, ☃);
/*     */   }
/*     */   
/*     */   public void b(bmb ☃) {
/*  51 */     if (☃.b() == bmd.ql) {
/*  52 */       this.g = bnv.d(☃);
/*  53 */       Collection<apu> collection = bnv.b(☃);
/*  54 */       if (!collection.isEmpty()) {
/*  55 */         for (apu apu : collection) {
/*  56 */           this.ag.add(new apu(apu));
/*     */         }
/*     */       }
/*     */       
/*  60 */       int i = c(☃);
/*  61 */       if (i == -1) {
/*  62 */         z();
/*     */       } else {
/*  64 */         c(i);
/*     */       } 
/*  66 */     } else if (☃.b() == bmd.kd) {
/*  67 */       this.g = bnw.a;
/*  68 */       this.ag.clear();
/*  69 */       this.R.b(f, Integer.valueOf(-1));
/*     */     } 
/*     */   }
/*     */   
/*     */   public static int c(bmb ☃) {
/*  74 */     md md = ☃.o();
/*  75 */     if (md != null && md.c("CustomPotionColor", 99)) {
/*  76 */       return md.h("CustomPotionColor");
/*     */     }
/*  78 */     return -1;
/*     */   }
/*     */   
/*     */   private void z() {
/*  82 */     this.ah = false;
/*  83 */     if (this.g == bnw.a && this.ag.isEmpty()) {
/*  84 */       this.R.b(f, Integer.valueOf(-1));
/*     */     } else {
/*  86 */       this.R.b(f, Integer.valueOf(bnv.a(bnv.a(this.g, this.ag))));
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(apu ☃) {
/*  91 */     this.ag.add(☃);
/*  92 */     ab().b(f, Integer.valueOf(bnv.a(bnv.a(this.g, this.ag))));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  97 */     super.e();
/*  98 */     this.R.a(f, Integer.valueOf(-1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 103 */     super.j();
/*     */     
/* 105 */     if (this.l.v) {
/* 106 */       if (this.b) {
/* 107 */         if (this.c % 5 == 0) {
/* 108 */           b(1);
/*     */         }
/*     */       } else {
/* 111 */         b(2);
/*     */       }
/*     */     
/* 114 */     } else if (this.b && this.c != 0 && 
/* 115 */       !this.ag.isEmpty() && this.c >= 600) {
/* 116 */       this.l.a(this, (byte)0);
/* 117 */       this.g = bnw.a;
/* 118 */       this.ag.clear();
/* 119 */       this.R.b(f, Integer.valueOf(-1));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void b(int ☃) {
/* 126 */     int i = u();
/* 127 */     if (i == -1 || ☃ <= 0) {
/*     */       return;
/*     */     }
/*     */     
/* 131 */     double d1 = (i >> 16 & 0xFF) / 255.0D;
/* 132 */     double d2 = (i >> 8 & 0xFF) / 255.0D;
/* 133 */     double d3 = (i >> 0 & 0xFF) / 255.0D;
/*     */     
/* 135 */     for (int j = 0; j < ☃; j++) {
/* 136 */       this.l.a(hh.u, d(0.5D), cF(), g(0.5D), d1, d2, d3);
/*     */     }
/*     */   }
/*     */   
/*     */   public int u() {
/* 141 */     return ((Integer)this.R.<Integer>a(f)).intValue();
/*     */   }
/*     */   
/*     */   private void c(int ☃) {
/* 145 */     this.ah = true;
/* 146 */     this.R.b(f, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 151 */     super.b(☃);
/*     */     
/* 153 */     if (this.g != bnw.a && this.g != null) {
/* 154 */       ☃.a("Potion", gm.U.b(this.g).toString());
/*     */     }
/* 156 */     if (this.ah) {
/* 157 */       ☃.b("Color", u());
/*     */     }
/* 159 */     if (!this.ag.isEmpty()) {
/* 160 */       mj mj = new mj();
/* 161 */       for (apu apu : this.ag) {
/* 162 */         mj.add(apu.a(new md()));
/*     */       }
/* 164 */       ☃.a("CustomPotionEffects", mj);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 170 */     super.a(☃);
/*     */     
/* 172 */     if (☃.c("Potion", 8)) {
/* 173 */       this.g = bnv.c(☃);
/*     */     }
/* 175 */     for (apu apu : bnv.b(☃)) {
/* 176 */       a(apu);
/*     */     }
/*     */     
/* 179 */     if (☃.c("Color", 99)) {
/* 180 */       c(☃.h("Color"));
/*     */     } else {
/* 182 */       z();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(aqm ☃) {
/* 188 */     super.a(☃);
/*     */     
/* 190 */     for (apu apu : this.g.a()) {
/* 191 */       ☃.c(new apu(apu.a(), Math.max(apu.b() / 8, 1), apu.c(), apu.d(), apu.e()));
/*     */     }
/* 193 */     if (!this.ag.isEmpty()) {
/* 194 */       for (apu apu : this.ag) {
/* 195 */         ☃.c(apu);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected bmb m() {
/* 202 */     if (this.ag.isEmpty() && this.g == bnw.a) {
/* 203 */       return new bmb(bmd.kd);
/*     */     }
/* 205 */     bmb ☃ = new bmb(bmd.ql);
/* 206 */     bnv.a(☃, this.g);
/* 207 */     bnv.a(☃, this.ag);
/* 208 */     if (this.ah) {
/* 209 */       ☃.p().b("CustomPotionColor", u());
/*     */     }
/* 211 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(byte ☃) {
/* 217 */     if (☃ == 0) {
/* 218 */       int i = u();
/* 219 */       if (i != -1) {
/* 220 */         double d1 = (i >> 16 & 0xFF) / 255.0D;
/* 221 */         double d2 = (i >> 8 & 0xFF) / 255.0D;
/* 222 */         double d3 = (i >> 0 & 0xFF) / 255.0D;
/*     */         
/* 224 */         for (int j = 0; j < 20; j++) {
/* 225 */           this.l.a(hh.u, d(0.5D), cF(), g(0.5D), d1, d2, d3);
/*     */         }
/*     */       } 
/*     */     } else {
/* 229 */       super.a(☃);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bgc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */