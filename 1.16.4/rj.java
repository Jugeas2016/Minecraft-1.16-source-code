/*    */ import java.io.IOException;
/*    */ import java.util.Objects;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rj
/*    */   implements oj<om>
/*    */ {
/* 14 */   private String a = "";
/*    */   
/*    */   @Nullable
/*    */   private String b;
/*    */   
/*    */   private int c;
/*    */   
/*    */   private wa.a d;
/*    */   
/*    */   public rj(wa.a ☃, @Nullable String str1, String str2, int i) {
/* 24 */     if (☃ != wa.a.b && str1 == null) {
/* 25 */       throw new IllegalArgumentException("Need an objective name");
/*    */     }
/* 27 */     this.a = str2;
/* 28 */     this.b = str1;
/* 29 */     this.c = i;
/* 30 */     this.d = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 35 */     this.a = ☃.e(40);
/* 36 */     this.d = ☃.<wa.a>a(wa.a.class);
/* 37 */     String str = ☃.e(16);
/* 38 */     this.b = Objects.equals(str, "") ? null : str;
/*    */     
/* 40 */     if (this.d != wa.a.b) {
/* 41 */       this.c = ☃.i();
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 47 */     ☃.a(this.a);
/* 48 */     ☃.a(this.d);
/* 49 */     ☃.a((this.b == null) ? "" : this.b);
/*    */     
/* 51 */     if (this.d != wa.a.b) {
/* 52 */       ☃.d(this.c);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 58 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public String b() {
/* 62 */     return this.a;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public String c() {
/* 67 */     return this.b;
/*    */   }
/*    */   
/*    */   public int d() {
/* 71 */     return this.c;
/*    */   }
/*    */   
/*    */   public wa.a e() {
/* 75 */     return this.d;
/*    */   }
/*    */   
/*    */   public rj() {}
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\rj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */