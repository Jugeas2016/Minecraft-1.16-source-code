/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.function.Consumer;
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
/*     */ public class b
/*     */ {
/*     */   private final int a;
/*     */   private final int b;
/*     */   private final int c;
/*     */   private final int d;
/*     */   private List<b> e;
/*     */   private ejz.a f;
/*     */   
/*     */   public b(int ☃, int i, int j, int k) {
/* 170 */     this.a = ☃;
/* 171 */     this.b = i;
/* 172 */     this.c = j;
/* 173 */     this.d = k;
/*     */   }
/*     */   
/*     */   public ejz.a a() {
/* 177 */     return this.f;
/*     */   }
/*     */   
/*     */   public int b() {
/* 181 */     return this.a;
/*     */   }
/*     */   
/*     */   public int c() {
/* 185 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ejz.a ☃) {
/* 190 */     if (this.f != null) {
/* 191 */       return false;
/*     */     }
/*     */     
/* 194 */     int i = ☃.b;
/* 195 */     int j = ☃.c;
/*     */ 
/*     */     
/* 198 */     if (i > this.c || j > this.d) {
/* 199 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 203 */     if (i == this.c && j == this.d) {
/*     */       
/* 205 */       this.f = ☃;
/* 206 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 210 */     if (this.e == null) {
/* 211 */       this.e = Lists.newArrayListWithCapacity(1);
/*     */ 
/*     */       
/* 214 */       this.e.add(new b(this.a, this.b, i, j));
/*     */       
/* 216 */       int k = this.c - i;
/* 217 */       int m = this.d - j;
/*     */       
/* 219 */       if (m > 0 && k > 0) {
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
/* 234 */         int n = Math.max(this.d, k);
/* 235 */         int i1 = Math.max(this.c, m);
/* 236 */         if (n >= i1) {
/* 237 */           this.e.add(new b(this.a, this.b + j, i, m));
/* 238 */           this.e.add(new b(this.a + i, this.b, k, this.d));
/*     */         } else {
/* 240 */           this.e.add(new b(this.a + i, this.b, k, j));
/* 241 */           this.e.add(new b(this.a, this.b + j, this.c, m));
/*     */         } 
/* 243 */       } else if (k == 0) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 253 */         this.e.add(new b(this.a, this.b + j, i, m));
/* 254 */       } else if (m == 0) {
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
/* 265 */         this.e.add(new b(this.a + i, this.b, k, j));
/*     */       } 
/*     */     } 
/*     */     
/* 269 */     for (b b1 : this.e) {
/* 270 */       if (b1.a(☃)) {
/* 271 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 275 */     return false;
/*     */   }
/*     */   
/*     */   public void a(Consumer<b> ☃) {
/* 279 */     if (this.f != null) {
/* 280 */       ☃.accept(this);
/* 281 */     } else if (this.e != null) {
/* 282 */       for (b b1 : this.e) {
/* 283 */         b1.a(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 290 */     return "Slot{originX=" + this.a + ", originY=" + this.b + ", width=" + this.c + ", height=" + this.d + ", texture=" + this.f + ", subSlots=" + this.e + '}';
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ejz$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */