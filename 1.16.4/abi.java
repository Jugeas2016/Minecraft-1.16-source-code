/*     */ import com.google.common.base.CharMatcher;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.io.File;
/*     */ import java.io.FileFilter;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Set;
/*     */ import java.util.function.Predicate;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.io.filefilter.DirectoryFileFilter;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class abi
/*     */   extends abg
/*     */ {
/*  26 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*  28 */   private static final boolean c = (x.i() == x.b.c);
/*  29 */   private static final CharMatcher d = CharMatcher.is('\\');
/*     */   
/*     */   public abi(File ☃) {
/*  32 */     super(☃);
/*     */   }
/*     */   
/*     */   public static boolean a(File ☃, String str) throws IOException {
/*  36 */     String str1 = ☃.getCanonicalPath();
/*     */ 
/*     */     
/*  39 */     if (c) {
/*  40 */       str1 = d.replaceFrom(str1, '/');
/*     */     }
/*  42 */     return str1.endsWith(str);
/*     */   }
/*     */ 
/*     */   
/*     */   protected InputStream a(String ☃) throws IOException {
/*  47 */     File file = e(☃);
/*  48 */     if (file == null) {
/*  49 */       throw new abl(this.a, ☃);
/*     */     }
/*     */     
/*  52 */     return new FileInputStream(file);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean c(String ☃) {
/*  57 */     return (e(☃) != null);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private File e(String ☃) {
/*     */     try {
/*  63 */       File file = new File(this.a, ☃);
/*  64 */       if (file.isFile() && a(file, ☃)) {
/*  65 */         return file;
/*     */       }
/*  67 */     } catch (IOException iOException) {}
/*     */     
/*  69 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<String> a(abk ☃) {
/*  74 */     Set<String> set = Sets.newHashSet();
/*  75 */     File file = new File(this.a, ☃.a());
/*     */     
/*  77 */     File[] arrayOfFile = file.listFiles((FileFilter)DirectoryFileFilter.DIRECTORY);
/*  78 */     if (arrayOfFile != null) {
/*  79 */       for (File file1 : arrayOfFile) {
/*  80 */         String str = a(file, file1);
/*     */         
/*  82 */         if (str.equals(str.toLowerCase(Locale.ROOT))) {
/*  83 */           set.add(str.substring(0, str.length() - 1));
/*     */         } else {
/*  85 */           d(str);
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*  90 */     return set;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() {}
/*     */ 
/*     */   
/*     */   public Collection<vk> a(abk ☃, String str1, String str2, int i, Predicate<String> predicate) {
/*  99 */     File file = new File(this.a, ☃.a());
/* 100 */     List<vk> list = Lists.newArrayList();
/* 101 */     a(new File(new File(file, str1), str2), i, str1, list, str2 + "/", predicate);
/* 102 */     return list;
/*     */   }
/*     */   
/*     */   private void a(File ☃, int i, String str1, List<vk> list, String str2, Predicate<String> predicate) {
/* 106 */     File[] arrayOfFile = ☃.listFiles();
/* 107 */     if (arrayOfFile != null)
/* 108 */       for (File file : arrayOfFile) {
/* 109 */         if (file.isDirectory()) {
/* 110 */           if (i > 0) {
/* 111 */             a(file, i - 1, str1, list, str2 + file.getName() + "/", predicate);
/*     */           }
/*     */         }
/* 114 */         else if (!file.getName().endsWith(".mcmeta") && predicate.test(file.getName())) {
/*     */           try {
/* 116 */             list.add(new vk(str1, str2 + file.getName()));
/* 117 */           } catch (v v) {
/* 118 */             b.error(v.getMessage());
/*     */           } 
/*     */         } 
/*     */       }  
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\abi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */