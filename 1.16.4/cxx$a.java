/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */ {
/*    */   public final bfw a;
/*    */   private boolean d = true;
/*    */   private int e;
/*    */   private int f;
/* 47 */   private int g = 127;
/* 48 */   private int h = 127;
/*    */   private int i;
/*    */   public int b;
/*    */   
/*    */   public a(cxx ☃, bfw bfw1) {
/* 53 */     this.a = bfw1;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public oj<?> a(bmb ☃) {
/* 58 */     if (this.d) {
/* 59 */       this.d = false;
/* 60 */       return new py(bmh.d(☃), this.c.f, this.c.d, this.c.h, this.c.j.values(), this.c.g, this.e, this.f, this.g + 1 - this.e, this.h + 1 - this.f);
/* 61 */     }  if (this.i++ % 5 == 0) {
/* 62 */       return new py(bmh.d(☃), this.c.f, this.c.d, this.c.h, this.c.j.values(), this.c.g, 0, 0, 0, 0);
/*    */     }
/*    */     
/* 65 */     return null;
/*    */   }
/*    */   
/*    */   public void a(int ☃, int i) {
/* 69 */     if (this.d) {
/* 70 */       this.e = Math.min(this.e, ☃);
/* 71 */       this.f = Math.min(this.f, i);
/* 72 */       this.g = Math.max(this.g, ☃);
/* 73 */       this.h = Math.max(this.h, i);
/*    */     } else {
/* 75 */       this.d = true;
/* 76 */       this.e = ☃;
/* 77 */       this.f = i;
/* 78 */       this.g = ☃;
/* 79 */       this.h = i;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cxx$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */