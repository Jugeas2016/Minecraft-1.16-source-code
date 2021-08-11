/*    */ import java.io.IOException;
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
/*    */ public class qj
/*    */   implements oj<om>
/*    */ {
/*    */   private double a;
/*    */   private double b;
/*    */   private double c;
/*    */   private int d;
/*    */   private dj.a e;
/*    */   private dj.a f;
/*    */   private boolean g;
/*    */   
/*    */   public qj() {}
/*    */   
/*    */   public qj(dj.a ☃, double d1, double d2, double d3) {
/* 26 */     this.e = ☃;
/* 27 */     this.a = d1;
/* 28 */     this.b = d2;
/* 29 */     this.c = d3;
/*    */   }
/*    */   
/*    */   public qj(dj.a ☃, aqa aqa1, dj.a a1) {
/* 33 */     this.e = ☃;
/* 34 */     this.d = aqa1.Y();
/* 35 */     this.f = a1;
/* 36 */     dcn dcn = a1.a(aqa1);
/* 37 */     this.a = dcn.b;
/* 38 */     this.b = dcn.c;
/* 39 */     this.c = dcn.d;
/* 40 */     this.g = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 45 */     this.e = ☃.<dj.a>a(dj.a.class);
/* 46 */     this.a = ☃.readDouble();
/* 47 */     this.b = ☃.readDouble();
/* 48 */     this.c = ☃.readDouble();
/* 49 */     if (☃.readBoolean()) {
/* 50 */       this.g = true;
/* 51 */       this.d = ☃.i();
/* 52 */       this.f = ☃.<dj.a>a(dj.a.class);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 58 */     ☃.a(this.e);
/* 59 */     ☃.writeDouble(this.a);
/* 60 */     ☃.writeDouble(this.b);
/* 61 */     ☃.writeDouble(this.c);
/* 62 */     ☃.writeBoolean(this.g);
/* 63 */     if (this.g) {
/* 64 */       ☃.d(this.d);
/* 65 */       ☃.a(this.f);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 71 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public dj.a b() {
/* 75 */     return this.e;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public dcn a(brx ☃) {
/* 80 */     if (this.g) {
/* 81 */       aqa aqa = ☃.a(this.d);
/* 82 */       if (aqa == null) {
/* 83 */         return new dcn(this.a, this.b, this.c);
/*    */       }
/* 85 */       return this.f.a(aqa);
/*    */     } 
/* 87 */     return new dcn(this.a, this.b, this.c);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\qj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */