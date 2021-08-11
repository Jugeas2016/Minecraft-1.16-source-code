/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
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
/*     */ public class cyj
/*     */ {
/*  36 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   static boolean a(cyg.a ☃, afn afn1) {
/*     */     bsy bsy;
/*  40 */     afn1.a(0);
/*     */     
/*  42 */     List<File> list1 = Lists.newArrayList();
/*  43 */     List<File> list2 = Lists.newArrayList();
/*  44 */     List<File> list3 = Lists.newArrayList();
/*  45 */     File file1 = ☃.a(brx.g);
/*  46 */     File file2 = ☃.a(brx.h);
/*  47 */     File file3 = ☃.a(brx.i);
/*     */     
/*  49 */     a.info("Scanning folders...");
/*     */ 
/*     */     
/*  52 */     a(file1, list1);
/*     */ 
/*     */     
/*  55 */     if (file2.exists()) {
/*  56 */       a(file2, list2);
/*     */     }
/*  58 */     if (file3.exists()) {
/*  59 */       a(file3, list3);
/*     */     }
/*     */     
/*  62 */     int i = list1.size() + list2.size() + list3.size();
/*  63 */     a.info("Total conversion count is {}", Integer.valueOf(i));
/*     */     
/*  65 */     gn.b b = gn.b();
/*  66 */     vh<mt> vh = vh.a(mo.a, ach.a.a, b);
/*     */     
/*  68 */     cyn cyn = ☃.a(vh, brk.a);
/*  69 */     long l = (cyn != null) ? cyn.A().a() : 0L;
/*     */ 
/*     */ 
/*     */     
/*  73 */     gm<bsv> gm = b.b(gm.ay);
/*     */     
/*  75 */     if (cyn != null && cyn.A().h()) {
/*  76 */       bsy = new btd(gm.d(btb.b));
/*     */     } else {
/*  78 */       bsy = new btj(l, false, false, gm);
/*     */     } 
/*     */ 
/*     */     
/*  82 */     a(b, new File(file1, "region"), list1, bsy, 0, i, afn1);
/*     */     
/*  84 */     a(b, new File(file2, "region"), list2, new btd(gm.d(btb.i)), list1.size(), i, afn1);
/*     */     
/*  86 */     a(b, new File(file3, "region"), list3, new btd(gm.d(btb.j)), list1.size() + list2.size(), i, afn1);
/*     */     
/*  88 */     a(☃);
/*     */     
/*  90 */     ☃.a(b, cyn);
/*  91 */     return true;
/*     */   }
/*     */   
/*     */   private static void a(cyg.a ☃) {
/*  95 */     File file1 = ☃.a(cye.e).toFile();
/*  96 */     if (!file1.exists()) {
/*  97 */       a.warn("Unable to create level.dat_mcr backup");
/*     */       
/*     */       return;
/*     */     } 
/* 101 */     File file2 = new File(file1.getParent(), "level.dat_mcr");
/* 102 */     if (!file1.renameTo(file2)) {
/* 103 */       a.warn("Unable to create level.dat_mcr backup");
/*     */     }
/*     */   }
/*     */   
/*     */   private static void a(gn.b ☃, File file, Iterable<File> iterable, bsy bsy1, int i, int j, afn afn1) {
/* 108 */     for (File file1 : iterable) {
/* 109 */       a(☃, file, file1, bsy1, i, j, afn1);
/*     */       
/* 111 */       i++;
/* 112 */       int k = (int)Math.round(100.0D * i / j);
/* 113 */       afn1.a(k);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(gn.b ☃, File file1, File file2, bsy bsy1, int i, int j, afn afn1) {
/* 118 */     String str = file2.getName();
/*     */ 
/*     */     
/* 121 */     try(cgy ☃ = new cgy(file2, file1, true); 
/* 122 */         cgy ☃ = new cgy(new File(file1, str.substring(0, str.length() - ".mcr".length()) + ".mca"), file1, true)) {
/*     */       
/* 124 */       for (int k = 0; k < 32; k++) {
/* 125 */         int m; for (m = 0; m < 32; m++) {
/* 126 */           brd brd = new brd(k, m);
/* 127 */           if (cgy.d(brd) && !cgy1.d(brd)) {
/*     */             try {
/* 129 */               md md; DataInputStream dataInputStream = cgy.a(brd); Throwable throwable = null;
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             }
/* 135 */             catch (IOException iOException) {
/* 136 */               a.warn("Failed to read data for chunk {}", brd, iOException);
/*     */             } 
/*     */           }
/*     */         } 
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
/* 153 */         m = (int)Math.round(100.0D * (i * 1024) / (j * 1024));
/* 154 */         int n = (int)Math.round(100.0D * ((k + 1) * 32 + i * 1024) / (j * 1024));
/* 155 */         if (n > m) {
/* 156 */           afn1.a(n);
/*     */         }
/*     */       } 
/* 159 */     } catch (IOException iOException) {
/* 160 */       a.error("Failed to upgrade region file {}", file2, iOException);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(File ☃, Collection<File> collection) {
/* 165 */     File file = new File(☃, "region");
/* 166 */     File[] arrayOfFile = file.listFiles((☃, str) -> str.endsWith(".mcr"));
/*     */     
/* 168 */     if (arrayOfFile != null)
/* 169 */       Collections.addAll(collection, arrayOfFile); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */