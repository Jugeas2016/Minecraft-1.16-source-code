/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class lb
/*     */ {
/*  19 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final fx b;
/*     */   private final aag c;
/*     */   private final ll d;
/*     */   private final int e;
/*  25 */   private final List<lf> f = Lists.newArrayList();
/*  26 */   private final Map<lf, fx> g = Maps.newHashMap();
/*  27 */   private final List<Pair<la, Collection<lf>>> h = Lists.newArrayList();
/*     */   
/*     */   private lp i;
/*  30 */   private int j = 0;
/*     */   private fx.a k;
/*     */   
/*     */   public lb(Collection<la> ☃, fx fx1, bzm bzm1, aag aag1, ll ll1, int i) {
/*  34 */     this.k = fx1.i();
/*  35 */     this.b = fx1;
/*  36 */     this.c = aag1;
/*  37 */     this.d = ll1;
/*  38 */     this.e = i;
/*     */     
/*  40 */     ☃.forEach(la1 -> {
/*     */           Collection<lf> collection = Lists.newArrayList();
/*     */           Collection<lu> collection1 = la1.b();
/*     */           for (lu lu : collection1) {
/*     */             lf lf = new lf(lu, ☃, aag1);
/*     */             collection.add(lf);
/*     */             this.f.add(lf);
/*     */           } 
/*     */           this.h.add(Pair.of(la1, collection));
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<lf> a() {
/*  56 */     return this.f;
/*     */   }
/*     */   
/*     */   public void b() {
/*  60 */     a(0);
/*     */   }
/*     */   
/*     */   private void a(int ☃) {
/*  64 */     this.j = ☃;
/*  65 */     this.i = new lp();
/*     */     
/*  67 */     if (☃ >= this.h.size()) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  72 */     Pair<la, Collection<lf>> pair = this.h.get(this.j);
/*  73 */     la la = (la)pair.getFirst();
/*  74 */     Collection<lf> collection = (Collection<lf>)pair.getSecond();
/*  75 */     a(collection);
/*  76 */     la.a(this.c);
/*     */     
/*  78 */     String str = la.a();
/*     */     
/*  80 */     a.info("Running test batch '" + str + "' (" + collection.size() + " tests)...");
/*  81 */     collection.forEach(☃ -> {
/*     */           this.i.a(☃);
/*     */           this.i.a(new lg(this)
/*     */               {
/*     */                 public void a(lf ☃) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*     */                 public void c(lf ☃) {
/*  95 */                   lb.a(this.a, ☃);
/*     */                 }
/*     */               });
/*     */           fx fx1 = this.g.get(☃);
/*     */           li.a(☃, fx1, this.d);
/*     */         });
/*     */   }
/*     */   
/*     */   private void a(lf ☃) {
/* 104 */     if (this.i.i()) {
/* 105 */       a(this.j + 1);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(Collection<lf> ☃) {
/* 110 */     int i = 0;
/* 111 */     dci dci = new dci(this.k);
/*     */     
/* 113 */     for (lf lf : ☃) {
/* 114 */       fx fx1 = new fx(this.k);
/* 115 */       cdj cdj = lq.a(lf.s(), fx1, lf.t(), 2, this.c, true);
/* 116 */       dci dci1 = lq.a(cdj);
/* 117 */       lf.a(cdj.o());
/* 118 */       this.g.put(lf, new fx(this.k));
/* 119 */       dci = dci.b(dci1);
/*     */       
/* 121 */       this.k.e((int)dci1.b() + 5, 0, 0);
/*     */       
/* 123 */       if (i++ % this.e == this.e - 1) {
/*     */         
/* 125 */         this.k.e(0, 0, (int)dci.d() + 6);
/* 126 */         this.k.o(this.b.u());
/* 127 */         dci = new dci(this.k);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\lb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */