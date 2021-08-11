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
/*     */ public class mi
/*     */   extends mq
/*     */ {
/*     */   static class a
/*     */   {
/*  21 */     static final mi[] a = new mi[1153];
/*     */     
/*     */     static {
/*  24 */       for (int ☃ = 0; ☃ < a.length; ☃++)
/*  25 */         a[☃] = new mi(-128 + ☃); 
/*     */     }
/*     */   }
/*     */   
/*  29 */   public static final mv<mi> a = new mv<mi>()
/*     */     {
/*     */       public mi a(DataInput ☃, int i, mm mm1) throws IOException {
/*  32 */         mm1.a(96L);
/*  33 */         return mi.a(☃.readInt());
/*     */       }
/*     */ 
/*     */       
/*     */       public String a() {
/*  38 */         return "INT";
/*     */       }
/*     */ 
/*     */       
/*     */       public String b() {
/*  43 */         return "TAG_Int";
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean c() {
/*  48 */         return true;
/*     */       }
/*     */     };
/*     */   
/*     */   private final int b;
/*     */   
/*     */   private mi(int ☃) {
/*  55 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public static mi a(int ☃) {
/*  59 */     if (☃ >= -128 && ☃ <= 1024)
/*  60 */       return a.a[☃ + 128]; 
/*  61 */     return new mi(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  66 */     ☃.writeInt(this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  71 */     return 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public mv<mi> b() {
/*  76 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  81 */     return String.valueOf(this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public mi d() {
/*  86 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  91 */     if (this == ☃) {
/*  92 */       return true;
/*     */     }
/*     */     
/*  95 */     return (☃ instanceof mi && this.b == ((mi)☃).b);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 100 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public nr a(String ☃, int i) {
/* 105 */     return (new oe(String.valueOf(this.b))).a(f);
/*     */   }
/*     */ 
/*     */   
/*     */   public long e() {
/* 110 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 115 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public short g() {
/* 120 */     return (short)(this.b & 0xFFFF);
/*     */   }
/*     */ 
/*     */   
/*     */   public byte h() {
/* 125 */     return (byte)(this.b & 0xFF);
/*     */   }
/*     */ 
/*     */   
/*     */   public double i() {
/* 130 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public float j() {
/* 135 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public Number k() {
/* 140 */     return Integer.valueOf(this.b);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\mi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */