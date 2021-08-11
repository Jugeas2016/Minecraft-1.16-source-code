/*     */ import java.util.Optional;
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
/*     */ public class ccm
/*     */   extends ccj
/*     */   implements aol, cdm
/*     */ {
/*  32 */   private final gj<bmb> a = gj.a(4, bmb.b);
/*  33 */   private final int[] b = new int[4];
/*  34 */   private final int[] c = new int[4];
/*     */   
/*     */   public ccm() {
/*  37 */     super(cck.F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void aj_() {
/*  42 */     boolean ☃ = ((Boolean)p().c(buy.b)).booleanValue();
/*  43 */     boolean bool1 = this.d.v;
/*     */     
/*  45 */     if (bool1) {
/*  46 */       if (☃) {
/*  47 */         j();
/*     */       }
/*     */       
/*     */       return;
/*     */     } 
/*  52 */     if (☃) {
/*  53 */       h();
/*     */     } else {
/*  55 */       for (int i = 0; i < this.a.size(); i++) {
/*  56 */         if (this.b[i] > 0) {
/*  57 */           this.b[i] = afm.a(this.b[i] - 2, 0, this.c[i]);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void h() {
/*  64 */     for (int ☃ = 0; ☃ < this.a.size(); ☃++) {
/*  65 */       bmb bmb = this.a.get(☃);
/*  66 */       if (!bmb.a()) {
/*     */ 
/*     */ 
/*     */         
/*  70 */         this.b[☃] = this.b[☃] + 1;
/*  71 */         if (this.b[☃] >= this.c[☃]) {
/*  72 */           aon aon = new apa(new bmb[] { bmb });
/*  73 */           bmb bmb1 = this.d.o().<aon, boh>a(bot.e, aon, this.d).map(boh1 -> boh1.a(☃)).orElse(bmb);
/*  74 */           fx fx = o();
/*  75 */           aoq.a(this.d, fx.u(), fx.v(), fx.w(), bmb1);
/*  76 */           this.a.set(☃, bmb.b);
/*  77 */           k();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   private void j() {
/*  83 */     brx ☃ = v();
/*  84 */     if (☃ == null) {
/*     */       return;
/*     */     }
/*     */     
/*  88 */     fx fx = o();
/*  89 */     Random random = ☃.t;
/*     */     
/*  91 */     if (random.nextFloat() < 0.11F) {
/*  92 */       for (int k = 0; k < random.nextInt(2) + 2; k++) {
/*  93 */         buy.a(☃, fx, ((Boolean)p().c(buy.c)).booleanValue(), false);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*  98 */     int i = ((gc)p().c(buy.e)).d();
/*  99 */     for (int j = 0; j < this.a.size(); j++) {
/* 100 */       if (!((bmb)this.a.get(j)).a() && random.nextFloat() < 0.2F) {
/* 101 */         gc gc = gc.b(Math.floorMod(j + i, 4));
/* 102 */         float f = 0.3125F;
/*     */         
/* 104 */         double d1 = fx.u() + 0.5D - (gc.i() * 0.3125F) + (gc.g().i() * 0.3125F);
/* 105 */         double d2 = fx.v() + 0.5D;
/* 106 */         double d3 = fx.w() + 0.5D - (gc.k() * 0.3125F) + (gc.g().k() * 0.3125F);
/*     */         
/* 108 */         for (int k = 0; k < 4; k++) {
/* 109 */           ☃.a(hh.S, d1, d2, d3, 0.0D, 5.0E-4D, 0.0D);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public gj<bmb> d() {
/* 116 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, md md1) {
/* 121 */     super.a(☃, md1);
/*     */     
/* 123 */     this.a.clear();
/* 124 */     aoo.b(md1, this.a);
/*     */     
/* 126 */     if (md1.c("CookingTimes", 11)) {
/* 127 */       int[] arrayOfInt = md1.n("CookingTimes");
/* 128 */       System.arraycopy(arrayOfInt, 0, this.b, 0, Math.min(this.c.length, arrayOfInt.length));
/*     */     } 
/*     */     
/* 131 */     if (md1.c("CookingTotalTimes", 11)) {
/* 132 */       int[] arrayOfInt = md1.n("CookingTotalTimes");
/* 133 */       System.arraycopy(arrayOfInt, 0, this.c, 0, Math.min(this.c.length, arrayOfInt.length));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public md a(md ☃) {
/* 139 */     b(☃);
/*     */     
/* 141 */     ☃.a("CookingTimes", this.b);
/* 142 */     ☃.a("CookingTotalTimes", this.c);
/*     */     
/* 144 */     return ☃;
/*     */   }
/*     */   
/*     */   private md b(md ☃) {
/* 148 */     super.a(☃);
/*     */     
/* 150 */     aoo.a(☃, this.a, true);
/*     */     
/* 152 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ow a() {
/* 158 */     return new ow(this.e, 13, b());
/*     */   }
/*     */ 
/*     */   
/*     */   public md b() {
/* 163 */     return b(new md());
/*     */   }
/*     */   
/*     */   public Optional<boh> a(bmb ☃) {
/* 167 */     if (this.a.stream().noneMatch(bmb::a)) {
/* 168 */       return Optional.empty();
/*     */     }
/*     */     
/* 171 */     return this.d.o().a(bot.e, new apa(new bmb[] { ☃ }, ), this.d);
/*     */   }
/*     */   
/*     */   public boolean a(bmb ☃, int i) {
/* 175 */     for (int j = 0; j < this.a.size(); j++) {
/* 176 */       bmb bmb1 = this.a.get(j);
/* 177 */       if (bmb1.a()) {
/* 178 */         this.c[j] = i;
/* 179 */         this.b[j] = 0;
/*     */         
/* 181 */         this.a.set(j, ☃.a(1));
/*     */         
/* 183 */         k();
/*     */         
/* 185 */         return true;
/*     */       } 
/*     */     } 
/* 188 */     return false;
/*     */   }
/*     */   
/*     */   private void k() {
/* 192 */     X_();
/* 193 */     v().a(o(), p(), p(), 3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void Y_() {
/* 198 */     this.a.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public void f() {
/* 203 */     if (this.d != null) {
/* 204 */       if (!this.d.v) {
/* 205 */         aoq.a(this.d, o(), d());
/*     */       }
/*     */       
/* 208 */       k();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ccm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */