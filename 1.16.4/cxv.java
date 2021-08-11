/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cxv
/*    */ {
/*    */   private final fx a;
/*    */   private final int b;
/*    */   private final int c;
/*    */   
/*    */   public cxv(fx ☃, int i, int j) {
/* 13 */     this.a = ☃;
/* 14 */     this.b = i;
/* 15 */     this.c = j;
/*    */   }
/*    */   
/*    */   public static cxv a(md ☃) {
/* 19 */     fx fx1 = mp.b(☃.p("Pos"));
/* 20 */     int i = ☃.h("Rotation");
/* 21 */     int j = ☃.h("EntityId");
/* 22 */     return new cxv(fx1, i, j);
/*    */   }
/*    */   
/*    */   public md a() {
/* 26 */     md ☃ = new md();
/* 27 */     ☃.a("Pos", mp.a(this.a));
/* 28 */     ☃.b("Rotation", this.b);
/* 29 */     ☃.b("EntityId", this.c);
/* 30 */     return ☃;
/*    */   }
/*    */   
/*    */   public fx b() {
/* 34 */     return this.a;
/*    */   }
/*    */   
/*    */   public int c() {
/* 38 */     return this.b;
/*    */   }
/*    */   
/*    */   public int d() {
/* 42 */     return this.c;
/*    */   }
/*    */   
/*    */   public String e() {
/* 46 */     return a(this.a);
/*    */   }
/*    */   
/*    */   public static String a(fx ☃) {
/* 50 */     return "frame-" + ☃.u() + "," + ☃.v() + "," + ☃.w();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cxv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */