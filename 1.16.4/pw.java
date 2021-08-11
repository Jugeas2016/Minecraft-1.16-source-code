/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
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
/*     */ public class pw
/*     */   implements oj<om>
/*     */ {
/*     */   private int a;
/*     */   private int b;
/*     */   private int c;
/*     */   private int d;
/*     */   private int e;
/*     */   private int f;
/*     */   private List<byte[]> g;
/*     */   private List<byte[]> h;
/*     */   private boolean i;
/*     */   
/*     */   public pw() {}
/*     */   
/*     */   public pw(brd ☃, cuo cuo1, boolean bool) {
/*  31 */     this.a = ☃.b;
/*  32 */     this.b = ☃.c;
/*  33 */     this.i = bool;
/*  34 */     this.g = Lists.newArrayList();
/*  35 */     this.h = Lists.newArrayList();
/*  36 */     for (int i = 0; i < 18; i++) {
/*  37 */       cgb cgb1 = cuo1.a(bsf.a).a(gp.a(☃, -1 + i));
/*  38 */       cgb cgb2 = cuo1.a(bsf.b).a(gp.a(☃, -1 + i));
/*  39 */       if (cgb1 != null) {
/*  40 */         if (cgb1.c()) {
/*  41 */           this.e |= 1 << i;
/*     */         } else {
/*  43 */           this.c |= 1 << i;
/*  44 */           this.g.add(cgb1.a().clone());
/*     */         } 
/*     */       }
/*  47 */       if (cgb2 != null) {
/*  48 */         if (cgb2.c()) {
/*  49 */           this.f |= 1 << i;
/*     */         } else {
/*  51 */           this.d |= 1 << i;
/*  52 */           this.h.add(cgb2.a().clone());
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public pw(brd ☃, cuo cuo1, int i, int j, boolean bool) {
/*  59 */     this.a = ☃.b;
/*  60 */     this.b = ☃.c;
/*  61 */     this.i = bool;
/*  62 */     this.c = i;
/*  63 */     this.d = j;
/*  64 */     this.g = Lists.newArrayList();
/*  65 */     this.h = Lists.newArrayList();
/*  66 */     for (int k = 0; k < 18; k++) {
/*  67 */       if ((this.c & 1 << k) != 0) {
/*  68 */         cgb cgb = cuo1.a(bsf.a).a(gp.a(☃, -1 + k));
/*  69 */         if (cgb == null || cgb.c()) {
/*  70 */           this.c &= 1 << k ^ 0xFFFFFFFF;
/*  71 */           if (cgb != null) {
/*  72 */             this.e |= 1 << k;
/*     */           }
/*     */         } else {
/*  75 */           this.g.add(cgb.a().clone());
/*     */         } 
/*     */       } 
/*  78 */       if ((this.d & 1 << k) != 0) {
/*  79 */         cgb cgb = cuo1.a(bsf.b).a(gp.a(☃, -1 + k));
/*  80 */         if (cgb == null || cgb.c()) {
/*  81 */           this.d &= 1 << k ^ 0xFFFFFFFF;
/*  82 */           if (cgb != null) {
/*  83 */             this.f |= 1 << k;
/*     */           }
/*     */         } else {
/*  86 */           this.h.add(cgb.a().clone());
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/*  94 */     this.a = ☃.i();
/*  95 */     this.b = ☃.i();
/*  96 */     this.i = ☃.readBoolean();
/*  97 */     this.c = ☃.i();
/*  98 */     this.d = ☃.i();
/*  99 */     this.e = ☃.i();
/* 100 */     this.f = ☃.i();
/* 101 */     this.g = Lists.newArrayList(); int i;
/* 102 */     for (i = 0; i < 18; i++) {
/* 103 */       if ((this.c & 1 << i) != 0) {
/* 104 */         this.g.add(☃.b(2048));
/*     */       }
/*     */     } 
/* 107 */     this.h = Lists.newArrayList();
/* 108 */     for (i = 0; i < 18; i++) {
/* 109 */       if ((this.d & 1 << i) != 0) {
/* 110 */         this.h.add(☃.b(2048));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/* 117 */     ☃.d(this.a);
/* 118 */     ☃.d(this.b);
/* 119 */     ☃.writeBoolean(this.i);
/* 120 */     ☃.d(this.c);
/* 121 */     ☃.d(this.d);
/* 122 */     ☃.d(this.e);
/* 123 */     ☃.d(this.f);
/* 124 */     for (byte[] arrayOfByte : this.g) {
/* 125 */       ☃.a(arrayOfByte);
/*     */     }
/* 127 */     for (byte[] arrayOfByte : this.h) {
/* 128 */       ☃.a(arrayOfByte);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(om ☃) {
/* 134 */     ☃.a(this);
/*     */   }
/*     */   
/*     */   public int b() {
/* 138 */     return this.a;
/*     */   }
/*     */   
/*     */   public int c() {
/* 142 */     return this.b;
/*     */   }
/*     */   
/*     */   public int d() {
/* 146 */     return this.c;
/*     */   }
/*     */   
/*     */   public int e() {
/* 150 */     return this.e;
/*     */   }
/*     */   
/*     */   public List<byte[]> f() {
/* 154 */     return this.g;
/*     */   }
/*     */   
/*     */   public int g() {
/* 158 */     return this.d;
/*     */   }
/*     */   
/*     */   public int h() {
/* 162 */     return this.f;
/*     */   }
/*     */   
/*     */   public List<byte[]> i() {
/* 166 */     return this.h;
/*     */   }
/*     */   
/*     */   public boolean j() {
/* 170 */     return this.i;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\pw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */