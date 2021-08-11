/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.function.Consumer;
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
/*     */ public class dhm
/*     */   extends dlj
/*     */   implements dmc
/*     */ {
/*  25 */   public static final vk a = new vk("realms", "textures/gui/realms/slot_frame.png");
/*  26 */   public static final vk b = new vk("realms", "textures/gui/realms/empty_frame.png");
/*  27 */   public static final vk c = new vk("minecraft", "textures/gui/title/background/panorama_0.png");
/*  28 */   public static final vk d = new vk("minecraft", "textures/gui/title/background/panorama_2.png");
/*  29 */   public static final vk e = new vk("minecraft", "textures/gui/title/background/panorama_3.png");
/*     */   
/*  31 */   private static final nr v = new of("mco.configure.world.slot.tooltip.active");
/*  32 */   private static final nr w = new of("mco.configure.world.slot.tooltip.minigame");
/*  33 */   private static final nr x = new of("mco.configure.world.slot.tooltip");
/*     */   
/*     */   private final Supplier<dgq> y;
/*     */   private final Consumer<nr> z;
/*     */   private final int A;
/*     */   private int B;
/*     */   @Nullable
/*     */   private b C;
/*     */   
/*     */   public dhm(int ☃, int i, int j, int k, Supplier<dgq> supplier, Consumer<nr> consumer, int m, dlj.a a1) {
/*  43 */     super(☃, i, j, k, oe.d, a1);
/*  44 */     this.y = supplier;
/*  45 */     this.A = m;
/*  46 */     this.z = consumer;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public b a() {
/*  51 */     return this.C;
/*     */   }
/*     */   
/*     */   public enum a {
/*  55 */     a,
/*  56 */     b,
/*  57 */     c;
/*     */   }
/*     */   
/*     */   public static class b
/*     */   {
/*     */     private final boolean d;
/*     */     private final String e;
/*     */     private final long f;
/*     */     private final String g;
/*     */     public final boolean a;
/*     */     public final boolean b;
/*     */     public final dhm.a c;
/*     */     @Nullable
/*     */     private final nr h;
/*     */     
/*  72 */     b(boolean ☃, String str1, long l, @Nullable String str2, boolean bool1, boolean bool2, dhm.a a1, @Nullable nr nr1) { this.d = ☃;
/*  73 */       this.e = str1;
/*  74 */       this.f = l;
/*  75 */       this.g = str2;
/*  76 */       this.a = bool1;
/*  77 */       this.b = bool2;
/*  78 */       this.c = a1;
/*  79 */       this.h = nr1; } } public void d() {
/*     */     boolean bool1;
/*     */     String str1;
/*     */     long l;
/*     */     String str2;
/*     */     boolean bool2;
/*  85 */     this.B++;
/*     */ 
/*     */     
/*  88 */     dgq ☃ = this.y.get();
/*  89 */     if (☃ == null) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  95 */     dgw dgw = ☃.i.get(Integer.valueOf(this.A));
/*     */ 
/*     */ 
/*     */     
/*  99 */     boolean bool3 = (this.A == 4);
/* 100 */     if (bool3) {
/* 101 */       bool1 = (☃.m == dgq.c.b);
/* 102 */       str1 = "Minigame";
/* 103 */       l = ☃.p;
/* 104 */       str2 = ☃.q;
/* 105 */       bool2 = (☃.p == -1);
/*     */     } else {
/* 107 */       bool1 = (☃.n == this.A && ☃.m != dgq.c.b);
/* 108 */       str1 = dgw.a(this.A);
/* 109 */       l = dgw.k;
/* 110 */       str2 = dgw.l;
/* 111 */       bool2 = dgw.n;
/*     */     } 
/*     */     
/* 114 */     a a = a(☃, bool1, bool3);
/* 115 */     Pair<nr, nr> pair = a(☃, str1, bool2, bool3, a);
/* 116 */     this.C = new b(bool1, str1, l, str2, bool2, bool3, a, (nr)pair.getFirst());
/* 117 */     a((nr)pair.getSecond());
/*     */   }
/*     */   
/*     */   private static a a(dgq ☃, boolean bool1, boolean bool2) {
/* 121 */     if (bool1) {
/* 122 */       if (!☃.j && ☃.e != dgq.b.c) {
/* 123 */         return a.c;
/*     */       }
/*     */     }
/* 126 */     else if (bool2) {
/* 127 */       if (!☃.j) {
/* 128 */         return a.b;
/*     */       }
/*     */     } else {
/* 131 */       return a.b;
/*     */     } 
/*     */     
/* 134 */     return a.a;
/*     */   }
/*     */   private Pair<nr, nr> a(dgq ☃, String str, boolean bool1, boolean bool2, a a1) {
/*     */     nr nr1, nr2;
/* 138 */     if (a1 == a.a) {
/* 139 */       return Pair.of(null, new oe(str));
/*     */     }
/*     */ 
/*     */     
/* 143 */     if (bool2) {
/* 144 */       if (bool1) {
/* 145 */         nr1 = oe.d;
/*     */       } else {
/* 147 */         nr1 = (new oe(" ")).c(str).c(" ").c(☃.o);
/*     */       } 
/*     */     } else {
/* 150 */       nr1 = (new oe(" ")).c(str);
/*     */     } 
/*     */ 
/*     */     
/* 154 */     if (a1 == a.c) {
/* 155 */       nr2 = v;
/*     */     } else {
/* 157 */       nr2 = bool2 ? w : x;
/*     */     } 
/*     */     
/* 160 */     nr nr3 = nr2.e().a(nr1);
/* 161 */     return Pair.of(nr2, nr3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(dfm ☃, int i, int j, float f) {
/* 166 */     if (this.C == null) {
/*     */       return;
/*     */     }
/* 169 */     a(☃, this.l, this.m, i, j, b.a(this.C), b.b(this.C), this.A, b.c(this.C), b.d(this.C), this.C.a, this.C.b, this.C.c, b.e(this.C));
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, int i, int j, int k, int m, boolean bool1, String str1, int n, long l, @Nullable String str2, boolean bool2, boolean bool3, a a1, @Nullable nr nr1) {
/* 173 */     boolean bool4 = g();
/*     */     
/* 175 */     if (b(k, m) && nr1 != null) {
/* 176 */       this.z.accept(nr1);
/*     */     }
/*     */     
/* 179 */     djz djz = djz.C();
/* 180 */     ekd ekd = djz.M();
/*     */ 
/*     */     
/* 183 */     if (bool3) {
/* 184 */       dir.a(String.valueOf(l), str2);
/*     */     }
/* 186 */     else if (bool2) {
/* 187 */       ekd.a(b);
/* 188 */     } else if (str2 != null && l != -1L) {
/* 189 */       dir.a(String.valueOf(l), str2);
/* 190 */     } else if (n == 1) {
/* 191 */       ekd.a(c);
/* 192 */     } else if (n == 2) {
/* 193 */       ekd.a(d);
/* 194 */     } else if (n == 3) {
/* 195 */       ekd.a(e);
/*     */     } 
/*     */ 
/*     */     
/* 199 */     if (bool1) {
/* 200 */       float f = 0.85F + 0.15F * afm.b(this.B * 0.2F);
/* 201 */       RenderSystem.color4f(f, f, f, 1.0F);
/*     */     } else {
/* 203 */       RenderSystem.color4f(0.56F, 0.56F, 0.56F, 1.0F);
/*     */     } 
/*     */     
/* 206 */     a(☃, i + 3, j + 3, 0.0F, 0.0F, 74, 74, 74, 74);
/*     */     
/* 208 */     ekd.a(a);
/* 209 */     boolean bool5 = (bool4 && a1 != a.a);
/* 210 */     if (bool5) {
/*     */       
/* 212 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     }
/* 214 */     else if (bool1) {
/* 215 */       RenderSystem.color4f(0.8F, 0.8F, 0.8F, 1.0F);
/*     */     } else {
/* 217 */       RenderSystem.color4f(0.56F, 0.56F, 0.56F, 1.0F);
/*     */     } 
/*     */ 
/*     */     
/* 221 */     a(☃, i, j, 0.0F, 0.0F, 80, 80, 80, 80);
/*     */     
/* 223 */     a(☃, djz.g, str1, i + 40, j + 66, 16777215);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dhm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */