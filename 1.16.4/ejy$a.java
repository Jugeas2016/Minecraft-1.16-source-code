/*     */ import java.io.Closeable;
/*     */ import java.io.IOException;
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
/*     */ public class a
/*     */   implements Closeable
/*     */ {
/*     */   @Nullable
/*     */   private final ell a;
/*     */   @Nullable
/*     */   private final det b;
/*     */   @Nullable
/*     */   private final IOException c;
/*     */   
/*     */   public a(IOException ☃) {
/*  69 */     this.c = ☃;
/*  70 */     this.a = null;
/*  71 */     this.b = null;
/*     */   }
/*     */   
/*     */   public a(@Nullable ell ☃, det det1) {
/*  75 */     this.c = null;
/*  76 */     this.a = ☃;
/*  77 */     this.b = det1;
/*     */   }
/*     */   
/*     */   public static a a(ach ☃, vk vk1) {
/*  81 */     try (acg ☃ = ☃.a(vk1)) {
/*  82 */       det det1 = det.a(acg.b());
/*  83 */       ell ell1 = null;
/*     */       try {
/*  85 */         ell1 = acg.<ell>a(ell.a);
/*  86 */       } catch (RuntimeException runtimeException) {
/*  87 */         ejy.e().warn("Failed reading metadata of: {}", vk1, runtimeException);
/*     */       } 
/*  89 */       return new a(ell1, det1);
/*  90 */     } catch (IOException iOException) {
/*  91 */       return new a(iOException);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ell a() {
/*  97 */     return this.a;
/*     */   }
/*     */   
/*     */   public det b() throws IOException {
/* 101 */     if (this.c != null) {
/* 102 */       throw this.c;
/*     */     }
/* 104 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/* 109 */     if (this.b != null) {
/* 110 */       this.b.close();
/*     */     }
/*     */   }
/*     */   
/*     */   public void c() throws IOException {
/* 115 */     if (this.c != null)
/* 116 */       throw this.c; 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ejy$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */