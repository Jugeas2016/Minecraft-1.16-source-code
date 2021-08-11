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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class qg
/*    */   implements oj<om>
/*    */ {
/*    */   private boolean a;
/*    */   private boolean b;
/*    */   private boolean c;
/*    */   private boolean d;
/*    */   private float e;
/*    */   private float f;
/*    */   
/*    */   public qg() {}
/*    */   
/*    */   public qg(bft ☃) {
/* 27 */     this.a = ☃.a;
/* 28 */     this.b = ☃.b;
/* 29 */     this.c = ☃.c;
/* 30 */     this.d = ☃.d;
/* 31 */     this.e = ☃.a();
/* 32 */     this.f = ☃.b();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 37 */     byte b = ☃.readByte();
/*    */     
/* 39 */     this.a = ((b & 0x1) != 0);
/* 40 */     this.b = ((b & 0x2) != 0);
/* 41 */     this.c = ((b & 0x4) != 0);
/* 42 */     this.d = ((b & 0x8) != 0);
/* 43 */     this.e = ☃.readFloat();
/* 44 */     this.f = ☃.readFloat();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 49 */     byte b = 0;
/*    */     
/* 51 */     if (this.a) {
/* 52 */       b = (byte)(b | 0x1);
/*    */     }
/* 54 */     if (this.b) {
/* 55 */       b = (byte)(b | 0x2);
/*    */     }
/* 57 */     if (this.c) {
/* 58 */       b = (byte)(b | 0x4);
/*    */     }
/* 60 */     if (this.d) {
/* 61 */       b = (byte)(b | 0x8);
/*    */     }
/*    */     
/* 64 */     ☃.writeByte(b);
/* 65 */     ☃.writeFloat(this.e);
/* 66 */     ☃.writeFloat(this.f);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 71 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 75 */     return this.a;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 79 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 83 */     return this.c;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 87 */     return this.d;
/*    */   }
/*    */   
/*    */   public float f() {
/* 91 */     return this.e;
/*    */   }
/*    */   
/*    */   public float g() {
/* 95 */     return this.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\qg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */