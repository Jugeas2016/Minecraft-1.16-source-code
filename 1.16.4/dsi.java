/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
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
/*     */ public class dsi
/*     */   extends dot
/*     */ {
/*     */   private static final Object2IntMap<vj<brx>> b;
/*  29 */   private static final Logger a = LogManager.getLogger();
/*     */   static {
/*  31 */     b = (Object2IntMap<vj<brx>>)x.a(new Object2IntOpenCustomHashMap(x.k()), ☃ -> {
/*     */           ☃.put(brx.g, -13408734);
/*     */           ☃.put(brx.h, -10075085);
/*     */           ☃.put(brx.i, -8943531);
/*     */           ☃.defaultReturnValue(-2236963);
/*     */         });
/*     */   }
/*     */   private final BooleanConsumer c;
/*     */   private final aoi p;
/*     */   
/*     */   @Nullable
/*     */   public static dsi a(djz ☃, BooleanConsumer booleanConsumer, DataFixer dataFixer, cyg.a a1, boolean bool) {
/*  43 */     gn.b b = gn.b();
/*     */     
/*  45 */     try (djz.b ☃ = ☃.a(b, djz::a, djz::a, false, a1)) {
/*  46 */       cyn cyn = b1.c();
/*  47 */       a1.a(b, cyn);
/*  48 */       ImmutableSet<vj<brx>> immutableSet = cyn.A().f();
/*  49 */       return new dsi(booleanConsumer, dataFixer, a1, cyn.I(), bool, immutableSet);
/*  50 */     } catch (Exception exception) {
/*  51 */       a.warn("Failed to load datapacks, can't optimize world", exception);
/*  52 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   private dsi(BooleanConsumer ☃, DataFixer dataFixer, cyg.a a1, bsa bsa1, boolean bool, ImmutableSet<vj<brx>> immutableSet) {
/*  57 */     super(new of("optimizeWorld.title", new Object[] { bsa1.a() }));
/*  58 */     this.c = ☃;
/*  59 */     this.p = new aoi(a1, dataFixer, immutableSet, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  64 */     super.b();
/*     */     
/*  66 */     a(new dlj(this.k / 2 - 100, this.l / 4 + 150, 200, 20, nq.d, ☃ -> {
/*     */             this.p.a();
/*     */             this.c.accept(false);
/*     */           }));
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  74 */     if (this.p.b()) {
/*  75 */       this.c.accept(true);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void at_() {
/*  81 */     this.c.accept(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  86 */     this.p.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*  91 */     a(☃);
/*     */     
/*  93 */     a(☃, this.o, this.d, this.k / 2, 20, 16777215);
/*     */     
/*  95 */     int k = this.k / 2 - 150;
/*  96 */     int m = this.k / 2 + 150;
/*  97 */     int n = this.l / 4 + 100;
/*  98 */     int i1 = n + 10;
/*     */     
/* 100 */     this.o.getClass(); a(☃, this.o, this.p.h(), this.k / 2, n - 9 - 2, 10526880);
/*     */     
/* 102 */     if (this.p.e() > 0) {
/* 103 */       a(☃, k - 1, n - 1, m + 1, i1 + 1, -16777216);
/*     */       
/* 105 */       b(☃, this.o, new of("optimizeWorld.info.converted", new Object[] { Integer.valueOf(this.p.f()) }), k, 40, 10526880);
/* 106 */       this.o.getClass(); b(☃, this.o, new of("optimizeWorld.info.skipped", new Object[] { Integer.valueOf(this.p.g()) }), k, 40 + 9 + 3, 10526880);
/* 107 */       this.o.getClass(); b(☃, this.o, new of("optimizeWorld.info.total", new Object[] { Integer.valueOf(this.p.e()) }), k, 40 + (9 + 3) * 2, 10526880);
/*     */       
/* 109 */       int i2 = 0;
/* 110 */       for (UnmodifiableIterator<vj<brx>> unmodifiableIterator = this.p.c().iterator(); unmodifiableIterator.hasNext(); ) { vj<brx> vj = unmodifiableIterator.next();
/* 111 */         int i4 = afm.d(this.p.a(vj) * (m - k));
/* 112 */         a(☃, k + i2, n, k + i2 + i4, i1, b.getInt(vj));
/* 113 */         i2 += i4; }
/*     */ 
/*     */       
/* 116 */       int i3 = this.p.f() + this.p.g();
/* 117 */       this.o.getClass(); a(☃, this.o, i3 + " / " + this.p.e(), this.k / 2, n + 2 * 9 + 2, 10526880);
/* 118 */       this.o.getClass(); a(☃, this.o, afm.d(this.p.d() * 100.0F) + "%", this.k / 2, n + (i1 - n) / 2 - 9 / 2, 10526880);
/*     */     } 
/*     */     
/* 121 */     super.a(☃, i, j, f);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dsi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */