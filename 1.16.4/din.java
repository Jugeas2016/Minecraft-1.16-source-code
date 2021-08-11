/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.util.concurrent.RateLimiter;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import java.util.concurrent.locks.ReentrantLock;
/*     */ import java.util.stream.Stream;
/*     */ import java.util.zip.GZIPOutputStream;
/*     */ import org.apache.commons.compress.archivers.ArchiveEntry;
/*     */ import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
/*     */ import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
/*     */ import org.apache.commons.compress.utils.IOUtils;
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
/*     */ public class din
/*     */   extends eoo
/*     */ {
/*  47 */   private static final Logger a = LogManager.getLogger();
/*  48 */   private static final ReentrantLock b = new ReentrantLock();
/*     */   
/*  50 */   private static final String[] c = new String[] { "", ".", ". .", ". . ." };
/*  51 */   private static final nr p = new of("mco.upload.verifying");
/*     */   
/*     */   private final dif q;
/*     */   
/*     */   private final cyh r;
/*     */   private final long s;
/*     */   private final int t;
/*     */   private final dgf u;
/*     */   private final RateLimiter v;
/*     */   private volatile nr[] w;
/*  61 */   private volatile nr x = new of("mco.upload.preparing");
/*     */   
/*     */   private volatile String y;
/*     */   
/*     */   private volatile boolean z;
/*     */   
/*     */   private volatile boolean A;
/*     */   
/*     */   private volatile boolean B = true;
/*     */   
/*     */   private volatile boolean C;
/*     */   private dlj D;
/*     */   private dlj E;
/*     */   private int F;
/*     */   private Long G;
/*     */   private Long H;
/*     */   private long I;
/*     */   private final Runnable J;
/*     */   
/*     */   public din(long ☃, int i, dif dif1, cyh cyh1, Runnable runnable) {
/*  81 */     this.s = ☃;
/*  82 */     this.t = i;
/*  83 */     this.q = dif1;
/*  84 */     this.r = cyh1;
/*  85 */     this.u = new dgf();
/*  86 */     this.v = RateLimiter.create(0.10000000149011612D);
/*  87 */     this.J = runnable;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  92 */     this.i.m.a(true);
/*     */     
/*  94 */     this.D = a(new dlj(this.k / 2 - 100, this.l - 42, 200, 20, nq.h, ☃ -> h()));
/*  95 */     this.D.p = false;
/*  96 */     this.E = a(new dlj(this.k / 2 - 100, this.l - 42, 200, 20, nq.d, ☃ -> i()));
/*     */     
/*  98 */     if (!this.C) {
/*  99 */       if (this.q.a == -1) {
/* 100 */         k();
/*     */       } else {
/* 102 */         this.q.a(() -> {
/*     */               if (!this.C) {
/*     */                 this.C = true;
/*     */                 this.i.a(this);
/*     */                 k();
/*     */               } 
/*     */             });
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 115 */     this.i.m.a(false);
/*     */   }
/*     */   
/*     */   private void h() {
/* 119 */     this.J.run();
/*     */   }
/*     */   
/*     */   private void i() {
/* 123 */     this.z = true;
/* 124 */     this.i.a(this.q);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 129 */     if (☃ == 256) {
/* 130 */       if (this.B) {
/* 131 */         i();
/*     */       } else {
/* 133 */         h();
/*     */       } 
/* 135 */       return true;
/*     */     } 
/* 137 */     return super.a(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 142 */     a(☃);
/*     */     
/* 144 */     if (!this.A && this.u.a != 0L && this.u.a == this.u.b) {
/* 145 */       this.x = p;
/* 146 */       this.E.o = false;
/*     */     } 
/*     */     
/* 149 */     a(☃, this.o, this.x, this.k / 2, 50, 16777215);
/*     */     
/* 151 */     if (this.B) {
/* 152 */       b(☃);
/*     */     }
/*     */     
/* 155 */     if (this.u.a != 0L && !this.z) {
/* 156 */       c(☃);
/* 157 */       d(☃);
/*     */     } 
/*     */     
/* 160 */     if (this.w != null) {
/* 161 */       for (int k = 0; k < this.w.length; k++) {
/* 162 */         a(☃, this.o, this.w[k], this.k / 2, 110 + 12 * k, 16711680);
/*     */       }
/*     */     }
/*     */     
/* 166 */     super.a(☃, i, j, f);
/*     */   }
/*     */   
/*     */   private void b(dfm ☃) {
/* 170 */     int i = this.o.a(this.x);
/*     */     
/* 172 */     this.o.b(☃, c[this.F / 10 % c.length], (this.k / 2 + i / 2 + 5), 50.0F, 16777215);
/*     */   }
/*     */   
/*     */   private void c(dfm ☃) {
/* 176 */     double d1 = Math.min(this.u.a / this.u.b, 1.0D);
/* 177 */     this.y = String.format(Locale.ROOT, "%.1f", new Object[] { Double.valueOf(d1 * 100.0D) });
/*     */     
/* 179 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 180 */     RenderSystem.disableTexture();
/*     */     
/* 182 */     double d2 = (this.k / 2 - 100);
/* 183 */     double d3 = 0.5D;
/*     */     
/* 185 */     dfo dfo = dfo.a();
/* 186 */     dfh dfh = dfo.c();
/* 187 */     dfh.a(7, dfk.l);
/*     */     
/* 189 */     dfh.a(d2 - 0.5D, 95.5D, 0.0D).a(217, 210, 210, 255).d();
/* 190 */     dfh.a(d2 + 200.0D * d1 + 0.5D, 95.5D, 0.0D).a(217, 210, 210, 255).d();
/* 191 */     dfh.a(d2 + 200.0D * d1 + 0.5D, 79.5D, 0.0D).a(217, 210, 210, 255).d();
/* 192 */     dfh.a(d2 - 0.5D, 79.5D, 0.0D).a(217, 210, 210, 255).d();
/*     */     
/* 194 */     dfh.a(d2, 95.0D, 0.0D).a(128, 128, 128, 255).d();
/* 195 */     dfh.a(d2 + 200.0D * d1, 95.0D, 0.0D).a(128, 128, 128, 255).d();
/* 196 */     dfh.a(d2 + 200.0D * d1, 80.0D, 0.0D).a(128, 128, 128, 255).d();
/* 197 */     dfh.a(d2, 80.0D, 0.0D).a(128, 128, 128, 255).d();
/*     */     
/* 199 */     dfo.b();
/* 200 */     RenderSystem.enableTexture();
/*     */     
/* 202 */     a(☃, this.o, this.y + " %", this.k / 2, 84, 16777215);
/*     */   }
/*     */   
/*     */   private void d(dfm ☃) {
/* 206 */     if (this.F % 20 == 0) {
/* 207 */       if (this.G != null) {
/* 208 */         long l = x.b() - this.H.longValue();
/* 209 */         if (l == 0L) {
/* 210 */           l = 1L;
/*     */         }
/* 212 */         this.I = 1000L * (this.u.a - this.G.longValue()) / l;
/* 213 */         a(☃, this.I);
/*     */       } 
/*     */       
/* 216 */       this.G = Long.valueOf(this.u.a);
/* 217 */       this.H = Long.valueOf(x.b());
/*     */     } else {
/* 219 */       a(☃, this.I);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, long l) {
/* 224 */     if (l > 0L) {
/* 225 */       int i = this.o.b(this.y);
/* 226 */       String str = "(" + dfx.b(l) + "/s)";
/* 227 */       this.o.b(☃, str, (this.k / 2 + i / 2 + 15), 84.0F, 16777215);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 233 */     super.d();
/*     */     
/* 235 */     this.F++;
/*     */     
/* 237 */     if (this.x != null && 
/* 238 */       this.v.tryAcquire(1)) {
/* 239 */       List<String> ☃ = Lists.newArrayList();
/* 240 */       ☃.add(this.x.getString());
/* 241 */       if (this.y != null) {
/* 242 */         ☃.add(this.y + "%");
/*     */       }
/* 244 */       if (this.w != null) {
/* 245 */         Stream.<nr>of(this.w).map(nr::getString).forEach(☃::add);
/*     */       }
/* 247 */       eoj.a(String.join(System.lineSeparator(), (Iterable)☃));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void k() {
/* 253 */     this.C = true;
/*     */     
/* 255 */     (new Thread(() -> {
/*     */           File ☃ = null;
/*     */           
/*     */           dgb dgb = dgb.a();
/*     */           
/*     */           long l = this.s;
/*     */           
/*     */           try {
/*     */             if (!b.tryLock(1L, TimeUnit.SECONDS)) {
/*     */               this.x = new of("mco.upload.close.failure");
/*     */               
/*     */               return;
/*     */             } 
/*     */             dhb dhb = null;
/*     */             for (int i = 0; i < 20; i++) {
/*     */               try {
/*     */                 if (this.z) {
/*     */                   l();
/*     */                   return;
/*     */                 } 
/*     */                 dhb = dgb.h(l, div.a(l));
/*     */                 if (dhb != null) {
/*     */                   break;
/*     */                 }
/* 279 */               } catch (dhj dhj) {
/*     */                 Thread.sleep((dhj.e * 1000));
/*     */               } 
/*     */             } 
/*     */ 
/*     */             
/*     */             if (dhb == null) {
/*     */               this.x = new of("mco.upload.close.failure");
/*     */ 
/*     */               
/*     */               return;
/*     */             } 
/*     */ 
/*     */             
/*     */             div.a(l, dhb.a());
/*     */ 
/*     */             
/*     */             if (!dhb.c()) {
/*     */               this.x = new of("mco.upload.close.failure");
/*     */ 
/*     */               
/*     */               return;
/*     */             } 
/*     */ 
/*     */             
/*     */             if (this.z) {
/*     */               l();
/*     */ 
/*     */               
/*     */               return;
/*     */             } 
/*     */ 
/*     */             
/*     */             File file = new File(this.i.n.getAbsolutePath(), "saves");
/*     */ 
/*     */             
/*     */             ☃ = b(new File(file, this.r.a()));
/*     */             
/*     */             if (this.z) {
/*     */               l();
/*     */               
/*     */               return;
/*     */             } 
/*     */             
/*     */             if (!a(☃)) {
/*     */               long l1 = ☃.length();
/*     */               
/*     */               dfx dfx1 = dfx.a(l1);
/*     */               
/*     */               dfx dfx2 = dfx.a(5368709120L);
/*     */               
/*     */               if (dfx.b(l1, dfx1).equals(dfx.b(5368709120L, dfx2)) && dfx1 != dfx.a) {
/*     */                 dfx dfx = dfx.values()[dfx1.ordinal() - 1];
/*     */                 
/*     */                 a(new nr[] { new of("mco.upload.size.failure.line1", new Object[] { this.r.b() }), new of("mco.upload.size.failure.line2", new Object[] { dfx.b(l1, dfx), dfx.b(5368709120L, dfx) }) });
/*     */                 
/*     */                 return;
/*     */               } 
/*     */               
/*     */               a(new nr[] { new of("mco.upload.size.failure.line1", new Object[] { this.r.b() }), new of("mco.upload.size.failure.line2", new Object[] { dfx.b(l1, dfx1), dfx.b(5368709120L, dfx2) }) });
/*     */               
/*     */               return;
/*     */             } 
/*     */             
/*     */             this.x = new of("mco.upload.uploading", new Object[] { this.r.b() });
/*     */             
/*     */             dfz dfz = new dfz(☃, this.s, this.t, dhb, this.i.J(), w.a().getName(), this.u);
/*     */             
/*     */             dfz.a(());
/*     */             
/*     */             while (!dfz.b()) {
/*     */               if (this.z) {
/*     */                 dfz.a();
/*     */                 
/*     */                 l();
/*     */                 
/*     */                 return;
/*     */               } 
/*     */               
/*     */               try {
/*     */                 Thread.sleep(500L);
/* 360 */               } catch (InterruptedException interruptedException) {
/*     */                 a.error("Failed to check Realms file upload status");
/*     */               } 
/*     */             } 
/* 364 */           } catch (IOException iOException) {
/*     */             a(new nr[] { new of("mco.upload.failed", new Object[] { iOException.getMessage() }) });
/* 366 */           } catch (dhi dhi) {
/*     */             a(new nr[] { new of("mco.upload.failed", new Object[] { dhi.toString() }) });
/* 368 */           } catch (InterruptedException interruptedException) {
/*     */             a.error("Could not acquire upload lock");
/*     */           } finally {
/*     */             this.A = true;
/*     */             
/*     */             if (b.isHeldByCurrentThread()) {
/*     */               b.unlock();
/*     */             } else {
/*     */               return;
/*     */             } 
/*     */             
/*     */             this.B = false;
/*     */             
/*     */             this.D.p = true;
/*     */             
/*     */             this.E.p = false;
/*     */             if (☃ != null) {
/*     */               a.debug("Deleting file " + ☃.getAbsolutePath());
/*     */               ☃.delete();
/*     */             } 
/*     */           } 
/* 389 */         })).start();
/*     */   }
/*     */   
/*     */   private void a(nr... ☃) {
/* 393 */     this.w = ☃;
/*     */   }
/*     */   
/*     */   private void l() {
/* 397 */     this.x = new of("mco.upload.cancelled");
/* 398 */     a.debug("Upload was cancelled");
/*     */   }
/*     */   
/*     */   private boolean a(File ☃) {
/* 402 */     return (☃.length() < 5368709120L);
/*     */   }
/*     */   
/*     */   private File b(File ☃) throws IOException {
/* 406 */     TarArchiveOutputStream tarArchiveOutputStream = null;
/*     */     try {
/* 408 */       File file = File.createTempFile("realms-upload-file", ".tar.gz");
/* 409 */       tarArchiveOutputStream = new TarArchiveOutputStream(new GZIPOutputStream(new FileOutputStream(file)));
/* 410 */       tarArchiveOutputStream.setLongFileMode(3);
/* 411 */       a(tarArchiveOutputStream, ☃.getAbsolutePath(), "world", true);
/* 412 */       tarArchiveOutputStream.finish();
/* 413 */       return file;
/*     */     } finally {
/* 415 */       if (tarArchiveOutputStream != null) {
/* 416 */         tarArchiveOutputStream.close();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(TarArchiveOutputStream ☃, String str1, String str2, boolean bool) throws IOException {
/* 422 */     if (this.z) {
/*     */       return;
/*     */     }
/*     */     
/* 426 */     File file = new File(str1);
/* 427 */     String str = bool ? str2 : (str2 + file.getName());
/* 428 */     TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(file, str);
/* 429 */     ☃.putArchiveEntry((ArchiveEntry)tarArchiveEntry);
/*     */     
/* 431 */     if (file.isFile()) {
/* 432 */       IOUtils.copy(new FileInputStream(file), (OutputStream)☃);
/* 433 */       ☃.closeArchiveEntry();
/*     */     } else {
/* 435 */       ☃.closeArchiveEntry();
/* 436 */       File[] arrayOfFile = file.listFiles();
/*     */       
/* 438 */       if (arrayOfFile != null)
/* 439 */         for (File file1 : arrayOfFile)
/* 440 */           a(☃, file1.getAbsolutePath(), str + "/", false);  
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\din.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */