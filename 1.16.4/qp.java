/*    */ import java.io.IOException;
/*    */ import java.util.function.Supplier;
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
/*    */ public class qp
/*    */   implements oj<om>
/*    */ {
/*    */   private chd a;
/*    */   private vj<brx> b;
/*    */   private long c;
/*    */   private bru d;
/*    */   private bru e;
/*    */   private boolean f;
/*    */   private boolean g;
/*    */   private boolean h;
/*    */   
/*    */   public qp() {}
/*    */   
/*    */   public qp(chd ☃, vj<brx> vj1, long l, bru bru1, bru bru2, boolean bool1, boolean bool2, boolean bool3) {
/* 28 */     this.a = ☃;
/* 29 */     this.b = vj1;
/* 30 */     this.c = l;
/* 31 */     this.d = bru1;
/* 32 */     this.e = bru2;
/* 33 */     this.f = bool1;
/* 34 */     this.g = bool2;
/* 35 */     this.h = bool3;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 40 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 45 */     this.a = ((Supplier<chd>)☃.<Supplier<chd>>a(chd.n)).get();
/* 46 */     this.b = vj.a(gm.L, ☃.p());
/* 47 */     this.c = ☃.readLong();
/* 48 */     this.d = bru.a(☃.readUnsignedByte());
/* 49 */     this.e = bru.a(☃.readUnsignedByte());
/* 50 */     this.f = ☃.readBoolean();
/* 51 */     this.g = ☃.readBoolean();
/* 52 */     this.h = ☃.readBoolean();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 57 */     ☃.a(chd.n, () -> this.a);
/* 58 */     ☃.a(this.b.a());
/* 59 */     ☃.writeLong(this.c);
/* 60 */     ☃.writeByte(this.d.a());
/* 61 */     ☃.writeByte(this.e.a());
/* 62 */     ☃.writeBoolean(this.f);
/* 63 */     ☃.writeBoolean(this.g);
/* 64 */     ☃.writeBoolean(this.h);
/*    */   }
/*    */   
/*    */   public chd b() {
/* 68 */     return this.a;
/*    */   }
/*    */   
/*    */   public vj<brx> c() {
/* 72 */     return this.b;
/*    */   }
/*    */   
/*    */   public long d() {
/* 76 */     return this.c;
/*    */   }
/*    */   
/*    */   public bru e() {
/* 80 */     return this.d;
/*    */   }
/*    */   
/*    */   public bru f() {
/* 84 */     return this.e;
/*    */   }
/*    */   
/*    */   public boolean g() {
/* 88 */     return this.f;
/*    */   }
/*    */   
/*    */   public boolean h() {
/* 92 */     return this.g;
/*    */   }
/*    */   
/*    */   public boolean i() {
/* 96 */     return this.h;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\qp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */