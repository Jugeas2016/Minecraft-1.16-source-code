/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ abstract class m
/*     */   extends cru
/*     */ {
/*     */   protected m(clb ☃, int i) {
/* 115 */     super(☃, i);
/*     */   }
/*     */   
/*     */   public m(clb ☃, md md1) {
/* 119 */     super(☃, md1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {}
/*     */ 
/*     */   
/*     */   private int a(List<cri.n> ☃) {
/* 127 */     boolean bool = false;
/* 128 */     int i = 0;
/* 129 */     for (cri.n n : ☃) {
/* 130 */       if (n.d > 0 && n.c < n.d) {
/* 131 */         bool = true;
/*     */       }
/* 133 */       i += n.b;
/*     */     } 
/* 135 */     return bool ? i : -1;
/*     */   }
/*     */   
/*     */   private m a(cri.q ☃, List<cri.n> list, List<cru> list1, Random random, int i, int j, int k, gc gc1, int n) {
/* 139 */     int i1 = a(list);
/* 140 */     boolean bool = (i1 > 0 && n <= 30);
/*     */     
/* 142 */     int i2 = 0;
/* 143 */     while (i2 < 5 && bool) {
/* 144 */       i2++;
/*     */       
/* 146 */       int i3 = random.nextInt(i1);
/* 147 */       for (cri.n n1 : list) {
/* 148 */         i3 -= n1.b;
/* 149 */         if (i3 < 0) {
/* 150 */           if (!n1.a(n) || (n1 == ☃.a && !n1.e)) {
/*     */             break;
/*     */           }
/*     */           
/* 154 */           m m1 = cri.a(n1, list1, random, i, j, k, gc1, n);
/* 155 */           if (m1 != null) {
/* 156 */             n1.c++;
/* 157 */             ☃.a = n1;
/*     */             
/* 159 */             if (!n1.a()) {
/* 160 */               list.remove(n1);
/*     */             }
/* 162 */             return m1;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 167 */     return cri.b.a(list1, random, i, j, k, gc1, n);
/*     */   }
/*     */   
/*     */   private cru a(cri.q ☃, List<cru> list, Random random, int i, int j, int k, @Nullable gc gc1, int n, boolean bool) {
/* 171 */     if (Math.abs(i - (☃.g()).a) > 112 || Math.abs(k - (☃.g()).c) > 112) {
/* 172 */       return cri.b.a(list, random, i, j, k, gc1, n);
/*     */     }
/* 174 */     List<cri.n> list1 = ☃.b;
/* 175 */     if (bool) {
/* 176 */       list1 = ☃.c;
/*     */     }
/* 178 */     cru cru1 = a(☃, list1, list, random, i, j, k, gc1, n + 1);
/* 179 */     if (cru1 != null) {
/* 180 */       list.add(cru1);
/* 181 */       ☃.d.add(cru1);
/*     */     } 
/* 183 */     return cru1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected cru a(cri.q ☃, List<cru> list, Random random, int i, int j, boolean bool) {
/* 188 */     gc gc = i();
/* 189 */     if (gc != null) {
/* 190 */       switch (cri.null.a[gc.ordinal()]) {
/*     */         case 1:
/* 192 */           return a(☃, list, random, this.n.a + i, this.n.b + j, this.n.c - 1, gc, h(), bool);
/*     */         case 2:
/* 194 */           return a(☃, list, random, this.n.a + i, this.n.b + j, this.n.f + 1, gc, h(), bool);
/*     */         case 3:
/* 196 */           return a(☃, list, random, this.n.a - 1, this.n.b + j, this.n.c + i, gc, h(), bool);
/*     */         case 4:
/* 198 */           return a(☃, list, random, this.n.d + 1, this.n.b + j, this.n.c + i, gc, h(), bool);
/*     */       } 
/*     */     }
/* 201 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected cru b(cri.q ☃, List<cru> list, Random random, int i, int j, boolean bool) {
/* 206 */     gc gc = i();
/* 207 */     if (gc != null) {
/* 208 */       switch (cri.null.a[gc.ordinal()]) {
/*     */         case 1:
/* 210 */           return a(☃, list, random, this.n.a - 1, this.n.b + i, this.n.c + j, gc.e, h(), bool);
/*     */         case 2:
/* 212 */           return a(☃, list, random, this.n.a - 1, this.n.b + i, this.n.c + j, gc.e, h(), bool);
/*     */         case 3:
/* 214 */           return a(☃, list, random, this.n.a + j, this.n.b + i, this.n.c - 1, gc.c, h(), bool);
/*     */         case 4:
/* 216 */           return a(☃, list, random, this.n.a + j, this.n.b + i, this.n.c - 1, gc.c, h(), bool);
/*     */       } 
/*     */     }
/* 219 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected cru c(cri.q ☃, List<cru> list, Random random, int i, int j, boolean bool) {
/* 224 */     gc gc = i();
/* 225 */     if (gc != null) {
/* 226 */       switch (cri.null.a[gc.ordinal()]) {
/*     */         case 1:
/* 228 */           return a(☃, list, random, this.n.d + 1, this.n.b + i, this.n.c + j, gc.f, h(), bool);
/*     */         case 2:
/* 230 */           return a(☃, list, random, this.n.d + 1, this.n.b + i, this.n.c + j, gc.f, h(), bool);
/*     */         case 3:
/* 232 */           return a(☃, list, random, this.n.a + j, this.n.b + i, this.n.f + 1, gc.d, h(), bool);
/*     */         case 4:
/* 234 */           return a(☃, list, random, this.n.a + j, this.n.b + i, this.n.f + 1, gc.d, h(), bool);
/*     */       } 
/*     */     }
/* 237 */     return null;
/*     */   }
/*     */   
/*     */   protected static boolean a(cra ☃) {
/* 241 */     return (☃ != null && ☃.b > 10);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cri$m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */