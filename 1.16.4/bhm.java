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
/*     */ 
/*     */ public abstract class bhm
/*     */   extends bhl
/*     */   implements aon, aox
/*     */ {
/*  35 */   private gj<bmb> b = gj.a(36, bmb.b);
/*     */   private boolean c = true;
/*     */   @Nullable
/*     */   private vk d;
/*     */   private long e;
/*     */   
/*     */   protected bhm(aqe<?> ☃, brx brx1) {
/*  42 */     super(☃, brx1);
/*     */   }
/*     */   
/*     */   protected bhm(aqe<?> ☃, double d1, double d2, double d3, brx brx1) {
/*  46 */     super(☃, brx1, d1, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(apk ☃) {
/*  51 */     super.a(☃);
/*     */     
/*  53 */     if (this.l.V().b(brt.g)) {
/*  54 */       aoq.a(this.l, this, this);
/*     */       
/*  56 */       if (!this.l.v) {
/*  57 */         aqa aqa = ☃.j();
/*  58 */         if (aqa != null && aqa.X() == aqe.bc) {
/*  59 */           bet.a((bfw)aqa, true);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  67 */     for (bmb ☃ : this.b) {
/*  68 */       if (!☃.a()) {
/*  69 */         return false;
/*     */       }
/*     */     } 
/*  72 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(int ☃) {
/*  77 */     d((bfw)null);
/*  78 */     return this.b.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(int ☃, int i) {
/*  83 */     d((bfw)null);
/*     */     
/*  85 */     return aoo.a(this.b, ☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(int ☃) {
/*  90 */     d((bfw)null);
/*  91 */     bmb bmb = this.b.get(☃);
/*  92 */     if (bmb.a()) {
/*  93 */       return bmb.b;
/*     */     }
/*  95 */     this.b.set(☃, bmb.b);
/*  96 */     return bmb;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, bmb bmb1) {
/* 101 */     d((bfw)null);
/* 102 */     this.b.set(☃, bmb1);
/* 103 */     if (!bmb1.a() && bmb1.E() > V_()) {
/* 104 */       bmb1.e(V_());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(int ☃, bmb bmb1) {
/* 110 */     if (☃ >= 0 && ☃ < Z_()) {
/* 111 */       a(☃, bmb1);
/* 112 */       return true;
/*     */     } 
/*     */     
/* 115 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void X_() {}
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 124 */     if (this.y) {
/* 125 */       return false;
/*     */     }
/* 127 */     if (☃.h(this) > 64.0D) {
/* 128 */       return false;
/*     */     }
/* 130 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aqa b(aag ☃) {
/* 136 */     this.c = false;
/* 137 */     return super.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void ad() {
/* 142 */     if (!this.l.v && this.c) {
/* 143 */       aoq.a(this.l, this, this);
/*     */     }
/*     */     
/* 146 */     super.ad();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void b(md ☃) {
/* 156 */     super.b(☃);
/*     */     
/* 158 */     if (this.d != null) {
/* 159 */       ☃.a("LootTable", this.d.toString());
/* 160 */       if (this.e != 0L) {
/* 161 */         ☃.a("LootTableSeed", this.e);
/*     */       }
/*     */     } else {
/* 164 */       aoo.a(☃, this.b);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/* 170 */     super.a(☃);
/* 171 */     this.b = gj.a(Z_(), bmb.b);
/*     */     
/* 173 */     if (☃.c("LootTable", 8)) {
/* 174 */       this.d = new vk(☃.l("LootTable"));
/* 175 */       this.e = ☃.i("LootTableSeed");
/*     */     } else {
/* 177 */       aoo.b(☃, this.b);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(bfw ☃, aot aot1) {
/* 183 */     ☃.a(this);
/* 184 */     if (!☃.l.v) {
/* 185 */       bet.a(☃, true);
/* 186 */       return aou.b;
/*     */     } 
/* 188 */     return aou.a;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void i() {
/* 193 */     float ☃ = 0.98F;
/*     */     
/* 195 */     if (this.d == null) {
/* 196 */       int i = 15 - bic.b(this);
/* 197 */       ☃ += i * 0.001F;
/*     */     } 
/*     */     
/* 200 */     f(cC().d(☃, 0.0D, ☃));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d(@Nullable bfw ☃) {
/* 208 */     if (this.d != null && this.l.l() != null) {
/* 209 */       cyy cyy = this.l.l().aJ().a(this.d);
/* 210 */       if (☃ instanceof aah) {
/* 211 */         ac.N.a((aah)☃, this.d);
/*     */       }
/* 213 */       this.d = null;
/*     */ 
/*     */ 
/*     */       
/* 217 */       cyv.a a = (new cyv.a((aag)this.l)).<dcn>a(dbc.f, cA()).a(this.e);
/*     */       
/* 219 */       if (☃ != null) {
/* 220 */         a.a(☃.eU()).a(dbc.a, ☃);
/*     */       }
/* 222 */       cyy.a(this, a.a(dbb.b));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void Y_() {
/* 228 */     d((bfw)null);
/* 229 */     this.b.clear();
/*     */   }
/*     */   
/*     */   public void a(vk ☃, long l) {
/* 233 */     this.d = ☃;
/* 234 */     this.e = l;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public bic createMenu(int ☃, bfv bfv1, bfw bfw1) {
/* 240 */     if (this.d == null || !bfw1.a_()) {
/* 241 */       d(bfv1.e);
/* 242 */       return a(☃, bfv1);
/*     */     } 
/* 244 */     return null;
/*     */   }
/*     */   
/*     */   protected abstract bic a(int paramInt, bfv parambfv);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bhm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */