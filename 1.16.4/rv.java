/*     */ import java.io.IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class rv
/*     */   implements oj<om>
/*     */ {
/*     */   private int a;
/*     */   private byte b;
/*     */   private byte c;
/*     */   private int d;
/*     */   private byte e;
/*     */   
/*     */   public rv() {}
/*     */   
/*     */   public rv(int ☃, apu apu1) {
/*  28 */     this.a = ☃;
/*  29 */     this.b = (byte)(aps.a(apu1.a()) & 0xFF);
/*  30 */     this.c = (byte)(apu1.c() & 0xFF);
/*  31 */     if (apu1.b() > 32767) {
/*  32 */       this.d = 32767;
/*     */     } else {
/*  34 */       this.d = apu1.b();
/*     */     } 
/*  36 */     this.e = 0;
/*     */     
/*  38 */     if (apu1.d()) {
/*  39 */       this.e = (byte)(this.e | 0x1);
/*     */     }
/*  41 */     if (apu1.e()) {
/*  42 */       this.e = (byte)(this.e | 0x2);
/*     */     }
/*  44 */     if (apu1.f()) {
/*  45 */       this.e = (byte)(this.e | 0x4);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/*  51 */     this.a = ☃.i();
/*  52 */     this.b = ☃.readByte();
/*  53 */     this.c = ☃.readByte();
/*  54 */     this.d = ☃.i();
/*  55 */     this.e = ☃.readByte();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/*  60 */     ☃.d(this.a);
/*  61 */     ☃.writeByte(this.b);
/*  62 */     ☃.writeByte(this.c);
/*  63 */     ☃.d(this.d);
/*  64 */     ☃.writeByte(this.e);
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  68 */     return (this.d == 32767);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(om ☃) {
/*  73 */     ☃.a(this);
/*     */   }
/*     */   
/*     */   public int c() {
/*  77 */     return this.a;
/*     */   }
/*     */   
/*     */   public byte d() {
/*  81 */     return this.b;
/*     */   }
/*     */   
/*     */   public byte e() {
/*  85 */     return this.c;
/*     */   }
/*     */   
/*     */   public int f() {
/*  89 */     return this.d;
/*     */   }
/*     */   
/*     */   public boolean g() {
/*  93 */     return ((this.e & 0x2) == 2);
/*     */   }
/*     */   
/*     */   public boolean h() {
/*  97 */     return ((this.e & 0x1) == 1);
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 101 */     return ((this.e & 0x4) == 4);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\rv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */