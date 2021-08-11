/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
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
/*     */ public class bcs
/*     */   extends bco
/*     */ {
/*     */   public bcr e;
/*     */   
/*     */   public bcs(aqe<? extends bcs> ☃, brx brx1) {
/*  27 */     super((aqe)☃, brx1);
/*     */   }
/*     */   
/*     */   public bcs(brx ☃, fx fx1, gc gc1) {
/*  31 */     super((aqe)aqe.ad, ☃, fx1);
/*     */     
/*  33 */     List<bcr> list = Lists.newArrayList();
/*  34 */     int i = 0;
/*  35 */     for (bcr bcr1 : gm.X) {
/*  36 */       this.e = bcr1;
/*  37 */       a(gc1);
/*     */       
/*  39 */       if (h()) {
/*  40 */         list.add(bcr1);
/*  41 */         int j = bcr1.a() * bcr1.b();
/*  42 */         if (j > i) {
/*  43 */           i = j;
/*     */         }
/*     */       } 
/*     */     } 
/*  47 */     if (!list.isEmpty()) {
/*     */       
/*  49 */       Iterator<bcr> iterator = list.iterator();
/*  50 */       while (iterator.hasNext()) {
/*  51 */         bcr bcr1 = iterator.next();
/*  52 */         if (bcr1.a() * bcr1.b() < i) {
/*  53 */           iterator.remove();
/*     */         }
/*     */       } 
/*  56 */       this.e = list.get(this.J.nextInt(list.size()));
/*     */     } 
/*  58 */     a(gc1);
/*     */   }
/*     */   
/*     */   public bcs(brx ☃, fx fx1, gc gc1, bcr bcr1) {
/*  62 */     this(☃, fx1, gc1);
/*     */     
/*  64 */     this.e = bcr1;
/*  65 */     a(gc1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/*  70 */     ☃.a("Motive", gm.X.b(this.e).toString());
/*  71 */     ☃.a("Facing", (byte)this.d.d());
/*  72 */     super.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/*  77 */     this.e = gm.X.a(vk.a(☃.l("Motive")));
/*  78 */     this.d = gc.b(☃.f("Facing"));
/*  79 */     super.a(☃);
/*  80 */     a(this.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public int i() {
/*  85 */     if (this.e == null) {
/*  86 */       return 1;
/*     */     }
/*  88 */     return this.e.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public int k() {
/*  93 */     if (this.e == null) {
/*  94 */       return 1;
/*     */     }
/*  96 */     return this.e.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable aqa ☃) {
/* 101 */     if (!this.l.V().b(brt.g)) {
/*     */       return;
/*     */     }
/*     */     
/* 105 */     a(adq.jI, 1.0F, 1.0F);
/*     */     
/* 107 */     if (☃ instanceof bfw) {
/* 108 */       bfw bfw = (bfw)☃;
/*     */       
/* 110 */       if (bfw.bC.d) {
/*     */         return;
/*     */       }
/*     */     } 
/*     */     
/* 115 */     a(bmd.lz);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m() {
/* 120 */     a(adq.jJ, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(double ☃, double d1, double d2, float f1, float f2) {
/* 125 */     d(☃, d1, d2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(double ☃, double d1, double d2, float f1, float f2, int i, boolean bool) {
/* 130 */     fx fx = this.c.a(☃ - cD(), d1 - cE(), d2 - cH());
/* 131 */     d(fx.u(), fx.v(), fx.w());
/*     */   }
/*     */ 
/*     */   
/*     */   public oj<?> P() {
/* 136 */     return new oq(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bcs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */