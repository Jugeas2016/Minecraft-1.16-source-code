/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMaps;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
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
/*     */ public class d
/*     */ {
/*     */   private final int a;
/*     */   private final Object2IntOpenHashMap<aqo> b;
/*     */   private final bsj c;
/*     */   private final Object2IntMap<aqo> d;
/*     */   @Nullable
/*     */   private fx e;
/*     */   @Nullable
/*     */   private aqe<?> f;
/*     */   private double g;
/*     */   
/*     */   private d(int ☃, Object2IntOpenHashMap<aqo> object2IntOpenHashMap, bsj bsj1) {
/*  70 */     this.a = ☃;
/*  71 */     this.b = object2IntOpenHashMap;
/*  72 */     this.c = bsj1;
/*  73 */     this.d = Object2IntMaps.unmodifiable((Object2IntMap)object2IntOpenHashMap);
/*     */   }
/*     */   
/*     */   private boolean a(aqe<?> ☃, fx fx1, cfw cfw1) {
/*  77 */     this.e = fx1;
/*  78 */     this.f = ☃;
/*     */     
/*  80 */     btg.b b = bsg.a(fx1, cfw1).b().a(☃);
/*  81 */     if (b == null) {
/*  82 */       this.g = 0.0D;
/*  83 */       return true;
/*     */     } 
/*  85 */     double d1 = b.b();
/*  86 */     this.g = d1;
/*  87 */     double d2 = this.c.b(fx1, d1);
/*  88 */     return (d2 <= b.a());
/*     */   }
/*     */   private void a(aqn ☃, cfw cfw1) {
/*     */     double d1;
/*  92 */     aqe<?> aqe1 = ☃.X();
/*     */     
/*  94 */     fx fx1 = ☃.cB();
/*  95 */     if (fx1.equals(this.e) && aqe1 == this.f) {
/*  96 */       d1 = this.g;
/*     */     } else {
/*     */       
/*  99 */       btg.b b = bsg.a(fx1, cfw1).b().a(aqe1);
/* 100 */       if (b != null) {
/* 101 */         d1 = b.b();
/*     */       } else {
/* 103 */         d1 = 0.0D;
/*     */       } 
/*     */     } 
/* 106 */     this.c.a(fx1, d1);
/* 107 */     this.b.addTo(aqe1.e(), 1);
/*     */   }
/*     */   
/*     */   public int a() {
/* 111 */     return this.a;
/*     */   }
/*     */   
/*     */   public Object2IntMap<aqo> b() {
/* 115 */     return this.d;
/*     */   }
/*     */   
/*     */   private boolean a(aqo ☃) {
/* 119 */     int i = ☃.c() * this.a / bsg.a();
/* 120 */     return (this.b.getInt(☃) < i);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsg$d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */