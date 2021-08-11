/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class apa
/*     */   implements aon, bju
/*     */ {
/*     */   private final int a;
/*     */   private final gj<bmb> b;
/*     */   private List<aop> c;
/*     */   
/*     */   public apa(int ☃) {
/*  22 */     this.a = ☃;
/*  23 */     this.b = gj.a(☃, bmb.b);
/*     */   }
/*     */   
/*     */   public apa(bmb... ☃) {
/*  27 */     this.a = ☃.length;
/*  28 */     this.b = gj.a(bmb.b, ☃);
/*     */   }
/*     */   
/*     */   public void a(aop ☃) {
/*  32 */     if (this.c == null) {
/*  33 */       this.c = Lists.newArrayList();
/*     */     }
/*  35 */     this.c.add(☃);
/*     */   }
/*     */   
/*     */   public void b(aop ☃) {
/*  39 */     this.c.remove(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(int ☃) {
/*  44 */     if (☃ < 0 || ☃ >= this.b.size()) {
/*  45 */       return bmb.b;
/*     */     }
/*  47 */     return this.b.get(☃);
/*     */   }
/*     */   
/*     */   public List<bmb> f() {
/*  51 */     List<bmb> ☃ = (List<bmb>)this.b.stream().filter(☃ -> !☃.a()).collect(Collectors.toList());
/*  52 */     Y_();
/*  53 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(int ☃, int i) {
/*  58 */     bmb bmb = aoo.a(this.b, ☃, i);
/*  59 */     if (!bmb.a()) {
/*  60 */       X_();
/*     */     }
/*  62 */     return bmb;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bmb a(blx ☃, int i) {
/*  70 */     bmb bmb = new bmb(☃, 0);
/*     */     
/*  72 */     for (int j = this.a - 1; j >= 0; j--) {
/*  73 */       bmb bmb1 = a(j);
/*  74 */       if (bmb1.b().equals(☃)) {
/*  75 */         int k = i - bmb.E();
/*  76 */         bmb bmb2 = bmb1.a(k);
/*  77 */         bmb.f(bmb2.E());
/*  78 */         if (bmb.E() == i) {
/*     */           break;
/*     */         }
/*     */       } 
/*     */     } 
/*  83 */     if (!bmb.a()) {
/*  84 */       X_();
/*     */     }
/*  86 */     return bmb;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bmb a(bmb ☃) {
/*  94 */     bmb bmb1 = ☃.i();
/*     */     
/*  96 */     d(bmb1);
/*  97 */     if (bmb1.a()) {
/*  98 */       return bmb.b;
/*     */     }
/*     */     
/* 101 */     c(bmb1);
/* 102 */     if (bmb1.a()) {
/* 103 */       return bmb.b;
/*     */     }
/*     */     
/* 106 */     return bmb1;
/*     */   }
/*     */   
/*     */   public boolean b(bmb ☃) {
/* 110 */     boolean bool = false;
/* 111 */     for (bmb bmb1 : this.b) {
/* 112 */       if (bmb1.a() || (a(bmb1, ☃) && bmb1.E() < bmb1.c())) {
/* 113 */         bool = true;
/*     */         break;
/*     */       } 
/*     */     } 
/* 117 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(int ☃) {
/* 122 */     bmb bmb = this.b.get(☃);
/* 123 */     if (bmb.a()) {
/* 124 */       return bmb.b;
/*     */     }
/* 126 */     this.b.set(☃, bmb.b);
/* 127 */     return bmb;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, bmb bmb1) {
/* 132 */     this.b.set(☃, bmb1);
/* 133 */     if (!bmb1.a() && bmb1.E() > V_()) {
/* 134 */       bmb1.e(V_());
/*     */     }
/* 136 */     X_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int Z_() {
/* 141 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 146 */     for (bmb ☃ : this.b) {
/* 147 */       if (!☃.a()) {
/* 148 */         return false;
/*     */       }
/*     */     } 
/* 151 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void X_() {
/* 156 */     if (this.c != null) {
/* 157 */       for (aop ☃ : this.c) {
/* 158 */         ☃.a(this);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 165 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void Y_() {
/* 170 */     this.b.clear();
/* 171 */     X_();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bfy ☃) {
/* 176 */     for (bmb bmb : this.b) {
/* 177 */       ☃.b(bmb);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 183 */     return ((List)this.b.stream()
/* 184 */       .filter(☃ -> !☃.a())
/* 185 */       .collect(Collectors.toList()))
/* 186 */       .toString();
/*     */   }
/*     */   
/*     */   private void c(bmb ☃) {
/* 190 */     for (int i = 0; i < this.a; i++) {
/* 191 */       bmb bmb1 = a(i);
/* 192 */       if (bmb1.a()) {
/* 193 */         a(i, ☃.i());
/* 194 */         ☃.e(0);
/*     */         return;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void d(bmb ☃) {
/* 201 */     for (int i = 0; i < this.a; i++) {
/* 202 */       bmb bmb1 = a(i);
/* 203 */       if (a(bmb1, ☃)) {
/* 204 */         b(☃, bmb1);
/* 205 */         if (☃.a()) {
/*     */           return;
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean a(bmb ☃, bmb bmb1) {
/* 213 */     return (☃.b() == bmb1.b() && bmb.a(☃, bmb1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void b(bmb ☃, bmb bmb1) {
/* 220 */     int i = Math.min(V_(), bmb1.c());
/* 221 */     int j = Math.min(☃.E(), i - bmb1.E());
/* 222 */     if (j > 0) {
/* 223 */       bmb1.f(j);
/* 224 */       ☃.g(j);
/* 225 */       X_();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(mj ☃) {
/* 230 */     for (int i = 0; i < ☃.size(); i++) {
/* 231 */       bmb bmb = bmb.a(☃.a(i));
/* 232 */       if (!bmb.a()) {
/* 233 */         a(bmb);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public mj g() {
/* 239 */     mj ☃ = new mj();
/* 240 */     for (int i = 0; i < Z_(); i++) {
/* 241 */       bmb bmb = a(i);
/* 242 */       if (!bmb.a()) {
/* 243 */         ☃.add(bmb.b(new md()));
/*     */       }
/*     */     } 
/* 246 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\apa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */