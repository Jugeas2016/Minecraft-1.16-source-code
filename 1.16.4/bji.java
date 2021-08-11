/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bji
/*    */   extends apa
/*    */ {
/*    */   private ccv a;
/*    */   
/*    */   public bji() {
/* 14 */     super(27);
/*    */   }
/*    */   
/*    */   public void a(ccv ☃) {
/* 18 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public void a(mj ☃) {
/*    */     int i;
/* 23 */     for (i = 0; i < Z_(); i++) {
/* 24 */       a(i, bmb.b);
/*    */     }
/* 26 */     for (i = 0; i < ☃.size(); i++) {
/* 27 */       md md = ☃.a(i);
/* 28 */       int j = md.f("Slot") & 0xFF;
/* 29 */       if (j >= 0 && j < Z_()) {
/* 30 */         a(j, bmb.a(md));
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public mj g() {
/* 37 */     mj ☃ = new mj();
/* 38 */     for (int i = 0; i < Z_(); i++) {
/* 39 */       bmb bmb = a(i);
/* 40 */       if (!bmb.a()) {
/* 41 */         md md = new md();
/* 42 */         md.a("Slot", (byte)i);
/* 43 */         bmb.b(md);
/* 44 */         ☃.add(md);
/*    */       } 
/*    */     } 
/* 47 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bfw ☃) {
/* 52 */     if (this.a != null && !this.a.a(☃)) {
/* 53 */       return false;
/*    */     }
/* 55 */     return super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void c_(bfw ☃) {
/* 60 */     if (this.a != null) {
/* 61 */       this.a.d();
/*    */     }
/* 63 */     super.c_(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b_(bfw ☃) {
/* 68 */     if (this.a != null) {
/* 69 */       this.a.f();
/*    */     }
/* 71 */     super.b_(☃);
/* 72 */     this.a = null;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bji.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */