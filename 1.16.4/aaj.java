/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectArrayList;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectList;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectListIterator;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.atomic.AtomicBoolean;
/*     */ import java.util.function.IntSupplier;
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
/*     */ public class aaj
/*     */   extends cuo
/*     */   implements AutoCloseable
/*     */ {
/*  30 */   private static final Logger a = LogManager.getLogger();
/*     */   private final aoe<Runnable> b;
/*  32 */   private final ObjectList<Pair<a, Runnable>> c = (ObjectList<Pair<a, Runnable>>)new ObjectArrayList();
/*     */   private final zs d;
/*     */   private final aod<zu.a<Runnable>> e;
/*  35 */   private volatile int f = 5;
/*  36 */   private final AtomicBoolean g = new AtomicBoolean();
/*     */   
/*     */   public aaj(cgj ☃, zs zs1, boolean bool, aoe<Runnable> aoe1, aod<zu.a<Runnable>> aod1) {
/*  39 */     super(☃, true, bool);
/*  40 */     this.d = zs1;
/*  41 */     this.e = aod1;
/*  42 */     this.b = aoe1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() {}
/*     */ 
/*     */   
/*     */   public int a(int ☃, boolean bool1, boolean bool2) {
/*  51 */     throw (UnsupportedOperationException)x.c(new UnsupportedOperationException("Ran authomatically on a different thread!"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(fx ☃, int i) {
/*  56 */     throw (UnsupportedOperationException)x.c(new UnsupportedOperationException("Ran authomatically on a different thread!"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(fx ☃) {
/*  61 */     fx fx1 = ☃.h();
/*  62 */     a(☃.u() >> 4, ☃.w() >> 4, a.b, x.a(() -> super.a(☃), () -> "checkBlock " + ☃));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(brd ☃) {
/*  67 */     a(☃.b, ☃.c, () -> 0, a.a, x.a(() -> {
/*     */             super.b(☃, false);
/*     */             super.a(☃, false);
/*     */             int i;
/*     */             for (i = -1; i < 17; i++) {
/*     */               super.a(bsf.b, gp.a(☃, i), null, true);
/*     */               super.a(bsf.a, gp.a(☃, i), null, true);
/*     */             } 
/*     */             for (i = 0; i < 16; i++) {
/*     */               super.a(gp.a(☃, i), true);
/*     */             }
/*     */           }() -> "updateChunkStatus " + ☃ + " " + '\001'));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(gp ☃, boolean bool) {
/*  86 */     a(☃.a(), ☃.c(), () -> 0, a.a, x.a(() -> super.a(☃, bool), () -> "updateSectionStatus " + ☃ + " " + bool));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brd ☃, boolean bool) {
/*  91 */     a(☃.b, ☃.c, a.a, x.a(() -> super.a(☃, bool), () -> "enableLight " + ☃ + " " + bool));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bsf ☃, gp gp1, @Nullable cgb cgb1, boolean bool) {
/*  97 */     a(gp1.a(), gp1.c(), () -> 0, a.a, x.a(() -> super.a(☃, gp1, cgb1, bool), () -> "queueData " + ☃));
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i, a a1, Runnable runnable) {
/* 101 */     a(☃, i, this.d.c(brd.a(☃, i)), a1, runnable);
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i, IntSupplier intSupplier, a a1, Runnable runnable) {
/* 105 */     this.e.a(zu.a(() -> {
/*     */             this.c.add(Pair.of(☃, runnable));
/*     */             if (this.c.size() >= this.f) {
/*     */               b();
/*     */             }
/* 110 */           }brd.a(☃, i), intSupplier));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(brd ☃, boolean bool) {
/* 115 */     a(☃.b, ☃.c, () -> 0, a.a, x.a(() -> super.b(☃, bool), () -> "retainData " + ☃));
/*     */   }
/*     */   
/*     */   public CompletableFuture<cfw> a(cfw ☃, boolean bool) {
/* 119 */     brd brd = ☃.g();
/* 120 */     ☃.b(false);
/* 121 */     a(brd.b, brd.c, a.a, x.a(() -> {
/*     */             cgi[] arrayOfCgi = ☃.d();
/*     */ 
/*     */             
/*     */             for (int i = 0; i < 16; i++) {
/*     */               cgi cgi = arrayOfCgi[i];
/*     */               
/*     */               if (!cgi.a(cgi)) {
/*     */                 super.a(gp.a(brd1, i), false);
/*     */               }
/*     */             } 
/*     */             
/*     */             super.a(brd1, true);
/*     */             
/*     */             if (!bool) {
/*     */               ☃.m().forEach(());
/*     */             }
/*     */             
/*     */             this.d.c(brd1);
/*     */           }() -> "lightChunk " + ☃ + " " + bool));
/*     */     
/* 142 */     return CompletableFuture.supplyAsync(() -> {
/*     */           ☃.b(true);
/*     */           super.b(brd1, false);
/*     */           return ☃;
/*     */         }runnable -> a(☃.b, ☃.c, a.b, runnable));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void z_() {
/* 153 */     if ((!this.c.isEmpty() || a()) && this.g.compareAndSet(false, true)) {
/* 154 */       this.b.a(() -> {
/*     */             b();
/*     */             this.g.set(false);
/*     */           });
/*     */     }
/*     */   }
/*     */   
/*     */   private void b() {
/* 162 */     int ☃ = Math.min(this.c.size(), this.f);
/*     */     
/* 164 */     ObjectListIterator<Pair<a, Runnable>> objectListIterator = this.c.iterator();
/*     */     
/* 166 */     int i = 0;
/* 167 */     while (objectListIterator.hasNext() && i < ☃) {
/* 168 */       Pair<a, Runnable> pair = (Pair<a, Runnable>)objectListIterator.next();
/* 169 */       if (pair.getFirst() == a.a) {
/* 170 */         ((Runnable)pair.getSecond()).run();
/*     */       }
/* 172 */       i++;
/*     */     } 
/* 174 */     objectListIterator.back(i);
/*     */     
/* 176 */     super.a(2147483647, true, true);
/*     */     
/* 178 */     i = 0;
/* 179 */     while (objectListIterator.hasNext() && i < ☃) {
/* 180 */       Pair<a, Runnable> pair = (Pair<a, Runnable>)objectListIterator.next();
/* 181 */       if (pair.getFirst() == a.b) {
/* 182 */         ((Runnable)pair.getSecond()).run();
/*     */       }
/* 184 */       objectListIterator.remove();
/* 185 */       i++;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 190 */     this.f = ☃;
/*     */   }
/*     */   
/*     */   enum a {
/* 194 */     a, b;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aaj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */