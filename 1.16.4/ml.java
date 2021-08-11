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
/*     */ public class ml
/*     */   extends mq
/*     */ {
/*     */   static class a
/*     */   {
/*  21 */     static final ml[] a = new ml[1153];
/*     */     
/*     */     static {
/*  24 */       for (int ☃ = 0; ☃ < a.length; ☃++)
/*  25 */         a[☃] = new ml((-128 + ☃)); 
/*     */     }
/*     */   }
/*     */   
/*  29 */   public static final mv<ml> a = new mv<ml>()
/*     */     {
/*     */       public ml a(DataInput ☃, int i, mm mm1) throws IOException {
/*  32 */         mm1.a(128L);
/*  33 */         return ml.a(☃.readLong());
/*     */       }
/*     */ 
/*     */       
/*     */       public String a() {
/*  38 */         return "LONG";
/*     */       }
/*     */ 
/*     */       
/*     */       public String b() {
/*  43 */         return "TAG_Long";
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean c() {
/*  48 */         return true;
/*     */       }
/*     */     };
/*     */   
/*     */   private final long b;
/*     */   
/*     */   private ml(long ☃) {
/*  55 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public static ml a(long ☃) {
/*  59 */     if (☃ >= -128L && ☃ <= 1024L)
/*  60 */       return a.a[(int)☃ + 128]; 
/*  61 */     return new ml(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  66 */     ☃.writeLong(this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  71 */     return 4;
/*     */   }
/*     */ 
/*     */   
/*     */   public mv<ml> b() {
/*  76 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  81 */     return this.b + "L";
/*     */   }
/*     */ 
/*     */   
/*     */   public ml d() {
/*  86 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  91 */     if (this == ☃) {
/*  92 */       return true;
/*     */     }
/*     */     
/*  95 */     return (☃ instanceof ml && this.b == ((ml)☃).b);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 100 */     return (int)(this.b ^ this.b >>> 32L);
/*     */   }
/*     */ 
/*     */   
/*     */   public nr a(String ☃, int i) {
/* 105 */     nr nr = (new oe("L")).a(g);
/* 106 */     return (new oe(String.valueOf(this.b))).a(nr).a(f);
/*     */   }
/*     */ 
/*     */   
/*     */   public long e() {
/* 111 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 116 */     return (int)(this.b & 0xFFFFFFFFFFFFFFFFL);
/*     */   }
/*     */ 
/*     */   
/*     */   public short g() {
/* 121 */     return (short)(int)(this.b & 0xFFFFL);
/*     */   }
/*     */ 
/*     */   
/*     */   public byte h() {
/* 126 */     return (byte)(int)(this.b & 0xFFL);
/*     */   }
/*     */ 
/*     */   
/*     */   public double i() {
/* 131 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public float j() {
/* 136 */     return (float)this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public Number k() {
/* 141 */     return Long.valueOf(this.b);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ml.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */