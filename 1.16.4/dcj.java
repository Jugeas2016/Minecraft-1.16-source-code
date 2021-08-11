/*    */ 
/*    */ 
/*    */ 
/*    */ public class dcj
/*    */   extends dcl
/*    */ {
/*    */   private final gc b;
/*    */   private final fx c;
/*    */   private final boolean d;
/*    */   private final boolean e;
/*    */   
/*    */   public static dcj a(dcn ☃, gc gc1, fx fx1) {
/* 13 */     return new dcj(true, ☃, gc1, fx1, false);
/*    */   }
/*    */   
/*    */   public dcj(dcn ☃, gc gc1, fx fx1, boolean bool) {
/* 17 */     this(false, ☃, gc1, fx1, bool);
/*    */   }
/*    */   
/*    */   private dcj(boolean ☃, dcn dcn1, gc gc1, fx fx1, boolean bool1) {
/* 21 */     super(dcn1);
/*    */     
/* 23 */     this.d = ☃;
/* 24 */     this.b = gc1;
/* 25 */     this.c = fx1;
/* 26 */     this.e = bool1;
/*    */   }
/*    */   
/*    */   public dcj a(gc ☃) {
/* 30 */     return new dcj(this.d, this.a, ☃, this.c, this.e);
/*    */   }
/*    */   
/*    */   public dcj a(fx ☃) {
/* 34 */     return new dcj(this.d, this.a, this.b, ☃, this.e);
/*    */   }
/*    */   
/*    */   public fx a() {
/* 38 */     return this.c;
/*    */   }
/*    */   
/*    */   public gc b() {
/* 42 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public dcl.a c() {
/* 47 */     return this.d ? dcl.a.a : dcl.a.b;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 51 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dcj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */