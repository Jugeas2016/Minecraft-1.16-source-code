/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class ckp
/*     */   extends cla<cmr>
/*     */ {
/*  34 */   private static final String[] u = new String[] { "ruined_portal/portal_1", "ruined_portal/portal_2", "ruined_portal/portal_3", "ruined_portal/portal_4", "ruined_portal/portal_5", "ruined_portal/portal_6", "ruined_portal/portal_7", "ruined_portal/portal_8", "ruined_portal/portal_9", "ruined_portal/portal_10" };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  39 */   private static final String[] v = new String[] { "ruined_portal/giant_portal_1", "ruined_portal/giant_portal_2", "ruined_portal/giant_portal_3" };
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
/*     */   public ckp(Codec<cmr> ☃) {
/*  52 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public cla.a<cmr> a() {
/*  57 */     return a::new;
/*     */   }
/*     */   
/*     */   public static class a extends crv<cmr> {
/*     */     protected a(cla<cmr> ☃, int i, int j, cra cra1, int k, long l) {
/*  62 */       super(☃, i, j, cra1, k, l);
/*     */     }
/*     */     
/*     */     public void a(gn ☃, cfy cfy1, csw csw1, int i, int j, bsv bsv1, cmr cmr1) {
/*     */       crp.b b;
/*     */       vk vk;
/*  68 */       crp.a a1 = new crp.a();
/*     */       
/*  70 */       if (cmr1.b == ckp.b.b) {
/*  71 */         b = crp.b.b;
/*  72 */         a1.d = false;
/*  73 */         a1.c = 0.0F;
/*  74 */       } else if (cmr1.b == ckp.b.c) {
/*  75 */         b = crp.b.a;
/*  76 */         a1.d = (this.d.nextFloat() < 0.5F);
/*  77 */         a1.c = 0.8F;
/*  78 */         a1.e = true;
/*  79 */         a1.f = true;
/*  80 */       } else if (cmr1.b == ckp.b.d) {
/*  81 */         b = crp.b.c;
/*  82 */         a1.d = false;
/*  83 */         a1.c = 0.5F;
/*  84 */         a1.f = true;
/*  85 */       } else if (cmr1.b == ckp.b.e) {
/*  86 */         boolean bool = (this.d.nextFloat() < 0.5F);
/*  87 */         b = bool ? crp.b.d : crp.b.a;
/*  88 */         a1.d = (bool || this.d.nextFloat() < 0.5F);
/*  89 */       } else if (cmr1.b == ckp.b.f) {
/*  90 */         b = crp.b.c;
/*  91 */         a1.d = false;
/*  92 */         a1.c = 0.8F;
/*  93 */       } else if (cmr1.b == ckp.b.g) {
/*  94 */         b = crp.b.f;
/*  95 */         a1.d = (this.d.nextFloat() < 0.5F);
/*  96 */         a1.c = 0.0F;
/*  97 */         a1.g = true;
/*     */       } else {
/*  99 */         boolean bool = (this.d.nextFloat() < 0.5F);
/* 100 */         b = bool ? crp.b.e : crp.b.a;
/* 101 */         a1.d = (bool || this.d.nextFloat() < 0.5F);
/*     */       } 
/*     */ 
/*     */       
/* 105 */       if (this.d.nextFloat() < 0.05F) {
/* 106 */         vk = new vk(ckp.d()[this.d.nextInt((ckp.d()).length)]);
/*     */       } else {
/* 108 */         vk = new vk(ckp.e()[this.d.nextInt((ckp.e()).length)]);
/*     */       } 
/*     */       
/* 111 */       ctb ctb = csw1.a(vk);
/* 112 */       bzm bzm = x.<bzm>a(bzm.values(), this.d);
/* 113 */       byg byg = (this.d.nextFloat() < 0.5F) ? byg.a : byg.c;
/* 114 */       fx fx1 = new fx(ctb.a().u() / 2, 0, ctb.a().w() / 2);
/*     */       
/* 116 */       fx fx2 = (new brd(i, j)).l();
/* 117 */       cra cra = ctb.a(fx2, bzm, fx1, byg);
/* 118 */       gr gr = cra.g();
/* 119 */       int k = gr.u();
/* 120 */       int m = gr.w();
/* 121 */       int n = cfy1.a(k, m, crp.a(b)) - 1;
/* 122 */       int i1 = ckp.a(this.d, cfy1, b, a1.d, n, cra.e(), cra);
/*     */       
/* 124 */       fx fx3 = new fx(fx2.u(), i1, fx2.w());
/*     */       
/* 126 */       if (cmr1.b == ckp.b.e || cmr1.b == ckp.b.f || cmr1.b == ckp.b.a) {
/* 127 */         a1.b = ckp.a(fx3, bsv1);
/*     */       }
/*     */       
/* 130 */       this.b.add(new crp(fx3, b, a1, vk, ctb, bzm, byg, fx1));
/* 131 */       b();
/*     */     }
/*     */   }
/*     */   
/*     */   private static boolean b(fx ☃, bsv bsv1) {
/* 136 */     return (bsv1.a(☃) < 0.15F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static int b(Random ☃, cfy cfy1, crp.b b1, boolean bool, int i, int j, cra cra1) {
/*     */     int k;
/* 143 */     if (b1 == crp.b.f) {
/* 144 */       if (bool) {
/*     */         
/* 146 */         k = a(☃, 32, 100);
/*     */       }
/* 148 */       else if (☃.nextFloat() < 0.5F) {
/*     */         
/* 150 */         k = a(☃, 27, 29);
/*     */       } else {
/*     */         
/* 153 */         k = a(☃, 29, 100);
/*     */       }
/*     */     
/* 156 */     } else if (b1 == crp.b.d) {
/* 157 */       int n = i - j;
/* 158 */       k = b(☃, 70, n);
/* 159 */     } else if (b1 == crp.b.e) {
/* 160 */       int n = i - j;
/* 161 */       k = b(☃, 15, n);
/* 162 */     } else if (b1 == crp.b.b) {
/* 163 */       k = i - j + a(☃, 2, 8);
/*     */     } else {
/* 165 */       k = i;
/*     */     } 
/*     */     
/* 168 */     ImmutableList immutableList = ImmutableList.of(new fx(cra1.a, 0, cra1.c), new fx(cra1.d, 0, cra1.c), new fx(cra1.a, 0, cra1.f), new fx(cra1.d, 0, cra1.f));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 175 */     List<brc> list = (List<brc>)immutableList.stream().map(fx1 -> ☃.a(fx1.u(), fx1.w())).collect(Collectors.toList());
/*     */     
/* 177 */     chn.a a = (b1 == crp.b.c) ? chn.a.c : chn.a.a;
/*     */     
/* 179 */     fx.a a1 = new fx.a();
/* 180 */     int m = k;
/*     */ 
/*     */ 
/*     */     
/* 184 */     label39: while (m > 15) {
/* 185 */       int n = 0;
/* 186 */       a1.d(0, m, 0);
/* 187 */       for (brc brc : list) {
/*     */         
/* 189 */         ceh ceh = brc.d_(a1);
/*     */         
/* 191 */         n++;
/* 192 */         if (ceh != null && a.e().test(ceh) && n == 3) {
/*     */           break label39;
/*     */         }
/*     */       } 
/*     */       
/* 197 */       m--;
/*     */     } 
/* 199 */     return m;
/*     */   }
/*     */   
/*     */   private static int a(Random ☃, int i, int j) {
/* 203 */     return ☃.nextInt(j - i + 1) + i;
/*     */   }
/*     */ 
/*     */   
/*     */   private static int b(Random ☃, int i, int j) {
/* 208 */     if (i < j) {
/* 209 */       return a(☃, i, j);
/*     */     }
/* 211 */     return j;
/*     */   }
/*     */   
/*     */   public enum b
/*     */     implements afs {
/* 216 */     a("standard"),
/* 217 */     b("desert"),
/* 218 */     c("jungle"),
/* 219 */     d("swamp"),
/* 220 */     e("mountain"),
/* 221 */     f("ocean"),
/* 222 */     g("nether");
/*     */     
/* 224 */     public static final Codec<b> h = afs.a(b::values, b::a); private static final Map<String, b> i;
/*     */     static {
/* 226 */       i = (Map<String, b>)Arrays.<b>stream(values()).collect(Collectors.toMap(b::b, ☃ -> ☃));
/*     */     }
/*     */     private final String j;
/*     */     b(String ☃) {
/* 230 */       this.j = ☃;
/*     */     }
/*     */     
/*     */     public String b() {
/* 234 */       return this.j;
/*     */     }
/*     */     
/*     */     public static b a(String ☃) {
/* 238 */       return i.get(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public String a() {
/* 243 */       return this.j;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ckp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */