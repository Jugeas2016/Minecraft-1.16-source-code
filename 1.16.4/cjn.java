/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.Random;
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
/*     */ public class cjn
/*     */   extends cjl<cmh>
/*     */ {
/*  26 */   private static final vk a = new vk("fossil/spine_1");
/*  27 */   private static final vk ab = new vk("fossil/spine_2");
/*  28 */   private static final vk ac = new vk("fossil/spine_3");
/*  29 */   private static final vk ad = new vk("fossil/spine_4");
/*     */   
/*  31 */   private static final vk ae = new vk("fossil/spine_1_coal");
/*  32 */   private static final vk af = new vk("fossil/spine_2_coal");
/*  33 */   private static final vk ag = new vk("fossil/spine_3_coal");
/*  34 */   private static final vk ah = new vk("fossil/spine_4_coal");
/*     */   
/*  36 */   private static final vk ai = new vk("fossil/skull_1");
/*  37 */   private static final vk aj = new vk("fossil/skull_2");
/*  38 */   private static final vk ak = new vk("fossil/skull_3");
/*  39 */   private static final vk al = new vk("fossil/skull_4");
/*     */   
/*  41 */   private static final vk am = new vk("fossil/skull_1_coal");
/*  42 */   private static final vk an = new vk("fossil/skull_2_coal");
/*  43 */   private static final vk ao = new vk("fossil/skull_3_coal");
/*  44 */   private static final vk ap = new vk("fossil/skull_4_coal");
/*     */   
/*  46 */   private static final vk[] aq = new vk[] { a, ab, ac, ad, ai, aj, ak, al };
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
/*  57 */   private static final vk[] ar = new vk[] { ae, af, ag, ah, am, an, ao, ap };
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
/*     */   public cjn(Codec<cmh> ☃) {
/*  69 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmh cmh1) {
/*  74 */     bzm bzm = bzm.a(random);
/*     */     
/*  76 */     int i = random.nextInt(aq.length);
/*     */ 
/*     */     
/*  79 */     csw csw = ☃.E().l().aW();
/*  80 */     ctb ctb1 = csw.a(aq[i]);
/*  81 */     ctb ctb2 = csw.a(ar[i]);
/*  82 */     brd brd = new brd(fx1);
/*  83 */     cra cra = new cra(brd.d(), 0, brd.e(), brd.f(), 256, brd.g());
/*  84 */     csx csx = (new csx()).a(bzm).a(cra).a(random).a(cse.d);
/*     */     
/*  86 */     fx fx2 = ctb1.a(bzm);
/*  87 */     int j = random.nextInt(16 - fx2.u());
/*  88 */     int k = random.nextInt(16 - fx2.w());
/*     */     
/*  90 */     int m = 256; int n;
/*  91 */     for (n = 0; n < fx2.u(); n++) {
/*  92 */       for (int i1 = 0; i1 < fx2.w(); i1++) {
/*  93 */         m = Math.min(m, ☃.a(chn.a.c, fx1.u() + n + j, fx1.w() + i1 + k));
/*     */       }
/*     */     } 
/*  96 */     n = Math.max(m - 15 - random.nextInt(10), 10);
/*     */     
/*  98 */     fx fx3 = ctb1.a(fx1.b(j, n, k), byg.a, bzm);
/*     */     
/* 100 */     csg csg1 = new csg(0.9F);
/* 101 */     csx.b().a(csg1);
/* 102 */     ctb1.a(☃, fx3, fx3, csx, random, 4);
/* 103 */     csx.b(csg1);
/*     */     
/* 105 */     csg csg2 = new csg(0.1F);
/* 106 */     csx.b().a(csg2);
/* 107 */     ctb2.a(☃, fx3, fx3, csx, random, 4);
/*     */     
/* 109 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cjn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */