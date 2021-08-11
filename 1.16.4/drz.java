/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
/*     */ import java.util.function.Supplier;
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
/*     */ public class drz
/*     */   extends dlo.a<drz>
/*     */ {
/*     */   private final djz f;
/*     */   private final List<dmi> g;
/*     */   private final UUID h;
/*     */   private final String i;
/*     */   private final Supplier<vk> j;
/*     */   private boolean k;
/*     */   @Nullable
/*     */   private dlj l;
/*     */   @Nullable
/*     */   private dlj m;
/*     */   private final List<afa> n;
/*     */   private final List<afa> o;
/*     */   private float p;
/*  50 */   private static final nr q = (new of("gui.socialInteractions.status_hidden")).a(k.u);
/*  51 */   private static final nr r = (new of("gui.socialInteractions.status_blocked")).a(k.u);
/*  52 */   private static final nr s = (new of("gui.socialInteractions.status_offline")).a(k.u);
/*  53 */   private static final nr t = (new of("gui.socialInteractions.status_hidden_offline")).a(k.u);
/*  54 */   private static final nr u = (new of("gui.socialInteractions.status_blocked_offline")).a(k.u);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  61 */   public static final int a = aez.a.a(190, 0, 0, 0);
/*  62 */   public static final int b = aez.a.a(255, 74, 74, 74);
/*  63 */   public static final int c = aez.a.a(255, 48, 48, 48);
/*  64 */   public static final int d = aez.a.a(255, 255, 255, 255);
/*  65 */   public static final int e = aez.a.a(140, 255, 255, 255);
/*     */   
/*     */   public drz(djz ☃, dsc dsc1, UUID uUID, String str, Supplier<vk> supplier) {
/*  68 */     this.f = ☃;
/*  69 */     this.h = uUID;
/*  70 */     this.i = str;
/*  71 */     this.j = supplier;
/*     */     
/*  73 */     this.n = ☃.g.b(new of("gui.socialInteractions.tooltip.hide", new Object[] { str }), 150);
/*  74 */     this.o = ☃.g.b(new of("gui.socialInteractions.tooltip.show", new Object[] { str }), 150);
/*     */     
/*  76 */     dsa dsa = ☃.aB();
/*  77 */     if (!☃.s.eA().getId().equals(uUID) && !dsa.e(uUID)) {
/*  78 */       this.l = new dlr(this, 0, 0, 20, 20, 0, 38, 20, dsc.a, 256, 256, dlj1 -> { ☃.a(uUID); a(true, new of("gui.socialInteractions.hidden_in_chat", new Object[] { str })); }(dlj1, dfm1, i, j) -> { this.p += ☃.ak(); if (this.p >= 10.0F) dsc1.a(());  }new of("gui.socialInteractions.hide"))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           protected nx c()
/*     */           {
/*  89 */             return drz.a(this.a, super.c());
/*     */           }
/*     */         };
/*  92 */       this.m = new dlr(this, 0, 0, 20, 20, 20, 38, 20, dsc.a, 256, 256, dlj1 -> { ☃.b(uUID); a(false, new of("gui.socialInteractions.shown_in_chat", new Object[] { str })); }(dlj1, dfm1, i, j) -> { this.p += ☃.ak(); if (this.p >= 10.0F) dsc1.a(());  }new of("gui.socialInteractions.show"))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           protected nx c()
/*     */           {
/* 103 */             return drz.a(this.a, super.c());
/*     */           }
/*     */         };
/*     */       
/* 107 */       this.m.p = dsa.d(uUID);
/* 108 */       this.l.p = !this.m.p;
/* 109 */       this.g = (List<dmi>)ImmutableList.of(this.l, this.m);
/*     */     } else {
/* 111 */       this.g = (List<dmi>)ImmutableList.of();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 117 */     int i6, i3 = k + 4;
/* 118 */     int i4 = j + (n - 24) / 2;
/* 119 */     int i5 = i3 + 24 + 4;
/*     */ 
/*     */     
/* 122 */     nr nr1 = d();
/* 123 */     if (nr1 == oe.d) {
/* 124 */       dkw.a(☃, k, j, k + m, j + n, b);
/* 125 */       this.f.g.getClass(); i6 = j + (n - 9) / 2;
/*     */     } else {
/* 127 */       dkw.a(☃, k, j, k + m, j + n, c);
/* 128 */       this.f.g.getClass(); this.f.g.getClass(); i6 = j + (n - 9 + 9) / 2;
/* 129 */       this.f.g.b(☃, nr1, i5, (i6 + 12), e);
/*     */     } 
/*     */     
/* 132 */     this.f.M().a(this.j.get());
/* 133 */     dkw.a(☃, i3, i4, 24, 24, 8.0F, 8.0F, 8, 8, 64, 64);
/* 134 */     RenderSystem.enableBlend();
/* 135 */     dkw.a(☃, i3, i4, 24, 24, 40.0F, 8.0F, 8, 8, 64, 64);
/* 136 */     RenderSystem.disableBlend();
/*     */     
/* 138 */     this.f.g.b(☃, this.i, i5, i6, d);
/*     */     
/* 140 */     if (this.k) {
/* 141 */       dkw.a(☃, i3, i4, i3 + 24, i4 + 24, a);
/*     */     }
/*     */     
/* 144 */     if (this.l != null && this.m != null) {
/* 145 */       float f1 = this.p;
/*     */       
/* 147 */       this.l.l = k + m - this.l.h() - 4;
/* 148 */       this.l.m = j + (n - this.l.e()) / 2;
/* 149 */       this.l.a(☃, i1, i2, f);
/* 150 */       this.m.l = k + m - this.m.h() - 4;
/* 151 */       this.m.m = j + (n - this.m.e()) / 2;
/* 152 */       this.m.a(☃, i1, i2, f);
/*     */       
/* 154 */       if (f1 == this.p) {
/* 155 */         this.p = 0.0F;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public List<? extends dmi> au_() {
/* 162 */     return this.g;
/*     */   }
/*     */   
/*     */   public String b() {
/* 166 */     return this.i;
/*     */   }
/*     */   
/*     */   public UUID c() {
/* 170 */     return this.h;
/*     */   }
/*     */   
/*     */   public void c(boolean ☃) {
/* 174 */     this.k = ☃;
/*     */   }
/*     */   
/*     */   private void a(boolean ☃, nr nr1) {
/* 178 */     this.m.p = ☃;
/* 179 */     this.l.p = !☃;
/* 180 */     this.f.j.c().a(nr1);
/* 181 */     dkz.b.a(nr1.getString());
/*     */   }
/*     */   
/*     */   private nx a(nx ☃) {
/* 185 */     nr nr1 = d();
/* 186 */     if (nr1 == oe.d) {
/* 187 */       return (new oe(this.i)).c(", ").a(☃);
/*     */     }
/* 189 */     return (new oe(this.i)).c(", ").a(nr1).c(", ").a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   private nr d() {
/* 194 */     boolean ☃ = this.f.aB().d(this.h);
/* 195 */     boolean bool1 = this.f.aB().e(this.h);
/*     */     
/* 197 */     if (bool1 && this.k)
/* 198 */       return u; 
/* 199 */     if (☃ && this.k)
/* 200 */       return t; 
/* 201 */     if (bool1)
/* 202 */       return r; 
/* 203 */     if (☃)
/* 204 */       return q; 
/* 205 */     if (this.k) {
/* 206 */       return s;
/*     */     }
/* 208 */     return oe.d;
/*     */   }
/*     */   
/*     */   private static void a(dsc ☃, dfm dfm1, List<afa> list, int i, int j) {
/* 212 */     ☃.c(dfm1, list, i, j);
/* 213 */     ☃.a((Runnable)null);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\drz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */