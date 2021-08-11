/*     */ import java.util.Optional;
/*     */ import java.util.UUID;
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
/*     */ public abstract class are
/*     */   extends azz
/*     */ {
/*  25 */   protected static final us<Byte> bo = uv.a((Class)are.class, uu.a);
/*  26 */   protected static final us<Optional<UUID>> bp = uv.a((Class)are.class, uu.o);
/*     */   
/*     */   private boolean bq;
/*     */   
/*     */   protected are(aqe<? extends are> ☃, brx brx1) {
/*  31 */     super((aqe)☃, brx1);
/*  32 */     eL();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  37 */     super.e();
/*  38 */     this.R.a(bo, Byte.valueOf((byte)0));
/*  39 */     this.R.a(bp, Optional.empty());
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/*  44 */     super.b(☃);
/*  45 */     if (A_() != null) {
/*  46 */       ☃.a("Owner", A_());
/*     */     }
/*  48 */     ☃.a("Sitting", this.bq);
/*     */   }
/*     */   
/*     */   public void a(md ☃) {
/*     */     UUID uUID;
/*  53 */     super.a(☃);
/*     */     
/*  55 */     if (☃.b("Owner")) {
/*  56 */       uUID = ☃.a("Owner");
/*     */     } else {
/*  58 */       String str = ☃.l("Owner");
/*  59 */       uUID = act.a(ch(), str);
/*     */     } 
/*  61 */     if (uUID != null) {
/*     */       try {
/*  63 */         b(uUID);
/*  64 */         u(true);
/*  65 */       } catch (Throwable throwable) {
/*  66 */         u(false);
/*     */       } 
/*     */     }
/*  69 */     this.bq = ☃.q("Sitting");
/*  70 */     v(this.bq);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/*  75 */     return !eB();
/*     */   }
/*     */   
/*     */   protected void t(boolean ☃) {
/*  79 */     hf hf = hh.G;
/*  80 */     if (!☃) {
/*  81 */       hf = hh.S;
/*     */     }
/*  83 */     for (int i = 0; i < 7; i++) {
/*  84 */       double d1 = this.J.nextGaussian() * 0.02D;
/*  85 */       double d2 = this.J.nextGaussian() * 0.02D;
/*  86 */       double d3 = this.J.nextGaussian() * 0.02D;
/*  87 */       this.l.a(hf, d(1.0D), cF() + 0.5D, g(1.0D), d1, d2, d3);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(byte ☃) {
/*  93 */     if (☃ == 7) {
/*  94 */       t(true);
/*  95 */     } else if (☃ == 6) {
/*  96 */       t(false);
/*     */     } else {
/*  98 */       super.a(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean eK() {
/* 103 */     return ((((Byte)this.R.<Byte>a(bo)).byteValue() & 0x4) != 0);
/*     */   }
/*     */   
/*     */   public void u(boolean ☃) {
/* 107 */     byte b = ((Byte)this.R.<Byte>a(bo)).byteValue();
/* 108 */     if (☃) {
/* 109 */       this.R.b(bo, Byte.valueOf((byte)(b | 0x4)));
/*     */     } else {
/* 111 */       this.R.b(bo, Byte.valueOf((byte)(b & 0xFFFFFFFB)));
/*     */     } 
/*     */     
/* 114 */     eL();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void eL() {}
/*     */   
/*     */   public boolean eM() {
/* 121 */     return ((((Byte)this.R.<Byte>a(bo)).byteValue() & 0x1) != 0);
/*     */   }
/*     */   
/*     */   public void v(boolean ☃) {
/* 125 */     byte b = ((Byte)this.R.<Byte>a(bo)).byteValue();
/* 126 */     if (☃) {
/* 127 */       this.R.b(bo, Byte.valueOf((byte)(b | 0x1)));
/*     */     } else {
/* 129 */       this.R.b(bo, Byte.valueOf((byte)(b & 0xFFFFFFFE)));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public UUID A_() {
/* 136 */     return ((Optional<UUID>)this.R.<Optional<UUID>>a(bp)).orElse(null);
/*     */   }
/*     */   
/*     */   public void b(@Nullable UUID ☃) {
/* 140 */     this.R.b(bp, Optional.ofNullable(☃));
/*     */   }
/*     */   
/*     */   public void f(bfw ☃) {
/* 144 */     u(true);
/* 145 */     b(☃.bS());
/* 146 */     if (☃ instanceof aah) {
/* 147 */       ac.x.a((aah)☃, this);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aqm eN() {
/*     */     try {
/* 155 */       UUID ☃ = A_();
/* 156 */       if (☃ == null) {
/* 157 */         return null;
/*     */       }
/* 159 */       return this.l.b(☃);
/* 160 */     } catch (IllegalArgumentException ☃) {
/* 161 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(aqm ☃) {
/* 167 */     if (i(☃)) {
/* 168 */       return false;
/*     */     }
/* 170 */     return super.c(☃);
/*     */   }
/*     */   
/*     */   public boolean i(aqm ☃) {
/* 174 */     return (☃ == eN());
/*     */   }
/*     */   
/*     */   public boolean a(aqm ☃, aqm aqm1) {
/* 178 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddp bG() {
/* 183 */     if (eK()) {
/* 184 */       aqm ☃ = eN();
/* 185 */       if (☃ != null) {
/* 186 */         return ☃.bG();
/*     */       }
/*     */     } 
/* 189 */     return super.bG();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean r(aqa ☃) {
/* 194 */     if (eK()) {
/* 195 */       aqm aqm = eN();
/* 196 */       if (☃ == aqm) {
/* 197 */         return true;
/*     */       }
/* 199 */       if (aqm != null) {
/* 200 */         return aqm.r(☃);
/*     */       }
/*     */     } 
/* 203 */     return super.r(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(apk ☃) {
/* 208 */     if (!this.l.v && this.l.V().b(brt.l) && 
/* 209 */       eN() instanceof aah) {
/* 210 */       eN().a(dv().b(), x.b);
/*     */     }
/*     */     
/* 213 */     super.a(☃);
/*     */   }
/*     */   
/*     */   public boolean eO() {
/* 217 */     return this.bq;
/*     */   }
/*     */   
/*     */   public void w(boolean ☃) {
/* 221 */     this.bq = ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\are.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */