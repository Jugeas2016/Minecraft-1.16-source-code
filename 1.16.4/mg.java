/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
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
/*     */ public class mg
/*     */   extends mq
/*     */ {
/*  19 */   public static final mg a = new mg(0.0F);
/*     */   
/*  21 */   public static final mv<mg> b = new mv<mg>()
/*     */     {
/*     */       public mg a(DataInput ☃, int i, mm mm1) throws IOException {
/*  24 */         mm1.a(96L);
/*  25 */         return mg.a(☃.readFloat());
/*     */       }
/*     */ 
/*     */       
/*     */       public String a() {
/*  30 */         return "FLOAT";
/*     */       }
/*     */ 
/*     */       
/*     */       public String b() {
/*  35 */         return "TAG_Float";
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean c() {
/*  40 */         return true;
/*     */       }
/*     */     };
/*     */   
/*     */   private final float c;
/*     */   
/*     */   private mg(float ☃) {
/*  47 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public static mg a(float ☃) {
/*  51 */     if (☃ == 0.0F) {
/*  52 */       return a;
/*     */     }
/*  54 */     return new mg(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  59 */     ☃.writeFloat(this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  64 */     return 5;
/*     */   }
/*     */ 
/*     */   
/*     */   public mv<mg> b() {
/*  69 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  74 */     return this.c + "f";
/*     */   }
/*     */ 
/*     */   
/*     */   public mg d() {
/*  79 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  84 */     if (this == ☃) {
/*  85 */       return true;
/*     */     }
/*     */     
/*  88 */     return (☃ instanceof mg && this.c == ((mg)☃).c);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  93 */     return Float.floatToIntBits(this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public nr a(String ☃, int i) {
/*  98 */     nr nr = (new oe("f")).a(g);
/*  99 */     return (new oe(String.valueOf(this.c))).a(nr).a(f);
/*     */   }
/*     */ 
/*     */   
/*     */   public long e() {
/* 104 */     return (long)this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 109 */     return afm.d(this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public short g() {
/* 114 */     return (short)(afm.d(this.c) & 0xFFFF);
/*     */   }
/*     */ 
/*     */   
/*     */   public byte h() {
/* 119 */     return (byte)(afm.d(this.c) & 0xFF);
/*     */   }
/*     */ 
/*     */   
/*     */   public double i() {
/* 124 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public float j() {
/* 129 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public Number k() {
/* 134 */     return Float.valueOf(this.c);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\mg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */