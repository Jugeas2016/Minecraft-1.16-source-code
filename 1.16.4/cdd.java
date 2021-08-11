/*     */ import java.util.Random;
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
/*     */ public abstract class cdd
/*     */   extends ccd
/*     */ {
/*     */   @Nullable
/*     */   protected vk g;
/*     */   protected long h;
/*     */   
/*     */   protected cdd(cck<?> ☃) {
/*  35 */     super(☃);
/*     */   }
/*     */   
/*     */   public static void a(brc ☃, Random random, fx fx1, vk vk1) {
/*  39 */     ccj ccj = ☃.c(fx1);
/*  40 */     if (ccj instanceof cdd) {
/*  41 */       ((cdd)ccj).a(vk1, random.nextLong());
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean b(md ☃) {
/*  46 */     if (☃.c("LootTable", 8)) {
/*  47 */       this.g = new vk(☃.l("LootTable"));
/*  48 */       this.h = ☃.i("LootTableSeed");
/*  49 */       return true;
/*     */     } 
/*  51 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean c(md ☃) {
/*  55 */     if (this.g == null) {
/*  56 */       return false;
/*     */     }
/*     */     
/*  59 */     ☃.a("LootTable", this.g.toString());
/*  60 */     if (this.h != 0L) {
/*  61 */       ☃.a("LootTableSeed", this.h);
/*     */     }
/*  63 */     return true;
/*     */   }
/*     */   
/*     */   public void d(@Nullable bfw ☃) {
/*  67 */     if (this.g != null && this.d.l() != null) {
/*  68 */       cyy cyy = this.d.l().aJ().a(this.g);
/*  69 */       if (☃ instanceof aah) {
/*  70 */         ac.N.a((aah)☃, this.g);
/*     */       }
/*  72 */       this.g = null;
/*     */ 
/*     */       
/*  75 */       cyv.a a = (new cyv.a((aag)this.d)).<dcn>a(dbc.f, dcn.a(this.e)).a(this.h);
/*     */       
/*  77 */       if (☃ != null) {
/*  78 */         a.a(☃.eU()).a(dbc.a, ☃);
/*     */       }
/*     */       
/*  81 */       cyy.a(this, a.a(dbb.b));
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(vk ☃, long l) {
/*  86 */     this.g = ☃;
/*  87 */     this.h = l;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  92 */     d((bfw)null);
/*  93 */     return f().stream().allMatch(bmb::a);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(int ☃) {
/*  98 */     d((bfw)null);
/*  99 */     return f().get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(int ☃, int i) {
/* 104 */     d((bfw)null);
/*     */     
/* 106 */     bmb bmb = aoo.a(f(), ☃, i);
/* 107 */     if (!bmb.a()) {
/* 108 */       X_();
/*     */     }
/* 110 */     return bmb;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(int ☃) {
/* 115 */     d((bfw)null);
/*     */     
/* 117 */     return aoo.a(f(), ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, bmb bmb1) {
/* 122 */     d((bfw)null);
/* 123 */     f().set(☃, bmb1);
/* 124 */     if (bmb1.E() > V_()) {
/* 125 */       bmb1.e(V_());
/*     */     }
/* 127 */     X_();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 132 */     if (this.d.c(this.e) != this) {
/* 133 */       return false;
/*     */     }
/* 135 */     if (☃.h(this.e.u() + 0.5D, this.e.v() + 0.5D, this.e.w() + 0.5D) > 64.0D) {
/* 136 */       return false;
/*     */     }
/* 138 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void Y_() {
/* 143 */     f().clear();
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract gj<bmb> f();
/*     */   
/*     */   protected abstract void a(gj<bmb> paramgj);
/*     */   
/*     */   public boolean e(bfw ☃) {
/* 152 */     return (super.e(☃) && (this.g == null || !☃.a_()));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public bic createMenu(int ☃, bfv bfv1, bfw bfw1) {
/* 158 */     if (e(bfw1)) {
/* 159 */       d(bfv1.e);
/* 160 */       return a(☃, bfv1);
/*     */     } 
/* 162 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cdd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */