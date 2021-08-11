/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonObject;
/*     */ import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.ints.IntSet;
/*     */ import java.io.IOException;
/*     */ import java.util.Arrays;
/*     */ import java.util.Map;
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
/*     */ public class dni
/*     */   implements deb
/*     */ {
/*  25 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */   
/*     */   private final ach b;
/*     */   
/*     */   private final byte[] c;
/*     */   
/*     */   private final String d;
/*     */   
/*  34 */   private final Map<vk, det> e = Maps.newHashMap();
/*     */   
/*     */   public dni(ach ☃, byte[] arrayOfByte, String str) {
/*  37 */     this.b = ☃;
/*  38 */     this.c = arrayOfByte;
/*  39 */     this.d = str;
/*     */ 
/*     */     
/*  42 */     for (int i = 0; i < 256; i++) {
/*  43 */       int j = i * 256;
/*     */       
/*  45 */       vk vk = b(j);
/*     */       
/*  47 */       try (acg ☃ = this.b.a(vk)) {
/*  48 */         det det = det.a(det.a.a, acg.b());
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
/*     */         Throwable throwable2 = null;
/*  60 */       } catch (IOException iOException) {
/*     */         
/*  62 */         Arrays.fill(arrayOfByte, j, j + 256, (byte)0);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void close() {
/*  68 */     this.e.values().forEach(det::close);
/*     */   }
/*     */   
/*     */   private vk b(int ☃) {
/*  72 */     vk vk = new vk(String.format(this.d, new Object[] { String.format("%02x", new Object[] { Integer.valueOf(☃ / 256) }) }));
/*  73 */     return new vk(vk.b(), "textures/" + vk.a());
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public dec a(int ☃) {
/*  79 */     if (☃ < 0 || ☃ > 65535) {
/*  80 */       return null;
/*     */     }
/*  82 */     byte b = this.c[☃];
/*     */     
/*  84 */     if (b != 0) {
/*  85 */       det det = this.e.computeIfAbsent(b(☃), this::a);
/*  86 */       if (det != null) {
/*  87 */         int i = a(b);
/*  88 */         return new b(☃ % 16 * 16 + i, (☃ & 0xFF) / 16 * 16, b(b) - i, 16, det);
/*     */       } 
/*     */     } 
/*  91 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public IntSet a() {
/*  96 */     IntOpenHashSet intOpenHashSet = new IntOpenHashSet();
/*  97 */     for (int ☃ = 0; ☃ < 65535; ☃++) {
/*  98 */       if (this.c[☃] != 0) {
/*  99 */         intOpenHashSet.add(☃);
/*     */       }
/*     */     } 
/* 102 */     return (IntSet)intOpenHashSet;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private det a(vk ☃) {
/* 107 */     try (acg ☃ = this.b.a(☃)) {
/* 108 */       return det.a(det.a.a, acg.b());
/* 109 */     } catch (IOException iOException) {
/* 110 */       a.error("Couldn't load texture {}", ☃, iOException);
/* 111 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static int a(byte ☃) {
/* 116 */     return ☃ >> 4 & 0xF;
/*     */   }
/*     */   
/*     */   private static int b(byte ☃) {
/* 120 */     return (☃ & 0xF) + 1;
/*     */   }
/*     */   
/*     */   public static class a implements dng {
/*     */     private final vk a;
/*     */     private final String b;
/*     */     
/*     */     public a(vk ☃, String str) {
/* 128 */       this.a = ☃;
/* 129 */       this.b = str;
/*     */     }
/*     */     
/*     */     public static dng a(JsonObject ☃) {
/* 133 */       return new a(new vk(
/* 134 */             afd.h(☃, "sizes")), 
/* 135 */           afd.h(☃, "template"));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public deb a(ach ☃) {
/* 142 */       try (acg ☃ = djz.C().N().a(this.a)) {
/* 143 */         byte[] arrayOfByte = new byte[65536];
/* 144 */         acg.b().read(arrayOfByte);
/* 145 */         return new dni(☃, arrayOfByte, this.b);
/* 146 */       } catch (IOException iOException) {
/* 147 */         dni.b().error("Cannot load {}, unicode glyphs will not render correctly", this.a);
/*     */         
/* 149 */         return null;
/*     */       } 
/*     */     } }
/*     */   
/*     */   static class b implements dec {
/*     */     private final int a;
/*     */     private final int b;
/*     */     private final int c;
/*     */     private final int d;
/*     */     private final det e;
/*     */     
/*     */     private b(int ☃, int i, int j, int k, det det1) {
/* 161 */       this.a = j;
/* 162 */       this.b = k;
/* 163 */       this.c = ☃;
/* 164 */       this.d = i;
/* 165 */       this.e = det1;
/*     */     }
/*     */ 
/*     */     
/*     */     public float g() {
/* 170 */       return 2.0F;
/*     */     }
/*     */ 
/*     */     
/*     */     public int d() {
/* 175 */       return this.a;
/*     */     }
/*     */ 
/*     */     
/*     */     public int e() {
/* 180 */       return this.b;
/*     */     }
/*     */ 
/*     */     
/*     */     public float getAdvance() {
/* 185 */       return (this.a / 2 + 1);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(int ☃, int i) {
/* 190 */       this.e.a(0, ☃, i, this.c, this.d, this.a, this.b, false, false);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean f() {
/* 195 */       return (this.e.c().a() > 1);
/*     */     }
/*     */ 
/*     */     
/*     */     public float c() {
/* 200 */       return 0.5F;
/*     */     }
/*     */ 
/*     */     
/*     */     public float b() {
/* 205 */       return 0.5F;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dni.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */