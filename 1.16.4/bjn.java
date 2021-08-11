/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bjn
/*    */   extends bjr
/*    */ {
/*    */   private final bio a;
/*    */   private final bfw b;
/*    */   private int g;
/*    */   
/*    */   public bjn(bfw ☃, bio bio1, aon aon1, int i, int j, int k) {
/* 15 */     super(aon1, i, j, k);
/* 16 */     this.b = ☃;
/* 17 */     this.a = bio1;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bmb ☃) {
/* 22 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(int ☃) {
/* 27 */     if (f()) {
/* 28 */       this.g += Math.min(☃, e().E());
/*    */     }
/* 30 */     return super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bmb ☃, int i) {
/* 35 */     this.g += i;
/* 36 */     c(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b(int ☃) {
/* 41 */     this.g += ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void c(bmb ☃) {
/* 46 */     if (this.g > 0) {
/* 47 */       ☃.a(this.b.l, this.b, this.g);
/*    */     }
/* 49 */     if (this.c instanceof bjl) {
/* 50 */       ((bjl)this.c).b(this.b);
/*    */     }
/* 52 */     this.g = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bfw ☃, bmb bmb1) {
/* 57 */     c(bmb1);
/*    */     
/* 59 */     gj<bmb> gj = ☃.l.o().c(bot.a, this.a, ☃.l);
/*    */     
/* 61 */     for (int i = 0; i < gj.size(); i++) {
/* 62 */       bmb bmb2 = this.a.a(i);
/* 63 */       bmb bmb3 = gj.get(i);
/*    */       
/* 65 */       if (!bmb2.a()) {
/* 66 */         this.a.a(i, 1);
/* 67 */         bmb2 = this.a.a(i);
/*    */       } 
/*    */       
/* 70 */       if (!bmb3.a()) {
/* 71 */         if (bmb2.a()) {
/*    */           
/* 73 */           this.a.a(i, bmb3);
/* 74 */         } else if (bmb.c(bmb2, bmb3) && bmb.a(bmb2, bmb3)) {
/* 75 */           bmb3.f(bmb2.E());
/* 76 */           this.a.a(i, bmb3);
/* 77 */         } else if (!this.b.bm.e(bmb3)) {
/*    */           
/* 79 */           this.b.a(bmb3, false);
/*    */         } 
/*    */       }
/*    */     } 
/* 83 */     return bmb1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bjn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */