/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class d
/*     */   extends crh.c
/*     */ {
/* 131 */   private final List<cra> b = Lists.newLinkedList();
/*     */   
/*     */   public d(int ☃, Random random, int i, int j, ckb.b b1) {
/* 134 */     super(clb.c, ☃, b1);
/* 135 */     this.a = b1;
/*     */     
/* 137 */     this.n = new cra(i, 50, j, i + 7 + random.nextInt(6), 54 + random.nextInt(6), j + 7 + random.nextInt(6));
/*     */   }
/*     */   
/*     */   public d(csw ☃, md md1) {
/* 141 */     super(clb.c, md1);
/* 142 */     mj mj = md1.d("Entrances", 11);
/* 143 */     for (int i = 0; i < mj.size(); i++) {
/* 144 */       this.b.add(new cra(mj.f(i)));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cru ☃, List<cru> list, Random random) {
/* 150 */     int i = h();
/*     */ 
/*     */ 
/*     */     
/* 154 */     int k = this.n.e() - 3 - 1;
/* 155 */     if (k <= 0) {
/* 156 */       k = 1;
/*     */     }
/*     */ 
/*     */     
/* 160 */     int j = 0;
/* 161 */     while (j < this.n.d()) {
/* 162 */       j += random.nextInt(this.n.d());
/* 163 */       if (j + 3 > this.n.d()) {
/*     */         break;
/*     */       }
/* 166 */       crh.c c1 = crh.a(☃, list, random, this.n.a + j, this.n.b + random.nextInt(k) + 1, this.n.c - 1, gc.c, i);
/* 167 */       if (c1 != null) {
/* 168 */         cra cra = c1.g();
/* 169 */         this.b.add(new cra(cra.a, cra.b, this.n.c, cra.d, cra.e, this.n.c + 1));
/*     */       } 
/* 171 */       j += 4;
/*     */     } 
/*     */     
/* 174 */     j = 0;
/* 175 */     while (j < this.n.d()) {
/* 176 */       j += random.nextInt(this.n.d());
/* 177 */       if (j + 3 > this.n.d()) {
/*     */         break;
/*     */       }
/* 180 */       crh.c c1 = crh.a(☃, list, random, this.n.a + j, this.n.b + random.nextInt(k) + 1, this.n.f + 1, gc.d, i);
/* 181 */       if (c1 != null) {
/* 182 */         cra cra = c1.g();
/* 183 */         this.b.add(new cra(cra.a, cra.b, this.n.f - 1, cra.d, cra.e, this.n.f));
/*     */       } 
/* 185 */       j += 4;
/*     */     } 
/*     */     
/* 188 */     j = 0;
/* 189 */     while (j < this.n.f()) {
/* 190 */       j += random.nextInt(this.n.f());
/* 191 */       if (j + 3 > this.n.f()) {
/*     */         break;
/*     */       }
/* 194 */       crh.c c1 = crh.a(☃, list, random, this.n.a - 1, this.n.b + random.nextInt(k) + 1, this.n.c + j, gc.e, i);
/* 195 */       if (c1 != null) {
/* 196 */         cra cra = c1.g();
/* 197 */         this.b.add(new cra(this.n.a, cra.b, cra.c, this.n.a + 1, cra.e, cra.f));
/*     */       } 
/* 199 */       j += 4;
/*     */     } 
/*     */     
/* 202 */     j = 0;
/* 203 */     while (j < this.n.f()) {
/* 204 */       j += random.nextInt(this.n.f());
/* 205 */       if (j + 3 > this.n.f()) {
/*     */         break;
/*     */       }
/* 208 */       cru cru1 = crh.a(☃, list, random, this.n.d + 1, this.n.b + random.nextInt(k) + 1, this.n.c + j, gc.f, i);
/* 209 */       if (cru1 != null) {
/* 210 */         cra cra = cru1.g();
/* 211 */         this.b.add(new cra(this.n.d - 1, cra.b, cra.c, this.n.d, cra.e, cra.f));
/*     */       } 
/* 213 */       j += 4;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 219 */     if (a(☃, cra1)) {
/* 220 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 224 */     a(☃, cra1, this.n.a, this.n.b, this.n.c, this.n.d, this.n.b, this.n.f, bup.j.n(), m, true);
/*     */ 
/*     */     
/* 227 */     a(☃, cra1, this.n.a, this.n.b + 1, this.n.c, this.n.d, Math.min(this.n.b + 3, this.n.e), this.n.f, m, m, false);
/* 228 */     for (cra cra2 : this.b) {
/* 229 */       a(☃, cra1, cra2.a, cra2.e - 2, cra2.c, cra2.d, cra2.e, cra2.f, m, m, false);
/*     */     }
/* 231 */     a(☃, cra1, this.n.a, this.n.b + 4, this.n.c, this.n.d, this.n.e, this.n.f, m, false);
/*     */     
/* 233 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j) {
/* 238 */     super.a(☃, i, j);
/* 239 */     for (cra cra : this.b) {
/* 240 */       cra.a(☃, i, j);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/* 246 */     super.a(☃);
/* 247 */     mj mj = new mj();
/* 248 */     for (cra cra : this.b) {
/* 249 */       mj.add(cra.h());
/*     */     }
/* 251 */     ☃.a("Entrances", mj);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crh$d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */