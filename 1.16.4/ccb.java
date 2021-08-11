/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.tuple.Pair;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum ccb
/*     */ {
/*  15 */   a("base", "b", false),
/*  16 */   b("square_bottom_left", "bl"),
/*  17 */   c("square_bottom_right", "br"),
/*  18 */   d("square_top_left", "tl"),
/*  19 */   e("square_top_right", "tr"),
/*  20 */   f("stripe_bottom", "bs"),
/*  21 */   g("stripe_top", "ts"),
/*  22 */   h("stripe_left", "ls"),
/*  23 */   i("stripe_right", "rs"),
/*  24 */   j("stripe_center", "cs"),
/*  25 */   k("stripe_middle", "ms"),
/*  26 */   l("stripe_downright", "drs"),
/*  27 */   m("stripe_downleft", "dls"),
/*  28 */   n("small_stripes", "ss"),
/*  29 */   o("cross", "cr"),
/*  30 */   p("straight_cross", "sc"),
/*  31 */   q("triangle_bottom", "bt"),
/*  32 */   r("triangle_top", "tt"),
/*  33 */   s("triangles_bottom", "bts"),
/*  34 */   t("triangles_top", "tts"),
/*  35 */   u("diagonal_left", "ld"),
/*  36 */   v("diagonal_up_right", "rd"),
/*  37 */   w("diagonal_up_left", "lud"),
/*  38 */   x("diagonal_right", "rud"),
/*  39 */   y("circle", "mc"),
/*  40 */   z("rhombus", "mr"),
/*  41 */   A("half_vertical", "vh"),
/*  42 */   B("half_horizontal", "hh"),
/*  43 */   C("half_vertical_right", "vhr"),
/*  44 */   D("half_horizontal_bottom", "hhb"),
/*  45 */   E("border", "bo"),
/*  46 */   F("curly_border", "cbo"),
/*  47 */   G("gradient", "gra"),
/*  48 */   H("gradient_up", "gru"),
/*  49 */   I("bricks", "bri"),
/*     */ 
/*     */ 
/*     */   
/*  53 */   J("globe", "glb", true),
/*  54 */   K("creeper", "cre", true),
/*  55 */   L("skull", "sku", true),
/*  56 */   M("flower", "flo", true),
/*  57 */   N("mojang", "moj", true),
/*  58 */   O("piglin", "pig", true);
/*     */   
/*     */   static {
/*  61 */     S = values();
/*  62 */     P = S.length;
/*  63 */     Q = (int)Arrays.<ccb>stream(S).filter(☃ -> ☃.T).count();
/*  64 */     R = P - Q - 1;
/*     */   }
/*     */   private static final ccb[] S;
/*     */   public static final int P;
/*     */   public static final int Q;
/*     */   public static final int R;
/*     */   private final boolean T;
/*     */   private final String U;
/*     */   private final String V;
/*     */   
/*     */   ccb(String ☃, String str1, boolean bool) {
/*  75 */     this.U = ☃;
/*  76 */     this.V = str1;
/*  77 */     this.T = bool;
/*     */   }
/*     */   
/*     */   public vk a(boolean ☃) {
/*  81 */     String str = ☃ ? "banner" : "shield";
/*  82 */     return new vk("entity/" + str + "/" + a());
/*     */   }
/*     */   
/*     */   public String a() {
/*  86 */     return this.U;
/*     */   }
/*     */   
/*     */   public String b() {
/*  90 */     return this.V;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static ccb a(String ☃) {
/*  95 */     for (ccb ccb1 : values()) {
/*  96 */       if (ccb1.V.equals(☃)) {
/*  97 */         return ccb1;
/*     */       }
/*     */     } 
/* 100 */     return null;
/*     */   }
/*     */   
/*     */   public static class a {
/* 104 */     private final List<Pair<ccb, bkx>> a = Lists.newArrayList();
/*     */     
/*     */     public a a(ccb ☃, bkx bkx1) {
/* 107 */       this.a.add(Pair.of(☃, bkx1));
/* 108 */       return this;
/*     */     }
/*     */     
/*     */     public mj a() {
/* 112 */       mj ☃ = new mj();
/*     */       
/* 114 */       for (Pair<ccb, bkx> pair : this.a) {
/* 115 */         md md = new md();
/* 116 */         md.a("Pattern", ccb.a((ccb)pair.getLeft()));
/* 117 */         md.b("Color", ((bkx)pair.getRight()).b());
/* 118 */         ☃.add(md);
/*     */       } 
/*     */       
/* 121 */       return ☃;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ccb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */