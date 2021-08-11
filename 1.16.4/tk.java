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
/*    */ public class tk
/*    */   implements oj<sa>
/*    */ {
/*    */   private fx a;
/*    */   private String b;
/*    */   private boolean c;
/*    */   private boolean d;
/*    */   private boolean e;
/*    */   private cco.a f;
/*    */   
/*    */   public tk() {}
/*    */   
/*    */   public tk(fx ☃, String str, cco.a a1, boolean bool1, boolean bool2, boolean bool3) {
/* 26 */     this.a = ☃;
/* 27 */     this.b = str;
/* 28 */     this.c = bool1;
/* 29 */     this.d = bool2;
/* 30 */     this.e = bool3;
/* 31 */     this.f = a1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 36 */     this.a = ☃.e();
/* 37 */     this.b = ☃.e(32767);
/* 38 */     this.f = ☃.<cco.a>a(cco.a.class);
/* 39 */     int i = ☃.readByte();
/* 40 */     this.c = ((i & 0x1) != 0);
/* 41 */     this.d = ((i & 0x2) != 0);
/* 42 */     this.e = ((i & 0x4) != 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 47 */     ☃.a(this.a);
/* 48 */     ☃.a(this.b);
/* 49 */     ☃.a(this.f);
/* 50 */     int i = 0;
/* 51 */     if (this.c) {
/* 52 */       i |= 0x1;
/*    */     }
/* 54 */     if (this.d) {
/* 55 */       i |= 0x2;
/*    */     }
/* 57 */     if (this.e) {
/* 58 */       i |= 0x4;
/*    */     }
/* 60 */     ☃.writeByte(i);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(sa ☃) {
/* 65 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public fx b() {
/* 69 */     return this.a;
/*    */   }
/*    */   
/*    */   public String c() {
/* 73 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 77 */     return this.c;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 81 */     return this.d;
/*    */   }
/*    */   
/*    */   public boolean f() {
/* 85 */     return this.e;
/*    */   }
/*    */   
/*    */   public cco.a g() {
/* 89 */     return this.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\tk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */