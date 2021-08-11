/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.FilterInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Stream;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class acb
/*     */   implements ach
/*     */ {
/*  25 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*  27 */   protected final List<abj> a = Lists.newArrayList();
/*     */   private final abk c;
/*     */   private final String d;
/*     */   
/*     */   public acb(abk ☃, String str) {
/*  32 */     this.c = ☃;
/*  33 */     this.d = str;
/*     */   }
/*     */   
/*     */   public void a(abj ☃) {
/*  37 */     this.a.add(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<String> a() {
/*  42 */     return (Set<String>)ImmutableSet.of(this.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public acg a(vk ☃) throws IOException {
/*  47 */     e(☃);
/*     */     
/*  49 */     abj abj = null;
/*  50 */     vk vk1 = d(☃);
/*     */     
/*  52 */     for (int i = this.a.size() - 1; i >= 0; i--) {
/*  53 */       abj abj1 = this.a.get(i);
/*  54 */       if (abj == null && abj1.b(this.c, vk1)) {
/*  55 */         abj = abj1;
/*     */       }
/*     */       
/*  58 */       if (abj1.b(this.c, ☃)) {
/*  59 */         InputStream inputStream = null;
/*  60 */         if (abj != null) {
/*  61 */           inputStream = a(vk1, abj);
/*     */         }
/*  63 */         return new acn(abj1.a(), ☃, a(☃, abj1), inputStream);
/*     */       } 
/*     */     } 
/*     */     
/*  67 */     throw new FileNotFoundException(☃.toString());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(vk ☃) {
/*  72 */     if (!f(☃)) {
/*  73 */       return false;
/*     */     }
/*     */     
/*  76 */     for (int i = this.a.size() - 1; i >= 0; i--) {
/*  77 */       abj abj = this.a.get(i);
/*     */       
/*  79 */       if (abj.b(this.c, ☃)) {
/*  80 */         return true;
/*     */       }
/*     */     } 
/*     */     
/*  84 */     return false;
/*     */   }
/*     */   
/*     */   protected InputStream a(vk ☃, abj abj1) throws IOException {
/*  88 */     InputStream inputStream = abj1.a(this.c, ☃);
/*  89 */     return b.isDebugEnabled() ? new a(inputStream, ☃, abj1.a()) : inputStream;
/*     */   }
/*     */   
/*     */   private void e(vk ☃) throws IOException {
/*  93 */     if (!f(☃)) {
/*  94 */       throw new IOException("Invalid relative path to resource: " + ☃);
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean f(vk ☃) {
/*  99 */     return !☃.a().contains("..");
/*     */   }
/*     */   
/*     */   static class a
/*     */     extends FilterInputStream {
/*     */     private final String a;
/*     */     private boolean b;
/*     */     
/*     */     public a(InputStream ☃, vk vk1, String str) {
/* 108 */       super(☃);
/* 109 */       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 110 */       (new Exception()).printStackTrace(new PrintStream(byteArrayOutputStream));
/* 111 */       this.a = "Leaked resource: '" + vk1 + "' loaded from pack: '" + str + "'\n" + byteArrayOutputStream;
/*     */     }
/*     */ 
/*     */     
/*     */     public void close() throws IOException {
/* 116 */       super.close();
/* 117 */       this.b = true;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void finalize() throws Throwable {
/* 122 */       if (!this.b) {
/* 123 */         acb.c().warn(this.a);
/*     */       }
/*     */       
/* 126 */       super.finalize();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public List<acg> c(vk ☃) throws IOException {
/* 132 */     e(☃);
/*     */     
/* 134 */     List<acg> list = Lists.newArrayList();
/* 135 */     vk vk1 = d(☃);
/*     */     
/* 137 */     for (abj abj : this.a) {
/* 138 */       if (abj.b(this.c, ☃)) {
/* 139 */         InputStream inputStream = abj.b(this.c, vk1) ? a(vk1, abj) : null;
/* 140 */         list.add(new acn(abj.a(), ☃, a(☃, abj), inputStream));
/*     */       } 
/*     */     } 
/*     */     
/* 144 */     if (list.isEmpty()) {
/* 145 */       throw new FileNotFoundException(☃.toString());
/*     */     }
/*     */     
/* 148 */     return list;
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<vk> a(String ☃, Predicate<String> predicate) {
/* 153 */     List<vk> list = Lists.newArrayList();
/*     */     
/* 155 */     for (abj abj : this.a) {
/* 156 */       list.addAll(abj.a(this.c, this.d, ☃, 2147483647, predicate));
/*     */     }
/*     */     
/* 159 */     Collections.sort(list);
/*     */     
/* 161 */     return list;
/*     */   }
/*     */ 
/*     */   
/*     */   public Stream<abj> b() {
/* 166 */     return this.a.stream();
/*     */   }
/*     */   
/*     */   static vk d(vk ☃) {
/* 170 */     return new vk(☃.b(), ☃.a() + ".mcmeta");
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\acb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */