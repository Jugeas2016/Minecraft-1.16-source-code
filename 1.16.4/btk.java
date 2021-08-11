/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import java.util.List;
/*     */ import java.util.function.BiFunction;
/*     */ 
/*     */ public class btk extends bsy {
/*     */   public static final Codec<btk> e;
/*     */   
/*     */   static {
/*  13 */     e = RecordCodecBuilder.create(☃ -> ☃.group((App)vg.<bsv>a(gm.ay).forGetter(()), (App)Codec.LONG.fieldOf("seed").stable().forGetter(())).apply((Applicative)☃, ☃.stable(btk::new)));
/*     */   }
/*     */ 
/*     */   
/*     */   private final cud f;
/*     */   
/*     */   private final gm<bsv> g;
/*     */   
/*     */   private final long h;
/*     */   
/*     */   private final bsv i;
/*     */   
/*     */   private final bsv j;
/*     */   
/*     */   private final bsv k;
/*     */   private final bsv l;
/*     */   private final bsv m;
/*     */   
/*     */   public btk(gm<bsv> ☃, long l) {
/*  32 */     this(☃, l, ☃
/*     */ 
/*     */         
/*  35 */         .d(btb.j), ☃
/*  36 */         .d(btb.Q), ☃
/*  37 */         .d(btb.P), ☃
/*  38 */         .d(btb.O), ☃
/*  39 */         .d(btb.R));
/*     */   }
/*     */ 
/*     */   
/*     */   private btk(gm<bsv> ☃, long l, bsv bsv1, bsv bsv2, bsv bsv3, bsv bsv4, bsv bsv5) {
/*  44 */     super((List<bsv>)ImmutableList.of(bsv1, bsv2, bsv3, bsv4, bsv5));
/*  45 */     this.g = ☃;
/*  46 */     this.h = l;
/*  47 */     this.i = bsv1;
/*  48 */     this.j = bsv2;
/*  49 */     this.k = bsv3;
/*  50 */     this.l = bsv4;
/*  51 */     this.m = bsv5;
/*  52 */     chx chx = new chx(l);
/*     */     
/*  54 */     chx.a(17292);
/*  55 */     this.f = new cud(chx);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Codec<? extends bsy> a() {
/*  60 */     return (Codec)e;
/*     */   }
/*     */ 
/*     */   
/*     */   public bsy a(long ☃) {
/*  65 */     return new btk(this.g, ☃, this.i, this.j, this.k, this.l, this.m);
/*     */   }
/*     */ 
/*     */   
/*     */   public bsv b(int ☃, int i, int j) {
/*  70 */     int k = ☃ >> 2;
/*  71 */     int m = j >> 2;
/*     */     
/*  73 */     if (k * k + m * m <= 4096L) {
/*  74 */       return this.i;
/*     */     }
/*     */     
/*  77 */     float f = a(this.f, k * 2 + 1, m * 2 + 1);
/*  78 */     if (f > 40.0F) {
/*  79 */       return this.j;
/*     */     }
/*     */     
/*  82 */     if (f >= 0.0F) {
/*  83 */       return this.k;
/*     */     }
/*     */     
/*  86 */     if (f < -20.0F) {
/*  87 */       return this.l;
/*     */     }
/*     */     
/*  90 */     return this.m;
/*     */   }
/*     */   
/*     */   public boolean b(long ☃) {
/*  94 */     return (this.h == ☃);
/*     */   }
/*     */   
/*     */   public static float a(cud ☃, int i, int j) {
/*  98 */     int k = i / 2;
/*  99 */     int m = j / 2;
/* 100 */     int n = i % 2;
/* 101 */     int i1 = j % 2;
/*     */ 
/*     */     
/* 104 */     float f = 100.0F - afm.c((i * i + j * j)) * 8.0F;
/* 105 */     f = afm.a(f, -100.0F, 80.0F);
/*     */ 
/*     */     
/* 108 */     for (int i2 = -12; i2 <= 12; i2++) {
/* 109 */       for (int i3 = -12; i3 <= 12; i3++) {
/* 110 */         long l1 = (k + i2);
/* 111 */         long l2 = (m + i3);
/* 112 */         if (l1 * l1 + l2 * l2 > 4096L && ☃.a(l1, l2) < -0.8999999761581421D) {
/* 113 */           float f1 = (afm.e((float)l1) * 3439.0F + afm.e((float)l2) * 147.0F) % 13.0F + 9.0F;
/* 114 */           float f2 = (n - i2 * 2);
/* 115 */           float f3 = (i1 - i3 * 2);
/* 116 */           float f4 = 100.0F - afm.c(f2 * f2 + f3 * f3) * f1;
/* 117 */           f4 = afm.a(f4, -100.0F, 80.0F);
/* 118 */           f = Math.max(f, f4);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 123 */     return f;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\btk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */