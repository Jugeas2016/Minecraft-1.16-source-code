/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import it.unimi.dsi.fastutil.booleans.BooleanArrayList;
/*     */ import it.unimi.dsi.fastutil.booleans.BooleanList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Map;
/*     */ import java.util.stream.Collectors;
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
/*     */ public enum c
/*     */   implements afs
/*     */ {
/*  23 */   a("identity", e.a, false, false, false),
/*     */ 
/*     */   
/*  26 */   b("rot_180_face_xy", e.a, true, true, false),
/*  27 */   c("rot_180_face_xz", e.a, true, false, true),
/*  28 */   d("rot_180_face_yz", e.a, false, true, true),
/*     */ 
/*     */   
/*  31 */   e("rot_120_nnn", e.d, false, false, false),
/*  32 */   f("rot_120_nnp", e.e, true, false, true),
/*  33 */   g("rot_120_npn", e.e, false, true, true),
/*  34 */   h("rot_120_npp", e.d, true, false, true),
/*  35 */   i("rot_120_pnn", e.e, true, true, false),
/*  36 */   j("rot_120_pnp", e.d, true, true, false),
/*  37 */   k("rot_120_ppn", e.d, false, true, true),
/*  38 */   l("rot_120_ppp", e.e, false, false, false),
/*     */ 
/*     */   
/*  41 */   m("rot_180_edge_xy_neg", e.b, true, true, true),
/*  42 */   n("rot_180_edge_xy_pos", e.b, false, false, true),
/*  43 */   o("rot_180_edge_xz_neg", e.f, true, true, true),
/*  44 */   p("rot_180_edge_xz_pos", e.f, false, true, false),
/*  45 */   q("rot_180_edge_yz_neg", e.c, true, true, true),
/*  46 */   r("rot_180_edge_yz_pos", e.c, true, false, false),
/*     */ 
/*     */   
/*  49 */   s("rot_90_x_neg", e.c, false, false, true),
/*  50 */   t("rot_90_x_pos", e.c, false, true, false),
/*  51 */   u("rot_90_y_neg", e.f, true, false, false),
/*  52 */   v("rot_90_y_pos", e.f, false, false, true),
/*  53 */   w("rot_90_z_neg", e.b, false, true, false),
/*  54 */   x("rot_90_z_pos", e.b, true, false, false),
/*     */ 
/*     */   
/*  57 */   y("inversion", e.a, true, true, true),
/*     */ 
/*     */   
/*  60 */   z("invert_x", e.a, true, false, false),
/*  61 */   A("invert_y", e.a, false, true, false),
/*  62 */   B("invert_z", e.a, false, false, true),
/*     */ 
/*     */   
/*  65 */   C("rot_60_ref_nnn", e.e, true, true, true),
/*  66 */   D("rot_60_ref_nnp", e.d, true, false, false),
/*  67 */   E("rot_60_ref_npn", e.d, false, false, true),
/*  68 */   F("rot_60_ref_npp", e.e, false, false, true),
/*  69 */   G("rot_60_ref_pnn", e.d, false, true, false),
/*  70 */   H("rot_60_ref_pnp", e.e, true, false, false),
/*  71 */   I("rot_60_ref_ppn", e.e, false, true, false),
/*  72 */   J("rot_60_ref_ppp", e.d, true, true, true),
/*     */ 
/*     */   
/*  75 */   K("swap_xy", e.b, false, false, false),
/*  76 */   L("swap_yz", e.c, false, false, false),
/*  77 */   M("swap_xz", e.f, false, false, false),
/*     */ 
/*     */   
/*  80 */   N("swap_neg_xy", e.b, true, true, false),
/*  81 */   O("swap_neg_yz", e.c, false, true, true),
/*  82 */   P("swap_neg_xz", e.f, true, false, true),
/*     */ 
/*     */   
/*  85 */   Q("rot_90_ref_x_neg", e.c, true, false, true),
/*  86 */   R("rot_90_ref_x_pos", e.c, true, true, false),
/*  87 */   S("rot_90_ref_y_neg", e.f, true, true, false),
/*  88 */   T("rot_90_ref_y_pos", e.f, false, true, true),
/*  89 */   U("rot_90_ref_z_neg", e.b, false, true, true),
/*  90 */   V("rot_90_ref_z_pos", e.b, true, false, true);
/*     */   
/*     */   private final a W;
/*     */   
/*     */   private final String X;
/*     */   
/*     */   @Nullable
/*     */   private Map<gc, gc> Y;
/*     */   private final boolean Z;
/*     */   private final boolean aa;
/*     */   private final boolean ab;
/*     */   private final e ac;
/*     */   private static final c[][] ad;
/*     */   private static final c[] ae;
/*     */   
/*     */   c(String ☃, e e1, boolean bool1, boolean bool2, boolean bool3) {
/* 106 */     this.X = ☃;
/* 107 */     this.Z = bool1;
/* 108 */     this.aa = bool2;
/* 109 */     this.ab = bool3;
/* 110 */     this.ac = e1;
/*     */     
/* 112 */     this.W = new a();
/* 113 */     this.W.a = bool1 ? -1.0F : 1.0F;
/* 114 */     this.W.e = bool2 ? -1.0F : 1.0F;
/* 115 */     this.W.i = bool3 ? -1.0F : 1.0F;
/*     */     
/* 117 */     this.W.b(e1.a());
/*     */   }
/*     */   
/*     */   private BooleanList b() {
/* 121 */     return (BooleanList)new BooleanArrayList(new boolean[] { this.Z, this.aa, this.ab });
/*     */   }
/*     */   static {
/* 124 */     ad = x.<c[][]>a(new c[(values()).length][(values()).length], ☃ -> {
/*     */           Map<Pair<e, BooleanList>, c> map = (Map<Pair<e, BooleanList>, c>)Arrays.<c>stream(values()).collect(Collectors.toMap((), ()));
/*     */           
/*     */           for (c c1 : values()) {
/*     */             for (c c2 : values()) {
/*     */               BooleanList booleanList1 = c1.b();
/*     */               
/*     */               BooleanList booleanList2 = c2.b();
/*     */               
/*     */               e e1 = c2.ac.a(c1.ac);
/*     */               
/*     */               BooleanArrayList booleanArrayList = new BooleanArrayList(3);
/*     */               
/*     */               for (int i = 0; i < 3; i++) {
/*     */                 booleanArrayList.add(booleanList1.getBoolean(i) ^ booleanList2.getBoolean(c1.ac.a(i)));
/*     */               }
/*     */               
/*     */               ☃[c1.ordinal()][c2.ordinal()] = map.get(Pair.of(e1, booleanArrayList));
/*     */             } 
/*     */           } 
/*     */         });
/* 145 */     ae = (c[])Arrays.<c>stream(values()).map(☃ -> (c)Arrays.<c>stream(values()).filter(()).findAny().get()).toArray(☃ -> new c[☃]);
/*     */   }
/*     */   public c a(c ☃) {
/* 148 */     return ad[ordinal()][☃.ordinal()];
/*     */   }
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
/*     */   public String toString() {
/* 161 */     return this.X;
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/* 166 */     return this.X;
/*     */   }
/*     */ 
/*     */   
/*     */   public gc a(gc ☃) {
/* 171 */     if (this.Y == null) {
/* 172 */       this.Y = Maps.newEnumMap(gc.class);
/*     */       
/* 174 */       for (gc gc1 : gc.values()) {
/* 175 */         gc.a a1 = gc1.n();
/* 176 */         gc.b b1 = gc1.e();
/*     */         
/* 178 */         gc.a a2 = gc.a.values()[this.ac.a(a1.ordinal())];
/*     */         
/* 180 */         gc.b b2 = a(a2) ? b1.c() : b1;
/*     */         
/* 182 */         gc gc2 = gc.a(a2, b2);
/*     */         
/* 184 */         this.Y.put(gc1, gc2);
/*     */       } 
/*     */     } 
/* 187 */     return this.Y.get(☃);
/*     */   }
/*     */   
/*     */   public boolean a(gc.a ☃) {
/* 191 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/* 193 */         return this.Z;
/*     */       case 2:
/* 195 */         return this.aa;
/*     */     } 
/*     */     
/* 198 */     return this.ab;
/*     */   }
/*     */ 
/*     */   
/*     */   public ge a(ge ☃) {
/* 203 */     return ge.a(a(☃.b()), a(☃.c()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */