/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.ints.IntSet;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import org.apache.commons.io.IOUtils;
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
/*     */ public class dpa
/*     */   extends dot
/*     */ {
/*  32 */   private static final Logger a = LogManager.getLogger();
/*  33 */   private static final vk b = new vk("textures/gui/title/minecraft.png");
/*  34 */   private static final vk c = new vk("textures/gui/title/edition.png");
/*  35 */   private static final vk p = new vk("textures/misc/vignette.png");
/*     */   
/*  37 */   private static final String q = "" + k.p + k.q + k.k + k.l;
/*     */   
/*     */   private final boolean r;
/*     */   
/*     */   private final Runnable s;
/*     */   private float t;
/*     */   private List<afa> u;
/*     */   private IntSet v;
/*     */   private int w;
/*  46 */   private float x = 0.5F;
/*     */   
/*     */   public dpa(boolean ☃, Runnable runnable) {
/*  49 */     super(dkz.a);
/*  50 */     this.r = ☃;
/*  51 */     this.s = runnable;
/*  52 */     if (!☃) {
/*  53 */       this.x = 0.75F;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  59 */     this.i.p().a();
/*  60 */     this.i.W().a(false);
/*  61 */     float ☃ = (this.w + this.l + this.l + 24) / this.x;
/*  62 */     if (this.t > ☃) {
/*  63 */       h();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void at_() {
/*  69 */     h();
/*     */   }
/*     */   
/*     */   private void h() {
/*  73 */     this.s.run();
/*  74 */     this.i.a((dot)null);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  79 */     if (this.u != null) {
/*     */       return;
/*     */     }
/*     */     
/*  83 */     this.u = Lists.newArrayList();
/*  84 */     this.v = (IntSet)new IntOpenHashSet();
/*  85 */     acg ☃ = null;
/*     */     try {
/*  87 */       int i = 274;
/*  88 */       if (this.r) {
/*  89 */         ☃ = this.i.N().a(new vk("texts/end.txt"));
/*  90 */         InputStream inputStream1 = ☃.b();
/*  91 */         BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(inputStream1, StandardCharsets.UTF_8));
/*  92 */         Random random = new Random(8124371L);
/*     */         
/*     */         String str1;
/*  95 */         while ((str1 = bufferedReader1.readLine()) != null) {
/*  96 */           str1 = str1.replaceAll("PLAYERNAME", this.i.J().c());
/*     */           
/*     */           int k;
/*  99 */           while ((k = str1.indexOf(q)) != -1) {
/* 100 */             String str2 = str1.substring(0, k);
/* 101 */             String str3 = str1.substring(k + q.length());
/* 102 */             str1 = str2 + k.p + k.q + "XXXXXXXX".substring(0, random.nextInt(4) + 3) + str3;
/*     */           } 
/* 104 */           this.u.addAll(this.i.g.b(new oe(str1), 274));
/* 105 */           this.u.add(afa.a);
/*     */         } 
/* 107 */         inputStream1.close();
/*     */         
/* 109 */         for (int j = 0; j < 8; j++) {
/* 110 */           this.u.add(afa.a);
/*     */         }
/*     */       } 
/*     */       
/* 114 */       InputStream inputStream = this.i.N().a(new vk("texts/credits.txt")).b();
/* 115 */       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
/*     */       String str;
/* 117 */       while ((str = bufferedReader.readLine()) != null) {
/* 118 */         boolean bool; str = str.replaceAll("PLAYERNAME", this.i.J().c());
/* 119 */         str = str.replaceAll("\t", "    ");
/*     */ 
/*     */         
/* 122 */         if (str.startsWith("[C]")) {
/* 123 */           str = str.substring(3);
/* 124 */           bool = true;
/*     */         } else {
/* 126 */           bool = false;
/*     */         } 
/*     */         
/* 129 */         List<afa> list = this.i.g.b(new oe(str), 274);
/* 130 */         for (afa afa : list) {
/* 131 */           if (bool) {
/* 132 */             this.v.add(this.u.size());
/*     */           }
/* 134 */           this.u.add(afa);
/*     */         } 
/* 136 */         this.u.add(afa.a);
/*     */       } 
/* 138 */       inputStream.close();
/*     */       
/* 140 */       this.w = this.u.size() * 12;
/* 141 */     } catch (Exception exception) {
/* 142 */       a.error("Couldn't load credits", exception);
/*     */     } finally {
/* 144 */       IOUtils.closeQuietly(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i, float f) {
/* 149 */     this.i.M().a(dkw.f);
/* 150 */     int j = this.k;
/* 151 */     float f1 = -this.t * 0.5F * this.x;
/* 152 */     float f2 = this.l - this.t * 0.5F * this.x;
/* 153 */     float f3 = 0.015625F;
/*     */     
/* 155 */     float f4 = this.t * 0.02F;
/*     */     
/* 157 */     float f5 = (this.w + this.l + this.l + 24) / this.x;
/* 158 */     float f6 = (f5 - 20.0F - this.t) * 0.005F;
/* 159 */     if (f6 < f4) {
/* 160 */       f4 = f6;
/*     */     }
/* 162 */     if (f4 > 1.0F) {
/* 163 */       f4 = 1.0F;
/*     */     }
/* 165 */     f4 *= f4;
/* 166 */     f4 = f4 * 96.0F / 255.0F;
/*     */     
/* 168 */     dfo dfo = dfo.a();
/* 169 */     dfh dfh = dfo.c();
/* 170 */     dfh.a(7, dfk.p);
/* 171 */     dfh.a(0.0D, this.l, v()).a(0.0F, f1 * 0.015625F).a(f4, f4, f4, 1.0F).d();
/* 172 */     dfh.a(j, this.l, v()).a(j * 0.015625F, f1 * 0.015625F).a(f4, f4, f4, 1.0F).d();
/* 173 */     dfh.a(j, 0.0D, v()).a(j * 0.015625F, f2 * 0.015625F).a(f4, f4, f4, 1.0F).d();
/* 174 */     dfh.a(0.0D, 0.0D, v()).a(0.0F, f2 * 0.015625F).a(f4, f4, f4, 1.0F).d();
/* 175 */     dfo.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 180 */     a(i, j, f);
/*     */     
/* 182 */     int k = 274;
/* 183 */     int m = this.k / 2 - 137;
/* 184 */     int n = this.l + 50;
/*     */     
/* 186 */     this.t += f;
/* 187 */     float f1 = -this.t * this.x;
/* 188 */     RenderSystem.pushMatrix();
/* 189 */     RenderSystem.translatef(0.0F, f1, 0.0F);
/* 190 */     this.i.M().a(b);
/* 191 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 192 */     RenderSystem.enableAlphaTest();
/*     */     
/* 194 */     RenderSystem.enableBlend();
/* 195 */     a(m, n, (integer1, integer2) -> {
/*     */           b(☃, integer1.intValue() + 0, integer2.intValue(), 0, 0, 155, 44);
/*     */           b(☃, integer1.intValue() + 155, integer2.intValue(), 0, 45, 155, 44);
/*     */         });
/* 199 */     RenderSystem.disableBlend();
/*     */     
/* 201 */     this.i.M().a(c);
/* 202 */     a(☃, m + 88, n + 37, 0.0F, 0.0F, 98, 14, 128, 16);
/* 203 */     RenderSystem.disableAlphaTest();
/* 204 */     int i1 = n + 100;
/*     */     int i2;
/* 206 */     for (i2 = 0; i2 < this.u.size(); i2++) {
/* 207 */       if (i2 == this.u.size() - 1) {
/* 208 */         float f2 = i1 + f1 - (this.l / 2 - 6);
/* 209 */         if (f2 < 0.0F) {
/* 210 */           RenderSystem.translatef(0.0F, -f2, 0.0F);
/*     */         }
/*     */       } 
/* 213 */       if (i1 + f1 + 12.0F + 8.0F > 0.0F && i1 + f1 < this.l) {
/* 214 */         afa afa = this.u.get(i2);
/* 215 */         if (this.v.contains(i2)) {
/* 216 */           this.o.a(☃, afa, (m + (274 - this.o.a(afa)) / 2), i1, 16777215);
/*     */         } else {
/* 218 */           this.o.b.setSeed((long)((float)(i2 * 4238972211L) + this.t / 4.0F));
/* 219 */           this.o.a(☃, afa, m, i1, 16777215);
/*     */         } 
/*     */       } 
/* 222 */       i1 += 12;
/*     */     } 
/*     */     
/* 225 */     RenderSystem.popMatrix();
/*     */     
/* 227 */     this.i.M().a(p);
/* 228 */     RenderSystem.enableBlend();
/* 229 */     RenderSystem.blendFunc(dem.r.o, dem.j.k);
/*     */     
/* 231 */     i2 = this.k;
/* 232 */     int i3 = this.l;
/*     */     
/* 234 */     dfo dfo = dfo.a();
/* 235 */     dfh dfh = dfo.c();
/* 236 */     dfh.a(7, dfk.p);
/* 237 */     dfh.a(0.0D, i3, v()).a(0.0F, 1.0F).a(1.0F, 1.0F, 1.0F, 1.0F).d();
/* 238 */     dfh.a(i2, i3, v()).a(1.0F, 1.0F).a(1.0F, 1.0F, 1.0F, 1.0F).d();
/* 239 */     dfh.a(i2, 0.0D, v()).a(1.0F, 0.0F).a(1.0F, 1.0F, 1.0F, 1.0F).d();
/* 240 */     dfh.a(0.0D, 0.0D, v()).a(0.0F, 0.0F).a(1.0F, 1.0F, 1.0F, 1.0F).d();
/* 241 */     dfo.b();
/*     */     
/* 243 */     RenderSystem.disableBlend();
/*     */     
/* 245 */     super.a(☃, i, j, f);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */