/*     */ import com.google.common.collect.ImmutableList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
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
/*     */ public class ear
/*     */ {
/*  25 */   public static final vk a = new vk("textures/atlas/shulker_boxes.png");
/*  26 */   public static final vk b = new vk("textures/atlas/beds.png");
/*  27 */   public static final vk c = new vk("textures/atlas/banner_patterns.png");
/*  28 */   public static final vk d = new vk("textures/atlas/shield_patterns.png");
/*  29 */   public static final vk e = new vk("textures/atlas/signs.png");
/*  30 */   public static final vk f = new vk("textures/atlas/chest.png");
/*     */   
/*  32 */   private static final eao u = eao.d(a);
/*  33 */   private static final eao v = eao.b(b);
/*  34 */   private static final eao w = eao.k(c);
/*  35 */   private static final eao x = eao.k(d);
/*  36 */   private static final eao y = eao.d(e);
/*  37 */   private static final eao z = eao.c(f);
/*     */   
/*  39 */   private static final eao A = eao.b(ekb.d);
/*  40 */   private static final eao B = eao.c(ekb.d);
/*  41 */   private static final eao C = eao.f(ekb.d);
/*  42 */   private static final eao D = eao.g(ekb.d);
/*     */   
/*  44 */   public static final elr g = new elr(a, new vk("entity/shulker/shulker"));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final List<elr> h;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/*  62 */     h = (List<elr>)Stream.<String>of(new String[] { "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black" }).map(☃ -> new elr(a, new vk("entity/shulker/shulker_" + ☃))).collect(ImmutableList.toImmutableList());
/*     */   }
/*  64 */   public static final Map<cfq, elr> i = cfq.a().collect(Collectors.toMap((Function)Function.identity(), ear::a)); public static final elr[] j;
/*     */   static {
/*  66 */     j = (elr[])Arrays.<bkx>stream(bkx.values()).sorted(Comparator.comparingInt(bkx::b)).map(☃ -> new elr(b, new vk("entity/bed/" + ☃.c()))).toArray(☃ -> new elr[☃]);
/*     */   }
/*  68 */   public static final elr k = a("trapped");
/*     */   
/*  70 */   public static final elr l = a("trapped_left");
/*  71 */   public static final elr m = a("trapped_right");
/*  72 */   public static final elr n = a("christmas");
/*  73 */   public static final elr o = a("christmas_left");
/*  74 */   public static final elr p = a("christmas_right");
/*  75 */   public static final elr q = a("normal");
/*  76 */   public static final elr r = a("normal_left");
/*  77 */   public static final elr s = a("normal_right");
/*  78 */   public static final elr t = a("ender");
/*     */   
/*     */   public static eao a() {
/*  81 */     return w;
/*     */   }
/*     */   
/*     */   public static eao b() {
/*  85 */     return x;
/*     */   }
/*     */   
/*     */   public static eao c() {
/*  89 */     return v;
/*     */   }
/*     */   
/*     */   public static eao d() {
/*  93 */     return u;
/*     */   }
/*     */   
/*     */   public static eao e() {
/*  97 */     return y;
/*     */   }
/*     */   
/*     */   public static eao f() {
/* 101 */     return z;
/*     */   }
/*     */   
/*     */   public static eao g() {
/* 105 */     return A;
/*     */   }
/*     */   
/*     */   public static eao h() {
/* 109 */     return B;
/*     */   }
/*     */   
/*     */   public static eao i() {
/* 113 */     return C;
/*     */   }
/*     */   
/*     */   public static eao j() {
/* 117 */     return D;
/*     */   }
/*     */   
/*     */   public static void a(Consumer<elr> ☃) {
/* 121 */     ☃.accept(g);
/* 122 */     h.forEach(☃);
/* 123 */     for (ccb ccb : ccb.values()) {
/* 124 */       ☃.accept(new elr(c, ccb.a(true)));
/* 125 */       ☃.accept(new elr(d, ccb.a(false)));
/*     */     } 
/* 127 */     i.values().forEach(☃);
/* 128 */     for (elr elr1 : j) {
/* 129 */       ☃.accept(elr1);
/*     */     }
/*     */     
/* 132 */     ☃.accept(k);
/* 133 */     ☃.accept(l);
/* 134 */     ☃.accept(m);
/*     */     
/* 136 */     ☃.accept(n);
/* 137 */     ☃.accept(o);
/* 138 */     ☃.accept(p);
/*     */     
/* 140 */     ☃.accept(q);
/* 141 */     ☃.accept(r);
/* 142 */     ☃.accept(s);
/*     */     
/* 144 */     ☃.accept(t);
/*     */   }
/*     */   
/*     */   public static elr a(cfq ☃) {
/* 148 */     return new elr(e, new vk("entity/signs/" + ☃.b()));
/*     */   }
/*     */   
/*     */   private static elr a(String ☃) {
/* 152 */     return new elr(f, new vk("entity/chest/" + ☃));
/*     */   }
/*     */   
/*     */   public static elr a(ccj ☃, cez cez1, boolean bool) {
/* 156 */     if (bool)
/* 157 */       return a(cez1, n, o, p); 
/* 158 */     if (☃ instanceof cdn)
/* 159 */       return a(cez1, k, l, m); 
/* 160 */     if (☃ instanceof ccv) {
/* 161 */       return t;
/*     */     }
/* 163 */     return a(cez1, q, r, s);
/*     */   }
/*     */   
/*     */   private static elr a(cez ☃, elr elr1, elr elr2, elr elr3) {
/* 167 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/* 169 */         return elr2;
/*     */       case 2:
/* 171 */         return elr3;
/*     */     } 
/*     */     
/* 174 */     return elr1;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ear.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */