/*     */ import java.io.IOException;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class qa
/*     */   implements oj<om>
/*     */ {
/*     */   protected int a;
/*     */   protected short b;
/*     */   protected short c;
/*     */   protected short d;
/*     */   protected byte e;
/*     */   protected byte f;
/*     */   protected boolean g;
/*     */   protected boolean h;
/*     */   protected boolean i;
/*     */   
/*     */   public static long a(double ☃) {
/*  29 */     return afm.d(☃ * 4096.0D);
/*     */   }
/*     */   
/*     */   public static double a(long ☃) {
/*  33 */     return ☃ / 4096.0D;
/*     */   }
/*     */   
/*     */   public dcn a(dcn ☃) {
/*  37 */     double d1 = (this.b == 0) ? ☃.b : a(a(☃.b) + this.b);
/*  38 */     double d2 = (this.c == 0) ? ☃.c : a(a(☃.c) + this.c);
/*  39 */     double d3 = (this.d == 0) ? ☃.d : a(a(☃.d) + this.d);
/*  40 */     return new dcn(d1, d2, d3);
/*     */   }
/*     */   
/*     */   public static dcn a(long ☃, long l1, long l2) {
/*  44 */     return (new dcn(☃, l1, l2)).a(2.44140625E-4D);
/*     */   }
/*     */   
/*     */   public static class b extends qa {
/*     */     public b() {
/*  49 */       this.h = true;
/*  50 */       this.i = true;
/*     */     }
/*     */     
/*     */     public b(int ☃, short s1, short s2, short s3, byte b1, byte b2, boolean bool) {
/*  54 */       super(☃);
/*     */       
/*  56 */       this.b = s1;
/*  57 */       this.c = s2;
/*  58 */       this.d = s3;
/*  59 */       this.e = b1;
/*  60 */       this.f = b2;
/*  61 */       this.g = bool;
/*  62 */       this.h = true;
/*  63 */       this.i = true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(nf ☃) throws IOException {
/*  68 */       super.a(☃);
/*  69 */       this.b = ☃.readShort();
/*  70 */       this.c = ☃.readShort();
/*  71 */       this.d = ☃.readShort();
/*  72 */       this.e = ☃.readByte();
/*  73 */       this.f = ☃.readByte();
/*  74 */       this.g = ☃.readBoolean();
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(nf ☃) throws IOException {
/*  79 */       super.b(☃);
/*  80 */       ☃.writeShort(this.b);
/*  81 */       ☃.writeShort(this.c);
/*  82 */       ☃.writeShort(this.d);
/*  83 */       ☃.writeByte(this.e);
/*  84 */       ☃.writeByte(this.f);
/*  85 */       ☃.writeBoolean(this.g);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a extends qa {
/*     */     public a() {
/*  91 */       this.i = true;
/*     */     }
/*     */     
/*     */     public a(int ☃, short s1, short s2, short s3, boolean bool) {
/*  95 */       super(☃);
/*     */       
/*  97 */       this.b = s1;
/*  98 */       this.c = s2;
/*  99 */       this.d = s3;
/* 100 */       this.g = bool;
/* 101 */       this.i = true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(nf ☃) throws IOException {
/* 106 */       super.a(☃);
/* 107 */       this.b = ☃.readShort();
/* 108 */       this.c = ☃.readShort();
/* 109 */       this.d = ☃.readShort();
/* 110 */       this.g = ☃.readBoolean();
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(nf ☃) throws IOException {
/* 115 */       super.b(☃);
/* 116 */       ☃.writeShort(this.b);
/* 117 */       ☃.writeShort(this.c);
/* 118 */       ☃.writeShort(this.d);
/* 119 */       ☃.writeBoolean(this.g);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class c extends qa {
/*     */     public c() {
/* 125 */       this.h = true;
/*     */     }
/*     */     
/*     */     public c(int ☃, byte b1, byte b2, boolean bool) {
/* 129 */       super(☃);
/* 130 */       this.e = b1;
/* 131 */       this.f = b2;
/* 132 */       this.h = true;
/* 133 */       this.g = bool;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(nf ☃) throws IOException {
/* 138 */       super.a(☃);
/* 139 */       this.e = ☃.readByte();
/* 140 */       this.f = ☃.readByte();
/* 141 */       this.g = ☃.readBoolean();
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(nf ☃) throws IOException {
/* 146 */       super.b(☃);
/* 147 */       ☃.writeByte(this.e);
/* 148 */       ☃.writeByte(this.f);
/* 149 */       ☃.writeBoolean(this.g);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public qa() {}
/*     */   
/*     */   public qa(int ☃) {
/* 157 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/* 162 */     this.a = ☃.i();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/* 167 */     ☃.d(this.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(om ☃) {
/* 172 */     ☃.a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 177 */     return "Entity_" + super.toString();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aqa a(brx ☃) {
/* 182 */     return ☃.a(this.a);
/*     */   }
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
/*     */   public byte e() {
/* 198 */     return this.e;
/*     */   }
/*     */   
/*     */   public byte f() {
/* 202 */     return this.f;
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 206 */     return this.h;
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 210 */     return this.i;
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 214 */     return this.g;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\qa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */