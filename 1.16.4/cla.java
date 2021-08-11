/*     */ import com.google.common.collect.BiMap;
/*     */ import com.google.common.collect.HashBiMap;
/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class cla<C extends cma>
/*     */ {
/*  52 */   public static final BiMap<String, cla<?>> a = (BiMap<String, cla<?>>)HashBiMap.create();
/*  53 */   private static final Map<cla<?>, chm.b> u = Maps.newHashMap();
/*     */   
/*  55 */   private static final Logger v = LogManager.getLogger();
/*     */   
/*  57 */   public static final cla<cmc> b = a("Pillager_Outpost", new ckj(cmc.a), chm.b.e);
/*  58 */   public static final cla<cme> c = a("Mineshaft", new ckb(cme.a), chm.b.d);
/*  59 */   public static final cla<cmh> d = a("Mansion", new clk(cmh.a), chm.b.e);
/*  60 */   public static final cla<cmh> e = a("Jungle_Pyramid", new cjy(cmh.a), chm.b.e);
/*  61 */   public static final cla<cmh> f = a("Desert_Pyramid", new cje(cmh.a), chm.b.e);
/*  62 */   public static final cla<cmh> g = a("Igloo", new cjw(cmh.a), chm.b.e);
/*  63 */   public static final cla<cmr> h = a("Ruined_Portal", new ckp(cmr.a), chm.b.e);
/*  64 */   public static final cla<cms> i = a("Shipwreck", new cks(cms.a), chm.b.e);
/*  65 */   public static final clc j = a("Swamp_Hut", new clc(cmh.a), chm.b.e);
/*  66 */   public static final cla<cmh> k = a("Stronghold", new ckz(cmh.a), chm.b.f);
/*  67 */   public static final cla<cmh> l = a("Monument", new ckh(cmh.a), chm.b.e);
/*  68 */   public static final cla<cmi> m = a("Ocean_Ruin", new crm(cmi.a), chm.b.e);
/*  69 */   public static final cla<cmh> n = a("Fortress", new cke(cmh.a), chm.b.h);
/*  70 */   public static final cla<cmh> o = a("EndCity", new cjh(cmh.a), chm.b.e);
/*  71 */   public static final cla<cmk> p = a("Buried_Treasure", new cit(cmk.b), chm.b.d);
/*  72 */   public static final cla<cmc> q = a("Village", new clf(cmc.a), chm.b.e);
/*  73 */   public static final cla<cmh> r = a("Nether_Fossil", new crj(cmh.a), chm.b.h);
/*  74 */   public static final cla<cmc> s = a("Bastion_Remnant", new cio(cmc.a), chm.b.e);
/*     */   
/*  76 */   public static final List<cla<?>> t = (List<cla<?>>)ImmutableList.of(b, q, r);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  83 */   private static final vk w = new vk("jigsaw");
/*  84 */   private static final Map<vk, vk> x = (Map<vk, vk>)ImmutableMap.builder()
/*  85 */     .put(new vk("nvi"), w)
/*  86 */     .put(new vk("pcp"), w)
/*  87 */     .put(new vk("bastionremnant"), w)
/*  88 */     .put(new vk("runtime"), w)
/*  89 */     .build();
/*     */   private final Codec<ciw<C, cla<C>>> y;
/*     */   
/*     */   private static <F extends cla<?>> F a(String ☃, F f, chm.b b1) {
/*  93 */     a.put(☃.toLowerCase(Locale.ROOT), f);
/*  94 */     u.put((cla<?>)f, b1);
/*  95 */     return (F)gm.<cla>a((gm)gm.aG, ☃.toLowerCase(Locale.ROOT), (cla)f);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public cla(Codec<C> ☃) {
/* 103 */     this.y = ☃.fieldOf("config").xmap(☃ -> new ciw<>(this, ☃), ☃ -> ☃.e).codec();
/*     */   }
/*     */   
/*     */   public chm.b f() {
/* 107 */     return u.get(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void g() {}
/*     */   
/*     */   @Nullable
/*     */   public static crv<?> a(csw ☃, md md1, long l) {
/* 115 */     String str = md1.l("id");
/* 116 */     if ("INVALID".equals(str)) {
/* 117 */       return crv.a;
/*     */     }
/*     */ 
/*     */     
/* 121 */     cla<?> cla1 = gm.aG.a(new vk(str.toLowerCase(Locale.ROOT)));
/* 122 */     if (cla1 == null) {
/* 123 */       v.error("Unknown feature id: {}", str);
/* 124 */       return null;
/*     */     } 
/*     */     
/* 127 */     int i = md1.h("ChunkX");
/* 128 */     int j = md1.h("ChunkZ");
/* 129 */     int k = md1.h("references");
/* 130 */     cra cra = md1.e("BB") ? new cra(md1.n("BB")) : cra.a();
/* 131 */     mj mj = md1.d("Children", 10);
/*     */     
/*     */     try {
/* 134 */       crv<?> crv = cla1.a(i, j, cra, k, l);
/* 135 */       for (int m = 0; m < mj.size(); m++) {
/* 136 */         md md2 = mj.a(m);
/* 137 */         String str1 = md2.l("id").toLowerCase(Locale.ROOT);
/* 138 */         vk vk1 = new vk(str1);
/* 139 */         vk vk2 = x.getOrDefault(vk1, vk1);
/*     */         
/* 141 */         clb clb = gm.aI.a(vk2);
/*     */         
/* 143 */         if (clb == null) {
/* 144 */           v.error("Unknown structure piece id: {}", vk2);
/*     */         } else {
/*     */ 
/*     */           
/*     */           try {
/* 149 */             cru cru = clb.load(☃, md2);
/* 150 */             crv.d().add(cru);
/* 151 */           } catch (Exception exception) {
/* 152 */             v.error("Exception loading structure piece with id {}", vk2, exception);
/*     */           } 
/*     */         } 
/* 155 */       }  return crv;
/* 156 */     } catch (Exception exception) {
/* 157 */       v.error("Failed Start with id {}", str, exception);
/* 158 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public Codec<ciw<C, cla<C>>> h() {
/* 163 */     return this.y;
/*     */   }
/*     */   
/*     */   public ciw<C, ? extends cla<C>> a(C ☃) {
/* 167 */     return new ciw<>(this, ☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public fx a(brz ☃, bsn bsn1, fx fx1, int i, boolean bool, long l, cmy cmy1) {
/* 172 */     int j = cmy1.a();
/*     */     
/* 174 */     int k = fx1.u() >> 4;
/* 175 */     int m = fx1.w() >> 4;
/*     */     
/* 177 */     int n = 0;
/* 178 */     chx chx = new chx();
/* 179 */     while (n <= i) {
/* 180 */       for (int i1 = -n; i1 <= n; i1++) {
/* 181 */         boolean bool1 = (i1 == -n || i1 == n);
/* 182 */         for (int i2 = -n; i2 <= n; i2++) {
/* 183 */           boolean bool2 = (i2 == -n || i2 == n);
/* 184 */           if (bool1 || bool2) {
/*     */ 
/*     */ 
/*     */             
/* 188 */             int i3 = k + j * i1;
/* 189 */             int i4 = m + j * i2;
/*     */             
/* 191 */             brd brd = a(cmy1, l, chx, i3, i4);
/* 192 */             cfw cfw = ☃.a(brd.b, brd.c, cga.b);
/* 193 */             crv<?> crv = bsn1.a(gp.a(cfw.g(), 0), this, cfw);
/* 194 */             if (crv != null && crv.e()) {
/* 195 */               if (bool && crv.h()) {
/* 196 */                 crv.i();
/* 197 */                 return crv.a();
/* 198 */               }  if (!bool) {
/* 199 */                 return crv.a();
/*     */               }
/*     */             } 
/*     */             
/* 203 */             if (n == 0)
/*     */               break; 
/*     */           } 
/*     */         } 
/* 207 */         if (n == 0) {
/*     */           break;
/*     */         }
/*     */       } 
/* 211 */       n++;
/*     */     } 
/*     */     
/* 214 */     return null;
/*     */   }
/*     */   
/*     */   protected boolean b() {
/* 218 */     return true;
/*     */   }
/*     */   
/*     */   public final brd a(cmy ☃, long l, chx chx1, int i, int j) {
/* 222 */     int i2, i3, k = ☃.a();
/* 223 */     int m = ☃.b();
/*     */     
/* 225 */     int n = Math.floorDiv(i, k);
/* 226 */     int i1 = Math.floorDiv(j, k);
/*     */     
/* 228 */     chx1.a(l, n, i1, ☃.c());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 233 */     if (b()) {
/* 234 */       i2 = chx1.nextInt(k - m);
/* 235 */       i3 = chx1.nextInt(k - m);
/*     */     } else {
/* 237 */       i2 = (chx1.nextInt(k - m) + chx1.nextInt(k - m)) / 2;
/* 238 */       i3 = (chx1.nextInt(k - m) + chx1.nextInt(k - m)) / 2;
/*     */     } 
/*     */     
/* 241 */     return new brd(n * k + i2, i1 * k + i3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(cfy ☃, bsy bsy1, long l, chx chx1, int i, int j, bsv bsv1, brd brd1, C c) {
/* 248 */     return true;
/*     */   }
/*     */   
/*     */   private crv<C> a(int ☃, int i, cra cra1, int j, long l) {
/* 252 */     return a().create(this, ☃, i, cra1, j, l);
/*     */   }
/*     */   
/*     */   public crv<?> a(gn ☃, cfy cfy1, bsy bsy1, csw csw1, long l, brd brd1, bsv bsv1, int i, chx chx1, cmy cmy1, C c) {
/* 256 */     brd brd2 = a(cmy1, l, chx1, brd1.b, brd1.c);
/* 257 */     if (brd1.b == brd2.b && brd1.c == brd2.c && 
/*     */       
/* 259 */       a(cfy1, bsy1, l, chx1, brd1.b, brd1.c, bsv1, brd2, c)) {
/* 260 */       crv<C> crv = a(brd1.b, brd1.c, cra.a(), i, l);
/* 261 */       crv.a(☃, cfy1, csw1, brd1.b, brd1.c, bsv1, c);
/* 262 */       if (crv.e()) {
/* 263 */         return crv;
/*     */       }
/*     */     } 
/* 266 */     return crv.a;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String i() {
/* 272 */     return (String)a.inverse().get(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<btg.c> c() {
/* 280 */     return (List<btg.c>)ImmutableList.of();
/*     */   }
/*     */   
/*     */   public List<btg.c> j() {
/* 284 */     return (List<btg.c>)ImmutableList.of();
/*     */   }
/*     */   
/*     */   public abstract a<C> a();
/*     */   
/*     */   public static interface a<C extends cma> {
/*     */     crv<C> create(cla<C> param1cla, int param1Int1, int param1Int2, cra param1cra, int param1Int3, long param1Long);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cla.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */