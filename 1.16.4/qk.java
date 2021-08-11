/*     */ import java.io.IOException;
/*     */ import java.util.EnumSet;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class qk
/*     */   implements oj<om>
/*     */ {
/*     */   private double a;
/*     */   private double b;
/*     */   private double c;
/*     */   private float d;
/*     */   private float e;
/*     */   private Set<a> f;
/*     */   private int g;
/*     */   
/*     */   public qk() {}
/*     */   
/*     */   public qk(double ☃, double d1, double d2, float f1, float f2, Set<a> set, int i) {
/*  23 */     this.a = ☃;
/*  24 */     this.b = d1;
/*  25 */     this.c = d2;
/*  26 */     this.d = f1;
/*  27 */     this.e = f2;
/*  28 */     this.f = set;
/*  29 */     this.g = i;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/*  34 */     this.a = ☃.readDouble();
/*  35 */     this.b = ☃.readDouble();
/*  36 */     this.c = ☃.readDouble();
/*  37 */     this.d = ☃.readFloat();
/*  38 */     this.e = ☃.readFloat();
/*  39 */     this.f = a.a(☃.readUnsignedByte());
/*  40 */     this.g = ☃.i();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/*  45 */     ☃.writeDouble(this.a);
/*  46 */     ☃.writeDouble(this.b);
/*  47 */     ☃.writeDouble(this.c);
/*  48 */     ☃.writeFloat(this.d);
/*  49 */     ☃.writeFloat(this.e);
/*  50 */     ☃.writeByte(a.a(this.f));
/*  51 */     ☃.d(this.g);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(om ☃) {
/*  56 */     ☃.a(this);
/*     */   }
/*     */   
/*     */   public double b() {
/*  60 */     return this.a;
/*     */   }
/*     */   
/*     */   public double c() {
/*  64 */     return this.b;
/*     */   }
/*     */   
/*     */   public double d() {
/*  68 */     return this.c;
/*     */   }
/*     */   
/*     */   public float e() {
/*  72 */     return this.d;
/*     */   }
/*     */   
/*     */   public float f() {
/*  76 */     return this.e;
/*     */   }
/*     */   
/*     */   public int g() {
/*  80 */     return this.g;
/*     */   }
/*     */   
/*     */   public Set<a> h() {
/*  84 */     return this.f;
/*     */   }
/*     */   
/*     */   public enum a {
/*  88 */     a(0),
/*  89 */     b(1),
/*  90 */     c(2),
/*  91 */     d(3),
/*  92 */     e(4);
/*     */     
/*     */     private final int f;
/*     */ 
/*     */     
/*     */     a(int ☃) {
/*  98 */       this.f = ☃;
/*     */     }
/*     */     
/*     */     private int a() {
/* 102 */       return 1 << this.f;
/*     */     }
/*     */     
/*     */     private boolean b(int ☃) {
/* 106 */       return ((☃ & a()) == a());
/*     */     }
/*     */     
/*     */     public static Set<a> a(int ☃) {
/* 110 */       Set<a> set = EnumSet.noneOf(a.class);
/*     */       
/* 112 */       for (a a1 : values()) {
/* 113 */         if (a1.b(☃)) {
/* 114 */           set.add(a1);
/*     */         }
/*     */       } 
/*     */       
/* 118 */       return set;
/*     */     }
/*     */     
/*     */     public static int a(Set<a> ☃) {
/* 122 */       int i = 0;
/*     */       
/* 124 */       for (a a1 : ☃) {
/* 125 */         i |= a1.a();
/*     */       }
/*     */       
/* 128 */       return i;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\qk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */