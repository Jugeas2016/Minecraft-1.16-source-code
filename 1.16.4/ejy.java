/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.io.Closeable;
/*     */ import java.io.IOException;
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
/*     */ public class ejy
/*     */   extends ejq
/*     */ {
/*  18 */   private static final Logger e = LogManager.getLogger();
/*     */   
/*     */   protected final vk d;
/*     */   
/*     */   public ejy(vk ☃) {
/*  23 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public void a(ach ☃) throws IOException {
/*     */     boolean bool1, bool2;
/*  28 */     a a = b(☃);
/*     */ 
/*     */     
/*  31 */     a.c();
/*     */     
/*  33 */     ell ell = a.a();
/*  34 */     if (ell != null) {
/*  35 */       bool1 = ell.a();
/*  36 */       bool2 = ell.b();
/*     */     } else {
/*  38 */       bool1 = false;
/*  39 */       bool2 = false;
/*     */     } 
/*  41 */     det det = a.b();
/*  42 */     if (!RenderSystem.isOnRenderThreadOrInit()) {
/*  43 */       RenderSystem.recordRenderCall(() -> a(☃, bool1, bool2));
/*     */     }
/*     */     else {
/*     */       
/*  47 */       a(det, bool1, bool2);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(det ☃, boolean bool1, boolean bool2) {
/*  52 */     dex.a(b(), 0, ☃.a(), ☃.b());
/*  53 */     ☃.a(0, 0, 0, 0, 0, ☃.a(), ☃.b(), bool1, bool2, false, true);
/*     */   }
/*     */   
/*     */   protected a b(ach ☃) {
/*  57 */     return a.a(☃, this.d);
/*     */   }
/*     */   
/*     */   public static class a implements Closeable {
/*     */     @Nullable
/*     */     private final ell a;
/*     */     @Nullable
/*     */     private final det b;
/*     */     @Nullable
/*     */     private final IOException c;
/*     */     
/*     */     public a(IOException ☃) {
/*  69 */       this.c = ☃;
/*  70 */       this.a = null;
/*  71 */       this.b = null;
/*     */     }
/*     */     
/*     */     public a(@Nullable ell ☃, det det1) {
/*  75 */       this.c = null;
/*  76 */       this.a = ☃;
/*  77 */       this.b = det1;
/*     */     }
/*     */     
/*     */     public static a a(ach ☃, vk vk1) {
/*  81 */       try (acg ☃ = ☃.a(vk1)) {
/*  82 */         det det1 = det.a(acg.b());
/*  83 */         ell ell1 = null;
/*     */         try {
/*  85 */           ell1 = acg.<ell>a(ell.a);
/*  86 */         } catch (RuntimeException runtimeException) {
/*  87 */           ejy.e().warn("Failed reading metadata of: {}", vk1, runtimeException);
/*     */         } 
/*  89 */         return new a(ell1, det1);
/*  90 */       } catch (IOException iOException) {
/*  91 */         return new a(iOException);
/*     */       } 
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public ell a() {
/*  97 */       return this.a;
/*     */     }
/*     */     
/*     */     public det b() throws IOException {
/* 101 */       if (this.c != null) {
/* 102 */         throw this.c;
/*     */       }
/* 104 */       return this.b;
/*     */     }
/*     */ 
/*     */     
/*     */     public void close() {
/* 109 */       if (this.b != null) {
/* 110 */         this.b.close();
/*     */       }
/*     */     }
/*     */     
/*     */     public void c() throws IOException {
/* 115 */       if (this.c != null)
/* 116 */         throw this.c; 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ejy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */