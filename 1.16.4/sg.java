/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class sg
/*    */   implements oj<sa>
/*    */ {
/*    */   private String a;
/*    */   private int b;
/*    */   private bfu c;
/*    */   private boolean d;
/*    */   private int e;
/*    */   private aqi f;
/*    */   
/*    */   public sg() {}
/*    */   
/*    */   public sg(String ☃, int i, bfu bfu1, boolean bool, int j, aqi aqi1) {
/* 24 */     this.a = ☃;
/* 25 */     this.b = i;
/* 26 */     this.c = bfu1;
/* 27 */     this.d = bool;
/* 28 */     this.e = j;
/* 29 */     this.f = aqi1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 34 */     this.a = ☃.e(16);
/* 35 */     this.b = ☃.readByte();
/*    */     
/* 37 */     this.c = ☃.<bfu>a(bfu.class);
/* 38 */     this.d = ☃.readBoolean();
/*    */     
/* 40 */     this.e = ☃.readUnsignedByte();
/* 41 */     this.f = ☃.<aqi>a(aqi.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 46 */     ☃.a(this.a);
/* 47 */     ☃.writeByte(this.b);
/* 48 */     ☃.a(this.c);
/* 49 */     ☃.writeBoolean(this.d);
/* 50 */     ☃.writeByte(this.e);
/* 51 */     ☃.a(this.f);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(sa ☃) {
/* 56 */     ☃.a(this);
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
/*    */   public bfu d() {
/* 68 */     return this.c;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 72 */     return this.d;
/*    */   }
/*    */   
/*    */   public int f() {
/* 76 */     return this.e;
/*    */   }
/*    */   
/*    */   public aqi g() {
/* 80 */     return this.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\sg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */