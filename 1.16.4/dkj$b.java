/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class b
/*     */   implements afb
/*     */ {
/*     */   private final float b;
/* 174 */   private int c = -1;
/* 175 */   private ob d = ob.a;
/*     */   private boolean e;
/*     */   private float f;
/* 178 */   private int g = -1;
/* 179 */   private ob h = ob.a;
/*     */   private int i;
/*     */   private int j;
/*     */   
/*     */   public b(dkj paramdkj, float ☃) {
/* 184 */     this.b = Math.max(☃, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean accept(int ☃, ob ob1, int i) {
/* 189 */     int j = ☃ + this.j;
/* 190 */     switch (i) {
/*     */       case 10:
/* 192 */         return a(j, ob1);
/*     */       case 32:
/* 194 */         this.g = j;
/* 195 */         this.h = ob1;
/*     */         break;
/*     */     } 
/* 198 */     float f = dkj.a(this.a).getWidth(i, ob1);
/* 199 */     this.f += f;
/* 200 */     if (this.e && this.f > this.b) {
/* 201 */       if (this.g != -1) {
/* 202 */         return a(this.g, this.h);
/*     */       }
/* 204 */       return a(j, ob1);
/*     */     } 
/*     */     
/* 207 */     this.e |= (f != 0.0F) ? 1 : 0;
/* 208 */     this.i = j + Character.charCount(i);
/* 209 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean a(int ☃, ob ob1) {
/* 215 */     this.c = ☃;
/* 216 */     this.d = ob1;
/* 217 */     return false;
/*     */   }
/*     */   
/*     */   private boolean c() {
/* 221 */     return (this.c != -1);
/*     */   }
/*     */   
/*     */   public int a() {
/* 225 */     return c() ? this.c : this.i;
/*     */   }
/*     */   
/*     */   public ob b() {
/* 229 */     return this.d;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 233 */     this.j += ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dkj$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */