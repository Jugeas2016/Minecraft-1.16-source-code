/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bio
/*    */   implements aon, bju
/*    */ {
/*    */   private final gj<bmb> a;
/*    */   private final int b;
/*    */   private final int c;
/*    */   private final bic d;
/*    */   
/*    */   public bio(bic ☃, int i, int j) {
/* 17 */     this.a = gj.a(i * j, bmb.b);
/* 18 */     this.d = ☃;
/* 19 */     this.b = i;
/* 20 */     this.c = j;
/*    */   }
/*    */ 
/*    */   
/*    */   public int Z_() {
/* 25 */     return this.a.size();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean c() {
/* 30 */     for (bmb ☃ : this.a) {
/* 31 */       if (!☃.a()) {
/* 32 */         return false;
/*    */       }
/*    */     } 
/* 35 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(int ☃) {
/* 40 */     if (☃ >= Z_()) {
/* 41 */       return bmb.b;
/*    */     }
/* 43 */     return this.a.get(☃);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public bmb b(int ☃) {
/* 55 */     return aoo.a(this.a, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(int ☃, int i) {
/* 60 */     bmb bmb = aoo.a(this.a, ☃, i);
/* 61 */     if (!bmb.a()) {
/* 62 */       this.d.a(this);
/*    */     }
/* 64 */     return bmb;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(int ☃, bmb bmb1) {
/* 69 */     this.a.set(☃, bmb1);
/* 70 */     this.d.a(this);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void X_() {}
/*    */ 
/*    */   
/*    */   public boolean a(bfw ☃) {
/* 79 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void Y_() {
/* 84 */     this.a.clear();
/*    */   }
/*    */   
/*    */   public int f() {
/* 88 */     return this.c;
/*    */   }
/*    */   
/*    */   public int g() {
/* 92 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bfy ☃) {
/* 97 */     for (bmb bmb : this.a)
/* 98 */       ☃.a(bmb); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bio.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */