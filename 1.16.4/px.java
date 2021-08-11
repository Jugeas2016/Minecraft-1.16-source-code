/*     */ import com.google.common.collect.Sets;
/*     */ import java.io.IOException;
/*     */ import java.util.Set;
/*     */ import java.util.function.Supplier;
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
/*     */ public class px
/*     */   implements oj<om>
/*     */ {
/*     */   private int a;
/*     */   private long b;
/*     */   private boolean c;
/*     */   private bru d;
/*     */   private bru e;
/*     */   private Set<vj<brx>> f;
/*     */   private gn.b g;
/*     */   private chd h;
/*     */   private vj<brx> i;
/*     */   private int j;
/*     */   private int k;
/*     */   private boolean l;
/*     */   private boolean m;
/*     */   private boolean n;
/*     */   private boolean o;
/*     */   
/*     */   public px() {}
/*     */   
/*     */   public px(int ☃, bru bru1, bru bru2, long l, boolean bool1, Set<vj<brx>> set, gn.b b1, chd chd1, vj<brx> vj1, int i, int j, boolean bool2, boolean bool3, boolean bool4, boolean bool5) {
/*  41 */     this.a = ☃;
/*  42 */     this.f = set;
/*  43 */     this.g = b1;
/*  44 */     this.h = chd1;
/*  45 */     this.i = vj1;
/*  46 */     this.b = l;
/*  47 */     this.d = bru1;
/*  48 */     this.e = bru2;
/*  49 */     this.j = i;
/*  50 */     this.c = bool1;
/*  51 */     this.k = j;
/*  52 */     this.l = bool2;
/*  53 */     this.m = bool3;
/*  54 */     this.n = bool4;
/*  55 */     this.o = bool5;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/*  60 */     this.a = ☃.readInt();
/*     */     
/*  62 */     this.c = ☃.readBoolean();
/*  63 */     this.d = bru.a(☃.readByte());
/*  64 */     this.e = bru.a(☃.readByte());
/*     */     
/*  66 */     int i = ☃.i();
/*  67 */     this.f = Sets.newHashSet();
/*  68 */     for (int j = 0; j < i; j++) {
/*  69 */       this.f.add(vj.a(gm.L, ☃.p()));
/*     */     }
/*  71 */     this.g = ☃.<gn.b>a(gn.b.a);
/*     */     
/*  73 */     this.h = ((Supplier<chd>)☃.<Supplier<chd>>a(chd.n)).get();
/*  74 */     this.i = vj.a(gm.L, ☃.p());
/*  75 */     this.b = ☃.readLong();
/*  76 */     this.j = ☃.i();
/*  77 */     this.k = ☃.i();
/*  78 */     this.l = ☃.readBoolean();
/*  79 */     this.m = ☃.readBoolean();
/*  80 */     this.n = ☃.readBoolean();
/*  81 */     this.o = ☃.readBoolean();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/*  86 */     ☃.writeInt(this.a);
/*  87 */     ☃.writeBoolean(this.c);
/*  88 */     ☃.writeByte(this.d.a());
/*  89 */     ☃.writeByte(this.e.a());
/*     */     
/*  91 */     ☃.d(this.f.size());
/*  92 */     for (vj<brx> vj1 : this.f) {
/*  93 */       ☃.a(vj1.a());
/*     */     }
/*  95 */     ☃.a(gn.b.a, this.g);
/*     */     
/*  97 */     ☃.a(chd.n, () -> this.h);
/*  98 */     ☃.a(this.i.a());
/*  99 */     ☃.writeLong(this.b);
/* 100 */     ☃.d(this.j);
/* 101 */     ☃.d(this.k);
/* 102 */     ☃.writeBoolean(this.l);
/* 103 */     ☃.writeBoolean(this.m);
/* 104 */     ☃.writeBoolean(this.n);
/* 105 */     ☃.writeBoolean(this.o);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(om ☃) {
/* 110 */     ☃.a(this);
/*     */   }
/*     */   
/*     */   public int b() {
/* 114 */     return this.a;
/*     */   }
/*     */   
/*     */   public long c() {
/* 118 */     return this.b;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 122 */     return this.c;
/*     */   }
/*     */   
/*     */   public bru e() {
/* 126 */     return this.d;
/*     */   }
/*     */   
/*     */   public bru f() {
/* 130 */     return this.e;
/*     */   }
/*     */   
/*     */   public Set<vj<brx>> g() {
/* 134 */     return this.f;
/*     */   }
/*     */   
/*     */   public gn h() {
/* 138 */     return this.g;
/*     */   }
/*     */   
/*     */   public chd i() {
/* 142 */     return this.h;
/*     */   }
/*     */   
/*     */   public vj<brx> j() {
/* 146 */     return this.i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int l() {
/* 154 */     return this.k;
/*     */   }
/*     */   
/*     */   public boolean m() {
/* 158 */     return this.l;
/*     */   }
/*     */   public boolean n() {
/* 161 */     return this.m;
/*     */   }
/*     */   public boolean o() {
/* 164 */     return this.n;
/*     */   }
/*     */   
/*     */   public boolean p() {
/* 168 */     return this.o;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\px.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */