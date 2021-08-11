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
/*     */ public class cgw
/*     */ {
/*     */   public static a a(md ☃) {
/*  18 */     int i = ☃.h("xPos");
/*  19 */     int j = ☃.h("zPos");
/*     */     
/*  21 */     a a = new a(i, j);
/*  22 */     a.g = ☃.m("Blocks");
/*  23 */     a.f = new cgl(☃.m("Data"), 7);
/*  24 */     a.e = new cgl(☃.m("SkyLight"), 7);
/*  25 */     a.d = new cgl(☃.m("BlockLight"), 7);
/*  26 */     a.c = ☃.m("HeightMap");
/*  27 */     a.b = ☃.q("TerrainPopulated");
/*  28 */     a.h = ☃.d("Entities", 10);
/*  29 */     a.i = ☃.d("TileEntities", 10);
/*  30 */     a.j = ☃.d("TileTicks", 10);
/*     */ 
/*     */     
/*     */     try {
/*  34 */       a.a = ☃.i("LastUpdate");
/*  35 */     } catch (ClassCastException classCastException) {
/*  36 */       a.a = ☃.h("LastUpdate");
/*     */     } 
/*     */     
/*  39 */     return a;
/*     */   }
/*     */   
/*     */   public static void a(gn.b ☃, a a1, md md1, bsy bsy1) {
/*  43 */     md1.b("xPos", a1.k);
/*  44 */     md1.b("zPos", a1.l);
/*  45 */     md1.a("LastUpdate", a1.a);
/*  46 */     int[] arrayOfInt = new int[a1.c.length];
/*  47 */     for (int i = 0; i < a1.c.length; i++) {
/*  48 */       arrayOfInt[i] = a1.c[i];
/*     */     }
/*  50 */     md1.a("HeightMap", arrayOfInt);
/*  51 */     md1.a("TerrainPopulated", a1.b);
/*     */     
/*  53 */     mj mj = new mj();
/*  54 */     for (int j = 0; j < 8; j++) {
/*     */       
/*  56 */       boolean bool = true;
/*  57 */       for (int k = 0; k < 16 && bool; k++) {
/*  58 */         for (int m = 0; m < 16 && bool; m++) {
/*  59 */           for (int n = 0; n < 16; n++) {
/*  60 */             int i1 = k << 11 | n << 7 | m + (j << 4);
/*  61 */             int i2 = a1.g[i1];
/*  62 */             if (i2 != 0) {
/*  63 */               bool = false;
/*     */               
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*  70 */       if (!bool) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  75 */         byte[] arrayOfByte = new byte[4096];
/*  76 */         cgb cgb1 = new cgb();
/*  77 */         cgb cgb2 = new cgb();
/*  78 */         cgb cgb3 = new cgb();
/*     */         
/*  80 */         for (int m = 0; m < 16; m++) {
/*  81 */           for (int n = 0; n < 16; n++) {
/*  82 */             for (int i1 = 0; i1 < 16; i1++) {
/*  83 */               int i2 = m << 11 | i1 << 7 | n + (j << 4);
/*  84 */               int i3 = a1.g[i2];
/*     */               
/*  86 */               arrayOfByte[n << 8 | i1 << 4 | m] = (byte)(i3 & 0xFF);
/*  87 */               cgb1.a(m, n, i1, a1.f.a(m, n + (j << 4), i1));
/*  88 */               cgb2.a(m, n, i1, a1.e.a(m, n + (j << 4), i1));
/*  89 */               cgb3.a(m, n, i1, a1.d.a(m, n + (j << 4), i1));
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/*  94 */         md md2 = new md();
/*     */         
/*  96 */         md2.a("Y", (byte)(j & 0xFF));
/*  97 */         md2.a("Blocks", arrayOfByte);
/*  98 */         md2.a("Data", cgb1.a());
/*  99 */         md2.a("SkyLight", cgb2.a());
/* 100 */         md2.a("BlockLight", cgb3.a());
/*     */         
/* 102 */         mj.add(md2);
/*     */       } 
/* 104 */     }  md1.a("Sections", mj);
/* 105 */     md1.a("Biomes", (new cfx(☃.b(gm.ay), new brd(a1.k, a1.l), bsy1)).a());
/* 106 */     md1.a("Entities", a1.h);
/* 107 */     md1.a("TileEntities", a1.i);
/* 108 */     if (a1.j != null) {
/* 109 */       md1.a("TileTicks", a1.j);
/*     */     }
/* 111 */     md1.a("convertedFromAlphaFormat", true);
/*     */   }
/*     */ 
/*     */   
/*     */   public static class a
/*     */   {
/*     */     public long a;
/*     */     public boolean b;
/*     */     public byte[] c;
/*     */     public cgl d;
/*     */     public cgl e;
/*     */     public cgl f;
/*     */     public byte[] g;
/*     */     public mj h;
/*     */     public mj i;
/*     */     public mj j;
/*     */     public final int k;
/*     */     public final int l;
/*     */     
/*     */     public a(int ☃, int i) {
/* 131 */       this.k = ☃;
/* 132 */       this.l = i;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cgw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */