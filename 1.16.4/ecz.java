/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ecz
/*    */ {
/*  8 */   private final h[] a = new h[6];
/*    */   private double b;
/*    */   private double c;
/*    */   private double d;
/*    */   
/*    */   public ecz(b ☃, b b1) {
/* 14 */     a(☃, b1);
/*    */   }
/*    */   
/*    */   public void a(double ☃, double d1, double d2) {
/* 18 */     this.b = ☃;
/* 19 */     this.c = d1;
/* 20 */     this.d = d2;
/*    */   }
/*    */   
/*    */   private void a(b ☃, b b1) {
/* 24 */     b b2 = b1.d();
/* 25 */     b2.a(☃);
/* 26 */     b2.e();
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 31 */     a(b2, -1, 0, 0, 0);
/* 32 */     a(b2, 1, 0, 0, 1);
/* 33 */     a(b2, 0, -1, 0, 2);
/* 34 */     a(b2, 0, 1, 0, 3);
/* 35 */     a(b2, 0, 0, -1, 4);
/* 36 */     a(b2, 0, 0, 1, 5);
/*    */   }
/*    */   
/*    */   private void a(b ☃, int i, int j, int k, int m) {
/* 40 */     h h1 = new h(i, j, k, 1.0F);
/* 41 */     h1.a(☃);
/* 42 */     h1.e();
/* 43 */     this.a[m] = h1;
/*    */   }
/*    */   
/*    */   public boolean a(dci ☃) {
/* 47 */     return a(☃.a, ☃.b, ☃.c, ☃.d, ☃.e, ☃.f);
/*    */   }
/*    */   
/*    */   private boolean a(double ☃, double d1, double d2, double d3, double d4, double d5) {
/* 51 */     float f1 = (float)(☃ - this.b);
/* 52 */     float f2 = (float)(d1 - this.c);
/* 53 */     float f3 = (float)(d2 - this.d);
/* 54 */     float f4 = (float)(d3 - this.b);
/* 55 */     float f5 = (float)(d4 - this.c);
/* 56 */     float f6 = (float)(d5 - this.d);
/* 57 */     return a(f1, f2, f3, f4, f5, f6);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private boolean a(float ☃, float f1, float f2, float f3, float f4, float f5) {
/* 64 */     for (int i = 0; i < 6; i++) {
/* 65 */       h h1 = this.a[i];
/*    */       
/* 67 */       if (h1.a(new h(☃, f1, f2, 1.0F)) <= 0.0F)
/*    */       {
/*    */         
/* 70 */         if (h1.a(new h(f3, f1, f2, 1.0F)) <= 0.0F)
/*    */         {
/*    */           
/* 73 */           if (h1.a(new h(☃, f4, f2, 1.0F)) <= 0.0F)
/*    */           {
/*    */             
/* 76 */             if (h1.a(new h(f3, f4, f2, 1.0F)) <= 0.0F)
/*    */             {
/*    */               
/* 79 */               if (h1.a(new h(☃, f1, f5, 1.0F)) <= 0.0F)
/*    */               {
/*    */                 
/* 82 */                 if (h1.a(new h(f3, f1, f5, 1.0F)) <= 0.0F)
/*    */                 {
/*    */                   
/* 85 */                   if (h1.a(new h(☃, f4, f5, 1.0F)) <= 0.0F)
/*    */                   {
/*    */                     
/* 88 */                     if (h1.a(new h(f3, f4, f5, 1.0F)) <= 0.0F)
/*    */                     {
/*    */ 
/*    */                       
/* 92 */                       return false; }  }  }  }  }  }  } 
/*    */       }
/*    */     } 
/* 95 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ecz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */