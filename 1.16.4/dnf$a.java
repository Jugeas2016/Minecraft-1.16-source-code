/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
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
/*     */ public class a
/*     */   implements dng
/*     */ {
/*     */   private final vk a;
/*     */   private final List<int[]> b;
/*     */   private final int c;
/*     */   private final int d;
/*     */   
/*     */   public a(vk ☃, int i, int j, List<int[]> list) {
/*  60 */     this.a = new vk(☃.b(), "textures/" + ☃.a());
/*  61 */     this.b = list;
/*  62 */     this.c = i;
/*  63 */     this.d = j;
/*     */   }
/*     */   
/*     */   public static a a(JsonObject ☃) {
/*  67 */     int i = afd.a(☃, "height", 8);
/*  68 */     int j = afd.n(☃, "ascent");
/*     */     
/*  70 */     if (j > i) {
/*  71 */       throw new JsonParseException("Ascent " + j + " higher than height " + i);
/*     */     }
/*     */     
/*  74 */     List<int[]> list = Lists.newArrayList();
/*  75 */     JsonArray jsonArray = afd.u(☃, "chars");
/*  76 */     for (int k = 0; k < jsonArray.size(); k++) {
/*  77 */       String str = afd.a(jsonArray.get(k), "chars[" + k + "]");
/*  78 */       int[] arrayOfInt = str.codePoints().toArray();
/*  79 */       if (k > 0) {
/*  80 */         int m = ((int[])list.get(0)).length;
/*  81 */         if (arrayOfInt.length != m) {
/*  82 */           throw new JsonParseException("Elements of chars have to be the same length (found: " + arrayOfInt.length + ", expected: " + m + "), pad with space or \\u0000");
/*     */         }
/*     */       } 
/*  85 */       list.add(arrayOfInt);
/*     */     } 
/*     */     
/*  88 */     if (list.isEmpty() || ((int[])list.get(0)).length == 0) {
/*  89 */       throw new JsonParseException("Expected to find data in chars, found none.");
/*     */     }
/*     */     
/*  92 */     return new a(new vk(afd.h(☃, "file")), i, j, list);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public deb a(ach ☃) {
/*  98 */     try (acg ☃ = ☃.a(this.a)) {
/*  99 */       det det = det.a(det.a.a, acg.b());
/*     */       
/* 101 */       int i = det.a();
/* 102 */       int j = det.b();
/*     */       
/* 104 */       int k = i / ((int[])this.b.get(0)).length;
/* 105 */       int m = j / this.b.size();
/*     */       
/* 107 */       float f = this.c / m;
/*     */       
/* 109 */       Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap();
/*     */       
/* 111 */       for (int n = 0; n < this.b.size(); n++) {
/* 112 */         int i1 = 0;
/* 113 */         for (int i2 : (int[])this.b.get(n)) {
/* 114 */           int i3 = i1++;
/* 115 */           if (i2 != 0 && i2 != 32) {
/*     */ 
/*     */             
/* 118 */             int i4 = a(det, k, m, i3, n);
/*     */             
/* 120 */             dnf.b b = (dnf.b)int2ObjectOpenHashMap.put(i2, new dnf.b(f, det, i3 * k, n * m, k, m, (int)(0.5D + (i4 * f)) + 1, this.d, null));
/* 121 */             if (b != null) {
/* 122 */               dnf.b().warn("Codepoint '{}' declared multiple times in {}", Integer.toHexString(i2), this.a);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/* 127 */       return new dnf(det, (Int2ObjectMap)int2ObjectOpenHashMap, null);
/* 128 */     } catch (IOException iOException) {
/* 129 */       throw new RuntimeException(iOException.getMessage());
/*     */     } 
/*     */   }
/*     */   
/*     */   private int a(det ☃, int i, int j, int k, int m) {
/* 134 */     int n = i - 1;
/* 135 */     for (; n >= 0; n--) {
/* 136 */       int i1 = k * i + n;
/* 137 */       for (int i2 = 0; i2 < j; i2++) {
/* 138 */         int i3 = m * j + i2;
/*     */         
/* 140 */         if (☃.b(i1, i3) != 0) {
/* 141 */           return n + 1;
/*     */         }
/*     */       } 
/*     */     } 
/* 145 */     return n + 1;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dnf$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */