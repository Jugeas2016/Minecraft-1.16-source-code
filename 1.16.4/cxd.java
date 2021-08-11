/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.List;
/*     */ import java.util.Set;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cxd
/*     */ {
/*     */   private final List<cxb> a;
/*  27 */   private cxb[] b = new cxb[0];
/*  28 */   private cxb[] c = new cxb[0];
/*     */   
/*     */   private Set<cxh> d;
/*     */   private int e;
/*     */   private final fx f;
/*     */   private final float g;
/*     */   private final boolean h;
/*     */   
/*     */   public cxd(List<cxb> ☃, fx fx1, boolean bool) {
/*  37 */     this.a = ☃;
/*  38 */     this.f = fx1;
/*     */     
/*  40 */     this.g = ☃.isEmpty() ? Float.MAX_VALUE : ((cxb)this.a.get(this.a.size() - 1)).c(this.f);
/*     */     
/*  42 */     this.h = bool;
/*     */   }
/*     */   
/*     */   public void a() {
/*  46 */     this.e++;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  50 */     return (this.e <= 0);
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  54 */     return (this.e >= this.a.size());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cxb d() {
/*  59 */     if (!this.a.isEmpty()) {
/*  60 */       return this.a.get(this.a.size() - 1);
/*     */     }
/*  62 */     return null;
/*     */   }
/*     */   
/*     */   public cxb a(int ☃) {
/*  66 */     return this.a.get(☃);
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/*  70 */     if (this.a.size() > ☃) {
/*  71 */       this.a.subList(☃, this.a.size()).clear();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int ☃, cxb cxb1) {
/*  76 */     this.a.set(☃, cxb1);
/*     */   }
/*     */   
/*     */   public int e() {
/*  80 */     return this.a.size();
/*     */   }
/*     */   
/*     */   public int f() {
/*  84 */     return this.e;
/*     */   }
/*     */   
/*     */   public void c(int ☃) {
/*  88 */     this.e = ☃;
/*     */   }
/*     */   
/*     */   public dcn a(aqa ☃, int i) {
/*  92 */     cxb cxb1 = this.a.get(i);
/*  93 */     double d1 = cxb1.a + (int)(☃.cy() + 1.0F) * 0.5D;
/*  94 */     double d2 = cxb1.b;
/*  95 */     double d3 = cxb1.c + (int)(☃.cy() + 1.0F) * 0.5D;
/*  96 */     return new dcn(d1, d2, d3);
/*     */   }
/*     */   
/*     */   public fx d(int ☃) {
/* 100 */     return ((cxb)this.a.get(☃)).a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public dcn a(aqa ☃) {
/* 107 */     return a(☃, this.e);
/*     */   }
/*     */   
/*     */   public fx g() {
/* 111 */     return ((cxb)this.a.get(this.e)).a();
/*     */   }
/*     */   
/*     */   public cxb h() {
/* 115 */     return this.a.get(this.e);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cxb i() {
/* 120 */     return (this.e > 0) ? this.a.get(this.e - 1) : null;
/*     */   }
/*     */   
/*     */   public boolean a(@Nullable cxd ☃) {
/* 124 */     if (☃ == null) {
/* 125 */       return false;
/*     */     }
/* 127 */     if (☃.a.size() != this.a.size()) {
/* 128 */       return false;
/*     */     }
/*     */     
/* 131 */     for (int i = 0; i < this.a.size(); i++) {
/* 132 */       cxb cxb1 = this.a.get(i);
/* 133 */       cxb cxb2 = ☃.a.get(i);
/*     */       
/* 135 */       if (cxb1.a != cxb2.a || cxb1.b != cxb2.b || cxb1.c != cxb2.c) {
/* 136 */         return false;
/*     */       }
/*     */     } 
/* 139 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean j() {
/* 146 */     return this.h;
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
/*     */   public cxb[] k() {
/* 158 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public cxb[] l() {
/* 163 */     return this.c;
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static cxd b(nf ☃) {
/* 197 */     boolean bool = ☃.readBoolean();
/* 198 */     int i = ☃.readInt();
/* 199 */     int j = ☃.readInt();
/* 200 */     Set<cxh> set = Sets.newHashSet();
/* 201 */     for (int k = 0; k < j; k++) {
/* 202 */       set.add(cxh.c(☃));
/*     */     }
/*     */     
/* 205 */     fx fx1 = new fx(☃.readInt(), ☃.readInt(), ☃.readInt());
/*     */     
/* 207 */     List<cxb> list = Lists.newArrayList();
/* 208 */     int m = ☃.readInt();
/* 209 */     for (int n = 0; n < m; n++) {
/* 210 */       list.add(cxb.b(☃));
/*     */     }
/*     */     
/* 213 */     cxb[] arrayOfCxb1 = new cxb[☃.readInt()];
/* 214 */     for (int i1 = 0; i1 < arrayOfCxb1.length; i1++) {
/* 215 */       arrayOfCxb1[i1] = cxb.b(☃);
/*     */     }
/*     */     
/* 218 */     cxb[] arrayOfCxb2 = new cxb[☃.readInt()];
/* 219 */     for (int i2 = 0; i2 < arrayOfCxb2.length; i2++) {
/* 220 */       arrayOfCxb2[i2] = cxb.b(☃);
/*     */     }
/*     */     
/* 223 */     cxd cxd1 = new cxd(list, fx1, bool);
/* 224 */     cxd1.b = arrayOfCxb1;
/* 225 */     cxd1.c = arrayOfCxb2;
/* 226 */     cxd1.d = set;
/* 227 */     cxd1.e = i;
/*     */     
/* 229 */     return cxd1;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 234 */     return "Path(length=" + this.a.size() + ")";
/*     */   }
/*     */   
/*     */   public fx m() {
/* 238 */     return this.f;
/*     */   }
/*     */   
/*     */   public float n() {
/* 242 */     return this.g;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cxd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */