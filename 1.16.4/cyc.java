/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.PushbackInputStream;
/*     */ import java.util.Map;
/*     */ import java.util.function.Supplier;
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
/*     */ public class cyc
/*     */ {
/*  26 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  28 */   private final Map<String, cxs> b = Maps.newHashMap();
/*     */   private final DataFixer c;
/*     */   private final File d;
/*     */   
/*     */   public cyc(File ☃, DataFixer dataFixer) {
/*  33 */     this.c = dataFixer;
/*  34 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   private File a(String ☃) {
/*  38 */     return new File(this.d, ☃ + ".dat");
/*     */   }
/*     */   
/*     */   public <T extends cxs> T a(Supplier<T> ☃, String str) {
/*  42 */     T t = b(☃, str);
/*  43 */     if (t != null) {
/*  44 */       return t;
/*     */     }
/*     */     
/*  47 */     cxs cxs = (cxs)☃.get();
/*  48 */     a(cxs);
/*  49 */     return (T)cxs;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public <T extends cxs> T b(Supplier<T> ☃, String str) {
/*  55 */     cxs cxs = this.b.get(str);
/*  56 */     if (cxs == null && 
/*  57 */       !this.b.containsKey(str)) {
/*  58 */       cxs = c(☃, str);
/*  59 */       this.b.put(str, cxs);
/*     */     } 
/*     */     
/*  62 */     return (T)cxs;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private <T extends cxs> T c(Supplier<T> ☃, String str) {
/*     */     try {
/*  68 */       File file = a(str);
/*  69 */       if (file.exists()) {
/*  70 */         cxs cxs = (cxs)☃.get();
/*  71 */         md md = a(str, w.a().getWorldVersion());
/*  72 */         cxs.a(md.p("data"));
/*  73 */         return (T)cxs;
/*     */       } 
/*  75 */     } catch (Exception exception) {
/*  76 */       a.error("Error loading saved data: {}", str, exception);
/*     */     } 
/*  78 */     return null;
/*     */   }
/*     */   
/*     */   public void a(cxs ☃) {
/*  82 */     this.b.put(☃.d(), ☃);
/*     */   }
/*     */   
/*     */   public md a(String ☃, int i) throws IOException {
/*  86 */     File file = a(☃);
/*     */     
/*  88 */     try (FileInputStream ☃ = new FileInputStream(file)) {
/*  89 */       PushbackInputStream pushbackInputStream = new PushbackInputStream(fileInputStream, 2);
/*     */       Throwable throwable = null;
/*     */     } 
/*     */   }
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
/*     */   private boolean a(PushbackInputStream ☃) throws IOException {
/* 106 */     byte[] arrayOfByte = new byte[2];
/* 107 */     boolean bool = false;
/* 108 */     int i = ☃.read(arrayOfByte, 0, 2);
/* 109 */     if (i == 2) {
/* 110 */       int j = (arrayOfByte[1] & 0xFF) << 8 | arrayOfByte[0] & 0xFF;
/* 111 */       if (j == 35615) {
/* 112 */         bool = true;
/*     */       }
/*     */     } 
/* 115 */     if (i != 0) {
/* 116 */       ☃.unread(arrayOfByte, 0, i);
/*     */     }
/* 118 */     return bool;
/*     */   }
/*     */   
/*     */   public void a() {
/* 122 */     for (cxs ☃ : this.b.values()) {
/* 123 */       if (☃ != null)
/* 124 */         ☃.a(a(☃.d())); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */