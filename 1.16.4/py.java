/*     */ import java.io.IOException;
/*     */ import java.util.Collection;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class py
/*     */   implements oj<om>
/*     */ {
/*     */   private int a;
/*     */   private byte b;
/*     */   private boolean c;
/*     */   private boolean d;
/*     */   private cxu[] e;
/*     */   private int f;
/*     */   private int g;
/*     */   private int h;
/*     */   private int i;
/*     */   private byte[] j;
/*     */   
/*     */   public py() {}
/*     */   
/*     */   public py(int ☃, byte b, boolean bool1, boolean bool2, Collection<cxu> collection, byte[] arrayOfByte, int i, int j, int k, int m) {
/*  28 */     this.a = ☃;
/*  29 */     this.b = b;
/*  30 */     this.c = bool1;
/*  31 */     this.d = bool2;
/*  32 */     this.e = collection.<cxu>toArray(new cxu[collection.size()]);
/*  33 */     this.f = i;
/*  34 */     this.g = j;
/*  35 */     this.h = k;
/*  36 */     this.i = m;
/*     */     
/*  38 */     this.j = new byte[k * m];
/*  39 */     for (int n = 0; n < k; n++) {
/*  40 */       for (int i1 = 0; i1 < m; i1++) {
/*  41 */         this.j[n + i1 * k] = arrayOfByte[i + n + (j + i1) * 128];
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/*  48 */     this.a = ☃.i();
/*  49 */     this.b = ☃.readByte();
/*  50 */     this.c = ☃.readBoolean();
/*  51 */     this.d = ☃.readBoolean();
/*  52 */     this.e = new cxu[☃.i()];
/*  53 */     for (int i = 0; i < this.e.length; i++) {
/*  54 */       cxu.a a = ☃.<cxu.a>a(cxu.a.class);
/*  55 */       this.e[i] = new cxu(a, ☃.readByte(), ☃.readByte(), (byte)(☃.readByte() & 0xF), ☃.readBoolean() ? ☃.h() : null);
/*     */     } 
/*  57 */     this.h = ☃.readUnsignedByte();
/*  58 */     if (this.h > 0) {
/*  59 */       this.i = ☃.readUnsignedByte();
/*  60 */       this.f = ☃.readUnsignedByte();
/*  61 */       this.g = ☃.readUnsignedByte();
/*  62 */       this.j = ☃.a();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/*  68 */     ☃.d(this.a);
/*  69 */     ☃.writeByte(this.b);
/*  70 */     ☃.writeBoolean(this.c);
/*  71 */     ☃.writeBoolean(this.d);
/*  72 */     ☃.d(this.e.length);
/*  73 */     for (cxu cxu1 : this.e) {
/*  74 */       ☃.a(cxu1.b());
/*  75 */       ☃.writeByte(cxu1.c());
/*  76 */       ☃.writeByte(cxu1.d());
/*  77 */       ☃.writeByte(cxu1.e() & 0xF);
/*  78 */       if (cxu1.g() != null) {
/*  79 */         ☃.writeBoolean(true);
/*  80 */         ☃.a(cxu1.g());
/*     */       } else {
/*  82 */         ☃.writeBoolean(false);
/*     */       } 
/*     */     } 
/*  85 */     ☃.writeByte(this.h);
/*  86 */     if (this.h > 0) {
/*  87 */       ☃.writeByte(this.i);
/*  88 */       ☃.writeByte(this.f);
/*  89 */       ☃.writeByte(this.g);
/*  90 */       ☃.a(this.j);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(om ☃) {
/*  96 */     ☃.a(this);
/*     */   }
/*     */   
/*     */   public int b() {
/* 100 */     return this.a;
/*     */   }
/*     */   
/*     */   public void a(cxx ☃) {
/* 104 */     ☃.f = this.b;
/* 105 */     ☃.d = this.c;
/* 106 */     ☃.h = this.d;
/* 107 */     ☃.j.clear(); int i;
/* 108 */     for (i = 0; i < this.e.length; i++) {
/* 109 */       cxu cxu1 = this.e[i];
/* 110 */       ☃.j.put("icon-" + i, cxu1);
/*     */     } 
/* 112 */     for (i = 0; i < this.h; i++) {
/* 113 */       for (int j = 0; j < this.i; j++)
/* 114 */         ☃.g[this.f + i + (this.g + j) * 128] = this.j[i + j * this.h]; 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\py.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */