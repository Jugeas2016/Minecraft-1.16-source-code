/*     */ import com.google.common.base.Splitter;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Enumeration;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Set;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.zip.ZipEntry;
/*     */ import java.util.zip.ZipFile;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class abh
/*     */   extends abg
/*     */ {
/*  23 */   public static final Splitter b = Splitter.on('/').omitEmptyStrings().limit(3);
/*     */   private ZipFile c;
/*     */   
/*     */   public abh(File ☃) {
/*  27 */     super(☃);
/*     */   }
/*     */   
/*     */   private ZipFile b() throws IOException {
/*  31 */     if (this.c == null) {
/*  32 */       this.c = new ZipFile(this.a);
/*     */     }
/*     */     
/*  35 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected InputStream a(String ☃) throws IOException {
/*  40 */     ZipFile zipFile = b();
/*  41 */     ZipEntry zipEntry = zipFile.getEntry(☃);
/*     */     
/*  43 */     if (zipEntry == null) {
/*  44 */       throw new abl(this.a, ☃);
/*     */     }
/*     */     
/*  47 */     return zipFile.getInputStream(zipEntry);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(String ☃) {
/*     */     try {
/*  53 */       return (b().getEntry(☃) != null);
/*  54 */     } catch (IOException iOException) {
/*  55 */       return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<String> a(abk ☃) {
/*     */     ZipFile zipFile;
/*     */     try {
/*  63 */       zipFile = b();
/*  64 */     } catch (IOException iOException) {
/*  65 */       return Collections.emptySet();
/*     */     } 
/*     */     
/*  68 */     Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
/*     */     
/*  70 */     Set<String> set = Sets.newHashSet();
/*     */     
/*  72 */     while (enumeration.hasMoreElements()) {
/*  73 */       ZipEntry zipEntry = enumeration.nextElement();
/*     */       
/*  75 */       String str = zipEntry.getName();
/*  76 */       if (str.startsWith(☃.a() + "/")) {
/*  77 */         List<String> list = Lists.newArrayList(b.split(str));
/*  78 */         if (list.size() > 1) {
/*  79 */           String str1 = list.get(1);
/*  80 */           if (str1.equals(str1.toLowerCase(Locale.ROOT))) {
/*  81 */             set.add(str1); continue;
/*     */           } 
/*  83 */           d(str1);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  89 */     return set;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/*  95 */     close();
/*  96 */     super.finalize();
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/* 101 */     if (this.c != null) {
/* 102 */       IOUtils.closeQuietly(this.c);
/* 103 */       this.c = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<vk> a(abk ☃, String str1, String str2, int i, Predicate<String> predicate) {
/*     */     ZipFile zipFile;
/*     */     try {
/* 111 */       zipFile = b();
/* 112 */     } catch (IOException iOException) {
/* 113 */       return Collections.emptySet();
/*     */     } 
/* 115 */     Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
/* 116 */     List<vk> list = Lists.newArrayList();
/* 117 */     String str3 = ☃.a() + "/" + str1 + "/";
/* 118 */     String str4 = str3 + str2 + "/";
/*     */     
/* 120 */     while (enumeration.hasMoreElements()) {
/* 121 */       ZipEntry zipEntry = enumeration.nextElement();
/* 122 */       if (zipEntry.isDirectory()) {
/*     */         continue;
/*     */       }
/*     */       
/* 126 */       String str5 = zipEntry.getName();
/* 127 */       if (str5.endsWith(".mcmeta") || !str5.startsWith(str4)) {
/*     */         continue;
/*     */       }
/*     */       
/* 131 */       String str6 = str5.substring(str3.length());
/* 132 */       String[] arrayOfString = str6.split("/");
/* 133 */       if (arrayOfString.length >= i + 1 && predicate.test(arrayOfString[arrayOfString.length - 1])) {
/* 134 */         list.add(new vk(str1, str6));
/*     */       }
/*     */     } 
/*     */     
/* 138 */     return list;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\abh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */